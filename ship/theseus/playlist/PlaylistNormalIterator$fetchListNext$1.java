package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistNormalIterator$fetchListNext$1.class */
final class PlaylistNormalIterator$fetchListNext$1 extends ContinuationImpl {
    int label;
    Object result;
    final z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistNormalIterator$fetchListNext$1(z zVar, Continuation<? super PlaylistNormalIterator$fetchListNext$1> continuation) {
        super(continuation);
        this.this$0 = zVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(false, false, this);
    }
}
