package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/i.class */
@StabilityInferred(parameters = 1)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104092a;

    public i(boolean z6) {
        this.f104092a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f104092a == ((i) obj).f104092a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104092a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("Control(limit="), this.f104092a, ")");
    }
}
