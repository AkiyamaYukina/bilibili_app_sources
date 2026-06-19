package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/CouponData.class */
@Keep
public class CouponData implements Serializable {

    @JSONField(name = "amount")
    private long amount;

    @JSONField(name = "arc_limit_condition")
    private String arcLimitCondition;

    @JSONField(name = "arc_limit_time")
    private long arcLimitTime;
    private boolean isSelected;

    @JSONField(name = "limit_condition")
    private String limitCondition;

    @JSONField(name = "order_id")
    private long orderId;

    @JSONField(name = "title")
    private String title;

    @JSONField(name = "valid_end_time")
    private long validEndTime;

    @JSONField(name = "valid_start_time")
    private long validStartTime;

    public long getAmount() {
        return this.amount;
    }

    public String getArcLimitCondition() {
        return this.arcLimitCondition;
    }

    public long getArcLimitTime() {
        return this.arcLimitTime;
    }

    public String getLimitCondition() {
        return this.limitCondition;
    }

    public long getOrderId() {
        return this.orderId;
    }

    public String getTitle() {
        return this.title;
    }

    public long getValidEndTime() {
        return this.validEndTime;
    }

    public long getValidStartTime() {
        return this.validStartTime;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setAmount(long j7) {
        this.amount = j7;
    }

    public void setArcLimitCondition(String str) {
        this.arcLimitCondition = str;
    }

    public void setArcLimitTime(long j7) {
        this.arcLimitTime = j7;
    }

    public void setLimitCondition(String str) {
        this.limitCondition = str;
    }

    public void setOrderId(long j7) {
        this.orderId = j7;
    }

    public void setSelected(boolean z6) {
        this.isSelected = z6;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setValidEndTime(long j7) {
        this.validEndTime = j7;
    }

    public void setValidStartTime(long j7) {
        this.validStartTime = j7;
    }
}
