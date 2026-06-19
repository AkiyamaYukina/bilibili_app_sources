package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.relate.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/h0.class */
@StabilityInferred(parameters = 1)
public final class C6317h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101224b;

    public C6317h0(@NotNull String str, int i7) {
        this.f101223a = str;
        this.f101224b = i7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6317h0)) {
            return false;
        }
        C6317h0 c6317h0 = (C6317h0) obj;
        return Intrinsics.areEqual(this.f101223a, c6317h0.f101223a) && this.f101224b == c6317h0.f101224b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f101224b) + (this.f101223a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating(score=");
        sb.append(this.f101223a);
        sb.append(", count=");
        return C4277b.a(this.f101224b, ")", sb);
    }
}
