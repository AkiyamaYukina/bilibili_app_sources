package com.bilibili.ship.theseus.united.page.toolbar;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.toolbar.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/b.class */
@StabilityInferred(parameters = 1)
public final class C6418b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f103380a;

    public C6418b(@NotNull String str) {
        this.f103380a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6418b) && Intrinsics.areEqual(this.f103380a, ((C6418b) obj).f103380a);
    }

    public final int hashCode() {
        return this.f103380a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("ClickActionSuppressor(reason="), this.f103380a, ")");
    }
}
