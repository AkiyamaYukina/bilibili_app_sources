package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1$next$1.class */
public final class PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1$next$1 extends ContinuationImpl {
    int label;
    Object result;
    final PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1$next$1(PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1 playlistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1, Continuation<? super PlaylistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1$next$1> continuation) {
        super(continuation);
        this.this$0 = playlistAutoContinuousInterceptStrategyModule$providePlaylistAutoContinuousInterceptStrategy$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.next(this);
    }
}
