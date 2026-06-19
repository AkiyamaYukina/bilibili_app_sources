package com.bilibili.module.vip.mall;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.call.rxjava.RxGeneralResponse;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/mall/VipApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface VipApiService {
    @GET("/x/vip/v1/order/status")
    @NotNull
    BiliCall<RxGeneralResponse<VipPayResultInfo>> checkOrderStatus(@Query("order_no") @NotNull String str, @Query("app_id") @NotNull String str2, @Query("payment_scenario") @Nullable String str3);

    @GET("/x/tv/vip/order/bpay_mobi/info")
    @NotNull
    BiliCall<RxGeneralResponse<VipPayResultInfo>> checkSuperVipOrderStatus(@Query("order_no") @NotNull String str, @Query("app_id") @NotNull String str2, @Query("payment_scenario") @Nullable String str3);

    @FormUrlEncoded
    @POST("/x/vip/order/create")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> createOrder(@Query("accessKey") @NotNull String str, @Query("with_fail_dialog") boolean z6, @FieldMap @NotNull Map<String, String> map);

    @FormUrlEncoded
    @POST("/x/tv/vip/order/bpay_mobi/create?platform=android")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> createSuperVipOrder(@Query("accessKey") @NotNull String str, @Query("with_fail_dialog") boolean z6, @FieldMap @NotNull Map<String, String> map);
}
