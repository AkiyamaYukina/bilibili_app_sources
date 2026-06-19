package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f104052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f104053b;

    public c(long j7, @NotNull String str) {
        this.f104052a = j7;
        this.f104053b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f104052a == cVar.f104052a && Intrinsics.areEqual(this.f104053b, cVar.f104053b);
    }

    public final int hashCode() {
        return this.f104053b.hashCode() + (Long.hashCode(this.f104052a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Author(mid=");
        sb.append(this.f104052a);
        sb.append(", name=");
        return C8770a.a(sb, this.f104053b, ")");
    }
}
