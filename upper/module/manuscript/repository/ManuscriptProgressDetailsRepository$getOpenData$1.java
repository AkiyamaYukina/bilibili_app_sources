package com.bilibili.upper.module.manuscript.repository;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/repository/ManuscriptProgressDetailsRepository$getOpenData$1.class */
final class ManuscriptProgressDetailsRepository$getOpenData$1 extends ContinuationImpl {
    long J$0;
    int label;
    Object result;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsRepository$getOpenData$1(e eVar, Continuation<? super ManuscriptProgressDetailsRepository$getOpenData$1> continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objB = this.this$0.b(0L, this);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : Result.box-impl(objB);
    }
}
