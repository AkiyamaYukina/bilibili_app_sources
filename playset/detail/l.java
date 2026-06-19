package com.bilibili.playset.detail;

import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/l.class */
@StabilityInferred(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f84578d;

    public l() {
        this(0);
    }

    public /* synthetic */ l(int i7) {
        this(true, false, false, false);
    }

    public l(boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f84575a = z6;
        this.f84576b = z7;
        this.f84577c = z8;
        this.f84578d = z9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f84575a == lVar.f84575a && this.f84576b == lVar.f84576b && this.f84577c == lVar.f84577c && this.f84578d == lVar.f84578d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84578d) + z.a(z.a(Boolean.hashCode(this.f84575a) * 31, 31, this.f84576b), 31, this.f84577c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PaneStyle(isFullScreen=");
        sb.append(this.f84575a);
        sb.append(", isEmbedded=");
        sb.append(this.f84576b);
        sb.append(", isContainerMode=");
        sb.append(this.f84577c);
        sb.append(", isFirstPage=");
        return androidx.appcompat.app.i.a(sb, this.f84578d, ")");
    }
}
