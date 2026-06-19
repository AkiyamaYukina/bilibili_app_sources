package com.bilibili.biligame.api.pay;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/pay/CashierConfig.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CashierConfig {
    public static final int $stable = 8;

    @JSONField(name = "pay_api_version")
    @NotNull
    private String payApiVersion = "2.0";

    @JSONField(name = "support_coupon")
    private boolean supportCoupon;

    @NotNull
    public final String getPayApiVersion() {
        return this.payApiVersion;
    }

    public final boolean getSupportCoupon() {
        return this.supportCoupon;
    }

    public final void setPayApiVersion(@NotNull String str) {
        this.payApiVersion = str;
    }

    public final void setSupportCoupon(boolean z6) {
        this.supportCoupon = z6;
    }
}
