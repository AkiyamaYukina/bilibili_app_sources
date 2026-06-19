package com.bilibili.ogv.pub.payment.pay;

import com.bilibili.okretro.response.BiliApiResponse;
import com.google.gson.JsonObject;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/pay/d.class */
@BaseUrl("https://api.bilibili.com")
public interface d {
    @FormUrlEncoded
    @POST("/x/member/app/pendant/equip?status=2")
    @Nullable
    Object equipPendant(@Field("pid") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<JsonObject>> continuation);
}
