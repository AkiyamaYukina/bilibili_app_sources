package com.bilibili.ship.theseus.playlist.uicomponent;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/uicomponent/PlaylistMediaAdapter$updateData$1.class */
final class PlaylistMediaAdapter$updateData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final C6260i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistMediaAdapter$updateData$1(C6260i c6260i, Continuation<? super PlaylistMediaAdapter$updateData$1> continuation) {
        super(continuation);
        this.this$0 = c6260i;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.N(null, this);
    }
}
