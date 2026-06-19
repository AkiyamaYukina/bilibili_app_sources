package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xg0.C8973c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/Staff.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Staff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f101787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f101788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f101789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f101790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("official")
    @NotNull
    private final OfficialVerify f101791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final VipUserInfo f101792g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f101793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final C8973c f101794j;

    public Staff(long j7, int i7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull OfficialVerify officialVerify, @NotNull VipUserInfo vipUserInfo, int i8, @NotNull String str4, @Nullable C8973c c8973c) {
        this.f101786a = j7;
        this.f101787b = i7;
        this.f101788c = str;
        this.f101789d = str2;
        this.f101790e = str3;
        this.f101791f = officialVerify;
        this.f101792g = vipUserInfo;
        this.h = i8;
        this.f101793i = str4;
        this.f101794j = c8973c;
    }

    @NotNull
    public final OfficialVerify a() {
        return this.f101791f;
    }

    public final boolean b() {
        boolean z6 = true;
        if (this.h != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean c() {
        boolean z6 = true;
        if (this.f101787b != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff staff = (Staff) obj;
        return this.f101786a == staff.f101786a && this.f101787b == staff.f101787b && Intrinsics.areEqual(this.f101788c, staff.f101788c) && Intrinsics.areEqual(this.f101789d, staff.f101789d) && Intrinsics.areEqual(this.f101790e, staff.f101790e) && Intrinsics.areEqual(this.f101791f, staff.f101791f) && Intrinsics.areEqual(this.f101792g, staff.f101792g) && this.h == staff.h && Intrinsics.areEqual(this.f101793i, staff.f101793i) && Intrinsics.areEqual(this.f101794j, staff.f101794j);
    }

    public final int hashCode() {
        int iA = I.E.a(I.E.a(I.E.a(androidx.compose.animation.core.I.a(this.f101787b, Long.hashCode(this.f101786a) * 31, 31), 31, this.f101788c), 31, this.f101789d), 31, this.f101790e);
        int iA2 = I.E.a(androidx.compose.animation.core.I.a(this.h, (this.f101792g.hashCode() + ((this.f101791f.hashCode() + iA) * 31)) * 31, 31), 31, this.f101793i);
        C8973c c8973c = this.f101794j;
        return iA2 + (c8973c == null ? 0 : c8973c.hashCode());
    }

    @NotNull
    public final String toString() {
        int i7 = this.f101787b;
        String str = this.f101788c;
        OfficialVerify officialVerify = this.f101791f;
        StringBuilder sb = new StringBuilder("Staff(mid=");
        androidx.media3.common.G.a(i7, this.f101786a, ", attention=", sb);
        B0.b.b(", title=", str, ", name=", sb);
        sb.append(this.f101789d);
        sb.append(", face=");
        sb.append(this.f101790e);
        sb.append(", officialVerify=");
        sb.append(officialVerify);
        sb.append(", vip=");
        sb.append(this.f101792g);
        sb.append(", labelStyle=");
        sb.append(this.h);
        sb.append(", fans=");
        sb.append(this.f101793i);
        sb.append(", nameRender=");
        sb.append(this.f101794j);
        sb.append(")");
        return sb.toString();
    }
}
