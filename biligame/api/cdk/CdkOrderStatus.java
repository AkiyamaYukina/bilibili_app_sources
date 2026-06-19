package com.bilibili.biligame.api.cdk;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkOrderStatus.class */
@StabilityInferred(parameters = 0)
@Keep
public final class CdkOrderStatus {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int PAY_STATUS_SUCCESS = 1;
    public static final int PAY_STATUS_UNPAID = 0;

    @JSONField(name = "attach_info")
    @Nullable
    private String attachInfo;

    @JSONField(name = "order_no")
    @Nullable
    private String orderNo;

    @JSONField(name = "out_order_no")
    @Nullable
    private String outOrderNo;

    @JSONField(name = "pay_status")
    private int payStatus;

    @JSONField(name = "pay_time")
    @Nullable
    private Long payTime;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkOrderStatus$a.class */
    public static final class a {
    }

    @Nullable
    public final String getAttachInfo() {
        return this.attachInfo;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getOutOrderNo() {
        return this.outOrderNo;
    }

    public final int getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    public final Long getPayTime() {
        return this.payTime;
    }

    public final boolean isPaySuccess() {
        boolean z6 = true;
        if (this.payStatus != 1) {
            z6 = false;
        }
        return z6;
    }

    public final boolean isUnpaid() {
        return this.payStatus == 0;
    }

    public final void setAttachInfo(@Nullable String str) {
        this.attachInfo = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setOutOrderNo(@Nullable String str) {
        this.outOrderNo = str;
    }

    public final void setPayStatus(int i7) {
        this.payStatus = i7;
    }

    public final void setPayTime(@Nullable Long l7) {
        this.payTime = l7;
    }
}
