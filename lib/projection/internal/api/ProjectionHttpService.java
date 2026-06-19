package com.bilibili.lib.projection.internal.api;

import com.bilibili.lib.projection.internal.api.model.ProjectionGuidInfo;
import com.bilibili.lib.projection.internal.api.model.ProjectionPlayUrl;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/ProjectionHttpService.class */
@BaseUrl("https://api.bilibili.com")
public interface ProjectionHttpService {
    @GET("/x/tv/projection/guide_info")
    @NotNull
    BiliCall<GeneralResponse<ProjectionGuidInfo>> guidInfo(@Query("android_ver") @NotNull String str, @Query("yst_ver") @NotNull String str2, @Query("is_connected") boolean z6, @Query("pre_device_brand") @NotNull String str3, @Query("pre_device_model") @NotNull String str4, @Query("pre_device_login_user_type") int i7);

    @GET("/x/tv/playurl")
    @NotNull
    BiliCall<GeneralResponse<ProjectionPlayUrl>> playUrl(@Query("video_type") int i7, @Query("protocol") int i8, @Query("mobile_access_key") @NotNull String str, @Query("is_proj") int i9, @Query("playurl_type") int i10, @Query("object_id") long j7, @Query("cid") long j8, @Query("qn") int i11, @Query("is_h265") int i12, @Query("is_dolby") int i13, @Query("live_extra") @Nullable String str2, @Query("fnver") int i14, @Query("fnval") int i15, @Query("fourk") int i16, @Query("sys_ver") int i17, @Query("buvid") @NotNull String str3, @Query(Tm0.a.f24206c) @NotNull String str4, @Query("ogv_aid") long j9, @Query("language") @NotNull String str5);

    @Timeout(conn = 2000, read = 2000, write = 2000)
    @NotNull
    @FormUrlEncoded
    @POST("/x/tv/bifrost/report/edge")
    BiliCall<GeneralResponse<Void>> reportEdge(@Field(Tm0.a.f24206c) @Nullable String str, @Field("edge_device") @Nullable String str2, @Field("core_device") @Nullable String str3);
}
