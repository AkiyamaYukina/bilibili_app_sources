package com.bilibili.studio.editor.question.service;

import androidx.core.app.NotificationCompat;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.studio.editor.question.bean.InvestigationActionParam;
import com.bilibili.studio.editor.question.bean.InvestigationConfig;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/question/service/QuestionApiService.class */
@BaseUrl("https://api.live.bilibili.com")
public interface QuestionApiService {
    @GET("/xlive/app-blink/v1/reportIndex/EventList")
    @NotNull
    BiliCall<GeneralResponse<InvestigationConfig>> requestInvestigationEvent();

    @FormUrlEncoded
    @POST("/xlive/app-blink/v1/reportIndex/EventAction")
    @NotNull
    BiliCall<GeneralResponse<InvestigationActionParam>> requestInvestigationParam(@Field(NotificationCompat.CATEGORY_EVENT) @NotNull String str);
}
