package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.U;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/v.class */
public interface v extends WithVideoProgress, com.bilibili.player.tangram.basic.l, com.bilibili.player.tangram.basic.j, com.bilibili.player.tangram.basic.k, G, U {
    @NotNull
    Flow<ResolveAndPlayPlayable.c<InterfaceC5778f>> C();

    @Nullable
    Object D(@NotNull ContinuationImpl continuationImpl);

    @Nullable
    Object E(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    Flow<u> b();

    @Nullable
    Object d0(@NotNull Function2 function2, @NotNull SuspendLambda suspendLambda);

    @NotNull
    ResolveAndPlayPlayable.c<InterfaceC5778f> h0();

    void n();

    @Nullable
    u o();

    @Nullable
    Object u(@NotNull Continuation<? super Long> continuation);

    @NotNull
    Flow<A> v();
}
