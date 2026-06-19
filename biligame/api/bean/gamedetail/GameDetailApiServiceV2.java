package com.bilibili.biligame.api.bean.gamedetail;

import Tm0.a;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.BookAward;
import com.bilibili.biligame.api.NoticeInfo;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.BiligameDisasterCall;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.call.ReportSign;
import com.bilibili.biligame.api.call.disaster.Disaster;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.interceptor.RecommendDeviceInfoInterceptor;
import com.bilibili.biligame.ui.gamedetail.abtest.GameDetailABTestResult;
import com.bilibili.biligame.ui.gamedetail.data.BenefitData;
import com.bilibili.biligame.ui.gamedetail.data.GameDetailToolsEntry;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailApiServiceV2.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface GameDetailApiServiceV2 {
    @GET("game/order_reward")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<BookAward>> getBookAwardInfoList(@Query("game_base_id") String str);

    @GET("landing_page/list/detail/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameDetailABTestResult>> getDetailAbTest(@Query("game_base_id") String str, @Query("source_code") String str2, @Query("channel_id") String str3, @Query("entrance_scene") String str4, @Query(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE) int i7, @Query("page_size") int i8, @Query("from_page") String str5, @Query("from_module") String str6, @Query("av_id") String str7, @Query("hit_mark_hot_exp") boolean z6, @Query(a.f24207d) String str8);

    @GET("detail/benefit")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BenefitData>> getDetailBenefit(@Query("game_base_id") String str, @Query("need_vip_gift") String str2);

    @KeySign({"game_base_id", "source_code"})
    @GET("detail/module/config")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<GameDetailModule>>> getDetailModuleConfig(@Query("game_base_id") String str, @Query("source_code") String str2);

    @GET("detail/share_image")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> getDetailSharePoster(@Query("game_base_id") String str);

    @GET("user/landing/page/detail/version/switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> getDetailVersionSwitch(@Query(NotificationCompat.CATEGORY_STATUS) int i7);

    @GET("detail/game_activity")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<GameActivityInfo>> getGameActivityInfo(@Query("game_base_id") String str);

    @GET("detail/game_activity/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<List<GameDetailActiveBanner>>> getGameActivityInfoV2(@Query("game_base_id") String str);

    @GET("official/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<GameOfficialAccount>> getGameCenterOfficialAccount(@Query(KeySign.UID) String str);

    @KeySign({"game_base_id"})
    @GET("detail/content/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(url = "detail/content/v2/1/{game_base_id}")
    BiligameDisasterCall<BiligameApiResponse<GameDetailContent>> getGameDetailContentV2(@Query("game_base_id") String str);

    @KeySign({"game_base_id"})
    @GET("detail/gameinfo/v3")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameDetailInfo>> getGameDetailInfoV3(@Query("game_base_id") String str);

    @GET("detail/game_intro")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameIntroBean>> getGameIntro(@Query("game_base_id") String str);

    @GET("detail/account")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<GameOfficialAccount>> getGameOfficialAccount(@Query("game_base_id") String str);

    @GET("detail/character")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<List<GameRole>>> getGameRoleList(@Query("game_base_id") String str);

    @GET("detail/toolbox/get_game_toolbox")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<GameDetailToolsEntry>> getGameTools(@Query("game_base_id") String str);

    @GET("detail/hot_video")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<VideoPage>> getHotVideoList(@Query("game_base_id") String str, @Query("buvid") String str2, @Query("from") int i7);

    @GET("game/notice")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<List<NoticeInfo>>> getNoticeInfoListV2(@Query("game_base_id") String str);

    @GET("comment/recommend")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<List<RecommendComment>>> getRecommendCommentList(@Query("game_base_id") String str, @Query("is_show_reply") boolean z6, @Query("page_size") int i7, @Query("hit_mark_hot_exp") boolean z7);

    @GET("detail/related")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    Single<BiligameApiResponse<List<BiligameMainGame>>> getRelatedGameList(@Query("game_base_id") String str);
}
