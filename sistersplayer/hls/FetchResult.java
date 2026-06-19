package com.bilibili.sistersplayer.hls;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/FetchResult.class */
public final class FetchResult<T> {

    @Nullable
    private final T data;
    private final boolean done;

    @Nullable
    private Exception exception;
    private int httpCode;

    @NotNull
    private final String msg;
    private final boolean ok;

    @Nullable
    private Integer resCode;

    public FetchResult(boolean z6, @NotNull String str, int i7, @Nullable T t7, @Nullable Integer num, boolean z7, @Nullable Exception exc) {
        this.ok = z6;
        this.msg = str;
        this.httpCode = i7;
        this.data = t7;
        this.resCode = num;
        this.done = z7;
        this.exception = exc;
    }

    public /* synthetic */ FetchResult(boolean z6, String str, int i7, Object obj, Integer num, boolean z7, Exception exc, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(z6, str, i7, (i8 & 8) != 0 ? null : obj, (i8 & 16) != 0 ? null : num, (i8 & 32) != 0 ? true : z7, (i8 & 64) != 0 ? null : exc);
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final boolean getDone() {
        return this.done;
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getOk() {
        return this.ok;
    }

    @Nullable
    public final Integer getResCode() {
        return this.resCode;
    }

    public final void setException(@Nullable Exception exc) {
        this.exception = exc;
    }

    public final void setHttpCode(int i7) {
        this.httpCode = i7;
    }

    public final void setResCode(@Nullable Integer num) {
        this.resCode = num;
    }
}
