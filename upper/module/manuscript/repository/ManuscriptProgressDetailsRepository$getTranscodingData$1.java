package com.bilibili.upper.module.manuscript.repository;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/repository/ManuscriptProgressDetailsRepository$getTranscodingData$1.class */
final class ManuscriptProgressDetailsRepository$getTranscodingData$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    int label;
    Object result;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsRepository$getTranscodingData$1(e eVar, Continuation<? super ManuscriptProgressDetailsRepository$getTranscodingData$1> continuation) {
        super(continuation);
        this.this$0 = eVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objE = this.this$0.e(0L, 0L, this);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Result.box-impl(objE);
    }
}
