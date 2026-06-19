package com.bilibili.biligame.api.bean.gamedetail;

import com.alibaba.fastjson.JSONObject;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameDetailRankInfo;
import com.bilibili.biligame.api.BiligameGiftAll;
import com.bilibili.biligame.api.BiligameHotStrategy;
import com.bilibili.biligame.api.BiligameMainGame;
import com.bilibili.biligame.api.BiligamePage;
import com.bilibili.biligame.api.BookAward;
import com.bilibili.biligame.api.FollowingListPage;
import com.bilibili.biligame.api.GameVideoInfo;
import com.bilibili.biligame.api.NoticeInfo;
import com.bilibili.biligame.api.UserInfo;
import com.bilibili.biligame.api.bean.BiligameVideoInfo;
import com.bilibili.biligame.api.call.BiliGameCall;
import com.bilibili.biligame.api.call.BiligameDisasterCall;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.call.ReportSign;
import com.bilibili.biligame.api.call.disaster.Disaster;
import com.bilibili.biligame.api.comment.CommentBanStatus;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.interceptor.RecommendDeviceInfoInterceptor;
import com.bilibili.biligame.ui.gamedetail.detail.data.UserCommentStatus;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/bean/gamedetail/GameDetailApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface GameDetailApiService {
    @FormUrlEncoded
    @POST("sourcefrom/popup/close")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> closeLeadFlowPopup(@Field("game_base_id") String str);

    @GET("detail/forum/hot_posts")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameForumHotPosts>> fetchGameForumHotPosts(@Query("game_base_id") String str);

    @GET("comment/user/ban_state")
    BiliCall<BiligameApiResponse<CommentBanStatus>> getBanState();

    @GET("game/order_reward")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BookAward>> getBookAwardInfoList(@Query("game_base_id") String str);

    @GET("game/order_reward/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BookAward>> getBookAwardInfoListV2(@Query("game_base_id") String str);

    @GET("comment/selection/summary")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<CommentClassification>>> getCommentClassification(@Query("game_base_id") String str, @Query("phase") Integer num, @Query("device_type") String str2);

    @KeySign({"game_base_id"})
    @GET("detail/game_entrance_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameMainGame>> getCommentEntranceInfo(@Query("game_base_id") String str);

    @GET("comment/user/commented_games")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<String>>> getCommentedGameIdList();

    @POST("gift/all")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameGiftAll>> getDetailGiftAll(@Query("game_base_id") String str);

    @GET("comment/five_figures")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<CommentGrade>> getFiveFigures(@Query("game_base_id") String str);

    @GET("detail/following_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<FollowingListPage>> getFollowingList(@Query("game_base_id") String str);

    @GET("detail/following_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<NoticeInfo>>> getFollowingList(@Query("game_base_id") String str, @Query("page_num") String str2, @Query("page_size") String str3);

    @GET("comment/user/forbid_state")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, Integer>>> getForbidState();

    @GET("official/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameOfficialAccount>> getGameCenterOfficialAccount(@Query(KeySign.UID) String str);

    @KeySign({"game_base_id"})
    @GET("detail/content")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameDetailContent>> getGameDetailContent(@Query("game_base_id") String str);

    @KeySign({"game_base_id"})
    @GET("detail/gameinfo/v2")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    @ReportSign(sample = false)
    @Disaster(excludeCode = {BiligameApiResponse.CODE_NO_DATA, -400}, url = "detail/gameinfo/v2/1/{game_base_id}")
    BiligameDisasterCall<BiligameApiResponse<GameDetailInfo>> getGameDetailInfo(@Query("game_base_id") String str, @Query("source_code") String str2);

    @KeySign({"game_base_id"})
    @GET("detail/gameinfo/v2")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    @ReportSign(sample = false)
    BiligameDisasterCall<BiligameApiResponse<GameDetailInfo>> getGameDetailInfo(@Query("game_base_id") String str, @Query("source_code") String str2, @Query("channel_id") String str3, @Query("entrance_scene") String str4);

    @GET("detail/get_archive")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameVideoInfo>> getGameDetailVideo(@Query("game_base_id") String str);

    @KeySign({"game_base_id"})
    @GET("detail/get_game_base_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<Map<String, String>>> getGameIcon(@Query("game_base_id") String str);

    @GET("detail/account")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameOfficialAccount>> getGameOfficialAccount(@Query("game_base_id") String str);

    @GET("detail/character")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<GameRole>>> getGameRoleList(@Query("game_base_id") String str);

    @GET("detail/hot_video")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<VideoPage>> getHotVideoList(@Query("game_base_id") String str, @Query("buvid") String str2, @Query("from") int i7);

    @GET("activity/center/participating_activities")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<ActivityInfoBean>>> getJoiningActivities();

    @GET("sourcefrom/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<HashMap<String, Integer>>> getLeadFlowConfig(@Query("game_base_id") String str, @Query("source_code") String str2);

    @GET("sourcefrom/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<String>>> getLeadFlowSourceFromList();

    @GET("comment/getLive")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameLiveRoom>> getLive(@Query("game_base_id") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("game/notice")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<NoticeInfo>>> getNoticeInfoList(@Query("game_base_id") String str);

    @GET("game/change/official/notify")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<UserInfo>> getOfficialAccountDialogue(@Query("game_base_id") String str);

    @GET("news/strategy/game/supreme/game_base_id")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameHotStrategy>>> getOfficialStrategy(@Query("game_base_id") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("detail/online_activity/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<OnlineActivityInfo>> getOnlineActivity(@Query("game_base_id") String str, @Query("query_from") int i7);

    @GET("detail/operator/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<BiligameMainGame>>> getOperatorGameList(@Query("operator_id") String str, @Query("game_base_id") String str2, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("detail/operator/gamelist")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<SimpleGame>>> getOperatorSimpleGameList(@Query("operator_id") String str, @Query("game_base_id") String str2, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("platform/grade")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GamePlatformGrade>> getPlatformGrade(@Query("game_base_id") String str);

    @GET("detail/pop/notice")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameDetailPopNotice>> getPopNotice(@Query("game_base_id") String str);

    @KeySign({"game_base_id"})
    @GET("detail/secret/recruit/gameinfo")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<GameDetailInfo>> getPrivateRecruitGameDetailInfo(@Query("game_base_id") String str, @Query("source_code") String str2, @Query("entrance_scene") String str3);

    @GET("detail/top_rank")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameDetailRankInfo>> getRankInfo(@Query("game_base_id") String str);

    @GET("comment/recommend")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<RecommendComment>>> getRecommendCommentList(@Query("game_base_id") String str);

    @POST("news/strategy/model/recommend/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<List<StrategyRecommend>>> getRecommendStrategy(@Query("strategy_id") String str);

    @GET("game/mini_book_game")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<Map<String, String>>> getRelatedGameByMiniAppId(@Query("app_id") String str);

    @GET("detail/related")
    @RequestInterceptor(RecommendDeviceInfoInterceptor.class)
    BiliCall<BiligameApiResponse<List<SimpleGame>>> getRelatedGameList(@Query("game_base_id") String str);

    @GET("gift/activity/get_sign_activity_by_game")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameSign>> getSignActivityByGame(@Query("game_base_id") String str);

    @GET("game/benefit/activities")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<OnlineActivityInfo>> getSingleGameActivity(@Query("game_base_id") String str);

    @GET("home/source_from")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> getSourceFrom(@Query("source_code") String str);

    @POST("news/strategy/game/detail_by_game")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<StrategyCategory>> getStrategyByGame(@Query("game_base_id") String str);

    @POST("news/strategy/game/page")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<StrategyPages>> getStrategyPage(@Query("strategy_id") String str, @Query("strategy_category_id") String str2, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("news/strategy/game_wiki")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<StrategyWiki>> getStrategyWiki(@Query("game_base_id") String str);

    @GET("gift/top3")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligameGiftAll>> getTop3Gift(@Query("game_base_id") String str);

    @GET("comment/up_user_comment")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<BiligamePage<RecommendComment>>> getUpCommentList(@Query("game_base_id") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @FormUrlEncoded
    @POST("comment/user/my_comment")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<RecommendComment>> getUserCommentById(@Field("game_base_id") String str, @Query("phase") Integer num);

    @GET("comment/user/entrance/guide")
    BiliCall<BiligameApiResponse<UserCommentStatus>> getUserCommentStatus(@Query("game_base_id") String str);

    @GET("https://line3-h5-mobile-api.biligame.com/api/h5/game/center/user/level/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameUserGrowthBean>> getUserGrowthLevelInfo();

    @GET("comment/getVideo")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<BiligameVideo>> getVideo(@Query("game_base_id") String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("detail/game_video")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<List<BiligameVideoInfo>>> getVideoList(@Query("game_base_id") String str, @Query("buvid") String str2, @Query("from") int i7, @Query("first_time") int i8);

    @POST("news/strategy/game/category/save")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<JSONObject>> saveStrategyCategory(@Query("strategy_id") String str, @Query("strategy_category_ids") String str2);

    @GET("gift/activity/sign_activity_detail")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<GameSignActivityDetail>> signActivityDetail(@Query("activity_id") String str);

    @POST("gift/activity/sign_in")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliCall<BiligameApiResponse<JSONObject>> signIn(@Query("activity_id") String str);

    @POST("detail/recruit_secret_agreement/submit")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<JSONObject>> submitSecretAgreement(@Query("game_base_id") int i7, @Query("recruit_id") String str, @Query("questionnaire_id") String str2);

    @POST("detail/test_recruit/accept_secret_agreement")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    BiliGameCall<BiligameApiResponse<JSONObject>> submitSecretAgreementV2(@Query("game_base_id") int i7, @Query("recruit_id") String str);
}
