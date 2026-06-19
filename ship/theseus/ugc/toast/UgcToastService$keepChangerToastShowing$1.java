package com.bilibili.ship.theseus.ugc.toast;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/toast/UgcToastService$keepChangerToastShowing$1.class */
final class UgcToastService$keepChangerToastShowing$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final UgcToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcToastService$keepChangerToastShowing$1(UgcToastService ugcToastService, Continuation<? super UgcToastService$keepChangerToastShowing$1> continuation) {
        super(continuation);
        this.this$0 = ugcToastService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UgcToastService.a(this.this$0, null, this);
    }
}
