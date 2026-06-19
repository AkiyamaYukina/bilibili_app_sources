package com.bilibili.biligame.bean.benefit;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.biligame.api.bean.gamedetail.ActivityInfoBean;
import com.bilibili.biligame.api.book.GameBookResp;
import com.bilibili.biligame.bean.BiligameNewGiftDetail;
import com.bilibili.biligame.ui.coupons.bean.UserCouponsDetailBean;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/benefit/GameBenefitAllReceiveBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class GameBenefitAllReceiveBean {
    public static final int $stable = 8;

    @JSONField(name = "activities")
    @Nullable
    private List<ActivityInfoBean> activityList;

    @JSONField(name = "coupon_list")
    @Nullable
    private List<UserCouponsDetailBean> couponList;

    @JSONField(name = "gift_info_list")
    @Nullable
    private List<BiligameNewGiftDetail> giftList;

    @JSONField(name = "reserve_result")
    @Nullable
    private GameBookResp reserveResult;

    @Nullable
    public final List<ActivityInfoBean> getActivityList() {
        return this.activityList;
    }

    @Nullable
    public final List<UserCouponsDetailBean> getCouponList() {
        return this.couponList;
    }

    @Nullable
    public final List<BiligameNewGiftDetail> getGiftList() {
        return this.giftList;
    }

    @Nullable
    public final GameBookResp getReserveResult() {
        return this.reserveResult;
    }

    public final void setActivityList(@Nullable List<ActivityInfoBean> list) {
        this.activityList = list;
    }

    public final void setCouponList(@Nullable List<UserCouponsDetailBean> list) {
        this.couponList = list;
    }

    public final void setGiftList(@Nullable List<BiligameNewGiftDetail> list) {
        this.giftList = list;
    }

    public final void setReserveResult(@Nullable GameBookResp gameBookResp) {
        this.reserveResult = gameBookResp;
    }
}
