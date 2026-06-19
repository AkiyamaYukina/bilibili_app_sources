package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrResponse.class */
@Keep
public class AsrResponse<T> {
    private int code;

    @Nullable
    private T data;

    @Nullable
    private String message;
    private int ttl;

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final int getTtl() {
        return this.ttl;
    }

    public final void setCode(int i7) {
        this.code = i7;
    }

    public final void setData(@Nullable T t7) {
        this.data = t7;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setTtl(int i7) {
        this.ttl = i7;
    }
}
