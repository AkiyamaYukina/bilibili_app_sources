package com.bilibili.pegasus.components;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/Security.class */
@StabilityInferred(parameters = 0)
@Keep
public final class Security {
    public static final int $stable = 8;

    @Nullable
    private String ip;

    @Nullable
    private String location;
    private long mid;
    private long time;

    @Nullable
    public final String getIp() {
        return this.ip;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    public final long getMid() {
        return this.mid;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setIp(@Nullable String str) {
        this.ip = str;
    }

    public final void setLocation(@Nullable String str) {
        this.location = str;
    }

    public final void setMid(long j7) {
        this.mid = j7;
    }

    public final void setTime(long j7) {
        this.time = j7;
    }
}
