package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/D0.class */
@StabilityInferred(parameters = 1)
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StatData f100834a;

    public D0(@NotNull StatData statData) {
        this.f100834a = statData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0) && Intrinsics.areEqual(this.f100834a, ((D0) obj).f100834a);
    }

    public final int hashCode() {
        return this.f100834a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RelateMiniProgramCard(stat=" + this.f100834a + ")";
    }
}
