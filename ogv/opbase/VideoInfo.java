package com.bilibili.ogv.opbase;

import G0.b;
import RQ.l;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineScene;
import com.bapis.bilibili.pgc.gateway.player.v2.InlineType;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/VideoInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VideoInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f69956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    public final long f69957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final InlineScene f69959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InlineType f69960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final ClipInfo f69961f;

    public VideoInfo(long j7, long j8, int i7, InlineScene inlineScene, InlineType inlineType, ClipInfo clipInfo, int i8) {
        inlineScene = (i8 & 8) != 0 ? InlineScene.UNKNOWN : inlineScene;
        inlineType = (i8 & 16) != 0 ? InlineType.TYPE_UNKNOWN : inlineType;
        this.f69956a = j7;
        this.f69957b = j8;
        this.f69958c = i7;
        this.f69959d = inlineScene;
        this.f69960e = inlineType;
        this.f69961f = clipInfo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return Duration.equals-impl0(this.f69956a, videoInfo.f69956a) && Duration.equals-impl0(this.f69957b, videoInfo.f69957b) && this.f69958c == videoInfo.f69958c && this.f69959d == videoInfo.f69959d && this.f69960e == videoInfo.f69960e && Intrinsics.areEqual(this.f69961f, videoInfo.f69961f);
    }

    public final int hashCode() {
        int iA = I.a(this.f69958c, l.a(Duration.hashCode-impl(this.f69956a) * 31, 31, this.f69957b), 31);
        int iHashCode = this.f69959d.hashCode();
        int iHashCode2 = this.f69960e.hashCode();
        ClipInfo clipInfo = this.f69961f;
        return ((iHashCode2 + ((iHashCode + iA) * 31)) * 31) + (clipInfo == null ? 0 : clipInfo.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sbA = b.a("VideoInfo(totalDuration=", Duration.toString-impl(this.f69956a), ", duration=", Duration.toString-impl(this.f69957b), ", autoSeek=");
        sbA.append(this.f69958c);
        sbA.append(", inlineScene=");
        sbA.append(this.f69959d);
        sbA.append(", inlineType=");
        sbA.append(this.f69960e);
        sbA.append(", clipInfo=");
        sbA.append(this.f69961f);
        sbA.append(")");
        return sbA.toString();
    }
}
