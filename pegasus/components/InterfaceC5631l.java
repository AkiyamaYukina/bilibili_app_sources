package com.bilibili.pegasus.components;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/l.class */
@BaseUrl("https://app.bilibili.com")
interface InterfaceC5631l {
    @GET("/x/v2/notice/package")
    @NotNull
    BiliCall<GeneralResponse<HDApkInfo>> getApkInfo(@Query("model") @Nullable String str);
}
