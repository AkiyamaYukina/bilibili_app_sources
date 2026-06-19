package com.bilibili.search2.discover;

import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/discover/n.class */
@Immutable
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86451b;

    public n() {
        this(false, false);
    }

    public n(boolean z6, boolean z7) {
        this.f86450a = z6;
        this.f86451b = z7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f86450a == nVar.f86450a && this.f86451b == nVar.f86451b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86451b) + (Boolean.hashCode(this.f86450a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDiscoverModuleState(hasHistoryModule=");
        sb.append(this.f86450a);
        sb.append(", hasTrendingModule=");
        return androidx.appcompat.app.i.a(sb, this.f86451b, ")");
    }
}
