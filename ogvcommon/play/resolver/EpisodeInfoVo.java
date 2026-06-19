package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.fragment.app.A;
import androidx.media3.common.G;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/EpisodeInfoVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class EpisodeInfoVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ep_id")
    private final long f73208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f73209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f73210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("ep_status")
    private final int f73211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("season_info")
    @Nullable
    private final SeasonInfoVo f73212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f73213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("long_title")
    @Nullable
    private final String f73214g;

    public EpisodeInfoVo(long j7, long j8, long j9, int i7, @Nullable SeasonInfoVo seasonInfoVo, @Nullable String str, @Nullable String str2) {
        this.f73208a = j7;
        this.f73209b = j8;
        this.f73210c = j9;
        this.f73211d = i7;
        this.f73212e = seasonInfoVo;
        this.f73213f = str;
        this.f73214g = str2;
    }

    public final long a() {
        return this.f73208a;
    }

    public final int b() {
        return this.f73211d;
    }

    @Nullable
    public final String c() {
        return this.f73214g;
    }

    @Nullable
    public final SeasonInfoVo d() {
        return this.f73212e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodeInfoVo)) {
            return false;
        }
        EpisodeInfoVo episodeInfoVo = (EpisodeInfoVo) obj;
        return this.f73208a == episodeInfoVo.f73208a && this.f73209b == episodeInfoVo.f73209b && this.f73210c == episodeInfoVo.f73210c && this.f73211d == episodeInfoVo.f73211d && Intrinsics.areEqual(this.f73212e, episodeInfoVo.f73212e) && Intrinsics.areEqual(this.f73213f, episodeInfoVo.f73213f) && Intrinsics.areEqual(this.f73214g, episodeInfoVo.f73214g);
    }

    public final int hashCode() {
        int iA = I.a(this.f73211d, C3554n0.a(C3554n0.a(Long.hashCode(this.f73208a) * 31, 31, this.f73209b), 31, this.f73210c), 31);
        SeasonInfoVo seasonInfoVo = this.f73212e;
        int iHashCode = 0;
        int iHashCode2 = seasonInfoVo == null ? 0 : seasonInfoVo.hashCode();
        String str = this.f73213f;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f73214g;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return ((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        long j7 = this.f73208a;
        int i7 = this.f73211d;
        SeasonInfoVo seasonInfoVo = this.f73212e;
        String str = this.f73214g;
        StringBuilder sbA = z.a(j7, "EpisodeInfoVo(epId=", ", cid=");
        sbA.append(this.f73209b);
        sbA.append(", aid=");
        G.a(i7, this.f73210c, ", epStatus=", sbA);
        sbA.append(", seasonInfo=");
        sbA.append(seasonInfoVo);
        sbA.append(", title=");
        return A.a(this.f73213f, ", longTitle=", str, ")", sbA);
    }
}
