package com.bilibili.player.tangram.basic;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/CompoundPlayStateProviderKt.class */
public final class CompoundPlayStateProviderKt {
    public static final boolean a(@NotNull d dVar) {
        return dVar.a() && !dVar.m();
    }

    @NotNull
    public static final Flow<Boolean> b(@NotNull d dVar) {
        return FlowKt.distinctUntilChanged(FlowKt.combine(dVar.n(), dVar.l(), new CompoundPlayStateProviderKt$allowedToPlayFlow$1(null)));
    }

    public static final boolean c(@NotNull d dVar) {
        return dVar.a() && dVar.k() == PlayerAvailability.READY && !dVar.m();
    }

    @NotNull
    public static final Flow<Boolean> d(@NotNull d dVar) {
        return FlowKt.distinctUntilChanged(FlowKt.combine(dVar.n(), dVar.d(), dVar.l(), new CompoundPlayStateProviderKt$isActuallyPlayingFlow$1(null)));
    }
}
