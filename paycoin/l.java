package com.bilibili.paycoin;

import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/l.class */
@BaseUrl("https://app.bilibili.com")
public interface l {
    @FormUrlEncoded
    @POST("/x/v2/view/coin/add")
    @NotNull
    BiliCall<GeneralResponse<PayCoinRequestResult>> payCoin(@Field(Tm0.a.f24206c) @NotNull String str, @Field("aid") long j7, @Field("upid") long j8, @Field("multiply") int i7, @Field("avtype") int i8, @Field("from") @NotNull String str2, @Field("select_like") int i9, @Field("from_spmid") @NotNull String str3, @Field("spmid") @NotNull String str4, @Field("track_id") @Nullable String str5, @Field("goto") @Nullable String str6, @Field(GameCardButton.extraParamSource) @Nullable String str7, @Field("token") @Nullable String str8, @Field("action_id") @Nullable String str9);
}
