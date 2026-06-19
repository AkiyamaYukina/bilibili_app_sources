package com.bilibili.biligame.api.cloudgame;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.bean.BiligameCloudGameNoticeBean;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.cloudgame.bean.BCGUserBalance;
import com.bilibili.biligame.api.cloudgame.bean.MicroGameInfo;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/CloudGameApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/api/cloud_game/")
public interface CloudGameApiService {
    @POST("v2/user/balance")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BCGUserBalance>> balance(@Query("user_id") String str);

    @GET("v2/notice/current")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameCloudGameNoticeBean>> gameNotice();

    @FormUrlEncoded
    @POST("v2/game/microclient/detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<MicroGameInfo>> microGameInfo(@Field("game_base_id") int i7);

    @GET("v2/game/pass/rules")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BCGUserBalance>> passRule();
}
