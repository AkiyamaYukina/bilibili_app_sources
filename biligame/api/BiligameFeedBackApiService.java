package com.bilibili.biligame.api;

import com.bilibili.biligame.api.call.KeySign;
import com.bilibili.biligame.api.interceptor.BiligameRequestInterceptor;
import com.bilibili.biligame.ui.feed.dialog.backguide.bean.GameFeedBackGuideBean;
import com.bilibili.biligame.ui.feed.dialog.backguide.bean.GameFeedBackGuideDialogBean;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameFeedBackApiService.class */
@BaseUrl("https://line3-h5-mobile-api.biligame.com/")
public interface BiligameFeedBackApiService {
    @POST("/h5/game/guide/retention/claim_record")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<String>> claimRecord(@Query("type") @NotNull String str);

    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    @FormUrlEncoded
    @POST("api/cloud_game/v2/game/pass/redeem")
    BiliCall<BiligameApiResponse<JSONObject>> exchangeCloudVipCard(@Field(KeySign.UID) @Nullable String str, @Field("ticket_id") @Nullable String str2);

    @GET("h5/game/guide/retention/active")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameFeedBackGuideBean>> retentionActive(@Query("game_base_id") @Nullable String str);

    @POST("h5/game/guide/send_award")
    @RequestInterceptor(BiligameRequestInterceptor.class)
    @NotNull
    BiliCall<BiligameApiResponse<GameFeedBackGuideDialogBean>> sendAward(@Body @NotNull RequestBody requestBody);
}
