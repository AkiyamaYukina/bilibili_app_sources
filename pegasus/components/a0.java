package com.bilibili.pegasus.components;

import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/a0.class */
@BaseUrl("https://app.bilibili.com")
interface a0 {
    @GET("/x/v2/notice?plat=0")
    @NotNull
    BiliCall<BiliNotice> getNotice(@Query("channel") @Nullable String str, @Query("type") int i7, @Query("ver") @Nullable String str2);
}
