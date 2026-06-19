package com.bilibili.pegasus.channelv2.api;

import Tm0.a;
import Wn0.b;
import Wn0.f;
import Xn0.c;
import androidx.annotation.Nullable;
import com.bilibili.app.comm.list.common.api.d;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.pegasus.api.model.ChannelCategoryItem;
import java.util.ArrayList;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/api/ChannelV2ApiService.class */
@BaseUrl("https://app.bilibili.com")
public interface ChannelV2ApiService {
    @GET("x/v2/channel/list")
    BiliCall<GeneralResponse<b>> getAllChannel(@Nullable @Query(a.f24206c) String str, @Query("type") long j7, @Query("offset") String str2);

    @GET("x/v2/channel/tab3")
    BiliCall<GeneralResponse<ArrayList<ChannelCategoryItem>>> getAllChannelTab(@Nullable @Query(a.f24206c) String str);

    @GET("x/v2/channel/home2")
    @RequestInterceptor(d.class)
    BiliCall<GeneralResponse<c>> getChannelHomeCenter(@Nullable @Query("offset_new") String str, @Nullable @Query("offset_rcmd") String str2, @Nullable @Query("spmid") String str3, @Nullable @Query("auto_refresh") String str4, @Query("pn") int i7);

    @GET("x/v2/channel/square2")
    @RequestInterceptor(d.class)
    BiliCall<GeneralResponse<List<Xn0.b>>> getChannelHomeV2(@Nullable @Query("offset_new") String str, @Nullable @Query("offset_rcmd") String str2, @Nullable @Query("spmid") String str3, @Nullable @Query("auto_refresh") String str4, @Query("pn") int i7);

    @GET("x/v2/channel/red")
    BiliCall<GeneralResponse<ChannelRedPointerData>> getChannelRedPointerData(@Nullable @Query(a.f24206c) String str);

    @GET("x/v2/channel/recommend2")
    @RequestInterceptor(d.class)
    BiliCall<GeneralResponse<Xn0.d>> getHomeMoreRcmd(@Nullable @Query("offset") String str, @Nullable @Query("spmid") String str2);

    @GET("x/v2/channel/mine")
    BiliCall<GeneralResponse<f>> getMyChannel(@Nullable @Query(a.f24206c) String str);

    @FormUrlEncoded
    @POST("x/v2/channel/sort")
    BiliCall<GeneralResponse<Object>> sortTag(@Nullable @Field(a.f24206c) String str, @Field("action") int i7, @Nullable @Field("stick") String str2, @Nullable @Field("normal") String str3);
}
