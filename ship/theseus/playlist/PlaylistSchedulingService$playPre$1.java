package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$playPre$1.class */
final class PlaylistSchedulingService$playPre$1 extends ContinuationImpl {
    boolean Z$0;
    boolean Z$1;
    int label;
    Object result;
    final PlaylistSchedulingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSchedulingService$playPre$1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super PlaylistSchedulingService$playPre$1> continuation) {
        super(continuation);
        this.this$0 = playlistSchedulingService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(false, false, false, this);
    }
}
