package com.bilibili.lib.push;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/push/j.class */
@BaseUrl("https://api.bilibili.com")
public interface j {
    @RequestInterceptor(y.class)
    @NotNull
    @FormUrlEncoded
    @POST("/x/push/user/isBadgeNoDisturb")
    BiliCall<GeneralResponse<DisturbInfo>> isBadgeNoDisturb(@FieldMap @NotNull Map<String, String> map);

    @RequestInterceptor(y.class)
    @NotNull
    @FormUrlEncoded
    @POST("/x/push/callback/fcm")
    BiliCall<GeneralResponse<Void>> reportFcmExpose(@FieldMap @NotNull Map<String, String> map);

    @RequestInterceptor(y.class)
    @NotNull
    @FormUrlEncoded
    @POST("/x/push/callback/click")
    BiliCall<GeneralResponse<Void>> reportPushClick(@FieldMap @NotNull Map<String, String> map);

    @RequestInterceptor(y.class)
    @NotNull
    @FormUrlEncoded
    @POST("/x/push/token")
    BiliCall<GeneralResponse<Void>> reportPushToken(@FieldMap @NotNull Map<String, String> map);
}
