package com.bilibili.ogv.infra.biliimage;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/biliimage/BiliImageCoroutineKt$await$1.class */
final class BiliImageCoroutineKt$await$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public BiliImageCoroutineKt$await$1(Continuation<? super BiliImageCoroutineKt$await$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = c.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.box-impl(objA);
    }
}
