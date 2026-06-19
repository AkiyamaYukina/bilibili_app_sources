package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistRandomIterator$fetchRandomNext$1.class */
final class PlaylistRandomIterator$fetchRandomNext$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRandomIterator$fetchRandomNext$1(A a7, Continuation<? super PlaylistRandomIterator$fetchRandomNext$1> continuation) {
        super(continuation);
        this.this$0 = a7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
