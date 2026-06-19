package com.bilibili.teenagersmode.model;

import Tm0.a;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import wD0.b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/model/TeenagersModeApiService.class */
@BaseUrl("https://app.bilibili.com")
public interface TeenagersModeApiService {
    @GET("/x/v2/account/teenagers/timer/get")
    @RequestInterceptor(b.class)
    BiliCall<GeneralResponse<TeenagersModeGetTime>> getTime(@Query(a.f24206c) String str, @Query("device_token") String str2);

    @FormUrlEncoded
    @POST("/x/v2/account/teenagers/timer/set")
    @RequestInterceptor(b.class)
    BiliCall<GeneralResponse<Void>> setTime(@Field(a.f24206c) String str, @Field("time") long j7, @Field("device_token") String str2);

    @FormUrlEncoded
    @POST("/x/v2/account/teenagers/update")
    @RequestInterceptor(b.class)
    BiliCall<GeneralResponse<Void>> updateStatus(@Field(a.f24206c) String str, @Field("device_token") String str2, @Field("teenagers_status") int i7, @Field("pwd") String str3, @Field("wsxcde") String str4, @Field("device_model") String str5, @Field("sync") boolean z6, @Field("from") String str6);
}
