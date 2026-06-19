package com.bilibili.biligame.api.call;

import com.bilibili.okretro.BiliApiCallback;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/call/BaseSafeApiCallback.class */
public abstract class BaseSafeApiCallback<T> extends BiliApiCallback<T> {
    public void onCatchSafe(Throwable th) {
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public void onError(Throwable th) {
        try {
            onErrorSafe(th);
        } catch (Throwable th2) {
            onCatchSafe(th2);
        }
    }

    public abstract void onErrorSafe(Throwable th);

    @Override // com.bilibili.okretro.BiliApiCallback
    public void onSuccess(T t7) {
        try {
            onSuccessSafe(t7);
        } catch (Throwable th) {
            onCatchSafe(th);
        }
    }

    public abstract void onSuccessSafe(T t7);
}
