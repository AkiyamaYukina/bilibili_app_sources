package com.bilibili.ship.theseus.ogv.videocard;

import com.bilibili.okretro.response.BiliApiResponse;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface OgvVideoCardApiService {
    @GET("/pgc/season/player/ogv/cards")
    @Nullable
    Object getOperationCardList(@Query("ep_id") long j7, @Query("scene_type") int i7, @NotNull Continuation<? super BiliApiResponse<? extends List<PlayerCardVO>>> continuation);

    @FormUrlEncoded
    @POST("/pgc/season/player/click/card")
    @Nullable
    Object operationCard(@Field("unique_id") @NotNull String str, @Field("ep_id") long j7, @Field("is_selected") boolean z6, @Field("season_id") @Nullable Long l7, @Field("biz_type") int i7, @Field("win_id") @NotNull String str2, @NotNull Continuation<? super BiliApiResponse<PlayerCardResultVO>> continuation);

    @GET("/pgc/season/player/frequency/control")
    @Nullable
    Object reportOperationCardShown(@Query("season_id") long j7, @Query("ep_id") long j8, @Query("card_type") int i7, @Query("biz_type") int i8, @Query("win_id") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<? extends Map<String, Integer>>> continuation);
}
