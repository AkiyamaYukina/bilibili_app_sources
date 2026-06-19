package com.bilibili.search2.api;

import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.search2.result.bangumi.EpisodesNewItem;
import com.bilibili.search2.result.bangumi.SearchPgcFavoriteResult;
import com.bilibili.search2.result.vertical.live.data.BiliLiveMasterSearchResult;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/SearchService.class */
@BaseUrl("https://app.bilibili.com")
public interface SearchService {
    @POST("/x/v2/relation/esport/add")
    @Nullable
    BiliCall<GeneralResponse<Void>> esportAdd(@Query(Tm0.a.f24206c) @Nullable String str, @Query("match_id") long j7);

    @POST("/x/v2/relation/esport/cancel")
    @Nullable
    BiliCall<GeneralResponse<Void>> esportCancel(@Query(Tm0.a.f24206c) @Nullable String str, @Query("match_id") long j7);

    @POST("https://api.bilibili.com/pgc/app/follow/add")
    @NotNull
    BiliCall<GeneralResponse<SearchPgcFavoriteResult>> favorite(@Query(Tm0.a.f24206c) @Nullable String str, @Query("season_id") long j7);

    @GET("/x/resource/static")
    @NotNull
    BiliCall<GeneralResponse<SearchEasterEggConfig>> getEasterEggs(@Query("ver") @Nullable String str);

    @GET("x/v2/search/square")
    @NotNull
    BiliCall<GeneralResponse<List<SearchSquareType>>> getSquareContent(@Query(Tm0.a.f24206c) @Nullable String str, @Query("ad_extra") @Nullable String str2, @Query("from") int i7, @Query("show") int i8, @Query("limit") int i9, @Query("event_id") @Nullable String str3, @Query(GameCardButton.extraAvid) @Nullable String str4, @Query("query") @Nullable String str5, @Query("user_act") @Nullable String str6);

    @GET("/x/v2/search/recommend")
    @Nullable
    BiliCall<GeneralResponse<SearchReferral>> guessRecommend(@Query(Tm0.a.f24206c) @Nullable String str, @Query("from") int i7, @Query("show") int i8, @Query("event_id") @Nullable String str2, @Query(GameCardButton.extraAvid) @Nullable String str3, @Query("query") @Nullable String str4, @Query("user_act") @Nullable String str5, @Query("dislike") @Nullable String str6);

    @GET("x/v2/search/episodes")
    @NotNull
    BiliCall<GeneralResponse<List<Episode>>> searchEpisodes(@Query(Tm0.a.f24206c) @Nullable String str, @Query("season_id") @Nullable String str2);

    @GET("x/v2/search/episodes_new")
    @NotNull
    BiliCall<GeneralResponse<EpisodesNewItem>> searchEpisodesNew(@Query(Tm0.a.f24206c) @Nullable String str, @Query("season_id") @Nullable String str2, @Query("pn") int i7, @Query("ps") int i8);

    @GET("/x/v2/search/live")
    @NotNull
    BiliCall<GeneralResponse<BiliLiveMasterSearchResult>> searchLiveMaster(@Query("type") int i7, @Query("keyword") @NotNull String str, @Query("pn") int i8, @Query("ps") int i9, @Query("order") @NotNull String str2);

    @GET("x/v2/search/recommend/noresult")
    @NotNull
    BiliCall<GeneralResponse<SearchResultAll>> searchRecommend(@Query(Tm0.a.f24206c) @Nullable String str, @Query("pn") int i7, @Query("ps") int i8, @Query("keyword") @Nullable String str2);

    @POST("https://api.bilibili.com/pgc/app/follow/del")
    @NotNull
    BiliCall<GeneralResponse<SearchPgcFavoriteResult>> unfavorite(@Query(Tm0.a.f24206c) @Nullable String str, @Query("season_id") long j7);
}
