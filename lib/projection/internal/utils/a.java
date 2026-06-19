package com.bilibili.lib.projection.internal.utils;

import com.bilibili.lib.projection.internal.utils.ProjectionDanmakuSendHelper;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.anno.Timeout;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.interceptor.SignOnUrlRequestInterceptor;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/utils/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {
    @RequestInterceptor(SignOnUrlRequestInterceptor.class)
    @Timeout(conn = 2000, read = 2000, write = 2000)
    @NotNull
    @FormUrlEncoded
    @POST("/x/v2/dm/post")
    BiliCall<GeneralResponse<ProjectionDanmakuSendHelper.DanmakuSendResponse>> sendDanmaku(@Query(Tm0.a.f24206c) @Nullable String str, @Query("aid") @NotNull String str2, @Query("oid") @NotNull String str3, @Query("spmid") @NotNull String str4, @Query("from_spmid") @NotNull String str5, @FieldMap @NotNull Map<String, String> map);

    @Timeout(conn = 2000, read = 2000, write = 2000)
    @NotNull
    @FormUrlEncoded
    @POST("/x/v2/dm/subject/state/update")
    BiliCall<GeneralResponse<Void>> updateDanmakuState(@Field(Tm0.a.f24206c) @Nullable String str, @Field("type") int i7, @Field("aid") long j7, @Field("state") int i8);
}
