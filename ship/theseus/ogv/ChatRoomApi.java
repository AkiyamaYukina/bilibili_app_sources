package com.bilibili.ship.theseus.ogv;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ChatRoomApi.class */
@BaseUrl("http://api.bilibili.com")
public interface ChatRoomApi {
    @FormUrlEncoded
    @POST("/pgc/freya/room/create")
    @Nullable
    Object createRoom(@Field("season_id") long j7, @Field("episode_id") long j8, @Field("is_open") int i7, @Field("vega_abtest") int i8, @Field("from_type") int i9, @Field("sex_type") @Nullable Integer num, @Field("ext") @NotNull String str, @Field(Tm0.a.f24206c) @NotNull String str2, @NotNull Continuation<? super BiliApiResponse<ChatRoomState>> continuation);

    @GET("/pgc/freya/share/ogv/link")
    @Nullable
    Object requestShareOgvLink(@Query("season_id") long j7, @Query("episode_id") long j8, @Query("season_type") int i7, @Query("age_type") int i8, @Query("version") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<FreyaShare>> continuation);
}
