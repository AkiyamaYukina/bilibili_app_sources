package com.bilibili.biligame.api.voucher;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.bean.GameAllCouponsBean;
import com.bilibili.biligame.ui.coupons.bean.BiligameMineCouponsBean;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/voucher/BiligameVouchersApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/game/center/h5/")
public interface BiligameVouchersApiService {
    static /* synthetic */ BiliCall getSingleVouchers$default(BiligameVouchersApiService biligameVouchersApiService, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSingleVouchers");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return biligameVouchersApiService.getSingleVouchers(str);
    }

    static /* synthetic */ BiliCall getUserVouchers$default(BiligameVouchersApiService biligameVouchersApiService, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserVouchers");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return biligameVouchersApiService.getUserVouchers(str);
    }

    @GET("game/benefit/coupons")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameAllCouponsBean>> getSingleVouchers(@Query("game_base_id") @Nullable String str);

    @GET("user/coupon/list")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<BiligameMineCouponsBean>> getUserVouchers(@Query("display_state") @Nullable String str);
}
