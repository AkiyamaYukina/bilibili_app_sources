package com.bilibili.ogv.secondary;

import androidx.compose.runtime.internal.StabilityInferred;
import kntr.common.komponent.UiComposableLike;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/j.class */
@StabilityInferred(parameters = 1)
public final class C5529j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.secondary.api.h f72696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UiComposableLike<Unit> f72697b;

    public C5529j(@NotNull com.bilibili.ogv.secondary.api.h hVar, @NotNull UiComposableLike<Unit> uiComposableLike) {
        this.f72696a = hVar;
        this.f72697b = uiComposableLike;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5529j)) {
            return false;
        }
        C5529j c5529j = (C5529j) obj;
        return Intrinsics.areEqual(this.f72696a, c5529j.f72696a) && Intrinsics.areEqual(this.f72697b, c5529j.f72697b);
    }

    public final int hashCode() {
        return this.f72697b.hashCode() + (this.f72696a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PageEntry(pageData=" + this.f72696a + ", uiComposableLike=" + this.f72697b + ")";
    }
}
