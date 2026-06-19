package com.bilibili.ship.theseus.ogv.intro.livereserve;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/OgvLiveReserveOperationApiService.class */
@BaseUrl("https://api.bilibili.com")
public interface OgvLiveReserveOperationApiService {
    @POST("/pgc/view/activity/guide/bar/operation")
    @Nullable
    Object operateLiveReserveBar(@Query("season_id") long j7, @Query("season_type") int i7, @Query("reserve_id") long j8, @Query("operation_flag") int i8, @NotNull Continuation<? super BiliApiResponse<OgvLiveReserveVo>> continuation);

    @GET("/pgc/view/activity/guide/bar/info")
    @Nullable
    Object updateLiveReserveBar(@Query("season_id") long j7, @Query("season_type") int i7, @NotNull Continuation<? super BiliApiResponse<OgvLiveReserveVo>> continuation);
}
