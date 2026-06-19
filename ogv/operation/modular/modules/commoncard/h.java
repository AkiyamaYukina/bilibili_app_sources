package com.bilibili.ogv.operation.modular.modules.commoncard;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.rxjava.SplitGeneralResponse;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/commoncard/h.class */
@BaseUrl("https://api.bilibili.com")
public interface h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f70596a = a.f70597a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/commoncard/h$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70597a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final h f70598b = (h) ServiceGenerator.createService(h.class);
    }

    @POST("/pgc/app/follow/topic/fav/add")
    @SplitGeneralResponse
    @NotNull
    aY0.a subscribe(@Query("set_id") long j7);

    @POST("/pgc/app/follow/topic/fav/cancel")
    @SplitGeneralResponse
    @NotNull
    aY0.a unsubscribe(@Query("set_id") long j7);
}
