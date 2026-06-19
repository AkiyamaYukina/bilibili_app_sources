package com.bilibili.biligame.api;

import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.bean.CouponsDetailList;
import com.bilibili.biligame.ui.playing.data.BiligamePlayTabResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameTriHomePlayingApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface BiligameTriHomePlayingApiService {
    @GET("game/center/h5/user/played_coupon_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<CouponsDetailList>>> playCouponList();

    @GET("game/center/h5/user/played_tab_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligamePlayTabResponse>> playTabInfo();

    @POST("game/center/h5/user/played_tab/red_dot/clear")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<JSONObject>> redDotClear(@Query("gift_info_ids") @Nullable String str, @Query("coupon_ids") @Nullable String str2);

    @POST("game/center/h5/user/played_tab/shield/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<JSONObject>> shieldReport(@Query("module_type") @Nullable String str, @Query("id") @Nullable String str2, @Query("game_base_id") @Nullable String str3, @Query("event_type") @Nullable String str4, @Query("sub_type") @Nullable String str5, @Query("event_timestamp") @Nullable Long l7);
}
