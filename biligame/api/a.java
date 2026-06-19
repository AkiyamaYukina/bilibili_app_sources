package com.bilibili.biligame.api;

import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.okretro.anno.RequestInterceptor;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/a.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/")
public interface a {
    @GET("abtest/get_all_exp_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<List<BiligameAbExpInfo>>> getAllExpInfo();
}
