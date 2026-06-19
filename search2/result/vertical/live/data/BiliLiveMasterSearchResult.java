package com.bilibili.search2.result.vertical.live.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.api.VerticalSearchResult;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiliLiveMasterSearchResult extends VerticalSearchResult<BaseSearchItem> {
    public static final int $stable = 8;

    @JSONField(name = "keyword")
    @Nullable
    private String keyWord;

    @JSONField(name = "live_master")
    @Nullable
    private LiveSearchMaster liveMaster;

    @JSONField(name = "live_room")
    @Nullable
    private LiveSearchRoom liveRoom;

    @JSONField(name = "pages")
    private int page;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult$GloryInfo.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class GloryInfo {
        public static final int $stable = 8;

        @JSONField(name = "items")
        @Nullable
        private List<GloryItem> items;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "total")
        private int total;

        @Nullable
        public final List<GloryItem> getItems() {
            return this.items;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final int getTotal() {
            return this.total;
        }

        public final void setItems(@Nullable List<GloryItem> list) {
            this.items = list;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setTotal(int i7) {
            this.total = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult$GloryItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class GloryItem {
        public static final int $stable = 8;

        @JSONField(name = "cover")
        @Nullable
        private String cover;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @Nullable
        public final String getCover() {
            return this.cover;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        public final void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setTitle(@Nullable String str) {
            this.title = str;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult$LiveMasterItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class LiveMasterItem extends BaseSearchItem {
        public static final int $stable = 8;

        @JSONField(name = "cate_name")
        @Nullable
        private String areaName;

        @JSONField(name = "attentions")
        private long attentions;

        @JSONField(name = "cover")
        @Nullable
        private String cover;

        @JSONField(name = "face_nft_new")
        private int faceNftNew;

        @JSONField(name = "glory_info")
        @Nullable
        private GloryInfo gloryInfo;
        private boolean hasReport;

        @JSONField(name = "is_atten")
        private int isAtten;

        @JSONField(name = "level")
        private int level;

        @JSONField(name = "level_color")
        private int levelColor;

        @JSONField(name = "live_link")
        @Nullable
        private String link;

        @JSONField(name = "live_status")
        private int liveStatus;

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        private long mid;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "nft_damrk")
        @Nullable
        private String nftDmark;

        @JSONField(name = "online")
        private int onLine;

        @JSONField(name = "cate_parent_name")
        @Nullable
        private String parentAreaName;

        @Nullable
        private String responseAbtestId;

        @Nullable
        private String responseQuery;

        @Nullable
        private String responseTrackId;

        @JSONField(name = "roomid")
        private long roomId;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = "ucover")
        @Nullable
        private String ucover;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        @JSONField(name = "verify_desc")
        @Nullable
        private String verifyDesc;

        @JSONField(name = "verify_type")
        private int verifyType;

        @JSONField(name = "watched_show")
        @Nullable
        private WatchedInfo watched;

        @Nullable
        public final String getAreaName() {
            return this.areaName;
        }

        public final long getAttentions() {
            return this.attentions;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getCover() {
            return this.cover;
        }

        public final int getFaceNftNew() {
            return this.faceNftNew;
        }

        @Nullable
        public final GloryInfo getGloryInfo() {
            return this.gloryInfo;
        }

        public final boolean getHasReport() {
            return this.hasReport;
        }

        public final int getLevel() {
            return this.level;
        }

        public final int getLevelColor() {
            return this.levelColor;
        }

        @Nullable
        public final String getLink() {
            return this.link;
        }

        public final int getLiveStatus() {
            return this.liveStatus;
        }

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getNftDmark() {
            return this.nftDmark;
        }

        public final int getOnLine() {
            return this.onLine;
        }

        @Nullable
        public final String getParentAreaName() {
            return this.parentAreaName;
        }

        @Nullable
        public final String getResponseAbtestId() {
            return this.responseAbtestId;
        }

        @Nullable
        public final String getResponseQuery() {
            return this.responseQuery;
        }

        @Nullable
        public final String getResponseTrackId() {
            return this.responseTrackId;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getUcover() {
            return this.ucover;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getUri() {
            return this.uri;
        }

        @Nullable
        public final String getVerifyDesc() {
            return this.verifyDesc;
        }

        public final int getVerifyType() {
            return this.verifyType;
        }

        @Nullable
        public final WatchedInfo getWatched() {
            return this.watched;
        }

        public final int isAtten() {
            return this.isAtten;
        }

        public final void setAreaName(@Nullable String str) {
            this.areaName = str;
        }

        public final void setAtten(int i7) {
            this.isAtten = i7;
        }

        public final void setAttentions(long j7) {
            this.attentions = j7;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setFaceNftNew(int i7) {
            this.faceNftNew = i7;
        }

        public final void setGloryInfo(@Nullable GloryInfo gloryInfo) {
            this.gloryInfo = gloryInfo;
        }

        public final void setHasReport(boolean z6) {
            this.hasReport = z6;
        }

        public final void setLevel(int i7) {
            this.level = i7;
        }

        public final void setLevelColor(int i7) {
            this.levelColor = i7;
        }

        public final void setLink(@Nullable String str) {
            this.link = str;
        }

        public final void setLiveStatus(int i7) {
            this.liveStatus = i7;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setNftDmark(@Nullable String str) {
            this.nftDmark = str;
        }

        public final void setOnLine(int i7) {
            this.onLine = i7;
        }

        public final void setParentAreaName(@Nullable String str) {
            this.parentAreaName = str;
        }

        public final void setResponseAbtestId(@Nullable String str) {
            this.responseAbtestId = str;
        }

        public final void setResponseQuery(@Nullable String str) {
            this.responseQuery = str;
        }

        public final void setResponseTrackId(@Nullable String str) {
            this.responseTrackId = str;
        }

        public final void setRoomId(long j7) {
            this.roomId = j7;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setTitle(@Nullable String str) {
            this.title = str;
        }

        public final void setUcover(@Nullable String str) {
            this.ucover = str;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setUri(@Nullable String str) {
            this.uri = str;
        }

        public final void setVerifyDesc(@Nullable String str) {
            this.verifyDesc = str;
        }

        public final void setVerifyType(int i7) {
            this.verifyType = i7;
        }

        public final void setWatched(@Nullable WatchedInfo watchedInfo) {
            this.watched = watchedInfo;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult$LiveRoomItem.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class LiveRoomItem extends BaseSearchItem {
        public static final int $stable = 8;

        @JSONField(name = "area_v2_name")
        @Nullable
        private String areaName;

        @JSONField(name = "cover")
        @Nullable
        private String cover;
        private boolean hasReport;

        @JSONField(name = "live_link")
        @Nullable
        private String link;

        @JSONField(name = "live_status")
        private int liveStatus;

        @JSONField(name = EditCustomizeSticker.TAG_MID)
        private long mid;

        @JSONField(name = "name")
        @Nullable
        private String name;

        @JSONField(name = "online")
        private int online;

        @JSONField(name = "param")
        @Nullable
        private String param;

        @Nullable
        private String responseAbtestId;

        @Nullable
        private String responseQuery;

        @Nullable
        private String responseTrackId;

        @JSONField(name = "roomid")
        private long roomId;

        @JSONField(name = "short_id")
        private long shortId;

        @JSONField(name = "goto")
        @Nullable
        private String str_goto;

        @JSONField(name = "title")
        @Nullable
        private String title;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        @Nullable
        private String uri;

        @JSONField(name = "watched_show")
        @Nullable
        private WatchedInfo watched;

        @Nullable
        public final String getAreaName() {
            return this.areaName;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getCover() {
            return this.cover;
        }

        public final boolean getHasReport() {
            return this.hasReport;
        }

        @Nullable
        public final String getLink() {
            return this.link;
        }

        public final int getLiveStatus() {
            return this.liveStatus;
        }

        public final long getMid() {
            return this.mid;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public final int getOnline() {
            return this.online;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getParam() {
            return this.param;
        }

        @Nullable
        public final String getResponseAbtestId() {
            return this.responseAbtestId;
        }

        @Nullable
        public final String getResponseQuery() {
            return this.responseQuery;
        }

        @Nullable
        public final String getResponseTrackId() {
            return this.responseTrackId;
        }

        public final long getRoomId() {
            return this.roomId;
        }

        public final long getShortId() {
            return this.shortId;
        }

        @Nullable
        public final String getStr_goto() {
            return this.str_goto;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getTitle() {
            return this.title;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        @Nullable
        public String getUri() {
            return this.uri;
        }

        @Nullable
        public final WatchedInfo getWatched() {
            return this.watched;
        }

        public final void setAreaName(@Nullable String str) {
            this.areaName = str;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setCover(@Nullable String str) {
            this.cover = str;
        }

        public final void setHasReport(boolean z6) {
            this.hasReport = z6;
        }

        public final void setLink(@Nullable String str) {
            this.link = str;
        }

        public final void setLiveStatus(int i7) {
            this.liveStatus = i7;
        }

        public final void setMid(long j7) {
            this.mid = j7;
        }

        public final void setName(@Nullable String str) {
            this.name = str;
        }

        public final void setOnline(int i7) {
            this.online = i7;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setParam(@Nullable String str) {
            this.param = str;
        }

        public final void setResponseAbtestId(@Nullable String str) {
            this.responseAbtestId = str;
        }

        public final void setResponseQuery(@Nullable String str) {
            this.responseQuery = str;
        }

        public final void setResponseTrackId(@Nullable String str) {
            this.responseTrackId = str;
        }

        public final void setRoomId(long j7) {
            this.roomId = j7;
        }

        public final void setShortId(long j7) {
            this.shortId = j7;
        }

        public final void setStr_goto(@Nullable String str) {
            this.str_goto = str;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setTitle(@Nullable String str) {
            this.title = str;
        }

        @Override // com.bilibili.search2.api.BaseSearchItem
        public void setUri(@Nullable String str) {
            this.uri = str;
        }

        public final void setWatched(@Nullable WatchedInfo watchedInfo) {
            this.watched = watchedInfo;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult$LiveSearchMaster.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class LiveSearchMaster {
        public static final int $stable = 8;

        @JSONField(name = "items")
        @Nullable
        private List<LiveMasterItem> items;

        @JSONField(name = "pages")
        private int pages;

        @JSONField(name = "total")
        private int total;

        @Nullable
        public final List<LiveMasterItem> getItems() {
            return this.items;
        }

        public final int getPages() {
            return this.pages;
        }

        public final int getTotal() {
            return this.total;
        }

        public final void setItems(@Nullable List<LiveMasterItem> list) {
            this.items = list;
        }

        public final void setPages(int i7) {
            this.pages = i7;
        }

        public final void setTotal(int i7) {
            this.total = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/vertical/live/data/BiliLiveMasterSearchResult$LiveSearchRoom.class */
    @StabilityInferred(parameters = 0)
    @Keep
    public static final class LiveSearchRoom {
        public static final int $stable = 8;

        @JSONField(name = "items")
        @Nullable
        private List<LiveRoomItem> items;

        @JSONField(name = "pages")
        private int pages;

        @JSONField(name = "total")
        private int total;

        @Nullable
        public final List<LiveRoomItem> getItems() {
            return this.items;
        }

        public final int getPages() {
            return this.pages;
        }

        public final int getTotal() {
            return this.total;
        }

        public final void setItems(@Nullable List<LiveRoomItem> list) {
            this.items = list;
        }

        public final void setPages(int i7) {
            this.pages = i7;
        }

        public final void setTotal(int i7) {
            this.total = i7;
        }
    }

    @Nullable
    public final String getKeyWord() {
        return this.keyWord;
    }

    @Nullable
    public final LiveSearchMaster getLiveMaster() {
        return this.liveMaster;
    }

    @Nullable
    public final LiveSearchRoom getLiveRoom() {
        return this.liveRoom;
    }

    public final int getPage() {
        return this.page;
    }

    public final void setKeyWord(@Nullable String str) {
        this.keyWord = str;
    }

    public final void setLiveMaster(@Nullable LiveSearchMaster liveSearchMaster) {
        this.liveMaster = liveSearchMaster;
    }

    public final void setLiveRoom(@Nullable LiveSearchRoom liveSearchRoom) {
        this.liveRoom = liveSearchRoom;
    }

    public final void setPage(int i7) {
        this.page = i7;
    }
}
