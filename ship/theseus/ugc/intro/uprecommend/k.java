package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.response.BiliApiResponse;
import java.util.Map;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/k.class */
@BaseUrl("https://app.bilibili.com")
public interface k {
    @GET("/x/v2/view/upper/recmd")
    @Timeout(conn = 1000)
    @Nullable
    Object recommendUp(@QueryMap @NotNull Map<String, String> map, @NotNull Continuation<? super BiliApiResponse<RecommendUpData>> continuation);
}
