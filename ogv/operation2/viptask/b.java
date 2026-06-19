package com.bilibili.ogv.operation2.viptask;

import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.NoSchedulers;
import com.bilibili.okretro.response.BiliApiResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/b.class */
@BaseUrl("https://api.bilibili.com")
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f71025a = a.f71026a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/viptask/b$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f71026a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f71027b = (b) ServiceGenerator.createService(b.class);
    }

    @NoSchedulers
    @POST("/pgc/activity/deliver/task/complete")
    @Nullable
    Object completeTask(@Query("position") @Nullable String str, @Query("task_id") @Nullable String str2, @Query("token") @Nullable String str3, @Query("timestamp") @Nullable String str4, @Query("task_sign") @Nullable String str5, @Query("win_id") @Nullable String str6, @NotNull Continuation<? super BiliApiResponse<Unit>> continuation);
}
