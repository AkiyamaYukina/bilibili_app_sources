package com.bilibili.ogv.target.reach;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/a.class */
@BaseUrl("https://api.bilibili.com")
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0461a f73137a = C0461a.f73138a;

    /* JADX INFO: renamed from: com.bilibili.ogv.target.reach.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/target/reach/a$a.class */
    public static final class C0461a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0461a f73138a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f73139b = (a) ServiceGenerator.createService(a.class);
    }

    @POST("/x/vip/gsm/activity/preload")
    @Nullable
    Object preloadTargetReach(@Query("platform") @NotNull String str, @NotNull Continuation<? super BiliApiResponse<TargetReachPreloadResult>> continuation);

    @POST("/x/vip/gsm/activity/report_act")
    @Nullable
    Object reportTargetReachActivities(@Query("promos") @NotNull String str, @Query("platform") @NotNull String str2, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);
}
