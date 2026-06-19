package com.bilibili.ship.theseus.keel.player;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$masterPieceProgress$1$seekTo$1.class */
public final class TheseusPlayableImpl$masterPieceProgress$1$seekTo$1 extends ContinuationImpl {
    long J$0;
    boolean Z$0;
    int label;
    Object result;
    final TheseusPlayableImpl$masterPieceProgress$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableImpl$masterPieceProgress$1$seekTo$1(TheseusPlayableImpl$masterPieceProgress$1 theseusPlayableImpl$masterPieceProgress$1, Continuation<? super TheseusPlayableImpl$masterPieceProgress$1$seekTo$1> continuation) {
        super(continuation);
        this.this$0 = theseusPlayableImpl$masterPieceProgress$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, false, this);
    }
}
