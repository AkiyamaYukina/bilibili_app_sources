package com.bilibili.playerbizcommonv2.api;

import androidx.core.app.NotificationCompat;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/api/c.class */
@BaseUrl("https://api.bilibili.com")
public interface c {
    @FormUrlEncoded
    @POST("/x/v2/history/report_list")
    @NotNull
    BiliCall<GeneralResponse<Object>> reportArc(@Field(Tm0.a.f24206c) @Nullable String str, @Field("cid") @NotNull String str2, @Field("aid") @NotNull String str3, @Field("parent_type") @NotNull String str4, @Field("parent_id") @NotNull String str5, @Field(GameCardButton.extraParamSource) @NotNull String str6);

    @FormUrlEncoded
    @POST("/x/v2/history/report")
    @NotNull
    BiliCall<GeneralResponse<Object>> reportProgress(@Field(Tm0.a.f24206c) @Nullable String str, @FieldMap @NotNull Map<String, String> map, @Field("cid") long j7, @Field("aid") long j8, @Field(GameCardButton.extraParamSource) @NotNull String str2, @Field(EditCustomizeSticker.TAG_DURATION) long j9, @Field(NotificationCompat.CATEGORY_PROGRESS) long j10, @Field("type") int i7, @Field("device_ts") long j11, @Field("start_ts") long j12, @Field("scene") @NotNull String str3);

    @FormUrlEncoded
    @POST("/x/v2/history/report_scene")
    @NotNull
    BiliCall<GeneralResponse<Object>> reportSceneProgress(@Field(Tm0.a.f24206c) @Nullable String str, @FieldMap @NotNull Map<String, String> map, @Field("cid") long j7, @Field("aid") long j8, @Field(GameCardButton.extraParamSource) @NotNull String str2, @Field(EditCustomizeSticker.TAG_DURATION) long j9, @Field(NotificationCompat.CATEGORY_PROGRESS) long j10, @Field("type") int i7, @Field("device_ts") long j11, @Field("start_ts") long j12, @Field("scene") @NotNull String str3, @Field("report_scene") long j13);
}
