package com.bilibili.biligame.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.ReportSign;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.interceptor.RecommendDeviceInfoInterceptor;
import com.bilibili.biligame.shortcut.bean.GameShortcutBean;
import com.bilibili.biligame.ui.home.bean.HomeFeedResponse;
import com.bilibili.biligame.ui.home.bean.RecentGameResp;
import com.bilibili.biligame.ui.home.bean.ReturnGiftInfoBean;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameTriHomeApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface BiligameTriHomeApiService {
    @POST("/game/center/h5/comment/user/system_message/clear_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<JSONObject>> clearRedPoint(@Query("reddot_type") @Nullable String str);

    @POST("game/center/h5/gift/game_center_return_gift")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<ReturnGiftInfoBean>> gameCenterReturnGift(@Query("reddot_type") @Nullable String str);

    @GET("api/h5/game/center/home/v2/feed")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    @NotNull
    @ReportSign(sample = false)
    BiliGameCall<BiligameApiResponse<HomeFeedResponse>> getHomeContent(@Query("session_id") @Nullable String str, @Query("cursor_id") @Nullable String str2, @Query("reddot_type") @Nullable String str3);

    @GET("/api/h5/game/center/home/v2/tag_feed")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @ReportSign(sample = false)
    BiliGameCall<BiligameApiResponse<HomeFeedResponse>> getHomeRecommendContent(@Query("session_id") @Nullable String str, @Query("cursor_id") @Nullable String str2, @Query("reddot_type") @Nullable String str3);

    @GET("game/center/h5/latest_tab/feed")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<RecentGameResp>> getLatestFeed(@Query("page_offset") @Nullable String str, @Query("page_size") int i7);

    @GET("game/abtest/get_entrance_exp_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameShortcutBean>> getLaunchShortcutConfig();
}
