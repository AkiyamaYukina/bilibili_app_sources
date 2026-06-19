package com.bilibili.biligame.api;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.user.BiliGameMineBookGame;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameBookApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface BiligameBookApiService {
    @POST("act/version/cancel_reserve")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<JSONObject>> cancelBookVersion(@Query("activity_id") @Nullable String str, @Query("reserve_for_pc") int i7);

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("user/book_list/delete")
    BiliCall<BiligameApiResponse<JSONObject>> deleteBookedGame(@Field("game_base_id") int i7);

    @KeySign({KeySign.UID, "filter_type"})
    @GET("user/book/gamelist/V3")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<Map<String, List<BiliGameMineBookGame>>>> getMineBookGamesV3(@Query("filter_type") int i7);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/top_order")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankOrder(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("top_charts/update_time")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameCommonBean>> getRankRefreshTime(@Query("rank_type") int i7);

    @GET("act/version/reserve_game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<BiliGameMineBookGame>>> getReserveGameList();
}
