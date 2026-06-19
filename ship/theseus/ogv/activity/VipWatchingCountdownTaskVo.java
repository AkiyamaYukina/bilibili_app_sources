package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/VipWatchingCountdownTaskVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VipWatchingCountdownTaskVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("milliseconds")
    private final long f91494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("count_down_status_desc")
    @NotNull
    private final String f91495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pause_status_desc")
    @NotNull
    private final String f91496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("complete_status_desc")
    @NotNull
    private final String f91497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("complete_status_jump_url")
    @NotNull
    private final String f91498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f91499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f91500g;

    public VipWatchingCountdownTaskVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, long j7) {
        this.f91494a = j7;
        this.f91495b = str;
        this.f91496c = str2;
        this.f91497d = str3;
        this.f91498e = str4;
        this.f91499f = str5;
        this.f91500g = str6;
    }

    @NotNull
    public final String a() {
        return this.f91497d;
    }

    @NotNull
    public final String b() {
        return this.f91495b;
    }

    @NotNull
    public final String c() {
        return this.f91498e;
    }

    @NotNull
    public final String d() {
        return this.f91496c;
    }

    public final long e() {
        return this.f91494a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipWatchingCountdownTaskVo)) {
            return false;
        }
        VipWatchingCountdownTaskVo vipWatchingCountdownTaskVo = (VipWatchingCountdownTaskVo) obj;
        return this.f91494a == vipWatchingCountdownTaskVo.f91494a && Intrinsics.areEqual(this.f91495b, vipWatchingCountdownTaskVo.f91495b) && Intrinsics.areEqual(this.f91496c, vipWatchingCountdownTaskVo.f91496c) && Intrinsics.areEqual(this.f91497d, vipWatchingCountdownTaskVo.f91497d) && Intrinsics.areEqual(this.f91498e, vipWatchingCountdownTaskVo.f91498e) && Intrinsics.areEqual(this.f91499f, vipWatchingCountdownTaskVo.f91499f) && Intrinsics.areEqual(this.f91500g, vipWatchingCountdownTaskVo.f91500g);
    }

    public final int hashCode() {
        return this.f91500g.hashCode() + E.a(E.a(E.a(E.a(E.a(Long.hashCode(this.f91494a) * 31, 31, this.f91495b), 31, this.f91496c), 31, this.f91497d), 31, this.f91498e), 31, this.f91499f);
    }

    @NotNull
    public final String toString() {
        long j7 = this.f91494a;
        String str = this.f91495b;
        String str2 = this.f91496c;
        String str3 = this.f91497d;
        String str4 = this.f91498e;
        StringBuilder sbA = n.a(j7, "VipWatchingCountdownTaskVo(time=", ", countdownText=", str);
        B.a(", pausedText=", str2, ", completedText=", str3, sbA);
        B0.b.b(", link=", str4, ", token=", sbA);
        sbA.append(this.f91499f);
        sbA.append(", taskId=");
        return C8770a.a(sbA, this.f91500g, ")");
    }
}
