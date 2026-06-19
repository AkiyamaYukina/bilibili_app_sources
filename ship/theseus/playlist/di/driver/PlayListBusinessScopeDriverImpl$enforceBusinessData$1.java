package com.bilibili.ship.theseus.playlist.di.driver;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$enforceBusinessData$1.class */
final class PlayListBusinessScopeDriverImpl$enforceBusinessData$1 extends ContinuationImpl {
    int label;
    Object result;
    final PlayListBusinessScopeDriverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayListBusinessScopeDriverImpl$enforceBusinessData$1(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super PlayListBusinessScopeDriverImpl$enforceBusinessData$1> continuation) {
        super(continuation);
        this.this$0 = playListBusinessScopeDriverImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlayListBusinessScopeDriverImpl.c(this.this$0, null, this);
    }
}
