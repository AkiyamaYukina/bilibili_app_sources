package com.bilibili.playset.api;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.playset.checkin.CheckInData;
import com.bilibili.playset.checkin.CheckInHistory;
import com.bilibili.playset.checkin.CheckInNotice;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/CheckInService.class */
@BaseUrl("https://api.bilibili.com")
public interface CheckInService {
    @FormUrlEncoded
    @POST("/x/checkin-plat/favor/cancel")
    @NotNull
    BiliCall<GeneralResponse<String>> cancelCheckIn(@Field(EditCustomizeSticker.TAG_MID) long j7, @Field("checkin_id") @NotNull String str, @Field("checkin_type") int i7);

    @FormUrlEncoded
    @POST("/x/checkin-plat/favor/delete")
    @NotNull
    BiliCall<GeneralResponse<String>> deleteCheckIn(@Field(EditCustomizeSticker.TAG_MID) long j7, @Field("checkin_id") @NotNull String str, @Field("checkin_type") int i7);

    @GET("/x/checkin-plat/favor/checkinDetail")
    @NotNull
    BiliCall<GeneralResponse<CheckInHistory>> getCheckInHistory(@Query(EditCustomizeSticker.TAG_MID) long j7, @Query("checkin_type") int i7, @Query("checkin_id") @NotNull String str, @Query("checkin_status") int i8, @Query("offset") int i9);

    @GET("/x/checkin-plat/favor/list")
    @NotNull
    BiliCall<GeneralResponse<CheckInData>> getCheckInList(@Query(EditCustomizeSticker.TAG_MID) long j7, @Query("checkin_status") int i7, @Query("offset") int i8);

    @GET("/x/checkin-plat/favor/getReminder")
    @NotNull
    BiliCall<GeneralResponse<CheckInNotice>> getCheckInNotice(@Query(EditCustomizeSticker.TAG_MID) long j7, @Query("checkin_type") int i7, @Query("checkin_id") @NotNull String str);

    @FormUrlEncoded
    @POST("/x/checkin-plat/favor/setReminder")
    @NotNull
    BiliCall<GeneralResponse<String>> setCheckInPushTime(@Field(EditCustomizeSticker.TAG_MID) long j7, @Field("checkin_type") int i7, @Field("checkin_id") @NotNull String str, @Field("reminder_status") int i8, @Field("push_time") int i9);
}
