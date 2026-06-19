package com.bilibili.module.vip.combine;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/e.class */
@BaseUrl("https://api.bilibili.com")
public interface e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f66176a = a.f66177a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/e$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f66177a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final e f66178b = (e) ServiceGenerator.createService(e.class);
    }

    @FormUrlEncoded
    @POST("/x/vip/privilege/remind")
    @NotNull
    BiliCall<GeneralResponse<VipPrivilege>> privilegeDialogInfo(@Field("rights_type") @NotNull String str);
}
