package com.bilibili.lib.projection.internal.api;

import com.bilibili.lib.projection.internal.api.CloudDevices;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {
    @GET("/x/tv/proj_code/scan")
    @NotNull
    BiliCall<GeneralResponse<CloudDevices.Device>> getDeviceByProjCode(@Header("Buvid") @NotNull String str, @Query(Tm0.a.f24206c) @NotNull String str2, @Query("proj_code") @NotNull String str3);

    @GET("/x/tv/projection/devices")
    @NotNull
    BiliCall<GeneralResponse<CloudDevices>> getDeviceList(@Query(Tm0.a.f24206c) @Nullable String str, @Query("video_type") int i7);
}
