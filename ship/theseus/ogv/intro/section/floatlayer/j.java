package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/j.class */
@BaseUrl("https://api.bilibili.com")
public interface j {
    @GET("/pgc/view/v2/app/eps")
    @Nullable
    Object getSectionFloatLayerSeason(@Query("season_id") long j7, @NotNull Continuation<? super BiliApiResponse<SectionFloatLayerSeason>> continuation);
}
