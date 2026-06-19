package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/e.class */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f74058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f74059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final RechargeConsumptionResponse f74060c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Throwable f74061d;

    public e() {
        this(null, null, null, null, 15);
    }

    public e(Integer num, String str, RechargeConsumptionResponse rechargeConsumptionResponse, Throwable th, int i7) {
        num = (i7 & 1) != 0 ? null : num;
        str = (i7 & 2) != 0 ? null : str;
        rechargeConsumptionResponse = (i7 & 4) != 0 ? null : rechargeConsumptionResponse;
        th = (i7 & 8) != 0 ? null : th;
        this.f74058a = num;
        this.f74059b = str;
        this.f74060c = rechargeConsumptionResponse;
        this.f74061d = th;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f74058a, eVar.f74058a) && Intrinsics.areEqual(this.f74059b, eVar.f74059b) && Intrinsics.areEqual(this.f74060c, eVar.f74060c) && Intrinsics.areEqual(this.f74061d, eVar.f74061d);
    }

    public final int hashCode() {
        int iHashCode = 0;
        Integer num = this.f74058a;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.f74059b;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        RechargeConsumptionResponse rechargeConsumptionResponse = this.f74060c;
        int iHashCode4 = rechargeConsumptionResponse == null ? 0 : rechargeConsumptionResponse.hashCode();
        Throwable th = this.f74061d;
        if (th != null) {
            iHashCode = th.hashCode();
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "ReChargeConsumptionState(responseCode=" + this.f74058a + ", responseMessage=" + this.f74059b + ", consumptionResp=" + this.f74060c + ", error=" + this.f74061d + ")";
    }
}
