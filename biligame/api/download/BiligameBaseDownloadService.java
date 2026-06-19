package com.bilibili.biligame.api.download;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/download/BiligameBaseDownloadService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface BiligameBaseDownloadService {
    @POST("game/center/h5/game/download_pkg/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameDownloadExtraResponse>> requestDownloadExtraPkg(@QueryMap @NotNull Map<String, String> map);
}
