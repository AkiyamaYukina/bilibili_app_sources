package com.bilibili.lib.ui;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/ImageResultListener.class */
public interface ImageResultListener {
    void onImageFailed(@Nullable Throwable th);

    void onImageLoaded();

    void onRequestCancelled();
}
