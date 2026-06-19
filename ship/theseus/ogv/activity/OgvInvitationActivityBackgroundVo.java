package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityBackgroundVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvInvitationActivityBackgroundVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("component_id")
    @NotNull
    private final String f91440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_img")
    @NotNull
    private final String f91441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("rule_link")
    @NotNull
    private final String f91442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("face")
    @NotNull
    private final String f91443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91446g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f91447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f91448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f91449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f91450l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f91451m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f91452n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("qq_share_type")
    private final boolean f91453o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("wechat_share_type")
    private final boolean f91454p;

    public OgvInvitationActivityBackgroundVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull OgvActivityTextVo ogvActivityTextVo, int i7, int i8, int i9, int i10, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i11, boolean z6, boolean z7) {
        this.f91440a = str;
        this.f91441b = str2;
        this.f91442c = str3;
        this.f91443d = str4;
        this.f91444e = ogvActivityTextVo;
        this.f91445f = i7;
        this.f91446g = i8;
        this.h = i9;
        this.f91447i = i10;
        this.f91448j = str5;
        this.f91449k = str6;
        this.f91450l = str7;
        this.f91451m = str8;
        this.f91452n = i11;
        this.f91453o = z6;
        this.f91454p = z7;
    }

    @NotNull
    public final String a() {
        return this.f91443d;
    }

    @NotNull
    public final String b() {
        return this.f91441b;
    }

    @NotNull
    public final String c() {
        return this.f91440a;
    }

    public final boolean d() {
        return this.f91453o;
    }

    public final boolean e() {
        return this.f91454p;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvInvitationActivityBackgroundVo)) {
            return false;
        }
        OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVo = (OgvInvitationActivityBackgroundVo) obj;
        return Intrinsics.areEqual(this.f91440a, ogvInvitationActivityBackgroundVo.f91440a) && Intrinsics.areEqual(this.f91441b, ogvInvitationActivityBackgroundVo.f91441b) && Intrinsics.areEqual(this.f91442c, ogvInvitationActivityBackgroundVo.f91442c) && Intrinsics.areEqual(this.f91443d, ogvInvitationActivityBackgroundVo.f91443d) && Intrinsics.areEqual(this.f91444e, ogvInvitationActivityBackgroundVo.f91444e) && this.f91445f == ogvInvitationActivityBackgroundVo.f91445f && this.f91446g == ogvInvitationActivityBackgroundVo.f91446g && this.h == ogvInvitationActivityBackgroundVo.h && this.f91447i == ogvInvitationActivityBackgroundVo.f91447i && Intrinsics.areEqual(this.f91448j, ogvInvitationActivityBackgroundVo.f91448j) && Intrinsics.areEqual(this.f91449k, ogvInvitationActivityBackgroundVo.f91449k) && Intrinsics.areEqual(this.f91450l, ogvInvitationActivityBackgroundVo.f91450l) && Intrinsics.areEqual(this.f91451m, ogvInvitationActivityBackgroundVo.f91451m) && this.f91452n == ogvInvitationActivityBackgroundVo.f91452n && this.f91453o == ogvInvitationActivityBackgroundVo.f91453o && this.f91454p == ogvInvitationActivityBackgroundVo.f91454p;
    }

    @NotNull
    public final String f() {
        return this.f91442c;
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(this.f91440a.hashCode() * 31, 31, this.f91441b), 31, this.f91442c), 31, this.f91443d);
        return Boolean.hashCode(this.f91454p) + z.a(I.a(this.f91452n, E.a(E.a(E.a(E.a(I.a(this.f91447i, I.a(this.h, I.a(this.f91446g, I.a(this.f91445f, (this.f91444e.hashCode() + iA) * 31, 31), 31), 31), 31), 31, this.f91448j), 31, this.f91449k), 31, this.f91450l), 31, this.f91451m), 31), 31, this.f91453o);
    }

    @NotNull
    public final String toString() {
        String str = this.f91440a;
        String str2 = this.f91441b;
        String str3 = this.f91442c;
        String str4 = this.f91443d;
        boolean z6 = this.f91453o;
        boolean z7 = this.f91454p;
        StringBuilder sbA = G0.b.a("OgvInvitationActivityBackgroundVo(componentId=", str, ", backgroundImage=", str2, ", ruleLink=");
        B.a(str3, ", avatar=", str4, ", title=", sbA);
        sbA.append(this.f91444e);
        sbA.append(", usedTimes=");
        sbA.append(this.f91445f);
        sbA.append(", maxTimes=");
        sbA.append(this.f91446g);
        sbA.append(", countdownCost=");
        sbA.append(this.h);
        sbA.append(", countdownDuration=");
        sbA.append(this.f91447i);
        sbA.append(", shareLink=");
        sbA.append(this.f91448j);
        sbA.append(", shareTitle=");
        sbA.append(this.f91449k);
        sbA.append(", shareSubtitle=");
        sbA.append(this.f91450l);
        sbA.append(", shareImage=");
        sbA.append(this.f91451m);
        sbA.append(", inviteeLimit=");
        z4.d.a(", quickShareToQQ=", ", quickShareToWechat=", this.f91452n, z6, sbA);
        return androidx.appcompat.app.i.a(sbA, z7, ")");
    }
}
