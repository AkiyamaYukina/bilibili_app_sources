package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Order.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Order {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92866b;

    public Order(String str, int i7, int i8) {
        i7 = (i8 & 2) != 0 ? 0 : i7;
        this.f92865a = str;
        this.f92866b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order order = (Order) obj;
        return Intrinsics.areEqual(this.f92865a, order.f92865a) && this.f92866b == order.f92866b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92866b) + (this.f92865a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Order(desc=");
        sb.append(this.f92865a);
        sb.append(", type=");
        return C4277b.a(this.f92866b, ")", sb);
    }
}
