package com.bilibili.bililive.listplayer.videonew.player;

import Ld.c;
import com.bilibili.app.gemini.base.player.GeminiCommonResolverParams;
import com.bilibili.lib.media.resolver2.IResolveParams;
import com.bilibili.player.history.IMediaHistoryKeyParams;
import com.bilibili.playerbizcommon.features.background.b;
import cq0.C6748a;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.DisplayOrientation;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.videoplayer.coreV2.VideoBizType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/player/InlineUgcPlayableParams.class */
public class InlineUgcPlayableParams extends BaseInlinePlayableParams {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public String f62952A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public String f62953B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public String f62954C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public String f62955D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public String f62956E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f62957F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public String f62958G = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public Video.b f62959H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Nullable
    public String f62960I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public String f62961J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f62962K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f62963L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public String f62964M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public String f62965N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f62966O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public String f62967P;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f62968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f62969x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f62970y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f62971z;

    public InlineUgcPlayableParams() {
        setFrom("vupload");
        setBizType(VideoBizType.UGC);
    }

    @Nullable
    public final String getAuthor() {
        return this.f62956E;
    }

    public final long getAvid() {
        return this.f62968w;
    }

    @NotNull
    public final String getBvId() {
        return this.f62958G;
    }

    public final long getCid() {
        return this.f62969x;
    }

    @Nullable
    public final String getCover() {
        return this.f62955D;
    }

    @Nullable
    public Video.DanmakuResolveParams getDanmakuResolveParams() {
        Video.DanmakuResolveParams danmakuResolveParams;
        if (isShowDanmaku()) {
            long j7 = this.f62968w;
            long j8 = this.f62969x;
            String spmid = getSpmid();
            int i7 = this.f62970y;
            String from = getFrom();
            if (from == null) {
                from = "";
            }
            String str = this.f62952A;
            if (str == null) {
                str = "";
            }
            danmakuResolveParams = new Video.DanmakuResolveParams(j7, j8, spmid, 0L, 0L, i7, from, str, false, (String) null, 0, (Object) null, (String) null, (String) null, 16128, (DefaultConstructorMarker) null);
        } else {
            danmakuResolveParams = null;
        }
        return danmakuResolveParams;
    }

    @NotNull
    public Video.DisplayParams getDisplayParams() {
        Video.DisplayParams displayParams = new Video.DisplayParams();
        String str = this.f62953B;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        displayParams.setTitle(str2);
        displayParams.setMid(this.f62971z);
        String str3 = this.f62955D;
        String str4 = str3;
        if (str3 == null) {
            str4 = "";
        }
        displayParams.setCover(str4);
        String str5 = this.f62956E;
        String str6 = str5;
        if (str5 == null) {
            str6 = "";
        }
        displayParams.setAuthor(str6);
        String from = getFrom();
        if (from == null) {
            from = "";
        }
        displayParams.setFrom(from);
        displayParams.setAvid(this.f62968w);
        displayParams.setCid(this.f62969x);
        displayParams.setDisplayRotate(this.f62957F);
        displayParams.setDisplayOrientation(((double) this.f62957F) <= 1.0d ? DisplayOrientation.LANDSCAPE : DisplayOrientation.VERTICAL);
        displayParams.setSeekIconUrl1(this.f62960I);
        displayParams.setSeekIconUrl2(this.f62961J);
        return displayParams;
    }

    public final float getDisplayRotate() {
        return this.f62957F;
    }

    public final int getDuration() {
        return this.f62962K;
    }

    @NotNull
    public Video.FeedbackParams getFeedbackParams() {
        Video.FeedbackParams feedbackParams = new Video.FeedbackParams();
        feedbackParams.setAId(this.f62968w);
        feedbackParams.setCId(this.f62969x);
        String spmid = getSpmid();
        String str = spmid;
        if (spmid == null) {
            str = "";
        }
        feedbackParams.setSpmid(str);
        String fromSpmid = getFromSpmid();
        if (fromSpmid == null) {
            fromSpmid = "";
        }
        feedbackParams.setFromSpmid(fromSpmid);
        return feedbackParams;
    }

    @Nullable
    public final String getHistorySource() {
        return this.f62967P;
    }

    @Nullable
    public final Video.b getInteract() {
        return this.f62959H;
    }

    @Nullable
    public final String getLink() {
        return this.f62952A;
    }

    @NotNull
    public String getLogDescription() {
        String str = this.f62953B;
        long j7 = this.f62968w;
        return c.a(b.a(j7, "title: ", str, ", aid: "), this.f62969x, ", cid: ");
    }

    @Nullable
    public IMediaHistoryKeyParams getMediaHistoryKayParams() {
        return new C6748a(this.f62969x);
    }

    public final long getMid() {
        return this.f62971z;
    }

    public final int getPage() {
        return this.f62970y;
    }

    @Nullable
    public final String getPageTitle() {
        return this.f62954C;
    }

    @NotNull
    public Video.ReportCommonParams getReportCommonParams() {
        Video.ReportCommonParams reportCommonParams = new Video.ReportCommonParams();
        reportCommonParams.setAvid(this.f62968w);
        reportCommonParams.setCid(this.f62969x);
        String jumpFrom = getJumpFrom();
        String str = jumpFrom;
        if (jumpFrom == null) {
            str = "";
        }
        reportCommonParams.setJumpFrom(str);
        String spmid = getSpmid();
        String str2 = spmid;
        if (spmid == null) {
            str2 = "";
        }
        reportCommonParams.setSpmid(str2);
        String fromSpmid = getFromSpmid();
        String str3 = fromSpmid;
        if (fromSpmid == null) {
            str3 = "";
        }
        reportCommonParams.setFromSpmid(str3);
        reportCommonParams.setPlayType("1");
        reportCommonParams.setPlayStatus("0");
        reportCommonParams.setType(3);
        reportCommonParams.setFromAutoPlay(getFromAutoPlay());
        reportCommonParams.setListPlay(true);
        String trackId = getTrackId();
        if (trackId == null) {
            trackId = "";
        }
        reportCommonParams.setTrackId(trackId);
        reportCommonParams.setLegacyExtra(getLegacyExtra());
        Map extraJsonParams = getExtraJsonParams();
        if (extraJsonParams != null) {
            reportCommonParams.addExtra(extraJsonParams);
        }
        return reportCommonParams;
    }

    @NotNull
    public IResolveParams getResolveParams() {
        GeminiCommonResolverParams geminiCommonResolverParams = new GeminiCommonResolverParams();
        geminiCommonResolverParams.setAvid(this.f62968w);
        geminiCommonResolverParams.setCid(this.f62969x);
        geminiCommonResolverParams.setRealQuality(getExpectedQuality());
        int i7 = 0;
        geminiCommonResolverParams.setRequestFromDownloader(0);
        if (isEnableSafeConnection()) {
            i7 = 2;
        }
        geminiCommonResolverParams.setDomainParams(i7);
        geminiCommonResolverParams.setFromSpmid(getFromSpmid());
        geminiCommonResolverParams.setSpmid(getSpmid());
        geminiCommonResolverParams.setContentCtrl(GeminiCommonResolverParams.ContentCtrl.SIMPLIFY);
        return geminiCommonResolverParams;
    }

    @Nullable
    public final String getSeekIconUrl1() {
        return this.f62960I;
    }

    @Nullable
    public final String getSeekIconUrl2() {
        return this.f62961J;
    }

    public final int getSelected() {
        return this.f62966O;
    }

    @Nullable
    public final String getTitle() {
        return this.f62953B;
    }

    @Nullable
    public final String getUpFace() {
        return this.f62965N;
    }

    @Nullable
    public final String getUpName() {
        return this.f62964M;
    }

    @NotNull
    public String id() {
        return String.valueOf(this.f62969x);
    }

    public final boolean isLast() {
        return this.f62963L;
    }

    public final void setAuthor(@Nullable String str) {
        this.f62956E = str;
    }

    public final void setAvid(long j7) {
        this.f62968w = j7;
    }

    public final void setBvId(@NotNull String str) {
        this.f62958G = str;
    }

    public final void setCid(long j7) {
        this.f62969x = j7;
    }

    public final void setCover(@Nullable String str) {
        this.f62955D = str;
    }

    public final void setDisplayRotate(float f7) {
        this.f62957F = f7;
    }

    public final void setDuration(int i7) {
        this.f62962K = i7;
    }

    public final void setHistorySource(@Nullable String str) {
        this.f62967P = str;
    }

    public final void setInteract(@Nullable Video.b bVar) {
        this.f62959H = bVar;
    }

    public final void setLast(boolean z6) {
        this.f62963L = z6;
    }

    public final void setLink(@Nullable String str) {
        this.f62952A = str;
    }

    public final void setMid(long j7) {
        this.f62971z = j7;
    }

    public final void setPage(int i7) {
        this.f62970y = i7;
    }

    public final void setPageTitle(@Nullable String str) {
        this.f62954C = str;
    }

    public final void setSeekIconUrl1(@Nullable String str) {
        this.f62960I = str;
    }

    public final void setSeekIconUrl2(@Nullable String str) {
        this.f62961J = str;
    }

    public final void setSelected(int i7) {
        this.f62966O = i7;
    }

    public final void setTitle(@Nullable String str) {
        this.f62953B = str;
    }

    public final void setUpFace(@Nullable String str) {
        this.f62965N = str;
    }

    public final void setUpName(@Nullable String str) {
        this.f62964M = str;
    }
}
