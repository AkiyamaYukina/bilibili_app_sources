package com.bilibili.ogv.operation.api;

import aY0.a;
import com.bilibili.ogv.opbase.CommonCard;
import com.bilibili.ogv.opbase.HomeRecommendPage;
import com.bilibili.ogv.opbase.ModuleMine;
import com.bilibili.ogv.operation.entrance.rank.BangumiRankInfoVo;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/api/RemoteLogicService.class */
@BaseUrl("https://api.bilibili.com")
public interface RemoteLogicService {
    @POST("/pgc/activity/deliver/task/complete")
    @SplitGeneralResponse
    @NotNull
    a completeTask(@Query("position") @Nullable String str, @Query("task_id") @Nullable String str2, @Query("token") @Nullable String str3, @Query("timestamp") @Nullable String str4, @Query("task_sign") @Nullable String str5);

    @GET("/pgc/page/exchange")
    @SplitGeneralResponse
    @NotNull
    Single<List<CommonCard>> exchange(@Query("oid") @NotNull String str, @Query("type") @NotNull String str2);

    @POST("/pgc/activity/deliver/susWin/receive")
    @SplitGeneralResponse
    @NotNull
    Single<Object> getActivityPendant();

    @GET("/pgc/page/module/mine")
    @SplitGeneralResponse
    @NotNull
    Single<ModuleMine> getModuleMine(@Query(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE) @NotNull String str, @Query("tab_id") long j7, @Query("fnver") int i7, @Query("fnval") int i8, @Query("fourk") @NotNull String str2, @Query("qn") @Nullable String str3, @Query("teenagers_mode") @NotNull String str4);

    @GET("/pgc/page/tab")
    @SplitGeneralResponse
    @NotNull
    Single<List<OperationPageTabVo>> getOperationPageTab(@Query("parent_tab_name") @NotNull String str, @Query("hide_rcmd_tab") int i7);

    @GET("/pgc/season/rank/list")
    @SplitGeneralResponse
    @NotNull
    Single<BangumiRankInfoVo> getRankList(@Query("season_type") int i7, @Query("style_id") int i8);

    @GET("/pgc/season/rank/v2/list")
    @Nullable
    Object getRankSeasonList(@Query("oid") @NotNull String str, @Query("rank_id") int i7, @Query("from_spmid") @NotNull String str2, @Query("action_id") @Nullable String str3, @NotNull Continuation<? super BiliApiResponse<Object>> continuation);

    @GET("/pgc/season/rank/tabs")
    @SplitGeneralResponse
    @NotNull
    Single<List<Object>> getRankTabs(@Query("index_id") int i7);

    @GET("/pgc/page/guess/bangumi")
    @SplitGeneralResponse
    @NotNull
    Single<HomeRecommendPage> guessBangumi(@Query("page_no") int i7, @Query("page_size") int i8);

    @GET("/pgc/page/guess/cinema")
    @SplitGeneralResponse
    @NotNull
    Single<HomeRecommendPage> guessCinema(@Query("page_no") int i7, @Query("page_size") int i8);

    @GET("/pgc/page")
    @SplitGeneralResponse
    @NotNull
    Single<HomeRecommendPage> operationPage(@Query("name") @NotNull String str, @Query("tab_id") @NotNull String str2, @Query("cursor") long j7, @Query("type") @Nullable Integer num, @Query("fnver") int i7, @Query("fnval") int i8, @Query("fourk") @NotNull String str3, @Query("qn") @Nullable String str4, @Query("ad_extra") @Nullable String str5, @Query("teenagers_mode") @NotNull String str6);

    @GET("/pgc/page")
    @SplitGeneralResponse
    @NotNull
    Single<HomeRecommendPage> operationPageV2(@Query("name") @NotNull String str, @Query("tab_id") @NotNull String str2, @Query("cursor") @NotNull String str3, @Query("is_refresh") int i7, @Query("type") @Nullable Integer num, @Query("fnver") int i8, @Query("fnval") int i9, @Query("fourk") @NotNull String str4, @Query("qn") @Nullable String str5, @Query("ad_extra") @Nullable String str6, @Query("teenagers_mode") @NotNull String str7);

    @GET("/pgc/page/bangumi")
    @SplitGeneralResponse
    @NotNull
    Single<HomeRecommendPage> recommendBangumiPage(@Query("jump_rank_id") @NotNull String str, @Query("jump_module") @NotNull String str2, @Query("feed_related_season_ids") @NotNull String str3, @Query("cursor") @NotNull String str4, @Query("is_refresh") int i7, @Query("fnver") int i8, @Query("fnval") int i9, @Query("fourk") @NotNull String str5, @Query("qn") @Nullable String str6, @Query("ad_extra") @Nullable String str7, @Header("pgcinfo") @NotNull String str8, @Query("from_scene") int i10, @Query("from_context") @NotNull String str9);

    @GET("pgc/page/cinema/tab")
    @SplitGeneralResponse
    @NotNull
    Single<HomeRecommendPage> recommendCinemaPage(@Query("jump_rank_id") @NotNull String str, @Query("jump_module") @NotNull String str2, @Query("cursor") @NotNull String str3, @Query("is_refresh") int i7, @Query("fnver") int i8, @Query("fnval") int i9, @Query("fourk") @NotNull String str4, @Query("qn") @Nullable String str5, @Query("ad_extra") @Nullable String str6, @Header("pgcinfo") @NotNull String str7);
}
