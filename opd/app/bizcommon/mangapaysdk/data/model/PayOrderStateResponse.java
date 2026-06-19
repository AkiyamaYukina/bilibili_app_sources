package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import androidx.annotation.Keep;
import androidx.fragment.app.A;
import androidx.media3.exoplayer.C4690e;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayOrderStateResponse.class */
@Keep
public final class PayOrderStateResponse {

    @JSONField(name = "pay_amount")
    private int payAmount;

    @JSONField(name = "pay_status")
    private int rawPayStatus;

    @JSONField(name = "order_id")
    @NotNull
    private String orderId = "";

    @JSONField(name = "tx_id")
    @NotNull
    private String txId = "";

    @JSONField(name = "pay_time")
    @NotNull
    private String payTime = "";

    @JSONField(name = "pay_channel")
    private int payChannel = -1;

    @NotNull
    public final String getOrderId() {
        return this.orderId;
    }

    public final int getPayAmount() {
        return this.payAmount;
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    @NotNull
    public final String getPayTime() {
        return this.payTime;
    }

    public final int getRawPayStatus() {
        return this.rawPayStatus;
    }

    @NotNull
    public final String getTxId() {
        return this.txId;
    }

    @NotNull
    public final OrderPayState requireOrderPayStatue() {
        int i7 = this.rawPayStatus;
        OrderPayState orderPayState = OrderPayState.OrderSuccess;
        if (i7 != orderPayState.getState()) {
            orderPayState = OrderPayState.ChargebacksNoVirtualAssetsReturn;
            if (i7 != orderPayState.getState()) {
                orderPayState = OrderPayState.Chargebacks;
                if (i7 != orderPayState.getState()) {
                    orderPayState = OrderPayState.AllInOneConsume;
                    if (i7 != orderPayState.getState()) {
                        orderPayState = OrderPayState.BCoinConsume;
                        if (i7 != orderPayState.getState()) {
                            orderPayState = OrderPayState.BCoinConsumeFailure;
                            if (i7 != orderPayState.getState()) {
                                orderPayState = OrderPayState.Unknown;
                            }
                        }
                    }
                }
            }
        }
        return orderPayState;
    }

    public final void setOrderId(@NotNull String str) {
        this.orderId = str;
    }

    public final void setPayAmount(int i7) {
        this.payAmount = i7;
    }

    public final void setPayChannel(int i7) {
        this.payChannel = i7;
    }

    public final void setPayTime(@NotNull String str) {
        this.payTime = str;
    }

    public final void setRawPayStatus(int i7) {
        this.rawPayStatus = i7;
    }

    public final void setTxId(@NotNull String str) {
        this.txId = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.rawPayStatus;
        String str = this.orderId;
        int i8 = this.payAmount;
        int i9 = this.payChannel;
        String str2 = this.txId;
        String str3 = this.payTime;
        StringBuilder sbB = bilibili.live.app.service.resolver.a.b(i7, "PayOrderStateResponse(payStatus=", ", orderId='", str, "', payAmount=");
        C4690e.a(i8, i9, ", payChannel=", ", txId='", sbB);
        return A.a(str2, "', payTime='", str3, "')", sbB);
    }
}
