package com.bilibili.ogv.misc.follow.api;

import aY0.a;
import androidx.core.app.NotificationCompat;
import com.bilibili.ogv.misc.follow.api.entity.BangumiMineFollowV2;
import com.bilibili.ogv.misc.follow.api.entity.BangumiSeries;
import com.bilibili.ogv.misc.follow.api.entity.FollowMovableList;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import io.reactivex.rxjava3.core.Single;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/follow/api/BangumiFollowApiService.class */
public interface BangumiFollowApiService {
    @POST("/pgc/app/follow/watched/close")
    @NotNull
    a closeMaybeSeen(@Query(Tm0.a.f24206c) @Nullable String str, @Query("follow_type") int i7);

    @POST("/pgc/app/follow/series/close")
    @NotNull
    a closeSeries(@Query(Tm0.a.f24206c) @Nullable String str, @Query("follow_type") int i7);

    @POST("/pgc/app/follow/unwatch/close")
    @NotNull
    a closeWill(@Query(Tm0.a.f24206c) @Nullable String str, @Query("follow_type") int i7);

    @GET("/pgc/app/follow/movable")
    @SplitGeneralResponse
    @NotNull
    Single<FollowMovableList> getFollowMovableIds(@Query(Tm0.a.f24206c) @Nullable String str, @Query(NotificationCompat.CATEGORY_STATUS) int i7, @Query("follow_type") int i8);

    @GET("/pgc/app/follow/v2/{type}")
    @SplitGeneralResponse
    @NotNull
    Single<BangumiMineFollowV2> getFollowedSeasons(@Path("type") @NotNull String str, @Query("ps") int i7, @Query("pn") int i8, @Query(NotificationCompat.CATEGORY_STATUS) int i9, @Query("from_spmid") @Nullable String str2, @Query("spmid") @NotNull String str3);

    @GET("/pgc/app/follow/series/info")
    @SplitGeneralResponse
    @NotNull
    Single<BangumiSeries> getSeriesInfo(@Query(Tm0.a.f24206c) @Nullable String str, @Query("follow_type") int i7);
}
