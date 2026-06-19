package com.bilibili.biligame.api.category;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.bean.gamedetail.GameDetailInfo;
import com.bilibili.biligame.api.download.BiligameTrackInfo;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.bean.FindGameInfo;
import com.bilibili.biligame.bean.FindGameTags;
import com.bilibili.biligame.bean.task.SignIn;
import com.bilibili.biligame.bean.task.SignInCalendar;
import com.bilibili.biligame.bean.task.SignInRemindInfo;
import com.bilibili.biligame.bean.task.SignInfoResp;
import com.bilibili.biligame.bean.task.TaskGroupListResp;
import com.bilibili.biligame.bean.task.TaskItem;
import com.bilibili.biligame.ui.coupons.bean.UserCouponsDetailBean;
import com.bilibili.biligame.ui.gamedetail.data.GameCouponsData;
import com.bilibili.biligame.ui.gamedetail.data.ReceiveCoupon;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.List;
import java.util.Map;
import jo.C7709a;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/category/BiligameBaseApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface BiligameBaseApiService {
    static /* synthetic */ BiliCall findGameSearch$default(BiligameBaseApiService biligameBaseApiService, long j7, String str, int i7, String str2, int i8, int i9, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findGameSearch");
        }
        if ((i12 & 128) != 0) {
            i11 = 20;
        }
        return biligameBaseApiService.findGameSearch(j7, str, i7, str2, i8, i9, i10, i11);
    }

    static /* synthetic */ BiliCall getTaskRewardWithRiskControl$default(BiligameBaseApiService biligameBaseApiService, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTaskRewardWithRiskControl");
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            str3 = null;
        }
        if ((i7 & 8) != 0) {
            str4 = null;
        }
        if ((i7 & 16) != 0) {
            str5 = null;
        }
        if ((i7 & 32) != 0) {
            str6 = null;
        }
        if ((i7 & 64) != 0) {
            num = null;
        }
        if ((i7 & 128) != 0) {
            str7 = null;
        }
        return biligameBaseApiService.getTaskRewardWithRiskControl(str, str2, str3, str4, str5, str6, num, str7);
    }

    @POST("api/h5/game/center/user/task/complete/backup/condition")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<TaskItem>> completeTask(@Query("task_id") @NotNull String str, @Query("cid") @NotNull String str2);

    @GET("find_game/condition_list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<FindGameTags>> conditionList();

    @GET("api/h5/game/center/user/coupon/applicable_games")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<String>>> couponApplyGameList(@Query("token") @Nullable String str);

    @POST("find_game/game_count")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<Integer>> findGameCount(@Query("category_id") long j7, @Query("tag_id_list") @NotNull String str, @Query("sort_type") int i7, @Query("game_status_list") @NotNull String str2, @Query("publish_time_section") int i8, @Query("grade_section") int i9);

    @POST("find_game/search")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<FindGameInfo>> findGameSearch(@Query("category_id") long j7, @Query("tag_id_list") @NotNull String str, @Query("sort_type") int i7, @Query("game_status_list") @NotNull String str2, @Query("publish_time_section") int i8, @Query("grade_section") int i9, @Query("page_num") int i10, @Query("page_size") int i11);

    @GET("api/h5/game/center/user/coupon/draw_all")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameCouponsData>> getCouponDrawAll();

    @GET("api/h5/game/center/user/coupon/receive_all")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<ReceiveCoupon>> getCouponReceiveAll();

    @POST("api/h5/game/center/user/task/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<TaskGroupListResp>> getTaskList();

    @POST("api/h5/game/center/user/task/get/reward")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<TaskItem>> getTaskRewardWithRiskControl(@Query("task_id") @NotNull String str, @Query("challenge") @Nullable String str2, @Query("validate") @Nullable String str3, @Query("seccode") @Nullable String str4, @Query("userid") @Nullable String str5, @Query("token") @Nullable String str6, @Query("gs") @Nullable Integer num, @Query("captcha_code") @Nullable String str7);

    @GET("game/center/h5/main_game/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @Timeout(conn = 1500, read = 1500, write = 1500)
    @NotNull
    BiliCall<BiligameApiResponse<GameDetailInfo.MainGameDetail>> loadMainGameData(@Query("game_base_id") @NotNull String str);

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @Timeout(conn = 1500, read = 1500, write = 1500)
    @NotNull
    @POST("game/center/track/query")
    BiliCall<BiligameApiResponse<BiligameTrackInfo>> queryDownloadTrackId(@QueryMap @NotNull Map<String, String> map);

    @POST("api/h5/game/center/user/coupon/receive")
    @RequestInterceptor(C7709a.class)
    @NotNull
    BiliCall<BiligameApiResponse<String>> receiveCoupon(@Body @NotNull RequestBody requestBody, @Query("pool_id") @NotNull String str, @Query("coupon_id") @NotNull String str2);

    @POST("api/h5/game/center/user/coupon/receive/v2")
    @RequestInterceptor(C7709a.class)
    @NotNull
    BiliCall<BiligameApiResponse<UserCouponsDetailBean>> receiveCouponV2(@Body @NotNull RequestBody requestBody, @Query("pool_id") @NotNull String str, @Query("coupon_id") @NotNull String str2);

    @POST("api/h5/game/center/user/task/report/action")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<Integer>> reportUserAction(@Query("action") @NotNull String str, @Query("scene") @NotNull String str2, @Query("game_base_id") int i7, @Query("ref_id") @NotNull String str3, @Query(EditCustomizeSticker.TAG_DURATION) int i8);

    @POST("api/h5/game/center/user/sign_in/sign_in")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<SignIn>> signIn(@Query("type") int i7);

    @POST("/api/h5/game/center/user/sign_in/calendar")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<SignInCalendar>> signInCalendar(@Query("type") int i7, @Query("start_date") @NotNull String str, @Query("end_date") @NotNull String str2);

    @POST("api/h5/game/center/user/sign_in/info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<SignInfoResp>> signInInfo(@Query("type") int i7);

    @POST("/api/h5/game/center/user/sign_in/popup_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<SignInRemindInfo>> signInPopupInfo(@Query("type") int i7);
}
