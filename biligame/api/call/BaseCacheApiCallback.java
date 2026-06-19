package com.bilibili.biligame.api.call;

import androidx.annotation.NonNull;
import com.bilibili.api.BiliApiException;
import com.bilibili.biligame.api.BiligameApiResponse;
import com.bilibili.biligame.utils.CatchUtils;
import go.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BaseCacheApiCallback.class */
public abstract class BaseCacheApiCallback<T> extends c<BiligameApiResponse<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f62150d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f62151e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f62152f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f62153g = false;
    public BiligameApiResponse<T> h;

    public boolean isExecutedCache() {
        return this.f62150d;
    }

    @Override // go.c
    public final void onCache(BiligameApiResponse<T> biligameApiResponse) {
        T t7;
        try {
            if (this.f62151e) {
                return;
            }
            if (this.f62152f && !this.f62153g) {
                this.h = biligameApiResponse;
            } else {
                if (!biligameApiResponse.isSuccess() || (t7 = biligameApiResponse.data) == null) {
                    return;
                }
                onCacheSafe(t7);
                this.f62150d = true;
            }
        } catch (Throwable th) {
            CatchUtils.e(this, "onCache", th);
            try {
                onCatchSafe(th);
            } catch (Throwable th2) {
                CatchUtils.e(this, "onCache onCatch", th);
            }
        }
    }

    public abstract void onCacheSafe(@NonNull T t7);

    public abstract void onCatchSafe(Throwable th);

    @Override // go.c
    public final void onError(Throwable th) {
        BiligameApiResponse<T> biligameApiResponse;
        T t7;
        try {
            this.f62153g = true;
            if (!this.f62150d && (biligameApiResponse = this.h) != null && (t7 = biligameApiResponse.data) != null) {
                this.f62150d = true;
                onCacheSafe(t7);
            }
            onErrorSafe(th);
        } catch (Throwable th2) {
            CatchUtils.e(this, "onError", th2);
            try {
                onCatchSafe(th2);
            } catch (Throwable th3) {
                CatchUtils.e(this, "onError onError", th);
            }
        }
    }

    public abstract void onErrorSafe(Throwable th);

    @Override // go.c
    public final void onSuccess(BiligameApiResponse<T> biligameApiResponse) {
        T t7;
        try {
            if (!biligameApiResponse.isSuccess() || (t7 = biligameApiResponse.data) == null) {
                onError(new BiliApiException(biligameApiResponse.code, biligameApiResponse.message));
            } else {
                onSuccessSafe(t7);
                this.f62151e = true;
            }
        } catch (Throwable th) {
            CatchUtils.e(this, "onSuccess", th);
            try {
                onCatchSafe(th);
            } catch (Throwable th2) {
                CatchUtils.e(this, "onSuccess onSuccess", th);
            }
        }
    }

    public abstract void onSuccessSafe(@NonNull T t7);

    public void setCacheAfterError(boolean z6) {
        this.f62152f = z6;
    }
}
