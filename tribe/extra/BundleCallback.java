package com.bilibili.tribe.extra;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tribe/extra/BundleCallback.class */
public interface BundleCallback {
    void onError(@NotNull Throwable th);

    default void onProgress(long j7, long j8, int i7, long j9) {
    }

    void onSuccess();
}
