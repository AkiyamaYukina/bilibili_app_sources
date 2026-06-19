package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.search2.api.SearchBangumiItem;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceShareMaterial.class */
@StabilityInferred(parameters = 1)
@Bson
public final class CheeseAttendanceShareMaterial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("avatar")
    @NotNull
    private final String f89263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("img")
    @NotNull
    private final String f89264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("logo")
    @NotNull
    private final String f89265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private final int f89266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("qr_code")
    @NotNull
    private final String f89267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("text")
    @NotNull
    private final String f89268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f89269g;

    public CheeseAttendanceShareMaterial() {
        this(null, 0, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null, null, null, null, null);
    }

    public CheeseAttendanceShareMaterial(String str, int i7, int i8, String str2, String str3, String str4, String str5, String str6) {
        str = (i8 & 1) != 0 ? "" : str;
        str2 = (i8 & 2) != 0 ? "" : str2;
        str3 = (i8 & 4) != 0 ? "" : str3;
        i7 = (i8 & 8) != 0 ? 0 : i7;
        str4 = (i8 & 16) != 0 ? "" : str4;
        str5 = (i8 & 32) != 0 ? "" : str5;
        str6 = (i8 & 64) != 0 ? "" : str6;
        this.f89263a = str;
        this.f89264b = str2;
        this.f89265c = str3;
        this.f89266d = i7;
        this.f89267e = str4;
        this.f89268f = str5;
        this.f89269g = str6;
    }

    @NotNull
    public final String a() {
        return this.f89263a;
    }

    @NotNull
    public final String b() {
        return this.f89264b;
    }

    @NotNull
    public final String c() {
        return this.f89265c;
    }

    public final int d() {
        return this.f89266d;
    }

    @NotNull
    public final String e() {
        return this.f89267e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheeseAttendanceShareMaterial)) {
            return false;
        }
        CheeseAttendanceShareMaterial cheeseAttendanceShareMaterial = (CheeseAttendanceShareMaterial) obj;
        return Intrinsics.areEqual(this.f89263a, cheeseAttendanceShareMaterial.f89263a) && Intrinsics.areEqual(this.f89264b, cheeseAttendanceShareMaterial.f89264b) && Intrinsics.areEqual(this.f89265c, cheeseAttendanceShareMaterial.f89265c) && this.f89266d == cheeseAttendanceShareMaterial.f89266d && Intrinsics.areEqual(this.f89267e, cheeseAttendanceShareMaterial.f89267e) && Intrinsics.areEqual(this.f89268f, cheeseAttendanceShareMaterial.f89268f) && Intrinsics.areEqual(this.f89269g, cheeseAttendanceShareMaterial.f89269g);
    }

    @NotNull
    public final String f() {
        return this.f89268f;
    }

    @NotNull
    public final String g() {
        return this.f89269g;
    }

    public final int hashCode() {
        return this.f89269g.hashCode() + E.a(E.a(I.a(this.f89266d, E.a(E.a(this.f89263a.hashCode() * 31, 31, this.f89264b), 31, this.f89265c), 31), 31, this.f89267e), 31, this.f89268f);
    }

    @NotNull
    public final String toString() {
        String str = this.f89263a;
        String str2 = this.f89264b;
        String str3 = this.f89265c;
        int i7 = this.f89266d;
        String str4 = this.f89267e;
        String str5 = this.f89268f;
        String str6 = this.f89269g;
        StringBuilder sbA = G0.b.a("CheeseAttendanceShareMaterial(avatar=", str, ", img=", str2, ", logo=");
        H0.e.b(i7, str3, ", progress=", ", qrCode=", sbA);
        B.a(str4, ", text=", str5, ", title=", sbA);
        return C8770a.a(sbA, str6, ")");
    }
}
