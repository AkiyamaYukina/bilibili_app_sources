package com.bilibili.biligame.api;

import com.bilibili.biligame.api.download.BiligamePreResBean;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameDownloadService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/cps/")
public interface BiligameDownloadService {
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("src_pkg/report/v2")
    BiliCall<BiligameApiResponse<JSONObject>> reportDownloadPreRes(@Field("game_src") @NotNull String str, @Field("action") int i7);

    @GET("src_pkg/list/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<ArrayList<BiligamePreResBean>>> requestPreResList();
}
