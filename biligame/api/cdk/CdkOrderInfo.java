package com.bilibili.biligame.api.cdk;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkOrderInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CdkOrderInfo {
    public static final int $stable = 8;

    @JSONField(name = "order_no")
    @Nullable
    private String orderNo;

    @JSONField(name = "pay_params")
    @Nullable
    private String payParams;

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getPayParams() {
        return this.payParams;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setPayParams(@Nullable String str) {
        this.payParams = str;
    }
}
