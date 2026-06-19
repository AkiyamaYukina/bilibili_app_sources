package com.bilibili.player.tangram.basic;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/d.class */
public interface d {
    boolean a();

    @NotNull
    Flow<PlayerAvailability> d();

    void i(@NotNull Object obj);

    @NotNull
    PlayerAvailability k();

    @NotNull
    Flow<Boolean> l();

    boolean m();

    @NotNull
    Flow<Boolean> n();

    @Nullable
    Object o(@NotNull j jVar, @NotNull Continuation<? super Unit> continuation);

    void pause();
}
