package com.bilibili.ogv.rank;

import androidx.compose.runtime.internal.StabilityInferred;
import kntr.common.komponent.UiComposableLike;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.rank.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/j.class */
@StabilityInferred(parameters = 1)
public final class C5505j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.rank.api.f f71988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UiComposableLike<com.bilibili.ogv.rank.part.B> f71989b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5505j(@NotNull com.bilibili.ogv.rank.api.f fVar, @NotNull UiComposableLike<? extends com.bilibili.ogv.rank.part.B> uiComposableLike) {
        this.f71988a = fVar;
        this.f71989b = uiComposableLike;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5505j)) {
            return false;
        }
        C5505j c5505j = (C5505j) obj;
        return Intrinsics.areEqual(this.f71988a, c5505j.f71988a) && Intrinsics.areEqual(this.f71989b, c5505j.f71989b);
    }

    public final int hashCode() {
        return this.f71989b.hashCode() + (this.f71988a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PageEntry(tabData=" + this.f71988a + ", uiComposableLike=" + this.f71989b + ")";
    }
}
