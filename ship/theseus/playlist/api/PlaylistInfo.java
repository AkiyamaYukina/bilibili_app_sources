package com.bilibili.ship.theseus.playlist.api;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/PlaylistInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class PlaylistInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cnt_info")
    @Nullable
    private final SocializeInfo f95270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bv_id")
    @NotNull
    private final String f95271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f95273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f95274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f95275g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f95276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f95277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f95278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f95279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f95280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f95281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f95282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final Upper f95283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("fav_btn")
    @Nullable
    private final FavoriteButtonStr f95284q;

    public PlaylistInfo() {
        this(0, null, null, 0, 0L, 0, 0, 0, 0L, null, 0, 0, 0L, null, 0, null, null, 131071);
    }

    public PlaylistInfo(int i7, @Nullable SocializeInfo socializeInfo, @NotNull String str, int i8, long j7, int i9, int i10, int i11, long j8, @NotNull String str2, int i12, int i13, long j9, @NotNull String str3, int i14, @Nullable Upper upper, @Nullable FavoriteButtonStr favoriteButtonStr) {
        this.f95269a = i7;
        this.f95270b = socializeInfo;
        this.f95271c = str;
        this.f95272d = i8;
        this.f95273e = j7;
        this.f95274f = i9;
        this.f95275g = i10;
        this.h = i11;
        this.f95276i = j8;
        this.f95277j = str2;
        this.f95278k = i12;
        this.f95279l = i13;
        this.f95280m = j9;
        this.f95281n = str3;
        this.f95282o = i14;
        this.f95283p = upper;
        this.f95284q = favoriteButtonStr;
    }

    public /* synthetic */ PlaylistInfo(int i7, SocializeInfo socializeInfo, String str, int i8, long j7, int i9, int i10, int i11, long j8, String str2, int i12, int i13, long j9, String str3, int i14, Upper upper, FavoriteButtonStr favoriteButtonStr, int i15) {
        this((i15 & 1) != 0 ? 0 : i7, (i15 & 2) != 0 ? null : socializeInfo, (i15 & 4) != 0 ? "" : str, (i15 & 8) != 0 ? 0 : i8, (i15 & 16) != 0 ? 0L : j7, (i15 & 32) != 0 ? 0 : i9, (i15 & 64) != 0 ? 0 : i10, (i15 & 128) != 0 ? 0 : i11, (i15 & 256) != 0 ? 0L : j8, (i15 & 512) != 0 ? "" : str2, (i15 & 1024) != 0 ? 0 : i12, (i15 & 2048) != 0 ? 0 : i13, (i15 & 4096) != 0 ? 0L : j9, (i15 & 8192) != 0 ? "" : str3, (i15 & 16384) != 0 ? 0 : i14, (32768 & i15) != 0 ? null : upper, (i15 & 65536) != 0 ? null : favoriteButtonStr);
    }

    public static PlaylistInfo a(PlaylistInfo playlistInfo, SocializeInfo socializeInfo, int i7, int i8, int i9, int i10, int i11) {
        int i12 = playlistInfo.f95269a;
        if ((i11 & 2) != 0) {
            socializeInfo = playlistInfo.f95270b;
        }
        String str = playlistInfo.f95271c;
        int i13 = playlistInfo.f95272d;
        long j7 = playlistInfo.f95273e;
        if ((i11 & 32) != 0) {
            i7 = playlistInfo.f95274f;
        }
        int i14 = playlistInfo.f95275g;
        int i15 = playlistInfo.h;
        long j8 = playlistInfo.f95276i;
        String str2 = playlistInfo.f95277j;
        if ((i11 & 1024) != 0) {
            i8 = playlistInfo.f95278k;
        }
        if ((i11 & 2048) != 0) {
            i9 = playlistInfo.f95279l;
        }
        long j9 = playlistInfo.f95280m;
        String str3 = playlistInfo.f95281n;
        if ((i11 & 16384) != 0) {
            i10 = playlistInfo.f95282o;
        }
        Upper upper = playlistInfo.f95283p;
        FavoriteButtonStr favoriteButtonStr = playlistInfo.f95284q;
        playlistInfo.getClass();
        return new PlaylistInfo(i12, socializeInfo, str, i13, j7, i7, i14, i15, j8, str2, i8, i9, j9, str3, i10, upper, favoriteButtonStr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r3 = this;
            r0 = r3
            int r0 = r0.f95275g
            r4 = r0
            r0 = r4
            r1 = 10
            int r0 = r0 >> r1
            r1 = 1
            r0 = r0 & r1
            r1 = 1
            if (r0 != r1) goto L17
            r0 = r3
            java.lang.String r0 = r0.f95277j
            r5 = r0
            goto L37
        L17:
            r0 = r4
            r1 = 1
            int r0 = r0 >> r1
            r1 = 1
            r0 = r0 & r1
            r1 = 1
            if (r0 != r1) goto L34
            r0 = r3
            com.bilibili.ship.theseus.playlist.api.Upper r0 = r0.f95283p
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L34
            r0 = r5
            java.lang.String r0 = r0.f95319a
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L37
        L34:
            java.lang.String r0 = ""
            r5 = r0
        L37:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.api.PlaylistInfo.b():java.lang.String");
    }

    @NotNull
    public final PlaylistInfo c() {
        SocializeInfo socializeInfo = this.f95270b;
        return a(this, socializeInfo != null ? SocializeInfo.a(socializeInfo, 0, 0, socializeInfo.f95315i - 1, 1791) : null, 0, 0, 0, 0, 130045);
    }

    @NotNull
    public final String d() {
        return this.f95271c;
    }

    @Nullable
    public final FavoriteButtonStr e() {
        return this.f95284q;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaylistInfo)) {
            return false;
        }
        PlaylistInfo playlistInfo = (PlaylistInfo) obj;
        return this.f95269a == playlistInfo.f95269a && Intrinsics.areEqual(this.f95270b, playlistInfo.f95270b) && Intrinsics.areEqual(this.f95271c, playlistInfo.f95271c) && this.f95272d == playlistInfo.f95272d && this.f95273e == playlistInfo.f95273e && this.f95274f == playlistInfo.f95274f && this.f95275g == playlistInfo.f95275g && this.h == playlistInfo.h && this.f95276i == playlistInfo.f95276i && Intrinsics.areEqual(this.f95277j, playlistInfo.f95277j) && this.f95278k == playlistInfo.f95278k && this.f95279l == playlistInfo.f95279l && this.f95280m == playlistInfo.f95280m && Intrinsics.areEqual(this.f95281n, playlistInfo.f95281n) && this.f95282o == playlistInfo.f95282o && Intrinsics.areEqual(this.f95283p, playlistInfo.f95283p) && Intrinsics.areEqual(this.f95284q, playlistInfo.f95284q);
    }

    @Nullable
    public final SocializeInfo f() {
        return this.f95270b;
    }

    @NotNull
    public final PlaylistInfo g() {
        SocializeInfo socializeInfo = this.f95270b;
        return a(this, socializeInfo != null ? SocializeInfo.a(socializeInfo, 0, 0, socializeInfo.f95315i + 1, 1791) : null, 0, 1, 0, 0, 130045);
    }

    @NotNull
    public final PlaylistInfo h() {
        SocializeInfo socializeInfo = this.f95270b;
        return a(this, socializeInfo != null ? SocializeInfo.a(socializeInfo, 0, socializeInfo.f95314g + 1, 0, 1983) : null, 0, 0, 0, 0, 131069);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f95269a);
        SocializeInfo socializeInfo = this.f95270b;
        int iHashCode2 = 0;
        int iA = I.a(this.f95282o, E.a(C3554n0.a(I.a(this.f95279l, I.a(this.f95278k, E.a(C3554n0.a(I.a(this.h, I.a(this.f95275g, I.a(this.f95274f, C3554n0.a(I.a(this.f95272d, E.a(((iHashCode * 31) + (socializeInfo == null ? 0 : socializeInfo.hashCode())) * 31, 31, this.f95271c), 31), 31, this.f95273e), 31), 31), 31), 31, this.f95276i), 31, this.f95277j), 31), 31), 31, this.f95280m), 31, this.f95281n), 31);
        Upper upper = this.f95283p;
        int iHashCode3 = upper == null ? 0 : upper.hashCode();
        FavoriteButtonStr favoriteButtonStr = this.f95284q;
        if (favoriteButtonStr != null) {
            iHashCode2 = favoriteButtonStr.hashCode();
        }
        return ((iA + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final PlaylistInfo i(boolean z6) {
        SocializeInfo socializeInfoA;
        SocializeInfo socializeInfo = this.f95270b;
        if (socializeInfo != null) {
            int i7 = socializeInfo.f95309b;
            socializeInfoA = SocializeInfo.a(socializeInfo, z6 ? i7 + 1 : Math.max(0, i7 - 1), 0, 0, 2045);
        } else {
            socializeInfoA = null;
        }
        return a(this, socializeInfoA, z6 ? 1 : 0, 0, 0, 0, 131037);
    }

    @NotNull
    public final String toString() {
        return "PlaylistInfo(attr=" + this.f95269a + ", socializeInfo=" + this.f95270b + ", cover=" + this.f95271c + ", coverType=" + this.f95272d + ", ctime=" + this.f95273e + ", favState=" + this.f95274f + ", functions=" + this.f95275g + ", pageType=" + this.h + ", id=" + this.f95276i + ", intro=" + this.f95277j + ", likeState=" + this.f95278k + ", mediaCount=" + this.f95279l + ", mid=" + this.f95280m + ", title=" + this.f95281n + ", type=" + this.f95282o + ", upper=" + this.f95283p + ", favButtonStr=" + this.f95284q + ")";
    }
}
