package com.bilibili.ship.theseus.sail;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/ViewRepository$requestView$1.class */
final class ViewRepository$requestView$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewRepository$requestView$1(f fVar, Continuation<? super ViewRepository$requestView$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objD = this.this$0.d(null, this);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Result.box-impl(objD);
    }
}
