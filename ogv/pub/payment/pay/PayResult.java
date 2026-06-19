package com.bilibili.ogv.pub.payment.pay;

import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/PayResult.class */
@Bson
public final class PayResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("expire_time_text")
    @Nullable
    private final String f71551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pay_pendant_activity")
    @Nullable
    private final PayActivities f71552c;

    public PayResult(@NotNull String str, @Nullable String str2, @Nullable PayActivities payActivities) {
        this.f71550a = str;
        this.f71551b = str2;
        this.f71552c = payActivities;
    }

    @Nullable
    public final PayActivities a() {
        return this.f71552c;
    }

    @Nullable
    public final String b() {
        return this.f71551b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayResult)) {
            return false;
        }
        PayResult payResult = (PayResult) obj;
        return Intrinsics.areEqual(this.f71550a, payResult.f71550a) && Intrinsics.areEqual(this.f71551b, payResult.f71551b) && Intrinsics.areEqual(this.f71552c, payResult.f71552c);
    }

    public final int hashCode() {
        int iHashCode = this.f71550a.hashCode();
        String str = this.f71551b;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        PayActivities payActivities = this.f71552c;
        if (payActivities != null) {
            iHashCode2 = payActivities.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    @NotNull
    public final String toString() {
        String str = this.f71551b;
        PayActivities payActivities = this.f71552c;
        StringBuilder sb = new StringBuilder("PayResult(state=");
        B.a(this.f71550a, ", expireTime=", str, ", activities=", sb);
        sb.append(payActivities);
        sb.append(")");
        return sb.toString();
    }
}
