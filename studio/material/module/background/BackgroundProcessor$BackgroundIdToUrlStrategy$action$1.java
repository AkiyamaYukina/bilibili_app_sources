package com.bilibili.studio.material.module.background;

import com.bilibili.studio.material.module.background.BackgroundProcessor;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/background/BackgroundProcessor$BackgroundIdToUrlStrategy$action$1.class */
public final class BackgroundProcessor$BackgroundIdToUrlStrategy$action$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final BackgroundProcessor.BackgroundIdToUrlStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundProcessor$BackgroundIdToUrlStrategy$action$1(BackgroundProcessor.BackgroundIdToUrlStrategy backgroundIdToUrlStrategy, Continuation<? super BackgroundProcessor$BackgroundIdToUrlStrategy$action$1> continuation) {
        super(continuation);
        this.this$0 = backgroundIdToUrlStrategy;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
