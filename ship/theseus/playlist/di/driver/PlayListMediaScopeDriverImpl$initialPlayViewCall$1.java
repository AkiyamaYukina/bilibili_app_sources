package com.bilibili.ship.theseus.playlist.di.driver;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$initialPlayViewCall$1.class */
final class PlayListMediaScopeDriverImpl$initialPlayViewCall$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final PlayListMediaScopeDriverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayListMediaScopeDriverImpl$initialPlayViewCall$1(PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, Continuation<? super PlayListMediaScopeDriverImpl$initialPlayViewCall$1> continuation) {
        super(continuation);
        this.this$0 = playListMediaScopeDriverImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlayListMediaScopeDriverImpl.b(this.this$0, null, this);
    }
}
