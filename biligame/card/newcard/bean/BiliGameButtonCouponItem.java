package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameButtonCouponItem.class */
@Keep
public final class BiliGameButtonCouponItem {

    @JSONField(name = "coupon_id")
    @NotNull
    private String couponId = "";

    @JSONField(name = "is_revealed")
    private boolean isRevealed;

    @NotNull
    public final String getCouponId() {
        return this.couponId;
    }

    public final boolean isRevealed() {
        return this.isRevealed;
    }

    public final void setCouponId(@NotNull String str) {
        this.couponId = str;
    }

    public final void setRevealed(boolean z6) {
        this.isRevealed = z6;
    }
}
