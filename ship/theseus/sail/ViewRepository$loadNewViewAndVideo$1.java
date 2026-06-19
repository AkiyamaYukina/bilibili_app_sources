package com.bilibili.ship.theseus.sail;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/sail/ViewRepository$loadNewViewAndVideo$1.class */
final class ViewRepository$loadNewViewAndVideo$1 extends ContinuationImpl {
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewRepository$loadNewViewAndVideo$1(f fVar, Continuation<? super ViewRepository$loadNewViewAndVideo$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = this.this$0.a(0L, null, null, null, null, null, null, null, null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.box-impl(objA);
    }
}
