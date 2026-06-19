package com.bilibili.moduleservice.followingstate;

import androidx.appcompat.app.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/moduleservice/followingstate/UpData.class */
public final class UpData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66313b;

    public UpData(long j7, boolean z6) {
        this.f66312a = j7;
        this.f66313b = z6;
    }

    public static /* synthetic */ UpData copy$default(UpData upData, long j7, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = upData.f66312a;
        }
        if ((i7 & 2) != 0) {
            z6 = upData.f66313b;
        }
        return upData.copy(j7, z6);
    }

    public final long component1() {
        return this.f66312a;
    }

    public final boolean component2() {
        return this.f66313b;
    }

    @NotNull
    public final UpData copy(long j7, boolean z6) {
        return new UpData(j7, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpData)) {
            return false;
        }
        UpData upData = (UpData) obj;
        return this.f66312a == upData.f66312a && this.f66313b == upData.f66313b;
    }

    public final long getUpId() {
        return this.f66312a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f66313b) + (Long.hashCode(this.f66312a) * 31);
    }

    public final boolean isAtten() {
        return this.f66313b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UpData(upId=");
        sb.append(this.f66312a);
        sb.append(", isAtten=");
        return i.a(sb, this.f66313b, ")");
    }
}
