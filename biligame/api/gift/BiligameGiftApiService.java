package com.bilibili.biligame.api.gift;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.BiligameGift;
import com.bilibili.biligame.api.BiligameGiftAll;
import com.bilibili.biligame.api.BiligameGiftAllGee;
import com.bilibili.biligame.api.BiligameGiftDetail;
import com.bilibili.biligame.api.BiligameGiftGee;
import com.bilibili.biligame.api.BiligameGiftList;
import com.bilibili.biligame.api.BiligamePage;
import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.api.interceptor.BiligameRiskManagerRequestInterceptor;
import com.bilibili.biligame.bean.benefit.GameBenefitAllReceiveBean;
import com.bilibili.biligame.ui.gift.v3.bean.BiligameGiftGameInfo;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/gift/BiligameGiftApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface BiligameGiftApiService {
    @POST("detail/receive_benefit")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameBenefitAllReceiveBean>> benefitAllReceiveCaptchaV2(@Query("game_base_id") @Nullable String str, @Query("challenge") @Nullable String str2, @Query("validate") @Nullable String str3, @Query("seccode") @Nullable String str4, @Query("userid") @Nullable String str5, @Query("gs") @Nullable Integer num);

    @GET("gift/gift_info")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftDetail>> fetchGiftDetailInfo(@Query("gift_info_id") @NotNull String str, @Query("gift_vip_type") @Nullable String str2);

    @GET("gift/home")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftList>> getDiscoverGift(@Query("page_num") int i7, @Query("page_size") int i8, @Query("need_vip_gift") int i9);

    @GET("gift/home/v2")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftList>> getDiscoverGiftV2(@Query("page_num") int i7, @Query("page_size") int i8, @Query("need_vip_gift") int i9, @Query("need_available") int i10);

    @KeySign({KeySign.UID, "page_num"})
    @GET("gift/user_gift")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligamePage<BiligameGiftDetail>>> getMineGiftInfos(@Query("page_num") int i7, @Query("need_vip_gift") int i8);

    @KeySign({KeySign.UID, "filter_game_base_id"})
    @GET("gift/recommend/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<BiligameGiftAll>>> getMoreGiftInfos(@Query("filter_game_base_id") int i7, @Query("page_num") int i8, @Query("page_size") int i9, @Query("need_vip_gift") int i10);

    @GET("game/benefit/gifts")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftGameInfo>> getNewSingleGiftAll(@Query("game_base_id") @Nullable String str);

    @GET("gift/play")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<List<BiligameGift>>> getPlayGift();

    @POST("gift/all")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftAll>> getSingleGiftAll(@Query("game_base_id") @Nullable String str, @Query("need_vip_gift") int i7);

    @POST("gift/multi_get_gift_code/v2")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftAllGee>> giftAllWithGeeCaptchaV2(@Query("gift_info_ids") @Nullable String str, @Query("vip_gift_info_ids") @Nullable String str2, @Query("challenge") @Nullable String str3, @Query("validate") @Nullable String str4, @Query("seccode") @Nullable String str5, @Query("userid") @Nullable String str6, @Query("gs") @Nullable Integer num);

    @POST("gift/get_gift_code/v4")
    @RequestInterceptor(BiligameRiskManagerRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameGiftGee>> giftWithGeeCaptchaV2(@Query("gift_info_id") @Nullable String str, @Query("is_vip_gift") @Nullable String str2, @Query("challenge") @Nullable String str3, @Query("validate") @Nullable String str4, @Query("seccode") @Nullable String str5, @Query("userid") @Nullable String str6, @Query("gs") @Nullable Integer num, @Query("need_reserve_first") boolean z6);
}
