package com.bilibili.ship.theseus.united.page.intro.module.insertedbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.insertedbanner.InsertedBanner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/insertedbanner/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InsertedBanner.Item f100172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InsertedBanner.Item f100173b;

    public c(@NotNull InsertedBanner.Item item, @NotNull InsertedBanner.Item item2) {
        this.f100172a = item;
        this.f100173b = item2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f100172a, cVar.f100172a) && Intrinsics.areEqual(this.f100173b, cVar.f100173b);
    }

    public final int hashCode() {
        return this.f100173b.hashCode() + (this.f100172a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "InsertedBannerRowUIData(firstItem=" + this.f100172a + ", secondItem=" + this.f100173b + ")";
    }
}
