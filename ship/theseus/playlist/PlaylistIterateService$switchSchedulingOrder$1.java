package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistIterateService$switchSchedulingOrder$1.class */
final class PlaylistIterateService$switchSchedulingOrder$1 extends ContinuationImpl {
    int label;
    Object result;
    final t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistIterateService$switchSchedulingOrder$1(t tVar, Continuation<? super PlaylistIterateService$switchSchedulingOrder$1> continuation) {
        super(continuation);
        this.this$0 = tVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
