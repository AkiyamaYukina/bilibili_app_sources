package com.bilibili.studio.material.internal.download;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/DownloadThrowable.class */
public final class DownloadThrowable extends Throwable {

    @Nullable
    private final Integer code;

    @Nullable
    private final String msg;

    public DownloadThrowable(@Nullable Integer num, @Nullable String str) {
        this.code = num;
        this.msg = str;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }
}
