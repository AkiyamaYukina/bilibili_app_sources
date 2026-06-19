package com.bilibili.ship.theseus.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$collectMediaStateChanged$1.class */
final class PlaylistLoadService$collectMediaStateChanged$1 extends ContinuationImpl {
    int label;
    Object result;
    final PlaylistLoadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLoadService$collectMediaStateChanged$1(PlaylistLoadService playlistLoadService, Continuation<? super PlaylistLoadService$collectMediaStateChanged$1> continuation) {
        super(continuation);
        this.this$0 = playlistLoadService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlaylistLoadService.a(this.this$0, this);
    }
}
