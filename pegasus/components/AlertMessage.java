package com.bilibili.pegasus.components;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/AlertMessage.class */
@StabilityInferred(parameters = 0)
@Keep
public final class AlertMessage {
    public static final int $stable = 8;

    @Nullable
    private Realname realname;

    @Nullable
    private Security security;
    private int status;

    @Nullable
    private String type;

    @Nullable
    public final Realname getRealname() {
        return this.realname;
    }

    @Nullable
    public final Security getSecurity() {
        return this.security;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setRealname(@Nullable Realname realname) {
        this.realname = realname;
    }

    public final void setSecurity(@Nullable Security security) {
        this.security = security;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
