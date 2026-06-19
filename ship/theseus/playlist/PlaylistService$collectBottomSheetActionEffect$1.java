package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$collectBottomSheetActionEffect$1.class */
final class PlaylistService$collectBottomSheetActionEffect$1 extends ContinuationImpl {
    int label;
    Object result;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$collectBottomSheetActionEffect$1(E e7, Continuation<? super PlaylistService$collectBottomSheetActionEffect$1> continuation) {
        super(continuation);
        this.this$0 = e7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return E.c(this.this$0, null, this);
    }
}
