package com.bilibili.pegasus.holders.oversea;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.oversea.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/k.class */
@BaseUrl("https://api.bilibili.com")
interface InterfaceC5686k {
    @FormUrlEncoded
    @POST("/x/v2/history/toview/add")
    @NotNull
    BiliCall<GeneralResponse<Void>> add(@Field("aid") @Nullable String str, @Field("spmid") @NotNull String str2, @Field("toview_version") @Nullable String str3);

    @FormUrlEncoded
    @POST("/x/v2/history/toview/del")
    @NotNull
    BiliCall<GeneralResponse<Void>> delete(@Field("aid") @Nullable String str, @Field("viewed") boolean z6);
}
