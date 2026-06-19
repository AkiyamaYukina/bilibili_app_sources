package com.bilibili.playerbizcommon.features.interactvideo;

import Tm0.a;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/interactvideo/InteractVideoApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface InteractVideoApiService {
    @GET("/x/stein/edgeinfo_v2")
    @NotNull
    BiliCall<GeneralResponse<InteractNode>> getNodeInfo(@Query(a.f24206c) @Nullable String str, @Query("edge_id") @NotNull String str2, @Query("aid") long j7, @Query("graph_version") long j8, @Query("delay") long j9, @Query("screen") int i7, @Query("portal") int i8, @Query("choices") @NotNull String str3, @Query("cursor") int i9);

    @POST("/x/stein/mark")
    @NotNull
    BiliCall<GeneralResponse<Object>> markInteractVideo(@Query(a.f24206c) @NotNull String str, @Query("aid") long j7, @Query("mark") int i7);
}
