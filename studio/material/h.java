package com.bilibili.studio.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f108523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f108524b;

    public h() {
        this(0.0f, 0L);
    }

    public h(float f7, long j7) {
        this.f108523a = f7;
        this.f108524b = j7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f108523a, hVar.f108523a) == 0 && this.f108524b == hVar.f108524b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f108524b) + (Float.hashCode(this.f108523a) * 31);
    }

    @NotNull
    public final String toString() {
        return "InternalProgress(speed=" + this.f108523a + ", progress=" + this.f108524b + ")";
    }
}
