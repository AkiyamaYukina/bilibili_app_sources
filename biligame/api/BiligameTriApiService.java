package com.bilibili.biligame.api;

import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.interceptor.RecommendDeviceInfoInterceptor;
import com.bilibili.biligame.ui.feed.bean.GameFeedData;
import com.bilibili.biligame.ui.feed.bean.GameFeedItem;
import com.bilibili.biligame.ui.feed.bean.GameIntroduction;
import com.bilibili.biligame.ui.feed.dialog.backguide.bean.GameFeedBackGuideBean;
import com.bilibili.biligame.ui.home.bean.GameHomeItem;
import com.bilibili.biligame.ui.homecontainer.data.BiligameHomeTab;
import com.bilibili.biligame.ui.information.bean.GameInformation;
import com.bilibili.biligame.ui.update.bean.GameVersionDetailResp;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameTriApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface BiligameTriApiService {
    @GET("user/small/game_center/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameFeedBackGuideBean>> getDetailBackGuideInfo(@Query("game_base_id") @NotNull String str);

    @POST("landing_page/detail/list")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<GameFeedData>> getGameFeedList(@Query("game_base_id") int i7, @Query(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE) int i8, @Query("page_size") int i9, @Query("from_page") @Nullable String str, @Query("from_module") @Nullable String str2, @Query("av_id") @Nullable String str3, @Query("hit_mark_hot_exp") boolean z6, @Query("channel_id") @Nullable String str4, @Query("entrance_scene") @Nullable String str5, @Query(Tm0.a.f24207d) @Nullable String str6);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("home/land_page_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<BiligamePage<GameInformation>>> getGameInformationList(@Query("module_id") @Nullable String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("act/version/detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameVersionDetailResp>> getGameVersionDetail(@Query("game_base_id") @NotNull String str, @Query("game_version_id") @NotNull String str2);

    @GET("home/tab")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<List<BiligameHomeTab>>> getHomeTabs(@Query("reddot_type") @Nullable String str);

    @POST("landing_page/expose/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameFeedItem>> reportFeedExpose(@Query("game_base_id") int i7, @Query("aid") @NotNull String str, @Query(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE) int i8);

    @POST("landing_page/detail/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameFeedItem>> requestDetailInfo(@Query("game_base_id") int i7, @Query("channel_id") @NotNull String str, @Query("hit_mark_hot_exp") boolean z6, @Query("need_introduction") int i8, @Query("need_benefit") int i9, @Query(Tm0.a.f24207d) @Nullable String str2);

    @POST("landing_page/introduction")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliGameCall<BiligameApiResponse<GameIntroduction>> requestIntroduction(@Query("game_base_id") int i7);

    @GET("small/game/home/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<GameHomeItem>>> smallGameCenter(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("user/small/game_center/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<JSONObject>> smallGameReport();
}
