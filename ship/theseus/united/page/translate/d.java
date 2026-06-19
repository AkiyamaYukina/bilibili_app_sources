package com.bilibili.ship.theseus.united.page.translate;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/d.class */
@StabilityInferred(parameters = 1)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f103472a;

    public d(@NotNull String str) {
        this.f103472a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.f103472a, ((d) obj).f103472a);
    }

    public final int hashCode() {
        return this.f103472a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("TranslationExtra(translateSwitch="), this.f103472a, ")");
    }
}
