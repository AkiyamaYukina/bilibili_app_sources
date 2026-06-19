package com.bilibili.ship.theseus.united.page.intro.module.tags;

import K7.M;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<a> f101972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101973b;

    public g(@NotNull List<a> list, boolean z6) {
        this.f101972a = list;
        this.f101973b = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f101972a, gVar.f101972a) && this.f101973b == gVar.f101973b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101973b) + (this.f101972a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(M.a("TagsData(list=", ", refresh=", this.f101972a), this.f101973b, ")");
    }
}
