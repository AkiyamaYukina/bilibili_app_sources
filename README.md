# B 站客户端 · 业务代码分析

---

## 1. 总览

直播代码在本 APK 里按"端"和"场景"分散组织,而非集中在一个包:

| 大组 | 位置 | 说明 |
|---|---|---|
| **开播推流端** | [com/bilibili/live/streaming/](bili/sources/com/bilibili/live/streaming/) (120 文件) | 主播开播的完整推流 SDK(采集→GL→编码→推送) |
| **看播播放器** | [bilibili/live/app/service/](bili/sources/bilibili/live/app/service/)、[bilibili/live/player/support/](bili/sources/bilibili/live/player/support/) | 拉流地址解析、直播状态机、播放器附属 UI、免流策略 |
| **P2P 直播加速** | [com/bilibili/sistersplayer/](bili/sources/com/bilibili/sistersplayer/) | 本地 HTTP 小服务 + Tracker/STUN 的 P2P 分片直播 |
| **宿主服务门面** | [com/bilibili/live/](bili/sources/com/bilibili/live/) (`*OutService`) | 直播插件对主 App 暴露的 7 个接口 |
| **场景化接入** | search2 / ogv / cheese / theseus.united / projection | 搜索直播、番剧直播预约、课程直播、详情页关联直播、投屏 |
| **资源底座** | [com/bilibili/resourceconfig/](bili/sources/com/bilibili/resourceconfig/) | 直播礼物特效/字体/图片走 MOD 增量下发 |

**关键事实:完整直播间未解出。** 全树里 211 个文件 `import com.bilibili.live.*`,但 `bililive.room` 的送礼、弹幕互动、PK、连麦、高能榜等 UI 业务在独立插件包内,这里只有它对外的**门面接口**和**播放/推流底层**。

---

## 2. 架构分层

```
┌─────────────────────────────────────────────────────────────────────┐
│  宿主 App(主壳)场景入口                                              │
│   Feed/动态直播卡 · 搜索"直播"垂搜&内联卡 · 番剧直播预约              │
│   课程直播跳转 · 视频详情页"关联直播" · 投屏直播                       │
│        │ 通过 BLRouter 拿 *OutService / Provider 接口                  │
├─────────────────────────────────────────────────────────────────────┤
│  直播插件门面(com.bilibili.live.*OutService)  ← 宿主↔插件边界          │
│   LiveRoomOutService / LivePlayerOutService(浮窗) /                    │
│   LiveHybridOutService(H5) / LiveCardOutService / Answer / Router      │
├──────────────────────────────┬──────────────────────────────────────┤
│  ① 开播推流端 (主播)          │  ② 看播端 (观众)                       │
│  LivePush 总控                │  LiveDefaultResolver 地址解析          │
│   ├ source 采集(Camera2/屏幕) │   ├ getRoomPlayInfo API → playurl     │
│   ├ gl   GL渲染/HDR色调映射   │   ├ LiveStatusProvider 状态机(1/0/2)   │
│   ├ encoder 编码(AVC/HEVC/DV) │   ├ LivePlayerDataTracker 埋点         │
│   └ Flashpoint 推流栈         │   └ InlineLivePlayableParams 内嵌播放  │
│      RTMP/SRT/USB/OSI         │  SistersPlayer:P2P 分片 + MiniServer   │
│      native: blive_pandora    │      Tracker/STUN NAT 穿透             │
├──────────────────────────────┴──────────────────────────────────────┤
│  公共底座:直播资源 MOD(礼物 SVGA/字体/图片)· 免流弹窗 · 投屏          │
└─────────────────────────────────────────────────────────────────────┘
```

---

## 3. 模块详解(20 簇)

### 组一 · 开播推流端(主播)

#### 3.1 推流总控 [streaming/LivePush.java](bili/sources/com/bilibili/live/streaming/LivePush.java)
开播一条龙的核心容器。Builder 构造,持有 `AVContext`(视音频上下文)、`EncoderManager`(编码配置)、`RenderPipeLine`(渲染循环)、`PushManager`(统计)、`BiliDispatchManagementFlaspoint`(推流协议栈)。
> 注:推流协议栈 `BiliDispatchManagementFlaspoint` 实际位于独立的 native 桥接包 [com/bilibili/mediastreaming/flashpoint/](bili/sources/com/bilibili/mediastreaming/flashpoint/)(Java→`blive_pandora` 的桥接层),OSI/USB 等闪点适配器在 [streaming/push/](bili/sources/com/bilibili/live/streaming/push/)。闪点回调经 `runOnDefaultBizCoroutine`(`SupervisorJob + limitedParallelism(1)`)串行异步转发,不阻塞 native 线程。
- 生命周期:构造 → 初始化 GL/音频 → `startPush(url,config)` 启动编码推送 → `stopPush` → `destroy`。
- native 库:[BiliLivePushLoader](bili/sources/com/bilibili/live/streaming/BiliLivePushLoader.java) 单例通过 `System.loadLibrary("blive_pandora")` 加载;build() 前必须 load,否则 `UnsatisfiedLinkError`。
- 推流协议 `BiliPushProtocolType`:**RTMP / RTMP_SRT / USB / OSI / BMT**;每条流一个 Flashpoint endpoint,支持多路并发(`outStreams` ConcurrentHashMap)。
- USB 推流(`BiliUSBFlashpoint`):投稿/PC 直播伴侣场景,FLV 打包 + 20 字节头,经 Socket 发到 PC。
- 内录:`PlaybackCaptureService` 经 `MediaProjection` 抓屏推流。
- 业务回调 `IBiliBizDefaultListener`:`onStart/onConnecting/onConnected/onConnectedFirstPacket/onSending/onError/onStopping/onStopped` + 统计 `onConnectStats/onNetStats`。
- 常量 [LiveConstants](bili/sources/com/bilibili/live/streaming/LiveConstants.java):码率(VIDEO_BITRATE_800~8000)、分辨率(360×640~1920×1080)、编码类型(NORMAL/PURE_VOICE/NETWORK_TEST)。

#### 3.2 音视频编码 [streaming/encoder/](bili/sources/com/bilibili/live/streaming/encoder/)
- `EncoderConfig` 集中配置(mimeType/分辨率/帧率/码率/iFrame间隔/bFrame/useBiliHEVC)。
- 双编码器策略:`VideoEncoderV2`(轻量异步) vs `VideoEncoderFix`(输入 Surface 复位超时 1500ms 处理),由 `useFixEncoder` 切换。
- `BiliPushAVCodecUtils` 扫描编解码能力:AVC(`video/avc`)、HEVC(`video/hevc`)、**Dolby Vision**(`video/dolby-vision`)、AAC;颜色格式 21=NV21 / 54=P010 / 2130708361=Surface。
- `PushEncoderSink` 把编码包(`sendVideoPacket/sendAudioPacket`)经 Flashpoint 送入 native;集成 `BiliSeiManagement` 注入 SEI、`BiliH26XParser` 解析。
- 状态枚举 `VideoEncodeState`:OK / START_ERROR / TARGET_BITRATE_OVERSHOOT / LEVEL_EXCEEDED / MEMORY …

#### 3.3 GL 渲染管线 [streaming/gl/](bili/sources/com/bilibili/live/streaming/gl/)
采集帧的 GPU 离屏渲染 + 色彩空间转换 + **HDR 色调映射**。
- `BEGLContext/BEGLSurface`:前后台线程上下文分离;`RenderMode` 支持 **SDR_SRGB / HDR_PQ(Dolby/HDR10) / HDR_HLG / HDR2SDR_SRGB / HDR_HLG_FILTER2P3**。
- `BGLDrawer` 用 **5 维数组**`[Transfer][Primaries][EETF][Primaries][Transfer]`缓存 Shader,避免重复编译。
- `BGLColorMatrix`:601/709/2020 三套 YUV→RGB 矩阵(full/partial range);HDR2SDR 用 `EETF.BT2390` 做 OOTF 逆映射。
- `BGLFramebuffer/BGLTexture` 离屏 FBO(F16 浮点)、`glFenceSync` GPU 同步。

#### 3.4 采集源/相机/预览窗 [streaming/source/](bili/sources/com/bilibili/live/streaming/source/)
- `CaptureSource` 抽象基类(SurfaceTexture 生命周期 + 帧到达追踪 + FPS 上报)。
- `Camera2CaptureSource`(Camera2,支持 HLG/PQ 动态范围)、`CameraCaptureSource`(legacy Camera + `BeautyFilter` 美颜)、`ScreenCaptureSource`(`MediaProjection` + `VirtualDisplay`)。
- `CameraP010Receiver`:HDR P010(`ImageFormat.YCBCR_P010`)Y/UV 双平面纹理上传。
- `SceneSource` 多源合成(画中画/连麦布局);`MontageLiveWindow`/kaleidoscope `LiveWindow` 是美摄(NvStreaming)native 预览窗。

#### 3.5 滤镜/控件/工具/日志/加密 [streaming/filter/](bili/sources/com/bilibili/live/streaming/filter/) ・ [crypto/](bili/sources/com/bilibili/live/crypto/)
- `FilterFactory` 注册并反序列化多种源(Color/Image/Text/CustomTex/Slide/VideoFile/Gif);`BeautyFilter` 美颜接口。
- 渲染控件双路:`TextureRenderView`(TextureView) / `SurfaceRenderView`(SurfaceView)。
- `RailgunTimer` 微秒级定时驱动、`BObjectPool` 无锁对象池、`LivePusherLog`(tag `LiveStreamingSDK`,代理 BLog)。
- `CryptoJni` 加载 `crypto_c` native 库,`compute(str,int)` 推测用于 **RTMP 推流鉴权签名**。

---

### 组二 · 看播端(观众)

#### 3.6 拉流地址解析与状态机 [app/service/resolver/](bili/sources/bilibili/live/app/service/resolver/)
- `LiveDefaultResolver` 实现 `IMediaResolverV2`,核心拉流入口。
- **真实接口**(BaseUrl `https://api.live.bilibili.com`):
  - `GET /xlive/play-gateway/room/brief` — 直播间简要状态
  - `GET /xlive/app-room/v2/index/getRoomPlayInfo` — 播放信息(协议/格式/编码/房间密码)
- 请求头:`User-Agent: Bilibili Freedoooooom/MarkII`、`x-bilibili-mid`、`X-Live-Room-Password`、`X-Live-Room-B-Staff-Token`(工作人员令牌)。
- **状态码**:`STATUS_LIVE=1`(直播中) / `STATUS_CLOSE=0`(未开播) / `STATUS_ROUND=2`(轮播)。
- **错误码映射**:`19002002→60002`(锁定)、`19002003→60004`(不存在)、`19002004→60005`(海外限制)、`19002005→60006`(需密码)。
- 秒开:优先 `LiveFastPlayUrlSelector.parsePlayUrlFromTianma(link)`(天马秒开),失效降级 API;多格式 `.flv→2/.m3u8→8/.ts→4`;`LiveStatusLRUCache` 容量 10 的 LRU 状态监听缓存。

#### 3.7 状态提供 / 数据追踪 [app/service/provider/](bili/sources/bilibili/live/app/service/provider/)
- `LiveStatusProvider` 对外提供直播间状态。
- `LivePlayerDataTracker` 全生命周期埋点:`onPlay/onPause/onPrepared/onBufferingEnd/release`,首帧 `VideoRenderingStart`,会话 GUID = MD5(随机+时间戳)。
- `WatchTimePlayType`:`PLAY_FOREGROUND(0)` / `PLAY_BACKGROUND(3)`;`CardTypeKt` 含 30+ 卡片类型(动态综合卡 / 首页直播卡 / Story 直播卡 / 搜索直播内联卡 / `ROOM_SHOPPING` 购物卡 …)。
- `SharePlayerDisplayProviderImp`(`@Named SHARE_PLAYER_DISPLAY_LIVE`):刘海屏适配,播放器顶部边距 `statusBar + 134dp`。

#### 3.8 播放器附属视图与免流 [player/support/](bili/sources/bilibili/live/player/support/)
- `PlayerSettingShowNetworkAlertPolicy` 免流弹窗策略:按网络类型(移动/限流 WiFi)+ 频率枚举(DAILY/本周/本月/NONE)+ 上次时间戳决定是否弹流量预警;读 `live_network_alert_type`/`live_network_alert_set_time`。
- `LiveStreamInfoDialogFragment` 推流信息面板(IP/分辨率/码率/延迟,RecyclerView+ViewModel 每 1s 轮询)。
- `LiveWaterMarkView`(主播 ID 水印 + `ShadowSpan` 阴影)、`LineChartView`(码率/延迟折线)、`LivePlayResizeUtils`(4:3 / 16:9 / 竖屏全屏 自适配)。

#### 3.9 Feed 内嵌直播小窗 [listplayer/.../InlineLivePlayableParams.java](bili/sources/com/bilibili/bililive/listplayer/videonew/player/InlineLivePlayableParams.java)
- `InlineLivePlayableParams`(roomId/cover/author/business/liveScene/link/mid)→ 产出 `LiveResolveParams` 交后端解析。
- `PlayerInlineFragment` 封装 `IPlayerContainer`(player v2),注册网络/耳机/后台播放 Service;`ListPlayerManager` 单例管理列表滚动自动播放、音频焦点。
- HTTPS 由 `PlayerSettingHelper.enablePlayUrlHTTPS()` 控制;弹幕房间经 `DanmakuResolveParams(roomId,...)` 绑定。

#### 3.10 通用播放器·直播预约消息 [playerbizcommon/live/](bili/sources/com/bilibili/playerbizcommon/live/)
> 注:这一簇是"**直播预约**"状态总线(非看播本身)。
- `VideoLiveStateMessage`(Parcelable + `IInterProcData`)经 Violet 跨进程总线广播预约态(sid/isReserved/from: 0=Native,1=H5)。
- `VideoLiveApi`(BaseUrl `https://api.bilibili.com`)预约接口:
  - `POST /x/new-reserve/reserve/add` · `/cancel` · `/multi_add` · `/multi_cancel`
  - `GET /x/activity/reserve/following` · `/x/new-reserve/reserve/multi_info`
  - `POST /x/resource/entrance/infoc`(关闭预约卡提示)

#### 3.11 P2P 直播加速 [sistersplayer/](bili/sources/com/bilibili/sistersplayer/)
- `LiveMiniServer` 本地 HTTP 小服务(`localhost:随机端口`),把 P2P+CDN 数据以流媒体代理给播放器。
- `SistersConfiguration` 硬编码 P2P 基础设施:`wss://tracker.chat.bilibili.com/`(Peer 发现)、`stun:stun.chat.bilibili.com:3478` / `stun:stun6.chat.bilibili.com:3478`(NAT 穿透,IPv4/IPv6)。
- `LiveFragment` 4 分片架构(blockSize 61440B),CRC32 校验失败自动降级纯 CDN;`DataSourceType` 区分 P2P/SERVER 源占比统计。**与弹幕服务共用 `chat.bilibili.com` 的 STUN/Tracker 基建。**

---

### 组三 · 宿主接入场景

#### 3.12 直播插件门面 [com/bilibili/live/](bili/sources/com/bilibili/live/)(7 个 OutService)
宿主经 BLRouter 获取,是插件化边界:

| 接口 | 能力 |
|---|---|
| [LiveRoomOutService](bili/sources/com/bilibili/live/LiveRoomOutService.java) | `closeRoom()` / 取直播间 Activity 类 |
| [LivePlayerOutService](bili/sources/com/bilibili/live/LivePlayerOutService.java) | 浮窗:`floatWindowIsShown` / `getFloatWindowRoomId` / `getTimeShift(roomId)` / `windowControl(DISABLE_WINDOW=1)` |
| [LiveHybridOutService](bili/sources/com/bilibili/live/LiveHybridOutService.java) | H5:`goToLiveCenter()`(直播中心)/ `openBbRecharge()`(B 币充值) |
| [LiveCardOutService](bili/sources/com/bilibili/live/LiveCardOutService.java) | `releaseAllCardPlay()` 释放所有卡片播放器 |
| [LiveStreamModResourceOutService](bili/sources/com/bilibili/live/LiveStreamModResourceOutService.java) | Blink 美颜资源:`checkBlinkBeautyResExisits` / `isByteEffect()`(字节特效库) |
| [ILiveRouterDispatcherService](bili/sources/com/bilibili/live/ILiveRouterDispatcherService.java) / Provider | URL 路由分发 + 页面/吐司/埋点能力 |
| [ILiveRoomAnswerAbilityProvider](bili/sources/com/bilibili/live/ILiveRoomAnswerAbilityProvider.java) | 直播答题:面板显隐、关注、`SharedFlow<PushRefreshDto>` 推送刷新流 |

#### 3.13 Feed/动态直播卡 [live/card/](bili/sources/com/bilibili/live/card/)
- `LivePlayerCard`(type=1 直播 / 2 录像)→ `LivePlayInfoBean`(roomId/online/areaId/liveStatus) 或 `LiveRecordInfoBean`(分段录像 + backupUrl)。
- `LiveCornerView` 角标(图片+≤16 字),`InlinePlayerContainer`(默认 16:9=0.5625)。
- `DynamicInlineLiveServiceImp` 曝光上报 `live.all-dynamic.live-player.0.show`;点击追加 `extra_jump_from=32000`。Fastjson `@JSONField` 反序列化。

#### 3.14 搜索·直播垂搜结果 [search2/result/vertical/live/](bili/sources/com/bilibili/search2/result/vertical/live/)
- `SearchResultLiveFragment`(GridLayout 网格),`BiliLiveMasterSearchResult` 含 `LiveMasterItem`(主播)+ `LiveRoomItem`(直播间)两组。
- PV 埋点 `live.live-search.0.0.pv`;点击 `LiveReportClickEvent`(eventId 000277)、访问 `LiveReportPageVisitEvent`(000278);ViewModel 以 `type=4` 调搜索 API。

#### 3.15 搜索·直播内联卡与 API 模型 [search2/api/SearchLiveInline.java](bili/sources/com/bilibili/search2/api/SearchLiveInline.java)
- `SearchLiveInline`(映射 protobuf `SearchLiveInlineCard`)/ `SearchLiveItem`(非内联 `SearchLiveCard`),走 `com.bapis.bilibili.polymer.app.search.v1.*`。
- 子对象:`Avatar`(支持 NFT 头像)、`Args`(online/roomId/分区)、`TrafficConfig`(分流/AB)、`SearchRankLiveIcon`(昼夜图标)。
- `getInlinePlayableParams()` → `InlineLivePlayableParams`,接 3.9 内嵌播放;埋点 `IPegasusLiveInlineCardReportService`。

#### 3.16 番剧(OGV)·直播预约 [ogv/intro/livereserve/](bili/sources/com/bilibili/ship/theseus/ogv/intro/livereserve/)
- `OgvLiveReserveOperationApiService`(host `api.bilibili.com`):
  - `POST /pgc/view/activity/guide/bar/operation`(预约/取消,参数 season_id/season_type/reserve_id/operation_flag)
  - `GET /pgc/view/activity/guide/bar/info`(拉预约条)
- `OgvLiveReserveVo`(`@SerializedName` reserve_id/icon/night_icon/title/reserve_status/live_status/report…);`JumpType`:UNKNOWN/OPEN_URL/REFRESH/HALF_SCREEN。
- Compose + DataBinding 双层渲染,`MutableStateFlow<OgvLiveReserveVo>` 驱动;埋点命名空间 `united.player-video-detail.reserve.*`。

#### 3.17 课程(Cheese)·直播入口 [cheese/biz/catalog/](bili/sources/com/bilibili/ship/theseus/cheese/biz/catalog/)
- `CheeseCatalogRepository.getLiveLinkData(ep_id)` → `GET https://api.bilibili.com/pugv/view/app/live/jump` → `CheeseLiveLinkVo{url}`。
- `CheeseCatalogService.gotoLiveRoom` / `CheeseSeasonSelectionService.gotoLiveRoom` 协程拿到 URL 后经 `qV.a.a()` 统一导航工具跳直播间。

#### 3.18 视频详情页·关联直播 [united/.../relate/live/](bili/sources/com/bilibili/ship/theseus/united/page/intro/module/relate/live/)
- `DetailRelateService.e(card)` 按 `RelateCardType.LIVE`(ordinal=6)创建 `RelateLiveComponent`。
- `RelateLiveCard`(UP 名/观看数/`liveStatus` 0/1/iconType/推荐 Badge/liveNewStyle/StatInfo);直播中走 Lottie 角标。
- 点击进直播间,长按赞踩,120s 内可撤回;状态变更经 `Violet.sendMsg(VideoLiveStateMessage)` 广播(接 3.10)。`liveorder` 子模块 = 预约(DetailReserveService:日历权限/增删日历提醒)。

#### 3.19 投屏·直播 [projection/.../ProjectionLiveItemData.java](bili/sources/com/bilibili/lib/projection/internal/projectionitem/ProjectionLiveItemData.java)
- `ProjectionLiveItemData`(roomId / `isSupportH265` / `isSupportDolby` / extraJson)实现 `StandardProjectionItem`,`CastContentType="live"`。
- 接口:`GET /x/tv/playurl`(is_h265/is_dolby/live_extra/room_id)、`GET /x/tv/proj_intercept`(返回 `LiveInfoBean.isPayLive` 付费直播拦截)、`POST /x/tv/stream/cmd`。

---

### 组四 · 资源底座

#### 3.20 直播资源 MOD 增量下发 [resourceconfig/modmanager/](bili/sources/com/bilibili/resourceconfig/modmanager/)
- `ModResourceClient`(`com.bilibili.lib.mod`)统一管理 MOD 池:**`live`**(`AndroidImage` 图片 / `bili_typeface` 字体 / `liveHighSVGA`·`liveStandardSVGA` 特效)与 **`feOffline`**(`cny_voice` 春节语音离线包)。
- 各 Helper:`LiveImageModManagerHelper`(礼物卡牌/大航海标签/PK 比分图,ConcurrentHashMap 缓存)、`LiveSvgaModManagerHelper`(SVGA→Drawable)、`LiveTypefaceModManagerHelper`(`song_typeface.ttf`)、`LiveFileModManagerHelper`。
- `LiveImageUrlConfig` 礼物动图 CDN:`https://i0.hdslb.com/bfs/live/...webp`。

---

## 4. 关键链路

**① 开播推流(主播)**
`BiliLivePushLoader.load()`(blive_pandora) → `LivePush` 构造 → `source`(Camera2/屏幕)采集 → `gl` GL 处理/HDR 色调映射 → `encoder`(AVC/HEVC/Dolby,硬编优先) → `PushEncoderSink` → `BiliDispatchManagementFlaspoint` 推流栈(RTMP/SRT/USB) → `IBiliBizDefaultListener` 回连接/统计状态。

**② 看播拉流(观众)**
`InlineLivePlayableParams`/直播卡 → `LiveResolveParams(roomId,link)` → `LiveDefaultResolver` → 秒开 `parsePlayUrlFromTianma()` 或 `GET /xlive/app-room/v2/index/getRoomPlayInfo` → 拿 FLV/HLS/TS playurl →(可选)`SistersPlayerLoader` 启 `LiveMiniServer` + Tracker/STUN 做 P2P 加速 → 播放器播放;`LiveStatusProvider` 轮询状态、`LivePlayerDataTracker` 埋点。

**③ 各场景跳进直播间**
搜索内联卡 / 番剧预约条 / 课程 `pugv/.../live/jump` / 详情页关联直播 → 统一经路由(`ILiveRouterDispatcherService.handleUrl` 或 `qV.a.a()`)→ `LiveRoomOutService.getLiveRoomActivityClazz()` 打开直播间插件。

---

## 5. 直播后端 host 与网络(均为代码中确认的真实字面量)

| host / 路径 | 用途 |
|---|---|
| `https://api.live.bilibili.com/xlive/play-gateway/room/brief` | 直播间简要状态 |
| `https://api.live.bilibili.com/xlive/app-room/v2/index/getRoomPlayInfo` | 拉流播放信息 |
| `https://live.bilibili.com/app/{all-live,myfollow,mytag/v2}` | 直播频道页(Web/半屏) |
| `https://live.bilibili.com/live/user-center/my-info/operation/{host-announcement,payment-detail,watch-history}` | 用户中心 |
| `https://api.bilibili.com/x/new-reserve/reserve/{add,cancel,multi_add,multi_info}` | 直播预约 |
| `https://api.bilibili.com/pgc/view/activity/guide/bar/{operation,info}` | 番剧直播预约条 |
| `https://api.bilibili.com/pugv/view/app/live/jump` | 课程直播跳转 |
| `https://api.bilibili.com/x/tv/{playurl,proj_intercept,stream/cmd}` | 投屏直播 |
| `wss://tracker.chat.bilibili.com/` | P2P Peer 发现 |
| `stun:stun.chat.bilibili.com:3478` / `stun:stun6.chat.bilibili.com:3478` | NAT 穿透(IPv4/IPv6) |
| `https://i0.hdslb.com/bfs/live/...` | 礼物动图 CDN |
| UA: `Bilibili Freedoooooom/MarkII` | 直播请求 User-Agent |

**推流上行地址未现:** 主播端 RTMP/SRT 服务器地址(`push.bilibili.com` 之类)不在反编译代码里,由开播下发的接口动态返回或 native(`blive_pandora`)内处理。

---

## 6. 取证局限

1. **完整直播间未解出**:送礼、弹幕互动、PK、连麦、高能榜、舰长等 UI 业务在独立插件(`com.bilibili.bililive.room.*`),这里只有门面接口和播放/推流底层。
2. **native 黑盒**:`blive_pandora`(推流栈)、`crypto_c`(签名)、美摄 `LiveWindow` 的核心逻辑在 `.so`,Java 侧只见调用面。
3. **JADX 截断**:`LivePush` 渲染循环、`drainOneEncode`、`DetailRelateService.e()`(3084 指令)、`dealWithResponse()` 等大方法标注 "Method not decompiled",分支细节缺失。
4. **混淆字段**:大量 `f5xxxx`/单字母类名靠 setter / `@SerializedName` / `JsonDescriptor` 反推语义,个别枚举取值含义需对照线上 API。
5. **protobuf 半可见**:搜索直播走 `bapis...polymer.app.search.v1.*`,字段可见但服务端 RPC 端点未在客户端硬编码。

---

## 7. 文件 / 接口索引

| 模块 | 关键文件 | 核心接口/常量 |
|---|---|---|
| 推流总控 | [LivePush.java](bili/sources/com/bilibili/live/streaming/LivePush.java) | `startPush` / Flashpoint(RTMP·SRT·USB) / `blive_pandora` |
| 编码 | [streaming/encoder/](bili/sources/com/bilibili/live/streaming/encoder/) | AVC/HEVC/Dolby,P010 |
| GL/HDR | [streaming/gl/](bili/sources/com/bilibili/live/streaming/gl/) | HDR_PQ/HLG,BT2390 |
| 采集 | [streaming/source/](bili/sources/com/bilibili/live/streaming/source/) | Camera2/屏幕/美颜 |
| 拉流解析 | [resolver/LiveDefaultResolver.java](bili/sources/bilibili/live/app/service/resolver/LiveDefaultResolver.java) | `/xlive/app-room/v2/index/getRoomPlayInfo` |
| 状态/埋点 | [provider/](bili/sources/bilibili/live/app/service/provider/) | STATUS 1/0/2,WatchTime |
| 内嵌播放 | [InlineLivePlayableParams.java](bili/sources/com/bilibili/bililive/listplayer/videonew/player/InlineLivePlayableParams.java) | `LiveResolveParams` |
| P2P | [sistersplayer/httpserver/LiveMiniServer.java](bili/sources/com/bilibili/sistersplayer/httpserver/LiveMiniServer.java) | Tracker/STUN |
| 门面 | [com/bilibili/live/](bili/sources/com/bilibili/live/) | 7×`*OutService` |
| Feed 卡 | [live/card/](bili/sources/com/bilibili/live/card/) | `LivePlayerCard` |
| 搜索 | [search2/api/SearchLiveInline.java](bili/sources/com/bilibili/search2/api/SearchLiveInline.java) | `type=4`,polymer protobuf |
| 番剧预约 | [livereserve/](bili/sources/com/bilibili/ship/theseus/ogv/intro/livereserve/) | `/pgc/view/activity/guide/bar/*` |
| 课程 | [cheese/biz/catalog/](bili/sources/com/bilibili/ship/theseus/cheese/biz/catalog/) | `/pugv/view/app/live/jump` |
| 详情关联 | [relate/live/](bili/sources/com/bilibili/ship/theseus/united/page/intro/module/relate/live/) | `RelateCardType.LIVE` |
| 投屏 | [ProjectionLiveItemData.java](bili/sources/com/bilibili/lib/projection/internal/projectionitem/ProjectionLiveItemData.java) | `/x/tv/playurl` |
| 资源 MOD | [resourceconfig/modmanager/](bili/sources/com/bilibili/resourceconfig/modmanager/) | 池 `live`/`feOffline` |

---

*本文为静态反编译分析,接口路径/常量均取自代码字面量;标注"推断"处未在代码中直接确认。*
