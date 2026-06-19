package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistDirectorSerialOperationsService$run$preloadProvider$1$getNextPlayable$1.class */
public final class PlaylistDirectorSerialOperationsService$run$preloadProvider$1$getNextPlayable$1 extends ContinuationImpl {
    int label;
    Object result;
    final PlaylistDirectorSerialOperationsService$run$preloadProvider$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDirectorSerialOperationsService$run$preloadProvider$1$getNextPlayable$1(PlaylistDirectorSerialOperationsService$run$preloadProvider$1 playlistDirectorSerialOperationsService$run$preloadProvider$1, Continuation<? super PlaylistDirectorSerialOperationsService$run$preloadProvider$1$getNextPlayable$1> continuation) {
        super(continuation);
        this.this$0 = playlistDirectorSerialOperationsService$run$preloadProvider$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
