package com.bilibili.lib.projection.internal.api;

import com.bilibili.lib.projection.internal.api.model.ProjectionInterceptInfo;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.Unit;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/ProjectionBeforeSearchService.class */
@BaseUrl("https://api.bilibili.com")
public interface ProjectionBeforeSearchService {
    @GET("/x/tv/proj_intercept")
    @Timeout(conn = 800, read = 800, write = 800)
    @NotNull
    BiliCall<GeneralResponse<ProjectionInterceptInfo>> getInterceptMachineInfo(@Query(Tm0.a.f24206c) @Nullable String str, @Query("playurl_type") int i7, @Query("aid") @Nullable Long l7, @Query("cid") @Nullable Long l8, @Query("season_id") @Nullable Long l9, @Query("ep_id") @Nullable Long l10, @Query("room_id") @Nullable Long l11);

    @POST("/x/vip/ads/material/report")
    @NotNull
    BiliCall<BiliApiResponse<Unit>> materialReport(@Body @NotNull RequestBody requestBody);

    @FormUrlEncoded
    @POST("/x/tv/projection/report")
    @NotNull
    BiliCall<GeneralResponse<Void>> projReport(@Field("event_type") @NotNull String str, @Field("event_msg") @NotNull String str2, @Field(Tm0.a.f24206c) @NotNull String str3, @Field("video_type") int i7, @Field("dlna") int i8);
}
