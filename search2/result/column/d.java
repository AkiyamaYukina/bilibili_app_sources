package com.bilibili.search2.result.column;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/column/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f87733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f87734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f87735e;

    public d(int i7, int i8, int i9, int i10, int i11) {
        this.f87731a = i7;
        this.f87732b = i8;
        this.f87733c = i9;
        this.f87734d = i10;
        this.f87735e = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f87731a == dVar.f87731a && this.f87732b == dVar.f87732b && this.f87733c == dVar.f87733c && this.f87734d == dVar.f87734d && this.f87735e == dVar.f87735e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f87735e) + I.a(4, I.a(this.f87734d, I.a(this.f87733c, I.a(this.f87732b, Integer.hashCode(this.f87731a) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ColumnMenuSpacing(space=");
        sb.append(this.f87731a);
        sb.append(", topFirst=");
        sb.append(this.f87732b);
        sb.append(", topNonFirst=");
        sb.append(this.f87733c);
        sb.append(", bottomLast=");
        sb.append(this.f87734d);
        sb.append(", spanCount=4, edgeMargin=");
        return C4277b.a(this.f87735e, ")", sb);
    }
}
