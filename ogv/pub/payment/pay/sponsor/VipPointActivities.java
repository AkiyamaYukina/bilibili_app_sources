package com.bilibili.ogv.pub.payment.pay.sponsor;

import G0.b;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/sponsor/VipPointActivities.class */
@Bson
public final class VipPointActivities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activity_tip")
    @Nullable
    private final String f71584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activity_content")
    @Nullable
    private final String f71585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activity_link")
    @Nullable
    private final String f71586c;

    public VipPointActivities(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f71584a = str;
        this.f71585b = str2;
        this.f71586c = str3;
    }

    @Nullable
    public final String a() {
        return this.f71585b;
    }

    @Nullable
    public final String b() {
        return this.f71586c;
    }

    @Nullable
    public final String c() {
        return this.f71584a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipPointActivities)) {
            return false;
        }
        VipPointActivities vipPointActivities = (VipPointActivities) obj;
        return Intrinsics.areEqual(this.f71584a, vipPointActivities.f71584a) && Intrinsics.areEqual(this.f71585b, vipPointActivities.f71585b) && Intrinsics.areEqual(this.f71586c, vipPointActivities.f71586c);
    }

    public final int hashCode() {
        String str = this.f71584a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f71585b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f71586c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f71584a;
        String str2 = this.f71585b;
        return C8770a.a(b.a("VipPointActivities(tip=", str, ", content=", str2, ", link="), this.f71586c, ")");
    }
}
