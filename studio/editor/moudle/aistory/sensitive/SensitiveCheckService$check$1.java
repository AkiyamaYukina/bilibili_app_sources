package com.bilibili.studio.editor.moudle.aistory.sensitive;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/sensitive/SensitiveCheckService$check$1.class */
final class SensitiveCheckService$check$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SensitiveCheckService$check$1(c cVar, Continuation<? super SensitiveCheckService$check$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(null, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Result.box-impl(objB);
    }
}
