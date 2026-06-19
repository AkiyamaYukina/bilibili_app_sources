package com.bilibili.ship.theseus.united.page.activitywindow;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/activitywindow/q.class */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f98883a;

    public q(@NotNull String str) {
        this.f98883a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f98883a, ((q) obj).f98883a);
    }

    public final int hashCode() {
        return this.f98883a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("WindowInsetsProfile(name="), this.f98883a, ")");
    }
}
