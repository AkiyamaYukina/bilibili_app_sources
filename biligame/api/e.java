package com.bilibili.biligame.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.steam.GameSteamWebTriageBean;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.okretro.anno.RequestInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/e.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface e {
    @POST("api/game/steam/auth/triage")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<GameSteamWebTriageBean>> getGroupInfo(@Query("scene_type") int i7, @Query("url") @NotNull String str, @Query("source_from") @NotNull String str2);

    @POST("api/game/steam/user/upload/bind")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<JSONObject>> uploadBind(@Query("steam_cookie") @NotNull String str, @Query("source_from") @NotNull String str2);

    @POST("api/game/steam/user/upload/wishlist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<JSONObject>> uploadWishlist(@Query("app_id") @NotNull String str, @Query(ThirdPartyExtraBuilder.CALLBACK_URL) @NotNull String str2, @Query("source_from") @NotNull String str3);
}
