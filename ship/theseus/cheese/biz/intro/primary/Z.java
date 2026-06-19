package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/Z.class */
@BaseUrl("https://api.bilibili.com")
public interface Z {
    @GET("/pugv/view/app/query/combine/season")
    @Nullable
    Object getRelatedCoursesDetails(@Query("season_id") long j7, @NotNull Continuation<? super BiliApiResponse<RelatedCoursesDetails>> continuation);
}
