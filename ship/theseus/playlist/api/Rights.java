package com.bilibili.ship.theseus.playlist.api;

import Vn.A;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.d;
import androidx.media3.exoplayer.C4690e;
import com.bilibili.bson.common.Bson;
import com.bilibili.opd.app.bizcommon.hybridruntime.KFCHybridV2;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/api/Rights.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Rights {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("autoplay")
    private final int f95298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bp")
    private final int f95299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(KFCHybridV2.Configuration.MALL_DOWNLOAD_DOMAIN)
    private final int f95300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("elec")
    private final int f95301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("movie")
    private final int f95302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("no_reprint")
    private final int f95303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("pay")
    private final int f95304g;

    @SerializedName("ugc_pay")
    private final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("ugc_pay_preview")
    private final int f95305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("no_background")
    private final int f95306j;

    public Rights() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023);
    }

    public Rights(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        i7 = (i17 & 1) != 0 ? 0 : i7;
        i8 = (i17 & 2) != 0 ? 0 : i8;
        i9 = (i17 & 4) != 0 ? 0 : i9;
        i10 = (i17 & 8) != 0 ? 0 : i10;
        i11 = (i17 & 16) != 0 ? 0 : i11;
        i12 = (i17 & 32) != 0 ? 0 : i12;
        i13 = (i17 & 64) != 0 ? 0 : i13;
        i14 = (i17 & 128) != 0 ? 0 : i14;
        i15 = (i17 & 256) != 0 ? 0 : i15;
        i16 = (i17 & 512) != 0 ? 0 : i16;
        this.f95298a = i7;
        this.f95299b = i8;
        this.f95300c = i9;
        this.f95301d = i10;
        this.f95302e = i11;
        this.f95303f = i12;
        this.f95304g = i13;
        this.h = i14;
        this.f95305i = i15;
        this.f95306j = i16;
    }

    public final int a() {
        return this.f95298a;
    }

    public final int b() {
        return this.f95299b;
    }

    public final int c() {
        return this.f95301d;
    }

    public final int d() {
        return this.f95300c;
    }

    public final int e() {
        return this.f95302e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rights)) {
            return false;
        }
        Rights rights = (Rights) obj;
        return this.f95298a == rights.f95298a && this.f95299b == rights.f95299b && this.f95300c == rights.f95300c && this.f95301d == rights.f95301d && this.f95302e == rights.f95302e && this.f95303f == rights.f95303f && this.f95304g == rights.f95304g && this.h == rights.h && this.f95305i == rights.f95305i && this.f95306j == rights.f95306j;
    }

    public final int f() {
        return this.f95306j;
    }

    public final int g() {
        return this.f95303f;
    }

    public final int h() {
        return this.f95304g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95306j) + I.a(this.f95305i, I.a(this.h, I.a(this.f95304g, I.a(this.f95303f, I.a(this.f95302e, I.a(this.f95301d, I.a(this.f95300c, I.a(this.f95299b, Integer.hashCode(this.f95298a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final int i() {
        return this.f95305i;
    }

    public final int j() {
        return this.h;
    }

    @NotNull
    public final String toString() {
        int i7 = this.f95298a;
        int i8 = this.f95299b;
        int i9 = this.f95300c;
        int i10 = this.f95301d;
        int i11 = this.f95302e;
        int i12 = this.f95303f;
        int i13 = this.f95304g;
        int i14 = this.h;
        int i15 = this.f95305i;
        int i16 = this.f95306j;
        StringBuilder sbB = A.b(i7, i8, "Rights(autoPlay=", ", canBp=", ", canDownload=");
        C4690e.a(i9, i10, ", canCharge=", ", canMovie=", sbB);
        C4690e.a(i11, i12, ", noReprint=", ", pay=", sbB);
        C4690e.a(i13, i14, ", isUgcPay=", ", isPreview=", sbB);
        return d.a(i15, i16, ", disableBackgroundMusic=", ")", sbB);
    }
}
