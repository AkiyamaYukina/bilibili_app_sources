package com.bilibili.lib.projection.internal.login;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/login/SyncCheckResult.class */
@Keep
public final class SyncCheckResult {
    private boolean valid;

    @NotNull
    private String packageName = "";

    @NotNull
    private String signature = "";

    @NotNull
    private String appKey = "";

    @NotNull
    private String msg = "";

    @NotNull
    public final String getAppKey() {
        return this.appKey;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final void setAppKey(@NotNull String str) {
        this.appKey = str;
    }

    public final void setMsg(@NotNull String str) {
        this.msg = str;
    }

    public final void setPackageName(@NotNull String str) {
        this.packageName = str;
    }

    public final void setSignature(@NotNull String str) {
        this.signature = str;
    }

    public final void setValid(boolean z6) {
        this.valid = z6;
    }
}
