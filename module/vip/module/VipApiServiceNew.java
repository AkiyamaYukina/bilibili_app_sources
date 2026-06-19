package com.bilibili.module.vip.module;

import Tm0.a;
import com.bilibili.module.vip.choosecoupon.VipCouponGeneralInfo;
import com.bilibili.module.vip.choosecoupon.VipCouponItemInfo;
import com.bilibili.module.vip.choosecoupon.VipExchangeVerifyCode;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/module/VipApiServiceNew.class */
@BaseUrl("https://api.bilibili.com")
public interface VipApiServiceNew {
    @FormUrlEncoded
    @POST("x/coupon/code/exchange")
    BiliCall<GeneralResponse<VipCouponItemInfo>> activeRedeemCode(@Field(a.f24206c) String str, @Field("token") String str2, @Field("code") String str3, @Field("verify") String str4);

    @GET("/x/vip/coupon/list")
    BiliCall<GeneralResponse<VipCouponGeneralInfo>> getCouponListWithProductId(@Query(a.f24206c) String str, @Query("id") int i7);

    @GET("/x/vip/coupon/list/v3")
    BiliCall<GeneralResponse<VipCouponGeneralInfo>> getCouponListWithProductIdV3(@Query("pid") int i7, @Query("discount_id") long j7, @Query("scene") String str);

    @GET("x/vip/v1/frozenTime")
    BiliCall<GeneralResponse<Integer>> getFrozenTime(@Query(a.f24206c) String str);

    @GET("x/coupon/code/verify")
    BiliCall<GeneralResponse<VipExchangeVerifyCode>> getRedeemVerifyCode(@Query(a.f24206c) String str);

    @FormUrlEncoded
    @POST("x/vip/v1/unfrozen")
    BiliCall<GeneralResponse<Void>> unfreeze(@Field(a.f24206c) String str);

    @POST("/x/vip/coupon/unlock")
    BiliCall<GeneralResponse<String>> unlockCoupon(@Query(a.f24206c) String str, @Query("coupon_token") String str2);
}
