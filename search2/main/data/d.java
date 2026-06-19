package com.bilibili.search2.main.data;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/main/data/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86806b;

    public d() {
        this(0, false);
    }

    public d(int i7, boolean z6) {
        this.f86805a = i7;
        this.f86806b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f86805a == dVar.f86805a && this.f86806b == dVar.f86806b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86806b) + (Integer.hashCode(this.f86805a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchContainerAppearance(topInsetForOgvPx=");
        sb.append(this.f86805a);
        sb.append(", isFloatingContainer=");
        return androidx.appcompat.app.i.a(sb, this.f86806b, ")");
    }
}
