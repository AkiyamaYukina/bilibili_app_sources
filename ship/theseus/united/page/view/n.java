package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/n.class */
@StabilityInferred(parameters = 1)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f104103a;

    public n(boolean z6) {
        this.f104103a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f104103a == ((n) obj).f104103a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104103a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("Online(onlineShow="), this.f104103a, ")");
    }
}
