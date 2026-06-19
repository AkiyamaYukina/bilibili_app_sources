package com.bilibili.search2.halfscreen;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/a.class */
@StabilityInferred(parameters = 1)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f86556b;

    public a() {
        this(0, 0);
    }

    public a(int i7, int i8) {
        this.f86555a = i7;
        this.f86556b = i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86555a == aVar.f86555a && this.f86556b == aVar.f86556b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86556b) + (Integer.hashCode(this.f86555a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OgvTopBarDrawMetrics(widthPx=");
        sb.append(this.f86555a);
        sb.append(", fixedClipHeightPx=");
        return C4277b.a(this.f86556b, ")", sb);
    }
}
