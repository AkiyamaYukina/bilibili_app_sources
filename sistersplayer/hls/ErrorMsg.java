package com.bilibili.sistersplayer.hls;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/ErrorMsg.class */
public final class ErrorMsg {
    private final int errorCode;

    @Nullable
    private final Integer httpCode;

    @NotNull
    private final String msg;

    @NotNull
    private final String url;

    public ErrorMsg(int i7, @NotNull String str, @NotNull String str2, @Nullable Integer num) {
        this.errorCode = i7;
        this.url = str;
        this.msg = str2;
        this.httpCode = num;
    }

    public /* synthetic */ ErrorMsg(int i7, String str, String str2, Integer num, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, str, str2, (i8 & 8) != 0 ? null : num);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final Integer getHttpCode() {
        return this.httpCode;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return this.errorCode + ", url: " + this.url + ", msg: " + this.msg + ", httpCode: " + this.httpCode;
    }
}
