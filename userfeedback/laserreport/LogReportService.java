package com.bilibili.userfeedback.laserreport;

import Tm0.a;
import androidx.annotation.Keep;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/LogReportService.class */
@Keep
@BaseUrl("https://api.bilibili.com")
public interface LogReportService {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/userfeedback/laserreport/LogReportService$LogDate.class */
    @Keep
    public static class LogDate {
        public long log_date;
    }

    @GET("/x/laser/app/query")
    BiliCall<GeneralResponse<LogDate>> queryReportTask(@Query(a.f24206c) String str, @Query("source_type") int i7);

    @FormUrlEncoded
    @POST("/x/laser/app/update")
    BiliCall<GeneralResponse<Void>> updateReportTask(@Field("platform") int i7, @Field(a.f24206c) String str, @Field("task_state") int i8, @Field(Constant.IN_KEY_REASON) String str2);
}
