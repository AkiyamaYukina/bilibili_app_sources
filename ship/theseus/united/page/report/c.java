package com.bilibili.ship.theseus.united.page.report;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/c.class */
@BaseUrl("https://api.bilibili.com")
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f102495a = a.f102496a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/c$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102496a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f102497b = (c) ServiceGenerator.createService(c.class);
    }

    @POST("/x/vip/ads/material/report")
    @Nullable
    Object materialReport(@Body @NotNull RequestBody requestBody, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);
}
