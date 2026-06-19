package com.bilibili.module.vip.combine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPrivilege.class */
@StabilityInferred(parameters = 0)
@Bson
public final class VipPrivilege {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VipPaymentTips f66167a;

    public VipPrivilege(@NotNull VipPaymentTips vipPaymentTips) {
        this.f66167a = vipPaymentTips;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VipPrivilege) && Intrinsics.areEqual(this.f66167a, ((VipPrivilege) obj).f66167a);
    }

    public final int hashCode() {
        return this.f66167a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "VipPrivilege(privilege=" + this.f66167a + ")";
    }
}
