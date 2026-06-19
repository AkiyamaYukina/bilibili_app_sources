package com.bilibili.lib.projection.internal.api;

import androidx.annotation.Keep;
import com.alipay.alipaysecuritysdk.face.APSceneRisk;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/NirvanaLoginService.class */
@Keep
@BaseUrl("https://passport.bilibili.com")
public interface NirvanaLoginService {
    @FormUrlEncoded
    @POST("/x/passport-login/authorize")
    @NotNull
    BiliCall<GeneralResponse<AuthorizeCode>> authorize(@Field(Tm0.a.f24206c) @Nullable String str, @Field("target_appkey") @Nullable String str2, @Field(APSceneRisk.KEY_SIGN) @Nullable String str3, @Field("package") @Nullable String str4, @Field("app_subid") @Nullable String str5);
}
