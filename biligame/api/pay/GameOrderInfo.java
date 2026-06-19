package com.bilibili.biligame.api.pay;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/pay/GameOrderInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameOrderInfo {
    public static final int $stable = 8;

    @JSONField(name = "local_order_id")
    @Nullable
    private String localOrderId;

    @JSONField(name = "payment_address")
    @Nullable
    private String paymentAddress;

    @JSONField(name = "submit_order_id")
    @Nullable
    private String submitOrderId;

    @Nullable
    public final String getLocalOrderId() {
        return this.localOrderId;
    }

    @Nullable
    public final String getPaymentAddress() {
        return this.paymentAddress;
    }

    @Nullable
    public final String getSubmitOrderId() {
        return this.submitOrderId;
    }

    public final void setLocalOrderId(@Nullable String str) {
        this.localOrderId = str;
    }

    public final void setPaymentAddress(@Nullable String str) {
        this.paymentAddress = str;
    }

    public final void setSubmitOrderId(@Nullable String str) {
        this.submitOrderId = str;
    }
}
