package com.bilibili.ship.theseus.united.page.preload;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/preload/PreloadRepository$releasePreload$1.class */
final class PreloadRepository$releasePreload$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    int label;
    Object result;
    final PreloadRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadRepository$releasePreload$1(PreloadRepository preloadRepository, Continuation<? super PreloadRepository$releasePreload$1> continuation) {
        super(continuation);
        this.this$0 = preloadRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0L, 0L, this);
    }
}
