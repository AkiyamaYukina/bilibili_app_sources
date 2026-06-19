package com.bilibili.ship.theseus.keel.player;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$1.class */
final class TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    Object result;

    public TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$1(Continuation<? super TheseusPlayableKt$TheseusPlayable$resolveFacadeFromPlayViewReply$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return p.i(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, this);
    }
}
