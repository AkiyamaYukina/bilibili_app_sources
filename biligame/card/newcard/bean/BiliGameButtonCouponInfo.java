package com.bilibili.biligame.card.newcard.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card/newcard/bean/BiliGameButtonCouponInfo.class */
@Keep
public final class BiliGameButtonCouponInfo {

    @JSONField(name = "coupon_count")
    private int couponCount;

    @JSONField(name = "coupon_ids")
    @Nullable
    private List<String> couponIds;

    @JSONField(name = "coupon_items")
    @Nullable
    private List<BiliGameButtonCouponItem> couponItems;

    public final int getCouponCount() {
        return this.couponCount;
    }

    @Nullable
    public final List<String> getCouponIds() {
        return this.couponIds;
    }

    @Nullable
    public final List<BiliGameButtonCouponItem> getCouponItems() {
        return this.couponItems;
    }

    public final void setCouponCount(int i7) {
        this.couponCount = i7;
    }

    public final void setCouponIds(@Nullable List<String> list) {
        this.couponIds = list;
    }

    public final void setCouponItems(@Nullable List<BiliGameButtonCouponItem> list) {
        this.couponItems = list;
    }
}
