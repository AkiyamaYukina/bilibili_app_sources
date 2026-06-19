package com.bilibili.ship.theseus.ogv.playviewextra;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import cf.o;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/OgvBadgeInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvBadgeInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f94350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f94351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("border_color")
    private final int f94352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("border_color_night")
    private final int f94353g;

    @SerializedName("img")
    @NotNull
    private final String h;

    public OgvBadgeInfo(int i7, int i8, int i9, int i10, int i11, @NotNull String str, int i12, @NotNull String str2) {
        this.f94347a = str;
        this.f94348b = i7;
        this.f94349c = i8;
        this.f94350d = i9;
        this.f94351e = i10;
        this.f94352f = i11;
        this.f94353g = i12;
        this.h = str2;
    }

    public final int a() {
        return this.f94352f;
    }

    public final int b() {
        return this.f94353g;
    }

    @NotNull
    public final String c() {
        return this.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvBadgeInfo)) {
            return false;
        }
        OgvBadgeInfo ogvBadgeInfo = (OgvBadgeInfo) obj;
        return Intrinsics.areEqual(this.f94347a, ogvBadgeInfo.f94347a) && this.f94348b == ogvBadgeInfo.f94348b && this.f94349c == ogvBadgeInfo.f94349c && this.f94350d == ogvBadgeInfo.f94350d && this.f94351e == ogvBadgeInfo.f94351e && this.f94352f == ogvBadgeInfo.f94352f && this.f94353g == ogvBadgeInfo.f94353g && Intrinsics.areEqual(this.h, ogvBadgeInfo.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + I.a(this.f94353g, I.a(this.f94352f, I.a(this.f94351e, I.a(this.f94350d, I.a(this.f94349c, I.a(this.f94348b, this.f94347a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f94352f;
        int i8 = this.f94353g;
        String str = this.h;
        StringBuilder sb = new StringBuilder("OgvBadgeInfo(text=");
        sb.append(this.f94347a);
        sb.append(", textColor=");
        sb.append(this.f94348b);
        sb.append(", textColorNight=");
        sb.append(this.f94349c);
        sb.append(", bgColor=");
        sb.append(this.f94350d);
        sb.append(", bgColorNight=");
        C4690e.a(this.f94351e, i7, ", borderColor=", ", borderColorNight=", sb);
        return o.a(i8, ", image=", str, ")", sb);
    }
}
