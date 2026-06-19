package com.bilibili.player.tangram.basic;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlaySpeedManagerImpl$retainTemporarySpeed$1.class */
public final class PlaySpeedManagerImpl$retainTemporarySpeed$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    Object result;
    final PlaySpeedManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySpeedManagerImpl$retainTemporarySpeed$1(PlaySpeedManagerImpl playSpeedManagerImpl, Continuation<? super PlaySpeedManagerImpl$retainTemporarySpeed$1> continuation) {
        super(continuation);
        this.this$0 = playSpeedManagerImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0.0f, this);
    }
}
