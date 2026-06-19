package com.bilibili.playerbizcommon.live;

import Tm0.a;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.tencent.map.geolocation.TencentLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/live/VideoLiveApi.class */
@BaseUrl("https://api.bilibili.com")
public interface VideoLiveApi {
    @FormUrlEncoded
    @POST("/x/new-reserve/reserve/cancel")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> cancelReserve(@Field(a.f24206c) @Nullable String str, @Field("sid") long j7, @Field("csrf") @NotNull String str2, @Field("business") @NotNull String str3);

    @FormUrlEncoded
    @POST("/x/new-reserve/reserve/multi_cancel")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> cancelReserveBatch(@Field(a.f24206c) @Nullable String str, @Field("sids") @NotNull String str2, @Field("csrf") @NotNull String str3);

    @FormUrlEncoded
    @POST("https://app.bilibili.com/x/resource/entrance/infoc")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> closeReserve(@Field(a.f24206c) @Nullable String str, @Field("up_mid") long j7, @Field("business") @NotNull String str2, @Field(TencentLocation.NETWORK_PROVIDER) @NotNull String str3);

    @GET("/x/activity/reserve/following")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> getReserveState(@Query(a.f24206c) @Nullable String str, @Query("sid") long j7);

    @GET("/x/new-reserve/reserve/multi_info")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> getReserveStateBatch(@Query(a.f24206c) @Nullable String str, @Query("sids") @NotNull String str2);

    @FormUrlEncoded
    @POST("/x/new-reserve/reserve/add")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> reserve(@Field(a.f24206c) @Nullable String str, @Field("sid") long j7, @Field("csrf") @NotNull String str2, @Field("business") @NotNull String str3);

    @FormUrlEncoded
    @POST("/x/new-reserve/reserve/multi_add")
    @NotNull
    BiliCall<GeneralResponse<JSONObject>> reserveBatch(@Field(a.f24206c) @Nullable String str, @Field("sids") @NotNull String str2, @Field("csrf") @NotNull String str3);
}
