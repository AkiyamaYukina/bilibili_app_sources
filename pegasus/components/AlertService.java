package com.bilibili.pegasus.components;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AlertService.class */
@BaseUrl("https://api.bilibili.com")
interface AlertService {
    @POST("/x/member/v2/notice/close")
    @NotNull
    BiliCall<GeneralResponse<Void>> closeAlert(@Query(Tm0.a.f24206c) @Nullable String str, @Query("uuid") @Nullable String str2);

    @GET("/x/member/v2/notice")
    @NotNull
    BiliCall<GeneralResponse<AlertMessage>> getAlertMessage(@Query(Tm0.a.f24206c) @Nullable String str, @Query("uuid") @Nullable String str2);
}
