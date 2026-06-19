package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/W.class */
@StabilityInferred(parameters = 1)
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final U f89698a;

    public W(@NotNull U u7) {
        this.f89698a = u7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W) && Intrinsics.areEqual(this.f89698a, ((W) obj).f89698a);
    }

    public final int hashCode() {
        return this.f89698a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "PugvSeasonPrimaryRankInfo(hotRank=" + this.f89698a + ")";
    }
}
