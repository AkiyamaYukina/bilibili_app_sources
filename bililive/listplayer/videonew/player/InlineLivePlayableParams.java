package com.bilibili.bililive.listplayer.videonew.player;

import androidx.transition.x;
import bilibili.live.app.service.resolver.LiveResolveParams;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/player/InlineLivePlayableParams.class */
public final class InlineLivePlayableParams extends BaseInlinePlayableParams {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public String f62944A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public String f62945B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public String f62946C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f62947D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f62948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f62949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public String f62950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public String f62951z;

    public InlineLivePlayableParams() {
        setFrom("live");
    }

    @Nullable
    public final String getAuthor() {
        return this.f62945B;
    }

    @NotNull
    public final String getBusiness() {
        return this.f62946C;
    }

    @Nullable
    public final String getCover() {
        return this.f62944A;
    }

    @Nullable
    public Video.DanmakuResolveParams getDanmakuResolveParams() {
        Video.DanmakuResolveParams danmakuResolveParams;
        if (isShowDanmaku()) {
            long j7 = this.f62948w;
            String spmid = getSpmid();
            String from = getFrom();
            if (from == null) {
                from = "";
            }
            String str = this.f62950y;
            if (str == null) {
                str = "";
            }
            danmakuResolveParams = new Video.DanmakuResolveParams(j7, -1L, spmid, 0L, 0L, 1, from, str, false, (String) null, 0, (Object) null, (String) null, (String) null, 16128, (DefaultConstructorMarker) null);
        } else {
            danmakuResolveParams = null;
        }
        return danmakuResolveParams;
    }

    @NotNull
    public Video.DisplayParams getDisplayParams() {
        return new Video.DisplayParams();
    }

    @NotNull
    public Video.FeedbackParams getFeedbackParams() {
        return new Video.FeedbackParams();
    }

    @Nullable
    public final String getLink() {
        return this.f62950y;
    }

    public final int getLiveScene() {
        return this.f62947D;
    }

    @NotNull
    public String getLogDescription() {
        String str = this.f62946C;
        String str2 = this.f62951z;
        long j7 = this.f62948w;
        StringBuilder sbA = x.a(str, " title: ", str2, ", roomId: ");
        sbA.append(j7);
        return sbA.toString();
    }

    public final long getMid() {
        return this.f62949x;
    }

    @NotNull
    public Video.ReportCommonParams getReportCommonParams() {
        Video.ReportCommonParams reportCommonParams = new Video.ReportCommonParams();
        reportCommonParams.setRoomId(this.f62948w);
        setFrom(getFrom());
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
        if (fromSpmid == null) {
            fromSpmid = "";
        }
        reportCommonParams.setFromSpmid(fromSpmid);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("live_scene", String.valueOf(this.f62947D));
        reportCommonParams.setLegacyExtra(MapsKt.build(mapCreateMapBuilder));
        return reportCommonParams;
    }

    @NotNull
    /* JADX INFO: renamed from: getResolveParams, reason: merged with bridge method [inline-methods] */
    public LiveResolveParams m6582getResolveParams() {
        LiveResolveParams liveResolveParams = new LiveResolveParams();
        liveResolveParams.setRoomId(this.f62948w);
        liveResolveParams.setLink(this.f62950y);
        return liveResolveParams;
    }

    public final long getRoomId() {
        return this.f62948w;
    }

    @Nullable
    public final String getTitle() {
        return this.f62951z;
    }

    @NotNull
    public String id() {
        return String.valueOf(this.f62948w);
    }

    public final void setAuthor(@Nullable String str) {
        this.f62945B = str;
    }

    public final void setBusiness(@NotNull String str) {
        this.f62946C = str;
    }

    public final void setCover(@Nullable String str) {
        this.f62944A = str;
    }

    public final void setLink(@Nullable String str) {
        this.f62950y = str;
    }

    public final void setLiveScene(int i7) {
        this.f62947D = i7;
    }

    public final void setMid(long j7) {
        this.f62949x = j7;
    }

    public final void setRoomId(long j7) {
        this.f62948w = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.f62951z = str;
    }
}
