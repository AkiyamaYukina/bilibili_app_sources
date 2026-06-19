package com.bilibili.pegasus.recommendlabel.api;

import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.pegasus.recommendlabel.data.RecommendLabelMoreResponse;
import com.bilibili.pegasus.recommendlabel.data.RecommendLabelResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/api/RecommendLabelApiService.class */
@BaseUrl("https://app.bilibili.com")
public interface RecommendLabelApiService {
    @GET("/x/v2/feed/uinterest/more")
    @NotNull
    BiliCall<GeneralResponse<RecommendLabelMoreResponse>> getMoreRecommendLabelList();

    @GET("/x/v2/feed/uinterest")
    @NotNull
    BiliCall<GeneralResponse<RecommendLabelResponse>> getRecommendLabelList(@Query("need_all_label") int i7);

    @FormUrlEncoded
    @POST("/x/v2/feed/uinterest/mng")
    @NotNull
    BiliCall<GeneralResponse<BaseResponse>> managerRecommendLabel(@Field("fixed_label") @NotNull String str, @Field("unfixed_label") @NotNull String str2, @Field("changed_label") @Nullable String str3, @Field("action") int i7);
}
