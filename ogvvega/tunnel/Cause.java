package com.bilibili.ogvvega.tunnel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/Cause.class */
public final class Cause {

    @NotNull
    private String msg;

    @NotNull
    private final CauseType type;

    public Cause(@NotNull CauseType causeType, @NotNull String str) {
        this.type = causeType;
        this.msg = str;
    }

    public static /* synthetic */ Cause copy$default(Cause cause, CauseType causeType, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            causeType = cause.type;
        }
        if ((i7 & 2) != 0) {
            str = cause.msg;
        }
        return cause.copy(causeType, str);
    }

    @NotNull
    public final CauseType component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.msg;
    }

    @NotNull
    public final Cause copy(@NotNull CauseType causeType, @NotNull String str) {
        return new Cause(causeType, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cause)) {
            return false;
        }
        Cause cause = (Cause) obj;
        return this.type == cause.type && Intrinsics.areEqual(this.msg, cause.msg);
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final CauseType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.msg.hashCode() + (this.type.hashCode() * 31);
    }

    public final void setMsg(@NotNull String str) {
        this.msg = str;
    }

    @NotNull
    public String toString() {
        return "Cause(type=" + this.type + ", msg=" + this.msg + ")";
    }
}
