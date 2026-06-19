package com.bilibili.biligame.api.call;

import android.os.Looper;
import com.bilibili.api.base.Config;
import com.bilibili.api.base.ok.BiliCache;
import com.bilibili.api.base.util.NetworkManager;
import com.bilibili.okretro.call.BiliCall;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiliGameCall.class */
@Deprecated
public class BiliGameCall<T> extends BiliCall<T> {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiliGameCall$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliGameCallback f62154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliGameCall f62155b;

        public a(BiliGameCall biliGameCall, BiliGameCallback biliGameCallback) {
            this.f62155b = biliGameCall;
            this.f62154a = biliGameCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f62154a == null || this.f62155b.isCanceled()) {
                return;
            }
            this.f62154a.onCacheResopnse(null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BiliGameCall$b.class */
    public final class b implements Callback<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiliGameCallback<T> f62156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiliGameCall f62157b;

        public b(BiliGameCall biliGameCall, BiliGameCallback<T> biliGameCallback) {
            this.f62157b = biliGameCall;
            this.f62156a = biliGameCallback;
        }

        public final void onFailure(Call<T> call, Throwable th) {
            BiliGameCallback<T> biliGameCallback = this.f62156a;
            if (biliGameCallback != null) {
                BiliGameCall biliGameCall = this.f62157b;
                if (biliGameCall.isCanceled()) {
                    return;
                }
                biliGameCallback.onFailure(call, th);
                if (Config.isDebuggable()) {
                    BLog.e("BiliGameCall", "onFailure " + biliGameCall.request().url().toString() + " " + th.getMessage());
                }
            }
        }

        public final void onResponse(Call<T> call, Response<T> response) {
            BiliGameCallback<T> biliGameCallback;
            BiliGameCall biliGameCall = this.f62157b;
            if (biliGameCall.isCanceled() || (biliGameCallback = this.f62156a) == null) {
                return;
            }
            if (Config.isDebuggable()) {
                BLog.e("BiliGameCall", "onResponse " + biliGameCall.request().url().toString());
            }
            biliGameCallback.onResponse(call, response);
        }
    }

    public BiliGameCall(Request request, Type type, Annotation[] annotationArr, OkHttpClient okHttpClient, BiliCache biliCache) {
        super(request, type, annotationArr, okHttpClient, biliCache);
        if (annotationArr != null) {
            try {
                for (Annotation annotation : annotationArr) {
                    if (annotation != null && annotation.annotationType() == KeySign.class) {
                        String[] strArrValue = ((KeySign) annotation).value();
                        ((KeySign) annotation).path();
                        new HashSet(Arrays.asList(strArrValue));
                        return;
                    }
                }
            } catch (Throwable th) {
            }
        }
    }

    public void enqueue(BiliGameCallback<T> biliGameCallback) {
        if (biliGameCallback != null) {
            try {
                if (!isCanceled()) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        biliGameCallback.onCacheResopnse(null);
                    } else {
                        NetworkManager.getUIExecutor().execute(new a(this, biliGameCallback));
                    }
                }
            } catch (Throwable th) {
            }
        }
        super.enqueue(new b(this, biliGameCallback));
    }

    public BiliGameCall<T> setCacheReadable(boolean z6) {
        return this;
    }

    public BiliGameCall<T> setCacheWritable(boolean z6) {
        return this;
    }
}
