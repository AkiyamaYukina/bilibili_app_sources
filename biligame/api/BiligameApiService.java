package com.bilibili.biligame.api;

import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import com.bilibili.biligame.api.bean.GameOfficialInfo;
import com.bilibili.biligame.api.bean.VersionGiftReserve;
import com.bilibili.biligame.api.bean.WxQrCodeInfo;
import com.bilibili.biligame.api.bean.discover.BiligameBetaGameTopic;
import com.bilibili.biligame.api.bean.discover.BiligameStartTest;
import com.bilibili.biligame.api.bean.discover.GameTopicBean;
import com.bilibili.biligame.api.bean.gamedetail.GameActCenterInfo;
import com.bilibili.biligame.api.bean.gamedetail.GameCommentReport;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.bean.gamedetail.HotActListInfo;
import com.bilibili.biligame.api.bean.gamedetail.RecommendComment;
import com.bilibili.biligame.api.book.AutoDownloadSet;
import com.bilibili.biligame.api.book.CancelBookResp;
import com.bilibili.biligame.api.book.GameBookResp;
import com.bilibili.biligame.api.book.RelatedGameResp;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.BiligameDisasterCall;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.call.ReportSign;
import com.bilibili.biligame.api.call.disaster.Disaster;
import com.bilibili.biligame.api.call.disaster.NewDisaster;
import com.bilibili.biligame.api.category.BiligameCategoryBanner;
import com.bilibili.biligame.api.category.BiligameCategoryGameList;
import com.bilibili.biligame.api.comment.CommentAttitude;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.interceptor.BiligameRiskManagerRequestInterceptor;
import com.bilibili.biligame.api.interceptor.RecommendDeviceInfoInterceptor;
import com.bilibili.biligame.api.pay.CashierConfig;
import com.bilibili.biligame.api.pay.GameOrderInfo;
import com.bilibili.biligame.api.search.BiligameSearchDiscoverResp;
import com.bilibili.biligame.api.search.BiligameSearchPage;
import com.bilibili.biligame.api.search.BiligameSearchRelationResponse;
import com.bilibili.biligame.api.user.BiligameSystemMessage;
import com.bilibili.biligame.api.user.FollowUser;
import com.bilibili.biligame.bean.GameEntrance;
import com.bilibili.biligame.bean.WikiDetailInfoBean;
import com.bilibili.biligame.bean.WikiInfo;
import com.bilibili.biligame.bean.benefit.GameBenefitAllReceiveBean;
import com.bilibili.biligame.business.pegasus.bean.GamePegasusNoticeBean;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.biligame.card.newcard.bean.BiliGameCardDataBean;
import com.bilibili.biligame.ui.authen.bean.AuthentionBean;
import com.bilibili.biligame.ui.coupons.bean.BiligameMineCouponsBean;
import com.bilibili.biligame.ui.gamedetail.data.MyRecentInfo;
import com.bilibili.biligame.ui.gamedetail.data.PanelNotification;
import com.bilibili.biligame.ui.minev3.bean.MyRedPoint;
import com.bilibili.biligame.ui.minigame.more.bean.BiligameSmallGameTabBean;
import com.bilibili.biligame.ui.set.download.bean.BiliSetAutoGameBean;
import com.bilibili.biligame.ui.widget.bean.GameWidgetBean;
import com.bilibili.biligame.ui.widget.bean.GameWidgetGuideBean;
import com.bilibili.biligame.ui.widget.bean.GameWidgetRecommendBean;
import com.bilibili.biligame.widget.user.dialog.data.UserCardInfo;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface BiligameApiService {
    @GET("activity/center/home")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameActCenterInfo>> actCenterHome();

    @POST("user/relationship/add_block")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> addBlock(@Query("fid") String str, @Query("spmid") String str2);

    @KeySign({KeySign.UID, "sdk_type", KeySign.UID, "category_id"})
    @GET("tag/user/follow/category/add")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BaseResponse>> addCategory(@Query("sdk_type") String str, @Query("category_id") String str2);

    @POST("comment/add")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> addComment(@Query("game_base_id") String str, @Query("grade") int i7, @Query("comment_type") int i8, @Query(TextSource.CFG_CONTENT) String str2, @Query("device_type") String str3, @Query("dynamic_repost") int i9, @Query("game_name") String str4, @Query("icon") String str5, @Query("url") String str6, @Query("extra_stars") String str7, @Query("desc_text") String str8, @Query("av_ids") String str9, @Query("need_risk_control") int i10, @Query("challenge") String str10, @Query("validate") String str11, @Query("seccode") String str12, @Query("userid") String str13, @Query("gs") int i11, @Query("token") String str14, @Query("captcha_code") String str15, @Query("account_change") boolean z6, @Query("show_play_duration") int i12);

    @GET("tag/user/follow/category/add")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<Object>> addCustomCategory(@Query("category_id") String str);

    @POST("comment/reply/add")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> addReply(@Query("game_base_id") String str, @Query(TextSource.CFG_CONTENT) String str2, @Query("comment_no") String str3, @Query("reply_type") int i7, @Query("to_uid") String str4, @Query("to_user_name") String str5, @Query("to_reply_no") String str6, @Query("need_risk_control") int i8, @Query("challenge") String str7, @Query("validate") String str8, @Query("seccode") String str9, @Query("userid") String str10, @Query("gs") int i9, @Query("token") String str11, @Query("captcha_code") String str12);

    @GET("news/article/view")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> addStrategyPV(@Query("article_id") String str);

    @ReportSign(sample = false)
    @POST("detail/order_and_receive_benefit")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameBenefitAllReceiveBean>> bookWithBenefitReceive(@Query("game_base_id") int i7, @Query(GameCardButton.extraParamSource) String str, @Query("challenge") String str2, @Query("validate") String str3, @Query("seccode") String str4, @Query("userid") String str5, @Query("gs") Integer num, @Query("token") String str6, @Query("captcha_code") String str7, @Query("bgame_from") String str8, @Query("source_from") String str9, @Query("from_game") String str10, @Query("page_id") String str11, @Query("btn_id") String str12, @Query("real_url") String str13, @Query("source_game_center") String str14, @Query(CaptureSchema.JUMP_PARAMS_EXTRA) String str15);

    @POST("detail/order/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> bookWithGeeCaptcha(@Query("game_base_id") int i7, @Query("challenge") String str, @Query("validate") String str2, @Query("seccode") String str3, @Query("userid") String str4, @Query("gs") int i8, @Query(GameCardButton.extraParamSource) String str5, @Query("bgame_from") String str6, @Query("source_from") String str7, @Query("from_game") String str8, @Query("page_id") String str9, @Query("btn_id") String str10, @Query("real_url") String str11, @Query("source_game_center") String str12, @Query(CaptureSchema.JUMP_PARAMS_EXTRA) String str13);

    @POST("detail/captcha_order/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> bookWithImageCaptcha(@Query("game_base_id") int i7, @Query("token") String str, @Query("captcha_code") String str2, @Query(GameCardButton.extraParamSource) String str3, @Query("bgame_from") String str4, @Query("source_from") String str5, @Query("from_game") String str6, @Query("page_id") String str7, @Query("btn_id") String str8, @Query("real_url") String str9, @Query("source_game_center") String str10);

    @ReportSign(sample = false)
    @POST("detail/order/v3")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameBookResp>> bookWithRiskControl(@Query("game_base_id") int i7, @Query(GameCardButton.extraParamSource) String str, @Query("challenge") String str2, @Query("validate") String str3, @Query("seccode") String str4, @Query("userid") String str5, @Query("gs") Integer num, @Query("token") String str6, @Query("captcha_code") String str7, @Query("bgame_from") String str8, @Query("source_from") String str9, @Query("from_game") String str10, @Query("page_id") String str11, @Query("btn_id") String str12, @Query("real_url") String str13, @Query("source_game_center") String str14, @Query(CaptureSchema.JUMP_PARAMS_EXTRA) String str15);

    @ReportSign(sample = false)
    @GET(BiligameCopyWriting.KEY_CANCEL_BOOK)
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> cancelBook(@Query("game_base_id") int i7, @Query("bgame_from") String str, @Query("source_from") String str2);

    @ReportSign(sample = false)
    @POST("cancel_book/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<CancelBookResp>> cancelBookV2(@Query("game_base_ids") String str, @Query("bgame_from") String str2, @Query("source_from") String str3);

    @GET("detail/order/recommend/status")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Integer>> checkBookRecommendListSwitch(@Query("game_base_id") int i7);

    @POST("comment/user/system_message/clear_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> clearMessagePoint();

    @GET("detail/user/clear_panel_notification")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> clearPanelNotification(@Query("biz_type") String str);

    @GET("message/user/tab/red_point/clear")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> clearTabRedPoint(@Query("message_type") int i7);

    @POST("user/cloud_game/recent_play/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> cloudRecentPlay();

    @POST("news/article/favorite")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> collectStrategy(@Query("article_id") String str, @Query(NotificationCompat.CATEGORY_STATUS) int i7);

    @POST("wiki/subscribe")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Object>> collectWiki(@Query("wiki_link") String str, @Query("wiki_title") String str2, @Query("game_base_id") String str3, @Query("subscribe_status") int i7);

    @FormUrlEncoded
    @POST("comment/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> commentReport(@Field("game_base_id") int i7, @Field("comment_no") String str);

    @POST("comment/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> commentReportV2(@Query("game_base_id") int i7, @Query("comment_no") String str, @Query("report_type") int i8, @Query("report_name") String str2, @Query("report_msg") String str3);

    @POST("comment/delete")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> deleteComment(@Query("game_base_id") int i7, @Query("comment_no") String str);

    @POST("comment/reply/delete")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> deleteReply(@Query("comment_no") String str, @Query("reply_no") String str2);

    @GET("desktop_widget/recommend_games")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameWidgetRecommendBean>> desktopWidgetRecommend(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("desktop_widget/refresh")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameWidgetBean>> desktopWidgetRefresh(@Query("game_base_id") String str, @Query("rank_adjust") int i7);

    @GET("desktop_widget/share/template")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameMainGame>> desktopWidgetTemplate(@Query("game_base_id") String str);

    @GET("small/game/follow/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> fetchAttentionMiniGame(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("user/auto_download/game_pkg_list/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameAutoDownloadInfo>> fetchAutoDownloadGame(@Query(GameCardButton.extraParamSource) int i7);

    @GET("user/order/auto_download_status/game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiliSetAutoGameBean>>> fetchBookedAutoDownloadGame();

    @GET("detail/game_card/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiliGameCardInfo>> fetchGameInfo(@Query("game_base_id") int i7, @Query("channel_id") String str, @Query("channel_extra") String str2, @Query("source_from") String str3);

    @ReportSign(sample = false)
    @GET("detail/game_card/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiliGameCardDataBean>> fetchGameInfoV2(@Query("game_base_id") long j7, @Query("channel_id") String str, @Query("channel_extra") String str2, @Query("source_from") String str3);

    @GET("incr_updated_pkg/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiliGamePatchInfo>> fetchGamePatchInfo(@Query("game_base_id") int i7);

    @GET("small/game/guess/like")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> fetchGuessYourLikeMiniGame(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("small/game/recent/play")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> fetchRecentPlayMiniGame(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("comment/uper/video_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<GameVideoInfo>>> fetchUperVideoList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("user/played/game_pkg_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePkgList>> fetchUserPlayedGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("tag/total/category/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameCategoryHotGameList>>> getAllCategoryGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("home/recommend_video")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameAttentionVideo>>> getAttentionVideoList(@Query("from") int i7, @Query("buvid") String str, @Query("first_time") int i8, @Query("game_base_id") int i9);

    @KeySign({KeySign.UID, "page_num"})
    @GET("comment/user/my_message/attitude/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMyMessagePage>>> getAttitudeMessageList(@Query("page_num") int i7);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("home/book/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameBook>>> getBookCenterList(@Query("page_num") int i7, @Query("page_size") int i8, @Query("sort_type") int i9);

    @GET("home/book/page/config")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameBookCenterTab>>> getBookCenterTab();

    @GET("home/download/notify")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameBookNotifyInfo>> getBookNotifyInfo();

    @GET("user/payment/cashier/config")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<CashierConfig>> getCashierConfig(@Query("game_base_id") int i7, @Query("product_id") String str, @Query("sdk_type_id") int i8);

    @GET("user/payment/cashier/coupon_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameMineCouponsBean>> getCashierCouponList(@Query("game_base_id") int i7, @Query("product_id") String str, @Query("sdk_type_id") int i8, @Query("order_amount") String str2);

    @GET("tag/top/category/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameCategoryBanner>>> getCategoryBanner(@Query("sdk_type") int i7);

    @KeySign({KeySign.UID, "sdk_type", "category_id", "tag_id", "page_num", "page_size", "sort_type", "filterType"})
    @GET("tag/category/game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getCategoryGameListByTagId(@Query("sdk_type") String str, @Query("category_id") String str2, @Query("tag_id") String str3, @Query("page_num") int i7, @Query("page_size") int i8, @Query("sort_type") int i9, @Query("filter_type") int i10);

    @KeySign({KeySign.UID, "sdk_type", "category_id"})
    @GET("tag/category/tag_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameCategoryGameList>> getCategoryGameTagList(@Query("sdk_type") String str, @Query("category_id") String str2);

    @GET("tag/category/guess_like_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameCategoryGuessYourLike>>> getCategoryGuessYourLikeList();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("user/cloud_game/recent/play/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameMainGame>>> getCloudGameList(@Query("page_num") int i7, @Query("page_size") int i8, @Query("keyword") String str);

    @POST("comment/detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<RecommendComment>> getCommentDetail(@Query("game_base_id") String str, @Query("comment_no") String str2);

    @GET("comment/history/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<RecommendComment>>> getCommentHistory(@Query("game_base_id") int i7, @Query("comment_no") String str, @Query("count") int i8);

    @GET("top_charts/get/copywriting")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameCopyWriting>> getCopyWritingConfig(@Query("key") String str);

    @GET("tag/user/follow/all/category/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameCategory>>> getCustomCategory();

    @GET("discover/banner")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameBanner>>> getDiscoverBanner();

    @GET("tag/category/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameCategory>>> getDiscoverCategory();

    @GET("discover/rank")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<RankConfig>>> getDiscoverRank();

    @KeySign({"page_num", "page_size"})
    @GET("discover/total/page/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameDiscoverTotalPage>> getDiscoverTotalPage(@Query("page_num") int i7, @Query("page_size") int i8);

    @FormUrlEncoded
    @POST("user/download")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> getDownloadGameInfoList(@Field("pkg_name_list") String str);

    @FormUrlEncoded
    @POST("user/download/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> getDownloadGameInfoListV2(@Field("game_channel_list") String str);

    @POST("comment/switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> getEnableComment(@Query("game_base_id") String str);

    @GET("user/entrance_list_v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<GameEntrance>>> getEntranceListConfig();

    @GET("tag/user/follow/category/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameCategoryList>>> getFollowCategoryGameList(@Query("sdk_type") int i7, @Query("page_num") int i8);

    @GET("home/recommend_game/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameSelectFollow>> getFollowGameList();

    @GET("user/follow/game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getFollowGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "vmid", "pn", "ps"})
    @GET("user/relationship/follower_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameVersionPage<FollowUser>>> getFollowerList(@Query("vmid") long j7, @Query("pn") int i7, @Query("ps") int i8);

    @KeySign({KeySign.UID, "vmid", "pn", "ps"})
    @GET("user/relationship/following_list?re_version=&order=des")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameVersionPage<FollowUser>>> getFollowingList(@Query("vmid") long j7, @Query("pn") int i7, @Query("ps") int i8);

    @KeySign({KeySign.UID, "page_num"})
    @GET("gift/forum_gift")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameGiftDetail>>> getForumGiftInfos(@Query("page_num") int i7);

    @GET("user/game_download/free/get_pay_url")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getFreeGameDownloadLinks(@Query("game_base_id") int i7);

    @GET("discover/get_future_start_test_list_detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameBetaGameTopic>>> getFutureBetaGameList(@Query("page_num") int i7, @Query("page_size") int i8, @Query("strategy") int i9, @Query("is_new_start_test") int i10);

    @KeySign({"game_base_id"})
    @GET("book/game/detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameDetailInfo>> getGameDetail(@Query("game_base_id") String str);

    @GET("user/game_download/get_crypto_url")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getGameDownloadLinks(@Query("game_base_id") int i7);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("home/land_page_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameInformation>>> getGameInformationList(@Query("module_id") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "collection_id", "page_num", "page_size", "filter_type"})
    @GET("discover/collection/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getGameListByCollectionId(@Query("collection_id") long j7, @Query("page_num") int i7, @Query("page_size") int i8, @Query("filter_type") int i9);

    @KeySign({KeySign.UID, "tag_id", "page_num", "page_size", "sort_type"})
    @GET("tag/game/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getGameListByTagId(@Query("tag_id") String str, @Query("page_num") int i7, @Query("page_size") int i8, @Query("sort_type") int i9);

    @KeySign({KeySign.UID, "tag_id", "page_num", "page_size", "sort_type"})
    @GET("tag/game/list/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getGameListByTagIdV2(@Query("tag_id") String str, @Query("page_num") int i7, @Query("page_size") int i8, @Query("sort_type") int i9);

    @GET("search/gift")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameGift>>> getGiftListByKeyword(@Query("keyword") String str);

    @GET("user/related_game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> getGuessLikeGameList();

    @KeySign({KeySign.UID, "page_num"})
    @GET("gift/user_expired_gift")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameGiftDetail>>> getHistoryGiftInfos(@Query("page_num") int i7, @Query("need_vip_gift") int i8);

    @GET("home/ad/current/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameHomeAd>> getHomeAd();

    @GET("home/cloud_game/list/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameMainGame>>> getHomeCloudGame(@Query("page_size") int i7);

    @GET("home/recent_new/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameCollection>> getHomeRecentNewGameList();

    @GET("message/user/home_bell/red_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameMyMessageCount>> getHomeRedPoint();

    @KeySign({"page_number", "page_size"})
    @GET("discover/activity/page_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameDiscoverHotActivity>>> getHotActivities(@Query("page_number") int i7, @Query("page_size") int i8);

    @KeySign({"page_num", "page_size"})
    @GET("comment/hot/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameHotComment>>> getHotCommentListPage(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("comment/hot")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameHotComment>>> getHotComments();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("home/hot/game/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getHotGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("home/hot_client_game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getHotTypeGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("message/bulletin")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameMessageNotice>> getMessageNotice();

    @GET("user/played/pkg_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePkgList>> getMinePlayGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("user/game_download/multi_get_crypto_url")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<Map<String, String>>>> getMultiGameDownloadLinks(@Query("game_base_ids") String str);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("user/favorite/strategy")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameStrategyPage>>> getMyFavoriteList(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("user/favorite/wiki")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<WikiInfo>>> getMyFavoriteWikiList(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num"})
    @GET("message/user/my_game/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameSystemMessage>>> getMyGameMessageList(@Query("page_num") int i7);

    @GET("user/myinfo")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameMyInfo>> getMyInfo();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("home/new/game/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getNewGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @POST("user/download/notify/status")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Integer>> getNotifyStatus();

    @GET("game/book_game_recommend")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> getOrderGameRecommendList(@Query("game_base_id") String str);

    @GET("detail/user/panel_v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<MyRecentInfo>>> getPanelV2(@Query("game_base_id") String str);

    @GET("user/payment/switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getPaymentSwitchConfig();

    @GET("game/module/get_module")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameGameInfo>> getPlayedGameInfo(@Query("game_base_id") int i7);

    @GET("home/subscribe_game/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameMainGame>>> getPlayedGameList();

    @GET("wechat/qrcode/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<WxQrCodeInfo>> getQrCodeInfo();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/top_b_index")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(url = "top_charts/top_b_index/1")
    BiligameDisasterCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankBIndex(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("top_charts/tag_ranks")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameRankCategory>>> getRankCategory();

    @KeySign({KeySign.UID, "tag_id", "rank_type"})
    @GET("top_charts/tag_rank/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankCategoryGameList(@Query("tag_id") String str, @Query("rank_type") int i7);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/hottest")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(url = "top_charts/hottest/1")
    BiligameDisasterCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankHot(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/hottest")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign("report")
    @NewDisaster(queryKey = {"page_num"}, queryValue = {"1"}, url = "top_charts/hottest/1")
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankHotV2(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("top_charts/get_ranking_name")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameRank>>> getRankNameArray();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/top_new")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(url = "top_charts/top_new/1")
    BiligameDisasterCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankNew(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/top_order")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(url = "top_charts/top_order/1")
    BiligameDisasterCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankOrder(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("top_charts/update_time")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameCommonBean>> getRankRefreshTime(@Query("rank_type") int i7);

    @GET("top_charts/get_start_test_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankStartTest(@Query("page_num") int i7, @Query("page_size") int i8, @Query("strategy") int i9);

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/top_rating")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(url = "top_charts/top_rating/1")
    BiligameDisasterCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRankTop(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("discover/get_recent_start_test_list_detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameBetaGameTopic>>> getRecentBetaGameList(@Query("strategy") int i7, @Query("is_new_start_test") int i8);

    @GET("home/recent_new/gamelist/v2")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getRecentNewGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({"game_base_id"})
    @GET("home/recommend_game_detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameDetailInfo>> getRecommendGameDetail(@Query("game_base_id") String str);

    @GET("search/key")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameSearchKey>>> getRecommendSearchKey();

    @GET("discover/recommend_game_user")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<UserInfo>>> getRecommendUpPlayerList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("detail/order/related_booked")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<RelatedGameResp>> getRelatedGames(@Query("game_base_id") int i7);

    @GET("search/game_name")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameSearchRelationResponse<List<SearchGameDetailInfo>>> getRelationGameListByKeyword(@Query("keyword") String str);

    @POST("comment/reply/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<RecommendComment.CommentReply>>> getReplyList(@Query("game_base_id") String str, @Query("comment_no") String str2, @Query("page_num") int i7);

    @KeySign({KeySign.UID, "page_num"})
    @GET("comment/user/my_message/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMyMessagePage>>> getReplyMessageList(@Query("page_num") int i7);

    @GET("search/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getSearchGameByKeyword(@Query("keyword") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("search/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameSearchPage<BiligameSearchGame>>> getSearchGameListByKeyword(@Query("keyword") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("search/module_type")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameSearchModuleType>> getSearchModuleTypeByKeyword(@Query("keyword") String str);

    @GET("search/operator/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameSearchOperatorGame>> getSearchOperatorGameListByKeyword(@Query("keyword") String str);

    @GET("search/related/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameMainGame>>> getSearchRelatedGameListByKeyword(@Query("keyword") String str);

    @GET("search/surprise")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameSearchSurprise>> getSearchSurpriseByKeyword(@Query("keyword") String str);

    @GET("search/resource")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<BiligameSearchV2OpRes>> getSearchV2OperationRes();

    @KeySign({KeySign.UID, "page_num", "page_size"})
    @GET("top_charts/{rank_type}")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getSearchV2Rank(@Path("rank_type") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("search/rank_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<List<BiligameRank>>> getSearchV2RankNameArray();

    @GET("search/recommend/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    Single<BiligameApiResponse<BiligameSearchDiscoverResp>> getSearchV2Recommend();

    @GET("search/wiki")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameSearchWikiList>> getSearchWikiListByKeyword(@Query("keyword") String str, @Query("page_offset") String str2, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("search/wiki/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameSearchWikiList>> getSearchWikiListByKeywordV2(@Query("keyword") String str, @Query("page_offset") String str2, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("home/smallgame/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getSmallGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("discover/get_start_test_list_v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameStartTest>> getStartTestListV2();

    @KeySign({"article_id"})
    @GET("news/article/detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<String>> getStrategyDetail(@Query("article_id") String str);

    @GET("search/strategy/article/page/v3")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameSearchPage<BiligameStrategyPage>>> getStrategyGameListByKeywordV2(@Query("keyword") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign(path = "news/user/strategy/page", value = {"page_num", "page_size", KeySign.UID})
    @GET("news/strategy/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameStrategyTotalPage>> getStrategySubscribePages(@Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({KeySign.UID, "page_num"})
    @GET("message/user/system_notice/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameSystemMessage>>> getSystemNoticeList(@Query("page_num") int i7);

    @GET("message/user/tab/red_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameNewMessageStatus>> getTabRedPoint();

    @KeySign({KeySign.UID, "tag_id", "page_num", "page_size"})
    @GET("tag/top_game/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<BiligameMainGame>>> getTopGameListByTagId(@Query("tag_id") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @KeySign({"page_number", "page_size"})
    @GET("topic/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameDiscoverTopic>>> getTopicList(@Query("page_number") int i7, @Query("page_size") int i8);

    @GET("discover/followed_up_play/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameUpPlayingGame>>> getUpPlayingGameList(@Query("page_num") int i7, @Query("page_size") int i8);

    @GET("user/update/gameinfo")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameUpdateGame>>> getUpdateGameInfos(@Query("game_base_ids") String str);

    @GET("user/identity_card")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<UserCardInfo>> getUserCardInfo(@Query(KeySign.UID) long j7, @Query("game_base_id") String str, @Query("need_steam") int i7);

    @KeySign({KeySign.UID, "page_num"})
    @GET("comment/user/my_comment/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameComment>>> getUserCommentList(@Query("page_num") int i7);

    @FormUrlEncoded
    @POST("user/followed")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> getUserFollowedStatus(@Field(KeySign.UID) long j7);

    @KeySign({KeySign.UID, "vmid", "pn", "ps"})
    @GET("user/space/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<FollowUser>> getUserInfo(@Query(KeySign.UID) long j7);

    @GET("home/collection/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameVideoInfo>>> getVideoGroupList(@Query("collection_id") int i7, @Query("collection_type") int i8, @Query("page_num") int i9, @Query("page_size") int i10);

    @GET("home/collection/top")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameVideoGroupTop>> getVideoGroupTop(@Query("collection_id") int i7, @Query("collection_type") int i8);

    @GET("wiki/home/page/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<WikiDetailInfoBean>> getWikiDetailInfo(@Query("game_base_id") String str);

    @KeySign({KeySign.UID, "page_num"})
    @POST("message/wiki/reply/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligamePage<BiligameMyMessagePage>>> getWikiMessageList(@Query("page_num") int i7);

    @POST("message/wiki_red_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Boolean>> getWikiTabStatus(@Query("message_tab") int i7);

    @GET("wechat/official/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameOfficialInfo>> getWxOfficialInfo(@Query("game_base_id") int i7);

    @GET("user/played_tab/red_dot")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameNewMessageStatus>> homePlayRedPoint();

    @GET("activity/center/hot_activities")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<HotActListInfo>> hotActivities(@Query("last_index") int i7, @Query("page_size") int i8);

    @GET("wiki/subscribe_status")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> isCollectWiki(@Query("wiki_link") String str);

    @POST("message/delete")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> messageDelete(@Query("message_tab") int i7, @Query("message_no") String str);

    @POST("comment/modify")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> modifyComment(@Query("game_base_id") String str, @Query("comment_no") String str2, @Query("grade") int i7, @Query("comment_type") int i8, @Query(TextSource.CFG_CONTENT) String str3, @Query("av_ids") String str4, @Query("need_risk_control") int i9, @Query("challenge") String str5, @Query("validate") String str6, @Query("seccode") String str7, @Query("userid") String str8, @Query("gs") int i10, @Query("token") String str9, @Query("captcha_code") String str10, @Query("show_play_duration") int i11);

    @POST("comment/attitude/modify")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<CommentAttitude>> modifyCommentEvaluateStatus(@Query("game_base_id") int i7, @Query("comment_no") String str, @Query("evaluate_status") int i8, @Query("target_uid") long j7);

    @FormUrlEncoded
    @POST("user/follow/game")
    @RequestInterceptor(jo.c.class)
    BiliCall<BiligameApiResponse<JSONObject>> modifyFollowGameStatus(@Field("game_base_id") int i7, @Field("act") int i8, @Field("spmid") String str, @Field("from_spmid") String str2, @Field("extend_content") String str3);

    @FormUrlEncoded
    @POST("user/relationship/modify_stat")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> modifyFollowStatus(@Field("fid") long j7, @Field("act") int i7, @Field("re_src") int i8);

    @FormUrlEncoded
    @POST("user/relationship/modify_stat")
    @RequestInterceptor(jo.c.class)
    BiliCall<BiligameApiResponse<JSONObject>> modifyFollowStatus(@Field("fid") long j7, @Field("act") int i7, @Field("re_src") int i8, @Field("spmid") String str, @Field("from_spmid") String str2, @Field("extend_content") String str3);

    @POST("user/download/notify/switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> modifyNotifyStatus(@Query("switch_status") int i7);

    @POST("comment/reply/attitude/modify")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> modifyReplyEvaluateStatus(@Query("game_base_id") String str, @Query("comment_no") String str2, @Query("reply_no") String str3, @Query("evaluate_status") int i7);

    @GET("user/switch/modify")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<JSONObject>> modifyUserSwitch(@Query("switch_type") int i7, @Query("switch_status") int i8);

    @GET("home/notice_game_report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> noticeGameReport(@Query("notice_id") String str);

    @POST("act/version/auto_download/switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<String>> obtainBookVersionGameWifiDownloadSwitchStatus(@Query("activity_id") String str, @Query("download_status") int i7);

    @GET("detail/order/auto_download/status")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<String>> obtainGameWifiDownloadSwitchStatus(@Query("game_base_id") int i7, @Query("reserve_type") int i8);

    @GET("detail/order/auto_download/status/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<AutoDownloadSet>> obtainGameWifiDownloadSwitchStatusV2(@Query("game_base_id") int i7, @Query("reserve_type") int i8);

    @FormUrlEncoded
    @POST("detail/presale/auto/reserve")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<Integer>> operatorAutoBook(@Field("game_base_id") int i7);

    @GET("detail/user/panel_notification")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<PanelNotification>> panelNotification();

    @GET("user/payment/check")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Boolean>> paymentCheck(@Query("game_base_id") String str, @Query("local_order_id") String str2, @Query("submit_order_id") String str3);

    @GET("user/query_realname_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<AuthentionBean>> queryRealInfo(@Query("game_base_id") String str, @Query("pay_money") String str2, @Query("sdk_type_id") int i7);

    @POST("comment/user/my_message/attitude/read")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<String>> readAttitudeMessage(@Query("message_no") String str);

    @GET("message/bulletin/read")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Object>> readMessageNotice(@Query("bulletin_no") String str);

    @POST("comment/user/my_message/read")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<String>> readReplyMessage(@Query("message_no") String str);

    @POST("message/wiki/reply/read")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<String>> readWikiMessage(@Query("message_no") String str);

    @POST("message/wiki_red_point/clear")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> readWikiMessageTab(@Query("message_tab") int i7);

    @GET("my/red_point")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<MyRedPoint>> redPoint();

    @FormUrlEncoded
    @POST("comment/reply/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> replyReport(@Field("game_base_id") String str, @Field("comment_no") String str2, @Field("reply_no") String str3);

    @POST("comment/reply/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> replyReportV2(@Query("game_base_id") String str, @Query("comment_no") String str2, @Query("reply_no") String str3, @Query("report_type") int i7, @Query("report_name") String str4, @Query("report_msg") String str5);

    @POST("user/auto_download/receipt")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportAutoDownloadGame(@Query("order_download_game_list") String str, @Query("download_push_game_list") String str2, @Query("game_version_download_game_list") String str3, @Query("sdk_type") int i7);

    @GET("user/auto_download/guide/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportAutoDownloadGuideDialogShow(@Query("game_base_id") String str);

    @POST("user/download_completed/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportDownloadCompleted(@Query("game_base_id") int i7);

    @GET("home/gray/info/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportGrayInfo(@Query("game_base_id") int i7, @Query("gray_id") String str);

    @GET("hot/report")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportHotGame(@Query("game_base_id") int i7, @Query("buvid") String str);

    @GET("user/played/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportPlayedGame(@Query("game_base_id") int i7);

    @POST("comment/report/reasons")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameCommentReport>> reportReasons();

    @GET("user/played/smallgame/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> reportSmall(@Query("app_id") String str, @Query("virtual_app_Id") String str2, @Query("full_applet_id") String str3);

    @GET("user/relationship/home_report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> requestHomeReport();

    @FormUrlEncoded
    @POST("tag/user/follow/category/save")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<Object>> saveCustomCategory(@Field("category_id_list") String str);

    @GET("small/game/lading/game_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameHotGame>>> smallGameList(@Query("tab_type") String str, @Query("tab_id") String str2, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("small/game/tab_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameSmallGameTabBean>>> smallGameTab();

    @POST("my/red_point/snooze")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> snoozeRedPoint();

    @POST("home/subscribe_game/sort")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> sortPlayedGame(@Query("operate_type") int i7, @Query("sort_game_id") String str);

    @GET("home/fetch_notice_game")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GamePegasusNoticeBean>> startTestNoticeGameV2();

    @POST("user/submit_realname_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<AuthentionBean>> submitRealInfo(@Query("game_base_id") String str, @Query("real_name") String str2, @Query("id_card") String str3, @Query("sdk_type_id") int i7);

    @POST("user/payment/submit/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameOrderInfo>> submitV2(@Query("game_base_id") String str, @Query("pay_amount") String str2, @Query("original_price") String str3, @Query("discount") String str4, @Query("pay_route_id") int i7, @Query("redirect") String str5, @Query("product_id") String str6, @Query("sdk_type_id") int i8, @Query("report_extra") String str7);

    @POST("user/payment/submit/v3")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameOrderInfo>> submitV3(@Query("game_base_id") String str, @Query("pay_amount") String str2, @Query("original_price") String str3, @Query("discount") String str4, @Query("pay_route_id") int i7, @Query("redirect") String str5, @Query("product_id") String str6, @Query("sdk_type_id") int i8, @Query("coupon_no") String str7, @Query("order_amount") String str8, @Query("pay_api_version") String str9, @Query("report_extra") String str10);

    @GET("user/order/auto_download/switch")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> switchAutoDownloadInWiFi(@Query("game_base_id") int i7, @Query("switch_status") int i8);

    @GET("topic/test/detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameTopicBean>> topicTest(@Query("type") int i7);

    @GET("user/report")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> userReport();

    @POST("act/version/reserve")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<VersionGiftReserve>> versionReserve(@Query("game_version_id") String str, @Query("reserve_for_pc") int i7);

    @GET("desktop_widget/guide")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameWidgetGuideBean>> widgetGuide(@Query(Tm0.a.f24207d) String str, @Query("os_version") String str2);
}
