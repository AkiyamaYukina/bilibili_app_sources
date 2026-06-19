package com.bilibili.search2.result;

import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/p.class */
@StabilityInferred(parameters = 1)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f88504d;

    public p() {
        this(0, 0, 0, "");
    }

    public p(int i7, int i8, int i9, @Nullable String str) {
        this.f88501a = i7;
        this.f88502b = i8;
        this.f88503c = i9;
        this.f88504d = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f88501a == pVar.f88501a && this.f88502b == pVar.f88502b && this.f88503c == pVar.f88503c && Intrinsics.areEqual(this.f88504d, pVar.f88504d);
    }

    public final int hashCode() {
        int iA = I.a(this.f88503c, I.a(this.f88502b, Integer.hashCode(this.f88501a) * 31, 31), 31);
        String str = this.f88504d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchConfigData(page=");
        sb.append(this.f88501a);
        sb.append(", duration=");
        sb.append(this.f88502b);
        sb.append(", tid=");
        sb.append(this.f88503c);
        sb.append(", order=");
        return C8770a.a(sb, this.f88504d, ")");
    }
}
