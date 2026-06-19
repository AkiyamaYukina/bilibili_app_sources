package com.bilibili.biligame.booktri.benefit;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.biligame.booktri.benefit.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/d.class */
@StabilityInferred(parameters = 1)
public final class C5293d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f62372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f62373b;

    public C5293d(@NotNull String str, @NotNull String str2) {
        this.f62372a = str;
        this.f62373b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5293d)) {
            return false;
        }
        C5293d c5293d = (C5293d) obj;
        return Intrinsics.areEqual(this.f62372a, c5293d.f62372a) && Intrinsics.areEqual(this.f62373b, c5293d.f62373b);
    }

    public final int hashCode() {
        return this.f62373b.hashCode() + (this.f62372a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BookErrorData(title=");
        sb.append(this.f62372a);
        sb.append(", message=");
        return C8770a.a(sb, this.f62373b, ")");
    }
}
