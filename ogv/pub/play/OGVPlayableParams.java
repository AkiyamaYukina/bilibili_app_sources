package com.bilibili.ogv.pub.play;

import Ld.c;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.playerbizcommon.features.background.b;
import cq0.C6750c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.ijk.media.player.IjkCodecHelper;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.video.resolver.OGVResolverParams;
import tv.danmaku.video.resolver.UGCResolverParams;
import tv.danmaku.videoplayer.core.media.ijk.IjkOptionsHelper;
import tv.danmaku.videoplayer.coreV2.VideoBizType;
import tv.danmaku.videoplayer.coreV2.transformer.P2PParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/play/OGVPlayableParams.class */
public final class OGVPlayableParams extends GeminiCommonPlayableParams {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public long f71598Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @Nullable
    public Long f71599Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public String f71600a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public String f71601b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f71602c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    @Nullable
    public Function0<String> f71603d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public float f71604e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f71605f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f71606g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f71607h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f71608i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public boolean f71609j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public boolean f71610k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f71611l1;
    public int m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f71612n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f71613o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public long f71614p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public long f71615q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    @NotNull
    public String f71616r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    @NotNull
    public String f71617s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    @Nullable
    public String f71618t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f71619u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    @Nullable
    public String f71620v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f71621w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f71622x1;
    public boolean y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    @Nullable
    public Object f71623z1;

    public OGVPlayableParams() {
        setFrom("bangumi");
        setBizType(VideoBizType.PGC);
        this.f71615q1 = Duration.Companion.getZERO-UwyO8pc();
        this.f71616r1 = "bangumi";
        this.f71617s1 = "";
        this.f71621w1 = true;
        this.y1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tv.danmaku.biliplayerv2.service.Video.DanmakuResolveParams getDanmakuResolveParams() {
        /*
            r23 = this;
            r0 = r23
            boolean r0 = r0.f71621w1
            r28 = r0
            r0 = 0
            r30 = r0
            r0 = r28
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r23
            boolean r0 = r0.f71622x1
            if (r0 == 0) goto L1e
            java.lang.String r0 = "downloaded"
            r29 = r0
        L1b:
            goto L25
        L1e:
            java.lang.String r0 = ""
            r29 = r0
            goto L1b
        L25:
            r0 = r23
            boolean r0 = r0.f71606g1
            if (r0 == 0) goto L4d
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r1 = r0
            r1.<init>()
            r30 = r0
            r0 = r30
            java.lang.String r1 = "video_type"
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.addProperty(r1, r2)
            r0 = r30
            java.lang.String r1 = "from_scene"
            com.bilibili.app.gemini.base.player.GeminiCommonResolverParams$Scene r2 = com.bilibili.app.gemini.base.player.GeminiCommonResolverParams.Scene.INLINE
            java.lang.String r2 = r2.getValue()
            r0.addProperty(r1, r2)
        L4d:
            r0 = r23
            long r0 = r0.getAvid()
            r26 = r0
            r0 = r23
            long r0 = r0.getCid()
            r24 = r0
            r0 = r23
            boolean r0 = r0.f71606g1
            if (r0 == 0) goto L6d
            r0 = r23
            java.lang.String r0 = r0.f71620v1
            r32 = r0
            r0 = r32
            r31 = r0
            r0 = r32
            if (r0 != 0) goto L73
        L6d:
            r0 = r23
            java.lang.String r0 = r0.getSpmid()
            r31 = r0
        L73:
            tv.danmaku.biliplayerv2.service.Video$DanmakuResolveParams r0 = new tv.danmaku.biliplayerv2.service.Video$DanmakuResolveParams
            r1 = r0
            r2 = r26
            r3 = r24
            r4 = r31
            r5 = r23
            long r5 = r5.f71598Y0
            r6 = r23
            long r6 = r6.getSeasonId()
            r7 = 0
            r8 = r29
            r9 = 0
            r10 = r23
            boolean r10 = r10.f71607h1
            r11 = 0
            r12 = 0
            r13 = r30
            r14 = 0
            r15 = 0
            r16 = 13984(0x36a0, float:1.9596E-41)
            r17 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.pub.play.OGVPlayableParams.getDanmakuResolveParams():tv.danmaku.biliplayerv2.service.Video$DanmakuResolveParams");
    }

    @Nullable
    public final String getDanmakuSpmid() {
        return this.f71620v1;
    }

    @NotNull
    public Video.DisplayParams getDisplayParams() {
        Video.DisplayParams displayParams = new Video.DisplayParams();
        String title = getTitle();
        String str = title;
        if (title == null) {
            str = "";
        }
        displayParams.setTitle(str);
        displayParams.setMid(getMid());
        displayParams.setAvid(getAvid());
        displayParams.setCid(getCid());
        String from = getFrom();
        String str2 = from;
        if (from == null) {
            str2 = "";
        }
        displayParams.setFrom(str2);
        displayParams.setDisplayRotate(this.f71604e1);
        String cover = getCover();
        if (cover == null) {
            cover = "";
        }
        displayParams.setCover(cover);
        displayParams.setDisplayOrientation(((double) this.f71604e1) <= 1.0d ? DisplayOrientation.LANDSCAPE : DisplayOrientation.VERTICAL);
        displayParams.setSeekIconUrl1(getSeekIconUrl1());
        displayParams.setSeekIconUrl2(getSeekIconUrl2());
        displayParams.setDragLeftIcon(getLeftSeekIcon());
        displayParams.setMiddleIcon(getMiddleSeekIcon());
        displayParams.setDragRightIcon(getRightSeekIcon());
        displayParams.setDragSpriteImg(getDragSpriteImg());
        displayParams.setDragSpriteMeta(getDragSpriteMeta());
        displayParams.setFinishSpriteImg(getFinishSpriteImg());
        displayParams.setFinishSpriteMeta(getFinishSpriteMeta());
        return displayParams;
    }

    public final float getDisplayRatio() {
        return this.f71604e1;
    }

    public final long getEpId() {
        return this.f71598Y0;
    }

    @NotNull
    public Video.FeedbackParams getFeedbackParams() {
        Video.FeedbackParams feedbackParams = new Video.FeedbackParams();
        feedbackParams.setAId(getAvid());
        feedbackParams.setCId(getCid());
        String fromSpmid = getFromSpmid();
        String str = fromSpmid;
        if (fromSpmid == null) {
            str = "";
        }
        feedbackParams.setFromSpmid(str);
        String spmid = getSpmid();
        if (spmid == null) {
            spmid = "";
        }
        feedbackParams.setSpmid(spmid);
        feedbackParams.setBangumi(true);
        feedbackParams.setSeasonId(getSeasonId());
        return feedbackParams;
    }

    public final boolean getFromInline() {
        return this.f71611l1;
    }

    public final int getInlineSceneInt() {
        return this.f71612n1;
    }

    public final int getInlineTypeInt() {
        return this.m1;
    }

    @Nullable
    public Video.b getInteractParams() {
        return getInteract();
    }

    @Nullable
    public final Function0<String> getInternalFromSpmidSupplier() {
        return this.f71603d1;
    }

    @NotNull
    public String getLogDescription() {
        String title = getTitle();
        long avid = getAvid();
        return c.a(b.a(avid, "title: ", title, ", aid: "), getCid(), ", cid: ");
    }

    public final long getMaterialId() {
        return this.f71614p1;
    }

    @Nullable
    public IMediaHistoryKeyParams getMediaHistoryKayParams() {
        return new C6750c(getSeasonId(), this.f71598Y0, getCid());
    }

    @NotNull
    public P2PParams getP2PParams() {
        return new P2PParams(getSeasonId(), this.f71598Y0, getAvid(), getCid(), 0L, getBizType(), 0L);
    }

    @Nullable
    public final Object getPreloadedResolveResult() {
        return this.f71623z1;
    }

    @NotNull
    public Video.c getProjectionParams() {
        Video.c cVar = new Video.c();
        cVar.a = 2;
        return cVar;
    }

    public final boolean getQualityTrial() {
        return this.f71619u1;
    }

    @Nullable
    public Video.ReportCommonParams getReportCommonParams() {
        if (!this.y1) {
            return null;
        }
        Video.ReportCommonParams reportCommonParams = new Video.ReportCommonParams();
        reportCommonParams.setAvid(getAvid());
        reportCommonParams.setCid(getCid());
        reportCommonParams.setSeasonId(getSeasonId());
        reportCommonParams.setEpId(String.valueOf(this.f71598Y0));
        reportCommonParams.setSpmid(String.valueOf(getSpmid()));
        Map legacyExtra = getLegacyExtra();
        Map mapEmptyMap = legacyExtra;
        if (legacyExtra == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map mutableMap = MapsKt.toMutableMap(mapEmptyMap);
        String fromSpmid = getFromSpmid();
        String str = fromSpmid;
        if (fromSpmid == null) {
            str = "0.0.0.0";
        }
        Function0<String> function0 = this.f71603d1;
        String str2 = function0 != null ? (String) function0.invoke() : null;
        LinkedHashMap linkedHashMapA = lh.c.a("from_outer_spmid", str);
        if (str2 != null) {
            str = str2;
        }
        reportCommonParams.setFromSpmid(str);
        if (this.f71613o1) {
            linkedHashMapA.put("material_no", String.valueOf(this.f71614p1));
        }
        if (this.f71617s1.length() > 0) {
            mutableMap.put("report_flow_data", this.f71617s1);
        }
        reportCommonParams.addExtra(linkedHashMapA);
        String jumpFrom = getJumpFrom();
        String str3 = jumpFrom;
        if (jumpFrom == null) {
            str3 = "";
        }
        reportCommonParams.setJumpFrom(str3);
        reportCommonParams.setType(4);
        reportCommonParams.setSubType(getSubType());
        Integer epStatus = getEpStatus();
        String strValueOf = null;
        if (epStatus != null) {
            strValueOf = String.valueOf(epStatus.intValue());
        }
        String str4 = strValueOf;
        if (strValueOf == null) {
            str4 = "";
        }
        reportCommonParams.setEpStatus(str4);
        reportCommonParams.setPlayType("2");
        reportCommonParams.setPlayStatus("1");
        reportCommonParams.setFromAutoPlay((this.f71608i1 || this.f71606g1) ? getFromAutoPlay() : this.f71609j1 ? 7 : 0);
        reportCommonParams.setListPlay(this.f71606g1);
        String trackId = getTrackId();
        if (trackId == null) {
            trackId = "";
        }
        reportCommonParams.setTrackId(trackId);
        reportCommonParams.setLegacyExtra(mutableMap);
        return reportCommonParams;
    }

    public final boolean getReportEnabled() {
        return this.y1;
    }

    @NotNull
    public final String getReportFlowData() {
        return this.f71617s1;
    }

    @Nullable
    public IResolveParams getResolveParams() {
        GeminiCommonResolverParams geminiCommonResolverParams;
        int i7 = 2;
        if (Intrinsics.areEqual(this.f71616r1, "vod_common")) {
            geminiCommonResolverParams = new GeminiCommonResolverParams();
            geminiCommonResolverParams.setMFrom(geminiCommonResolverParams.getFrom());
            geminiCommonResolverParams.setAvid(getAvid());
            geminiCommonResolverParams.setCid(getCid());
            geminiCommonResolverParams.setPage(getPage());
            geminiCommonResolverParams.setFnVal(getFnVal());
            geminiCommonResolverParams.setFnVer(getFnVer());
            geminiCommonResolverParams.setRealQuality(getExpectedQuality());
            geminiCommonResolverParams.setRequestFromDownloader(0);
            if (!isEnableSafeConnection()) {
                i7 = 0;
            }
            geminiCommonResolverParams.setDomainParams(i7);
            geminiCommonResolverParams.setFromSpmid(getFromSpmid());
            geminiCommonResolverParams.setSpmid(getSpmid());
            geminiCommonResolverParams.setResolveFromDownloadedFile(getNeedResolveFromLocalCache());
            geminiCommonResolverParams.setExtraContent(getExtraContentForResolve());
            geminiCommonResolverParams.setAdExtra(getAdExtra());
            geminiCommonResolverParams.setForceLocalOnly(getForceLocalOnly());
        } else if (Intrinsics.areEqual(this.f71616r1, "bangumi")) {
            GeminiCommonResolverParams oGVResolverParams = new OGVResolverParams();
            ((OGVResolverParams) oGVResolverParams).c = getExpectedQuality();
            ((OGVResolverParams) oGVResolverParams).f = getCid();
            ((OGVResolverParams) oGVResolverParams).e = getSeasonId();
            ((OGVResolverParams) oGVResolverParams).d = this.f71598Y0;
            ((OGVResolverParams) oGVResolverParams).h = getFnVal();
            ((OGVResolverParams) oGVResolverParams).g = getFnVer();
            ((OGVResolverParams) oGVResolverParams).j = getSpmid();
            ((OGVResolverParams) oGVResolverParams).k = getFromSpmid();
            ((OGVResolverParams) oGVResolverParams).m = this.f71602c1;
            ((OGVResolverParams) oGVResolverParams).o = this.f71610k1;
            ((OGVResolverParams) oGVResolverParams).p = isSmallWindow();
            ((OGVResolverParams) oGVResolverParams).q = this.f71611l1;
            InlineScene inlineSceneForNumber = InlineScene.forNumber(this.f71612n1);
            InlineScene inlineScene = inlineSceneForNumber;
            if (inlineSceneForNumber == null) {
                inlineScene = InlineScene.UNKNOWN;
            }
            ((OGVResolverParams) oGVResolverParams).r = inlineScene;
            ((OGVResolverParams) oGVResolverParams).s = this.f71614p1;
            ((OGVResolverParams) oGVResolverParams).t = this.f71619u1;
            ((OGVResolverParams) oGVResolverParams).v = getNeedResolveFromLocalCache();
            ((OGVResolverParams) oGVResolverParams).w = this.f71623z1;
            this.f71623z1 = null;
            geminiCommonResolverParams = oGVResolverParams;
        } else {
            GeminiCommonResolverParams uGCResolverParams = new UGCResolverParams();
            uGCResolverParams.setMFrom("vupload");
            uGCResolverParams.setAvid(getAvid());
            uGCResolverParams.setCid(getCid());
            uGCResolverParams.setRealQuality(getExpectedQuality());
            uGCResolverParams.setFnVer(getFnVer());
            uGCResolverParams.setFnVal(getFnVal());
            uGCResolverParams.setRequestFromDownloader(0);
            if (!isEnableSafeConnection()) {
                i7 = 0;
            }
            uGCResolverParams.setDomainParams(i7);
            uGCResolverParams.setFromSpmid(getFromSpmid());
            uGCResolverParams.setSpmid(getSpmid());
            uGCResolverParams.setTeenagerMode(Hj0.b.a() ? 1 : 0);
            uGCResolverParams.setPreferCodecType(IjkCodecHelper.isAv1Support() ? IjkMediaAsset.VideoCodecType.AV1 : IjkOptionsHelper.isHevcEnable(FoundationAlias.getFapp()) ? IjkMediaAsset.VideoCodecType.H265 : IjkMediaAsset.VideoCodecType.H264);
            uGCResolverParams.setResolveFromDownloadedFile(getNeedResolveFromLocalCache());
            geminiCommonResolverParams = uGCResolverParams;
        }
        return geminiCommonResolverParams;
    }

    @NotNull
    public final String getResolverType() {
        return this.f71616r1;
    }

    public final long getRoomId() {
        return this.f71602c1;
    }

    @Nullable
    public final String getSessionId() {
        return this.f71618t1;
    }

    public final boolean getShowsDanmaku() {
        return this.f71621w1;
    }

    /* JADX INFO: renamed from: getTotalDuration-UwyO8pc, reason: not valid java name */
    public final long m7593getTotalDurationUwyO8pc() {
        return this.f71615q1;
    }

    @Nullable
    public final String getUpperAvatar() {
        return this.f71601b1;
    }

    @Nullable
    public final Long getUpperId() {
        return this.f71599Z0;
    }

    @Nullable
    public final String getUpperName() {
        return this.f71600a1;
    }

    @NotNull
    public String id() {
        return String.valueOf(this.f71598Y0);
    }

    public final boolean isDownloaded() {
        return this.f71622x1;
    }

    public final boolean isFromShare() {
        return this.f71608i1;
    }

    public final boolean isHeClip() {
        return this.f71613o1;
    }

    public final boolean isInline() {
        return this.f71606g1;
    }

    public final boolean isPaster() {
        return this.f71605f1;
    }

    public final boolean isPlayList() {
        return this.f71610k1;
    }

    public final boolean isRemoteStrategyAutoContinue() {
        return this.f71609j1;
    }

    public final boolean isTogetherWatch() {
        return this.f71607h1;
    }

    public final void markPreviewVideo() {
        this.m1 = 3;
    }

    public final void setDanmakuSpmid(@Nullable String str) {
        this.f71620v1 = str;
    }

    public final void setDisplayRatio(float f7) {
        this.f71604e1 = f7;
    }

    public final void setDownloaded(boolean z6) {
        this.f71622x1 = z6;
    }

    public final void setEpId(long j7) {
        this.f71598Y0 = j7;
    }

    public final void setFromInline(boolean z6) {
        this.f71611l1 = z6;
    }

    public final void setFromShare(boolean z6) {
        this.f71608i1 = z6;
    }

    public final void setHeClip(boolean z6) {
        this.f71613o1 = z6;
    }

    public final void setInline(boolean z6) {
        this.f71606g1 = z6;
    }

    public final void setInlineSceneInt(int i7) {
        this.f71612n1 = i7;
    }

    public final void setInlineTypeInt(int i7) {
        this.m1 = i7;
    }

    public final void setInternalFromSpmidSupplier(@Nullable Function0<String> function0) {
        this.f71603d1 = function0;
    }

    public final void setMaterialId(long j7) {
        this.f71614p1 = j7;
    }

    public final void setPaster(boolean z6) {
        this.f71605f1 = z6;
    }

    public final void setPlayList(boolean z6) {
        this.f71610k1 = z6;
    }

    public final void setPreloadedResolveResult(@Nullable Object obj) {
        this.f71623z1 = obj;
    }

    public final void setQualityTrial(boolean z6) {
        this.f71619u1 = z6;
    }

    public final void setRemoteStrategyAutoContinue(boolean z6) {
        this.f71609j1 = z6;
    }

    public final void setReportEnabled(boolean z6) {
        this.y1 = z6;
    }

    public final void setReportFlowData(@NotNull String str) {
        this.f71617s1 = str;
    }

    public final void setResolverType(@NotNull String str) {
        this.f71616r1 = str;
    }

    public final void setRoomId(long j7) {
        this.f71602c1 = j7;
    }

    public final void setSessionId(@Nullable String str) {
        this.f71618t1 = str;
    }

    public final void setShowsDanmaku(boolean z6) {
        this.f71621w1 = z6;
    }

    public final void setTogetherWatch(boolean z6) {
        this.f71607h1 = z6;
    }

    /* JADX INFO: renamed from: setTotalDuration-LRDsOJo, reason: not valid java name */
    public final void m7594setTotalDurationLRDsOJo(long j7) {
        this.f71615q1 = j7;
    }

    public final void setUpperAvatar(@Nullable String str) {
        this.f71601b1 = str;
    }

    public final void setUpperId(@Nullable Long l7) {
        this.f71599Z0 = l7;
    }

    public final void setUpperName(@Nullable String str) {
        this.f71600a1 = str;
    }
}
