package com.bilibili.biligame.api.captcha;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameCaptcha;
import com.bilibili.biligame.api.CancelBookTextHints;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.bean.GamePreloadInfoBean;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/captcha/CaptchaApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/api/common/")
public interface CaptchaApiService {
    @GET("client_preload_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GamePreloadInfoBean>> cpsGameInfo();

    @GET("reserve_text")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<JSONObject>> getAutoDownloadText(@Query("game_base_id") int i7);

    @GET("hint_text")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<CancelBookTextHints>> getCancelBookTextHint();

    @GET("captcha/start_captcha/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameCaptcha>> getCaptchaInfo(@Query("geet_scene") int i7, @Query("source_from") String str);

    @GET("switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getCommonSwitch();

    @GET("copywriting/config")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> getCopywritingConfig(@Query("m_keys") String str);

    @GET("teenager/manager")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getTeenagersModeCongfig();

    @GET("red_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getWikiRedPoint();
}
