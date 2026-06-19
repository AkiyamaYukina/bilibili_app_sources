package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/l.class */
@StabilityInferred(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104098a;

    public l(boolean z6) {
        this.f104098a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f104098a == ((l) obj).f104098a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104098a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("Immersion(open="), this.f104098a, ")");
    }
}
