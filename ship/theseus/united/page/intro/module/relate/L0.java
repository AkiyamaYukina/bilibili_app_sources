package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/L0.class */
@StabilityInferred(parameters = 1)
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101027b;

    public L0(@NotNull String str, @NotNull String str2) {
        this.f101026a = str;
        this.f101027b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        return Intrinsics.areEqual(this.f101026a, l02.f101026a) && Intrinsics.areEqual(this.f101027b, l02.f101027b);
    }

    public final int hashCode() {
        return this.f101027b.hashCode() + (this.f101026a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("WikiInfo(label=");
        sb.append(this.f101026a);
        sb.append(", url=");
        return C8770a.a(sb, this.f101027b, ")");
    }
}
