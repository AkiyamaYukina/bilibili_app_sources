package com.bilibili.ship.theseus.united.page.intro.module.season;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/season/V.class */
@StabilityInferred(parameters = 1)
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AbstractC6342d f101632a;

    public V(@NotNull AbstractC6342d abstractC6342d) {
        this.f101632a = abstractC6342d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v7 = (V) obj;
        v7.getClass();
        return Intrinsics.areEqual(this.f101632a, v7.f101632a);
    }

    public final int hashCode() {
        return this.f101632a.hashCode() + (Boolean.hashCode(true) * 31);
    }

    @NotNull
    public final String toString() {
        return "UnitedSeasonPanelShowData(showPanel=true, scrollMode=" + this.f101632a + ")";
    }
}
