package com.bilibili.ogv.pub.payment.pay;

import M3.C2565b;
import com.bilibili.ogv.pub.payment.pay.sponsor.SponsorCheckResult;
import com.bilibili.okretro.call.NoSchedulers;
import com.bilibili.okretro.response.BiliApiResponse;
import com.google.gson.JsonElement;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/c.class */
@BaseUrl("https://api.bilibili.com")
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f71564a = a.f71565a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/c$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71565a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Lazy<c> f71566b = LazyKt.lazy(new C2565b(5));

        @NotNull
        public static c a() {
            return (c) f71566b.getValue();
        }
    }

    @NoSchedulers
    @Nullable
    @FormUrlEncoded
    @POST("/pgc/pay/api/season/order/check")
    Object checkOrder(@Field("season_type") int i7, @Field("order_id") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<PayResult>> continuation);

    @FormUrlEncoded
    @POST("/pgc/pay/api/sponsor/order/check")
    @Nullable
    Object checkSponsorOrder(@Field("order_id") @NotNull String str, @Field("season_type") int i7, @NotNull Continuation<? super BiliApiResponse<SponsorCheckResult>> continuation);

    @FormUrlEncoded
    @POST("pgc/pay/api/season/order/create")
    @Nullable
    Object createPayOrder(@Field("season_id") @NotNull String str, @Field("season_type") int i7, @Field("coupon_token") @Nullable String str2, @Field("is_quick") int i8, @Field("demand_ep_id") long j7, @Field("ep_count") int i9, @Field("pay_channel") @Nullable String str3, @Field("pay_channel_id") @Nullable Long l7, @Field("section") @Nullable String str4, @NotNull Continuation<? super BiliApiResponse<? extends JsonElement>> continuation);

    @FormUrlEncoded
    @POST("/pgc/pay/api/sponsor/order/create")
    @Nullable
    Object createSponsorOrder(@Field("season_id") @NotNull String str, @Field("season_type") int i7, @Field("money") int i8, @Field("is_quick") int i9, @NotNull Continuation<? super BiliApiResponse<? extends JsonElement>> continuation);

    @FormUrlEncoded
    @POST("/pgc/pay/api/season/exchange")
    @Nullable
    Object exchangeByCouponToken(@Field("coupon_token") @NotNull String str, @Field("otype") long j7, @Field("season_id") @NotNull String str2, @Field("episode_id") long j8, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);
}
