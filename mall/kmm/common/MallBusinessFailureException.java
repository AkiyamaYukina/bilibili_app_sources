package com.bilibili.mall.kmm.common;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/MallBusinessFailureException.class */
public final class MallBusinessFailureException extends Exception {
    private final int code;

    @Nullable
    private final String message;

    public MallBusinessFailureException(int i7, @Nullable String str) {
        this.code = i7;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.message;
    }
}
