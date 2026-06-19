package com.bilibili.ship.theseus.ogv.intro.floatlayer;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.bean.OgvActorInfoVo;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.bean.OgvIntroInfoVo;
import com.bilibili.ship.theseus.ogv.intro.floatlayer.bean.PersonRelateContentVo;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/e.class */
@BaseUrl("http://api.bilibili.com")
public interface e {
    @GET("/pgc/season/character/get")
    @Nullable
    Object getRoleInfoDetail(@Query("id") long j7, @NotNull Continuation<? super BiliApiResponse<OgvActorInfoVo>> continuation);

    @GET("/pgc/season/character/seasons")
    @Nullable
    Object getRoleWorksDetail(@Query("character_id") long j7, @Query("order_type") int i7, @Query("pn") int i8, @Query("ps") int i9, @NotNull Continuation<? super BiliApiResponse<PersonRelateContentVo>> continuation);

    @GET("/pgc/view/v2/app/media")
    @Nullable
    Object requestMediaInfo(@Query("media_id") long j7, @NotNull Continuation<? super BiliApiResponse<OgvIntroInfoVo>> continuation);
}
