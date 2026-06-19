package com.bilibili.okretro.response;

import com.bilibili.okretro.response.BiliApiResponse;
import okhttp3.Request;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/a.class */
public final class a<R> implements Call<BiliApiResponse<? extends R>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Call<BiliApiResponse<R>> f73458a;

    /* JADX INFO: renamed from: com.bilibili.okretro.response.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/response/a$a.class */
    public static final class C0465a implements Callback<BiliApiResponse<? extends R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Callback<BiliApiResponse<R>> f73459a;

        public C0465a(Callback<BiliApiResponse<R>> callback) {
            this.f73459a = callback;
        }

        public final void onFailure(Call<BiliApiResponse<R>> call, Throwable th) {
            boolean z6 = th instanceof Exception;
            Callback<BiliApiResponse<R>> callback = this.f73459a;
            if (z6) {
                callback.onResponse(call, Response.success(new BiliApiResponse.ServiceUnavailable((Exception) th)));
            } else {
                callback.onFailure(call, th);
            }
        }

        public final void onResponse(Call<BiliApiResponse<R>> call, Response<BiliApiResponse<R>> response) {
            boolean zIsSuccessful = response.isSuccessful();
            Callback<BiliApiResponse<R>> callback = this.f73459a;
            if (zIsSuccessful) {
                callback.onResponse(call, response);
            } else {
                callback.onResponse(call, Response.success(new BiliApiResponse.ServiceUnavailable(new HttpException(response))));
            }
        }
    }

    public a(@NotNull Call<BiliApiResponse<R>> call) {
        this.f73458a = call;
    }

    public final void cancel() {
        this.f73458a.cancel();
    }

    @NotNull
    public final Call<BiliApiResponse<R>> clone() {
        return new a(this.f73458a.clone());
    }

    public final void enqueue(@NotNull Callback<BiliApiResponse<R>> callback) {
        this.f73458a.enqueue(new C0465a(callback));
    }

    @NotNull
    public final Response<BiliApiResponse<R>> execute() {
        Response<BiliApiResponse<R>> responseSuccess;
        try {
            responseSuccess = this.f73458a.execute();
        } catch (Exception e7) {
            responseSuccess = Response.success(new BiliApiResponse.ServiceUnavailable(e7));
        }
        return responseSuccess;
    }

    public final boolean isCanceled() {
        return this.f73458a.isCanceled();
    }

    public final boolean isExecuted() {
        return this.f73458a.isExecuted();
    }

    public final Request request() {
        return this.f73458a.request();
    }

    public final Timeout timeout() {
        return this.f73458a.timeout();
    }
}
