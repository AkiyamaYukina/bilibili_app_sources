package com.bilibili.ship.theseus.keel.player;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$1.class */
final class TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$1 extends ContinuationImpl {
    int label;
    Object result;
    final o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$1(o oVar, Continuation<? super TheseusPlayableKt$TheseusPlayable$attachVideoPieceTask$1$run$1> continuation) {
        super(continuation);
        this.this$0 = oVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.I(0L, false, null, this);
    }
}
