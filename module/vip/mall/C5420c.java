package com.bilibili.module.vip.mall;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.module.vip.mall.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/c.class */
@StabilityInferred(parameters = 0)
public final class C5420c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final VipPayResultInfo f66249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f66250b;

    public C5420c(@Nullable VipPayResultInfo vipPayResultInfo, @NotNull Map<String, String> map) {
        this.f66249a = vipPayResultInfo;
        this.f66250b = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5420c)) {
            return false;
        }
        C5420c c5420c = (C5420c) obj;
        return Intrinsics.areEqual(this.f66249a, c5420c.f66249a) && Intrinsics.areEqual(this.f66250b, c5420c.f66250b);
    }

    public final int hashCode() {
        VipPayResultInfo vipPayResultInfo = this.f66249a;
        return this.f66250b.hashCode() + ((vipPayResultInfo == null ? 0 : vipPayResultInfo.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "VipPaymentResultData(payResultInfo=" + this.f66249a + ", payReportParams=" + this.f66250b + ")";
    }
}
