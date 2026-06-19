package com.bilibili.ship.theseus.keel.player;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resourceUrlUpdater$1.class */
final class TheseusPlayableKt$TheseusPlayable$resourceUrlUpdater$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public TheseusPlayableKt$TheseusPlayable$resourceUrlUpdater$1(Continuation<? super TheseusPlayableKt$TheseusPlayable$resourceUrlUpdater$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.m(null, null, null, null, null, null, null, null, this);
    }
}
