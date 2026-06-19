package com.bilibili.okretro;

import androidx.annotation.Nullable;
import com.bilibili.api.base.Config;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.HttpException;
import retrofit2.Response;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/BiliApiCallback.class */
public abstract class BiliApiCallback<T> implements Callback<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f73391a;

    public boolean isCancel() {
        return false;
    }

    public boolean isFromCache() {
        return this.f73391a;
    }

    public abstract void onError(Throwable th);

    public void onFailure(@Nullable Call<T> call, Throwable th) {
        if (isCancel()) {
            return;
        }
        if (Config.isDebuggable()) {
            if (call != null) {
                BLog.w("onFailure", call.request().url() + " " + th.getMessage());
            } else {
                BLog.w("onFailure", "", th);
            }
        }
        onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResponse(@Nullable Call<T> call, Response<T> response) {
        if (isCancel()) {
            return;
        }
        if (!response.isSuccessful()) {
            onFailure(call, new HttpException(response));
        } else {
            this.f73391a = "Bili-Cache-Hit".equals(response.headers().get("Bili-Cache-Hit"));
            onSuccess(response.body());
        }
    }

    public abstract void onSuccess(T t7);
}
