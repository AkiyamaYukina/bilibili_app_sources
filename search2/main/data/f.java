package com.bilibili.search2.main.data;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/f.class */
@StabilityInferred(parameters = 1)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f86814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f86815f;

    public f(int i7, int i8, int i9, int i10, float f7, boolean z6) {
        this.f86810a = i7;
        this.f86811b = i8;
        this.f86812c = i9;
        this.f86813d = i10;
        this.f86814e = f7;
        this.f86815f = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f86810a == fVar.f86810a && this.f86811b == fVar.f86811b && this.f86812c == fVar.f86812c && this.f86813d == fVar.f86813d && Float.compare(this.f86814e, fVar.f86814e) == 0 && this.f86815f == fVar.f86815f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86815f) + androidx.compose.animation.n.a(this.f86814e, I.a(this.f86813d, I.a(this.f86812c, I.a(this.f86811b, Integer.hashCode(this.f86810a) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFloatingViewportState(containerVisibleHeightPx=");
        sb.append(this.f86810a);
        sb.append(", resultVisibleHeightPx=");
        sb.append(this.f86811b);
        sb.append(", topReservedHeightPx=");
        sb.append(this.f86812c);
        sb.append(", searchInputHeightPx=");
        sb.append(this.f86813d);
        sb.append(", slideOffset=");
        sb.append(this.f86814e);
        sb.append(", isClosingOrHidden=");
        return androidx.appcompat.app.i.a(sb, this.f86815f, ")");
    }
}
