package com.bilibili.studio.editor.moudle.intelligence.music.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.interceptor.SignOnUrlRequestInterceptor;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.MaterialServerGenerationResponse;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.MusicResponse;
import com.bilibili.studio.editor.moudle.intelligence.music.api.bean.PollingMusicResponse;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/music/api/AIMusicService.class */
@BaseUrl("https://member.bilibili.com")
public interface AIMusicService {
    @GET("/x/app/material/recommend/bgm/list")
    @NotNull
    BiliCall<GeneralResponse<MusicResponse>> getRecommendMusics(@Query("upload_id") @NotNull String str, @Query("zip_url") @NotNull String str2, @Query("upfrom") int i7, @Query("platform") @NotNull String str3, @Query("content_tags") @Nullable String str4, @Query("pn") @Nullable Integer num, @Query("topn") @Nullable Integer num2, @Query("track_id") @NotNull String str5);

    @GET("/x/app/material/recommend/bgm/polling")
    @NotNull
    BiliCall<GeneralResponse<PollingMusicResponse>> getRecommendMusicsByPolling(@Query("upload_id") @NotNull String str, @Query("zip_url") @NotNull String str2, @Query("upfrom") int i7, @Query("platform") @NotNull String str3, @Query("content_tags") @Nullable String str4, @Query("track_id") @NotNull String str5);

    @POST("/x/app/archive/content/generation")
    @RequestInterceptor(SignOnUrlRequestInterceptor.class)
    @NotNull
    BiliCall<GeneralResponse<MaterialServerGenerationResponse>> getServerMaterialContentGeneration(@Body @NotNull RequestBody requestBody);
}
