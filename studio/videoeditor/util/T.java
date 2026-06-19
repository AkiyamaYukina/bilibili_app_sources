package com.bilibili.studio.videoeditor.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/T.class */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110217c;

    public T(boolean z6, boolean z7, boolean z8) {
        this.f110215a = z6;
        this.f110216b = z7;
        this.f110217c = z8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t7 = (T) obj;
        return this.f110215a == t7.f110215a && this.f110216b == t7.f110216b && this.f110217c == t7.f110217c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110217c) + androidx.compose.animation.z.a(Boolean.hashCode(this.f110215a) * 31, 31, this.f110216b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformCompareResult(useScale=");
        sb.append(this.f110215a);
        sb.append(", useTrans=");
        sb.append(this.f110216b);
        sb.append(", useRotation=");
        return androidx.appcompat.app.i.a(sb, this.f110217c, ")");
    }
}
