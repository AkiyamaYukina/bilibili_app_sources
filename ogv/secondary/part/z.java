package com.bilibili.ogv.secondary.part;

import androidx.compose.runtime.internal.StabilityInferred;
import kntr.common.komponent.Komponent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/z.class */
@StabilityInferred(parameters = 0)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Komponent<?> f72920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC5533c f72921b;

    public z(@NotNull Komponent<?> komponent, @NotNull InterfaceC5533c interfaceC5533c) {
        this.f72920a = komponent;
        this.f72921b = interfaceC5533c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f72920a, zVar.f72920a) && Intrinsics.areEqual(this.f72921b, zVar.f72921b);
    }

    public final int hashCode() {
        return this.f72921b.hashCode() + (this.f72920a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "KomponentWrapper(komponent=" + this.f72920a + ", chunkMode=" + this.f72921b + ")";
    }
}
