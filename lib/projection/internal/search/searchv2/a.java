package com.bilibili.lib.projection.internal.search.searchv2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/searchv2/a.class */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f63787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63788b;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f63787a == aVar.f63787a && this.f63788b == aVar.f63788b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63788b) + (Boolean.hashCode(this.f63787a) * 31);
    }

    @NotNull
    public final String toString() {
        return "PanelInfo(fromSwitch=" + this.f63787a + ", clientId=" + this.f63788b + ")";
    }
}
