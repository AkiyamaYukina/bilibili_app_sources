package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/p.class */
@StabilityInferred(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<KingPositionType, C6289c> f100470a;

    public p(@NotNull Map<KingPositionType, C6289c> map) {
        this.f100470a = map;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.areEqual(this.f100470a, ((p) obj).f100470a);
    }

    public final int hashCode() {
        return this.f100470a.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.j.a("KingPositionData(map=", ")", this.f100470a);
    }
}
