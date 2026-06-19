package com.bilibili.ship.theseus.keel.player;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resolveComplete$1.class */
final class TheseusPlayableKt$TheseusPlayable$resolveComplete$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public TheseusPlayableKt$TheseusPlayable$resolveComplete$1(Continuation<? super TheseusPlayableKt$TheseusPlayable$resolveComplete$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.h(null, null, null, null, this);
    }
}
