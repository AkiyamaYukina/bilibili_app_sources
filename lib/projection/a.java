package com.bilibili.lib.projection;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {
    @FormUrlEncoded
    @POST("/x/tv/stream/cmd")
    @NotNull
    BiliCall<GeneralResponse<Void>> sendCommand(@Field("aid") long j7, @Field("cid") long j8, @Field("command") @NotNull String str, @Field("video_type") @NotNull String str2, @Field("epid") @NotNull String str3, @Field("season_id") @NotNull String str4, @Field("seek_ts") @NotNull String str5, @Field("ott_buvid") @NotNull String str6, @Field(CaptureSchema.JUMP_PARAMS_EXTRA) @NotNull String str7, @Field(Tm0.a.f24206c) @NotNull String str8, @Field("danmakuSwitchSave") boolean z6, @Field("room_id") @Nullable String str9, @Field("device_info") @Nullable String str10, @Field("by_code") boolean z7, @Field("screencast_event") @NotNull String str11);
}
