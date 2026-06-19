package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/DeliveryOperationAction.class */
@StabilityInferred(parameters = 1)
@Bson
public final class DeliveryOperationAction implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f102521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f102522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f102523c;

    public DeliveryOperationAction(@Nullable String str, @Nullable String str2, boolean z6) {
        this.f102521a = str;
        this.f102522b = str2;
        this.f102523c = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryOperationAction)) {
            return false;
        }
        DeliveryOperationAction deliveryOperationAction = (DeliveryOperationAction) obj;
        return Intrinsics.areEqual(this.f102521a, deliveryOperationAction.f102521a) && Intrinsics.areEqual(this.f102522b, deliveryOperationAction.f102522b) && this.f102523c == deliveryOperationAction.f102523c;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f102521a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f102522b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return Boolean.hashCode(this.f102523c) + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryOperationAction(winId=");
        sb.append(this.f102521a);
        sb.append(", deliver_code=");
        sb.append(this.f102522b);
        sb.append(", exposing=");
        return androidx.appcompat.app.i.a(sb, this.f102523c, ")");
    }
}
