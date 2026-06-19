package com.bilibili.playset.widget.favorite;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteService.class */
@BaseUrl("https://api.bilibili.com")
public interface FavoriteService {
    @FormUrlEncoded
    @POST("/x/v3/fav/resource/clean")
    @NotNull
    BiliCall<GeneralResponse<String>> clearOfflineMedias(@Field("media_id") long j7);

    @FormUrlEncoded
    @POST("/x/v3/fav/tab/up-fav")
    @NotNull
    BiliCall<GeneralResponse<FavoriteChangeResponse>> favBatchManage(@Field("resources") @NotNull String str, @Field("tar_media_ids") @NotNull String str2, @Field("action") @NotNull String str3, @Field("media_id") @Nullable Long l7);

    @FormUrlEncoded
    @POST("/x/v3/fav/resource/batch-deal")
    @NotNull
    BiliCall<GeneralResponse<JsonObject>> favBatchVideo(@Field(Tm0.a.f24206c) @NotNull String str, @Field("resources") @NotNull String str2, @Field("add_media_ids") @NotNull String str3, @Field("del_media_ids") @NotNull String str4, @Field("from") @NotNull String str5, @Field(CaptureSchema.JUMP_PARAMS_EXTRA) @NotNull String str6, @Field("from_spmid") @Nullable String str7, @Field("spmid") @Nullable String str8, @Field("action_id") @Nullable String str9, @Header("x-bili-gaia-vtoken") @Nullable String str10);

    @GET("/x/v3/fav/folder/created/list-all")
    @NotNull
    BiliCall<GeneralResponse<PlaySetPageData>> getCreatedPlaySetAll(@Query(Tm0.a.f24206c) @NotNull String str, @Query("up_mid") long j7, @Query("rid") @NotNull String str2, @Query("type") @NotNull String str3, @Query("show_season") boolean z6, @Query(CaptureSchema.JUMP_PARAMS_EXTRA) @NotNull String str4);

    @FormUrlEncoded
    @POST("/x/v3/fav/resource/unfav-all")
    @NotNull
    BiliCall<GeneralResponse<JsonObject>> removeFavorite(@Field("rid") long j7, @Field("type") int i7, @Field("from_spmid") @NotNull String str, @Field("spmid") @NotNull String str2, @Field("action_id") @Nullable String str3);

    @FormUrlEncoded
    @POST("/x/v3/fav/resource/sort")
    @NotNull
    BiliCall<GeneralResponse<String>> sortPlaySetMedias(@Field("sort") @NotNull String str, @Field("media_id") long j7);
}
