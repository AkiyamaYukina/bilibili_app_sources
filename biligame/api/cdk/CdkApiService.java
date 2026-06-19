package com.bilibili.biligame.api.cdk;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cdk/CdkApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface CdkApiService {
    static /* synthetic */ BiliCall a(CdkApiService cdkApiService, Integer num, String str, int i7, int i8, int i9) {
        if ((i9 & 1) != 0) {
            num = null;
        }
        if ((i9 & 2) != 0) {
            str = null;
        }
        if ((i9 & 4) != 0) {
            i7 = 1;
        }
        if ((i9 & 8) != 0) {
            i8 = 99;
        }
        return cdkApiService.getCdkAssetsList(num, str, i7, i8);
    }

    @GET("cdkey/assets")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<CdkAssetsListResp>> getCdkAssetsList(@Query("game_base_id") @Nullable Integer num, @Query("order_no") @Nullable String str, @Query("page_num") int i7, @Query("page_size") int i8);

    @GET("cdkey/order/status")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<CdkOrderStatus>> getCdkOrderStatus(@Query("order_no") @NotNull String str, @Query("game_base_id") int i7);

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("cdkey/submit")
    BiliCall<BiligameApiResponse<CdkOrderInfo>> submitCdkOrder(@Field("game_base_id") int i7, @Field("product_id") @NotNull String str, @Field("quantity") int i8, @Field("pay_money") int i9, @Field("money") int i10, @Field("pay_channel") @NotNull String str2, @Field("pay_scene") @NotNull String str3, @Field("redirect_url") @NotNull String str4);
}
