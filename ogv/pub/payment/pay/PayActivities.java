package com.bilibili.ogv.pub.payment.pay;

import N1.o;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/PayActivities.class */
@Bson
public final class PayActivities {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<PendantInfo> f71548b;

    public PayActivities() {
        throw null;
    }

    public PayActivities(int i7, String str, List list) {
        list = (i7 & 2) != 0 ? CollectionsKt.emptyList() : list;
        this.f71547a = str;
        this.f71548b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayActivities)) {
            return false;
        }
        PayActivities payActivities = (PayActivities) obj;
        return Intrinsics.areEqual(this.f71547a, payActivities.f71547a) && Intrinsics.areEqual(this.f71548b, payActivities.f71548b);
    }

    public final int hashCode() {
        return this.f71548b.hashCode() + (this.f71547a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<PendantInfo> list = this.f71548b;
        return o.a(this.f71547a, ", pendants=", ")", new StringBuilder("PayActivities(id="), list);
    }
}
