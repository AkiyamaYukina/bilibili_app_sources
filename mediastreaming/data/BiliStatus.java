package com.bilibili.mediastreaming.data;

import com.bilibili.mediastreaming.enums.CommonStatusCode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliStatus.class */
public final class BiliStatus<T extends CommonStatusCode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f65975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f65976b;

    public BiliStatus(@NotNull T t7, @NotNull String str) {
        this.f65975a = t7;
        this.f65976b = str;
    }

    @NotNull
    public final String getMessage() {
        return this.f65976b;
    }

    @NotNull
    public final T getStatus() {
        return this.f65975a;
    }

    public final boolean isOk() {
        boolean z6 = true;
        if (this.f65975a.mo7062getValuew2LRezQ() != 1) {
            z6 = false;
        }
        return z6;
    }
}
