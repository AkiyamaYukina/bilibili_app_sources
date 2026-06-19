package com.bilibili.studio.videoeditor.generalrender.model;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.interceptor.SignOnUrlRequestInterceptor;
import com.bilibili.studio.videoeditor.generalrender.bean.GRContributeResult;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/a.class */
@BaseUrl("https://member.bilibili.com")
public interface a {
    @POST("/x/vu/app/add")
    @RequestInterceptor(SignOnUrlRequestInterceptor.class)
    @NotNull
    BiliCall<GeneralResponse<GRContributeResult>> add(@Query(Tm0.a.f24206c) @Nullable String str, @Body @Nullable RequestBody requestBody, @Header("X-Event-TraceID") @NotNull String str2);
}
