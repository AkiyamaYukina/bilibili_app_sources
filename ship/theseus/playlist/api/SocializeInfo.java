package com.bilibili.ship.theseus.playlist.api;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.G;
import androidx.paging.M;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/SocializeInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class SocializeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("play_switch")
    private final int f95312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f95313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f95314g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f95315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("view_text_1")
    @NotNull
    private final String f95316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f95317k;

    public SocializeInfo() {
        this(0, 0, 0L, 0L, 0, 0, 0, 0, 0, null, 0, 2047);
    }

    public SocializeInfo(int i7, int i8, long j7, long j8, int i9, int i10, int i11, int i12, int i13, @NotNull String str, int i14) {
        this.f95308a = i7;
        this.f95309b = i8;
        this.f95310c = j7;
        this.f95311d = j8;
        this.f95312e = i9;
        this.f95313f = i10;
        this.f95314g = i11;
        this.h = i12;
        this.f95315i = i13;
        this.f95316j = str;
        this.f95317k = i14;
    }

    public /* synthetic */ SocializeInfo(int i7, int i8, long j7, long j8, int i9, int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        this((i15 & 1) != 0 ? 0 : i7, (i15 & 2) != 0 ? 0 : i8, (i15 & 4) != 0 ? 0L : j7, (i15 & 8) != 0 ? 0L : j8, (i15 & 16) != 0 ? 0 : i9, (i15 & 32) != 0 ? 0 : i10, (i15 & 64) != 0 ? 0 : i11, (i15 & 128) != 0 ? 0 : i12, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? "" : str, (i15 & 1024) != 0 ? 0 : i14);
    }

    public static SocializeInfo a(SocializeInfo socializeInfo, int i7, int i8, int i9, int i10) {
        int i11 = socializeInfo.f95308a;
        if ((i10 & 2) != 0) {
            i7 = socializeInfo.f95309b;
        }
        long j7 = socializeInfo.f95310c;
        long j8 = socializeInfo.f95311d;
        int i12 = socializeInfo.f95312e;
        int i13 = socializeInfo.f95313f;
        if ((i10 & 64) != 0) {
            i8 = socializeInfo.f95314g;
        }
        int i14 = socializeInfo.h;
        if ((i10 & 256) != 0) {
            i9 = socializeInfo.f95315i;
        }
        String str = socializeInfo.f95316j;
        int i15 = socializeInfo.f95317k;
        socializeInfo.getClass();
        return new SocializeInfo(i11, i7, j7, j8, i12, i13, i8, i14, i9, str, i15);
    }

    public final int b() {
        return this.f95312e;
    }

    @NotNull
    public final String c() {
        return this.f95316j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocializeInfo)) {
            return false;
        }
        SocializeInfo socializeInfo = (SocializeInfo) obj;
        return this.f95308a == socializeInfo.f95308a && this.f95309b == socializeInfo.f95309b && this.f95310c == socializeInfo.f95310c && this.f95311d == socializeInfo.f95311d && this.f95312e == socializeInfo.f95312e && this.f95313f == socializeInfo.f95313f && this.f95314g == socializeInfo.f95314g && this.h == socializeInfo.h && this.f95315i == socializeInfo.f95315i && Intrinsics.areEqual(this.f95316j, socializeInfo.f95316j) && this.f95317k == socializeInfo.f95317k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95317k) + E.a(I.a(this.f95315i, I.a(this.h, I.a(this.f95314g, I.a(this.f95313f, I.a(this.f95312e, C3554n0.a(C3554n0.a(I.a(this.f95309b, Integer.hashCode(this.f95308a) * 31, 31), 31, this.f95310c), 31, this.f95311d), 31), 31), 31), 31), 31), 31, this.f95316j);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f95312e;
        String str = this.f95316j;
        StringBuilder sb = new StringBuilder("SocializeInfo(coin=");
        sb.append(this.f95308a);
        sb.append(", collect=");
        sb.append(this.f95309b);
        sb.append(", danmaku=");
        sb.append(this.f95310c);
        sb.append(", play=");
        G.a(i7, this.f95311d, ", iconType=", sb);
        sb.append(", reply=");
        sb.append(this.f95313f);
        sb.append(", share=");
        sb.append(this.f95314g);
        sb.append(", thumbDown=");
        sb.append(this.h);
        sb.append(", thumbUp=");
        M.a(this.f95315i, ", viewContent=", str, ", vt=", sb);
        return C4277b.a(this.f95317k, ")", sb);
    }
}
