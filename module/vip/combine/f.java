package com.bilibili.module.vip.combine;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.call.BiliCall;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import com.bilibili.vip.PrivilegeInfo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/f.class */
@BaseUrl("https://api.bilibili.com")
public interface f {
    @GET("/x/vip/vip_privilege/info")
    @SplitGeneralResponse
    @NotNull
    BiliCall<GeneralResponse<PrivilegeInfo>> requestPrivilegeInfo(@Query("privilege_key") @NotNull String str);
}
