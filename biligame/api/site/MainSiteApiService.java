package com.bilibili.biligame.api.site;

import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/site/MainSiteApiService.class */
@BaseUrl("https://api.bilibili.com/")
public interface MainSiteApiService {
    @GET("x/answer/v4/status")
    @NotNull
    BiliCall<BiligameApiResponse<AnswerStatus>> answerStatus(@Query(EditCustomizeSticker.TAG_MID) long j7);

    @GET("x/answer/v4/guide")
    @NotNull
    BiliCall<BiligameApiResponse<AnswerV4Guide>> getAnswerV4Guide(@Query("business") @NotNull String str, @Query("spmid") @NotNull String str2, @Query("oid") @NotNull String str3, @Query("sid") @NotNull String str4, @Query(EditCustomizeSticker.TAG_MID) long j7);

    @GET("x/member/app/nickfree")
    @NotNull
    BiliCall<BiligameApiResponse<NickFree>> getNickFree();

    @POST("x/member/app/uname/update")
    @NotNull
    BiliCall<BiligameApiResponse<NickName>> nickUpdate(@Query("uname") @NotNull String str, @Query(GameCardButton.extraParamSource) @NotNull String str2);
}
