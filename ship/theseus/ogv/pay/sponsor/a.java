package com.bilibili.ship.theseus.ogv.pay.sponsor;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/a.class */
@BaseUrl("https://bangumi.bilibili.com")
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0742a f94228a = C0742a.f94229a;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.pay.sponsor.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/sponsor/a$a.class */
    public static final class C0742a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0742a f94229a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f94230b = (a) ServiceGenerator.createService(a.class);
    }

    @GET("/sponsor/api/point")
    @Nullable
    Object getSponsorPoint(@Query("amount") int i7, @NotNull Continuation<? super BiliApiResponse<SponsorPoint>> continuation);
}
