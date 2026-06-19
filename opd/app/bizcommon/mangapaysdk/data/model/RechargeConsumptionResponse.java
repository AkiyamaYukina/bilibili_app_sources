package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/RechargeConsumptionResponse.class */
@Keep
public final class RechargeConsumptionResponse {

    @JSONField(name = "pay_params")
    @NotNull
    private String payParams = "";

    @JSONField(name = "order_id")
    @NotNull
    private String orderId = "";

    @JSONField(name = "order_ctime")
    @NotNull
    private String orderCTime = "";

    @NotNull
    public final String getOrderCTime() {
        return this.orderCTime;
    }

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    @NotNull
    public final String getPayParams() {
        return this.payParams;
    }

    public final void setOrderCTime(@NotNull String str) {
        this.orderCTime = str;
    }

    public final void setOrderId(@NotNull String str) {
        this.orderId = str;
    }

    public final void setPayParams(@NotNull String str) {
        this.payParams = str;
    }
}
