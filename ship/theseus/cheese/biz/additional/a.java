package com.bilibili.ship.theseus.cheese.biz.additional;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/additional/a.class */
@BaseUrl("https://api.bilibili.com")
interface a {
    @GET("/pugv/view/app/view_additional_info")
    @Nullable
    Object getAdditionalInfo(@Query("season_id") long j7, @NotNull Continuation<? super BiliApiResponse<CheeseAdditionalInfo>> continuation);
}
