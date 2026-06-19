package com.bilibili.ship.theseus.united.page.intro.module.tags;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/b.class */
@StabilityInferred(parameters = 1)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f101947c;

    public b(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.f101945a = str;
        this.f101946b = str2;
        this.f101947c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f101945a, bVar.f101945a) && Intrinsics.areEqual(this.f101946b, bVar.f101946b) && Intrinsics.areEqual(this.f101947c, bVar.f101947c);
    }

    public final int hashCode() {
        return this.f101947c.hashCode() + E.a(this.f101945a.hashCode() * 31, 31, this.f101946b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CellFluid(topBaseColor=");
        sb.append(this.f101945a);
        sb.append(", topSplitColor=");
        sb.append(this.f101946b);
        sb.append(", topTextColor=");
        return C8770a.a(sb, this.f101947c, ")");
    }
}
