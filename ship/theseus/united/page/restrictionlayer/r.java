package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/r.class */
@StabilityInferred(parameters = 1)
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102757a;

    public r() {
        this(false);
    }

    public r(boolean z6) {
        this.f102757a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f102757a == ((r) obj).f102757a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102757a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("OgvPayAction(enforcePopWin="), this.f102757a, ")");
    }
}
