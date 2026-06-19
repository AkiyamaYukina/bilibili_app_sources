package com.bilibili.ship.theseus.ogv;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/p.class */
@BaseUrl("https://api.bilibili.com/pgc/")
public interface p {
    @GET("player/check")
    @Nullable
    Object checkDrmPlayable(@Query("season_id") long j7, @Query("ep_id") long j8, @Query(Tm0.a.f24206c) @Nullable String str, @NotNull Continuation<? super BiliApiResponse<OgvDrmCheckResult>> continuation);
}
