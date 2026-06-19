package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InsertedBanner.Item f100175a;

    public e(@NotNull InsertedBanner.Item item) {
        this.f100175a = item;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f100175a, ((e) obj).f100175a);
    }

    public final int hashCode() {
        return this.f100175a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "InsertedBannerSingleUIData(item=" + this.f100175a + ")";
    }
}
