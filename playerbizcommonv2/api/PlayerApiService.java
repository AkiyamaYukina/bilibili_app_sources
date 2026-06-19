package com.bilibili.playerbizcommonv2.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playerbizcommonv2.danmaku.data.PlayerDanmukuReplyListInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/PlayerApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface PlayerApiService {
    @GET("/x/v2/dm/thumbup/stats")
    @NotNull
    BiliCall<GeneralResponse<String>> actList(@Query(Tm0.a.f24206c) @Nullable String str, @Query("oid") @NotNull String str2, @Query("ids") @NotNull String str3);

    @FormUrlEncoded
    @POST("/x/v2/dm/thumbup/add")
    @NotNull
    BiliCall<GeneralResponse<Void>> good(@Field(Tm0.a.f24206c) @Nullable String str, @Field("oid") @NotNull String str2, @Field("spmid") @NotNull String str3, @Field("from_spmid") @NotNull String str4, @Field("dmid") @NotNull String str5, @Field("op") @NotNull String str6);

    @GET("/x/v2/dm/reply/list")
    @NotNull
    BiliCall<GeneralResponse<PlayerDanmukuReplyListInfo>> replyList(@Query(Tm0.a.f24206c) @Nullable String str, @Query("type") @NotNull String str2, @Query("aid") @NotNull String str3, @Query("oid") @NotNull String str4, @Query("parent_id") @NotNull String str5, @Query("target_id") @Nullable String str6, @Query("pn") @Nullable Integer num, @Query("ps") @Nullable Integer num2, @Query("teenagers_mode") @Nullable String str7, @Query("lessons_mode") @Nullable String str8);
}
