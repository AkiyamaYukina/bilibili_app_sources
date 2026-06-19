package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/f0.class */
@StabilityInferred(parameters = 1)
public final class C6313f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101190b;

    public C6313f0(int i7, @NotNull String str) {
        this.f101189a = i7;
        this.f101190b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6313f0)) {
            return false;
        }
        C6313f0 c6313f0 = (C6313f0) obj;
        return this.f101189a == c6313f0.f101189a && Intrinsics.areEqual(this.f101190b, c6313f0.f101190b);
    }

    public final int hashCode() {
        return this.f101190b.hashCode() + (Integer.hashCode(this.f101189a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Pagination(size=");
        sb.append(this.f101189a);
        sb.append(", next=");
        return C8770a.a(sb, this.f101190b, ")");
    }
}
