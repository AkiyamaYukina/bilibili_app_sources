package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94119a;

    public c(@NotNull String str) {
        this.f94119a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.areEqual(this.f94119a, ((c) obj).f94119a);
    }

    public final int hashCode() {
        return this.f94119a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("OgvColorName(colorNameStr="), this.f94119a, ")");
    }
}
