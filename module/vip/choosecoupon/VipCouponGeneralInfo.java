package com.bilibili.module.vip.choosecoupon;

import Fh0.q;
import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/choosecoupon/VipCouponGeneralInfo.class */
@Keep
public class VipCouponGeneralInfo {
    public List<VipCouponItemInfo> disables;
    public List<VipCouponItemInfo> usables;

    public boolean notEmpty() {
        return q.a(this.usables) || q.a(this.disables);
    }

    public boolean usableAndDisableCouponBothNotEmpty() {
        return q.a(this.usables) && q.a(this.disables);
    }
}
