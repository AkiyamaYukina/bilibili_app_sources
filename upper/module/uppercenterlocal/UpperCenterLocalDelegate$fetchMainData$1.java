package com.bilibili.upper.module.uppercenterlocal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$fetchMainData$1.class */
final class UpperCenterLocalDelegate$fetchMainData$1 extends ContinuationImpl {
    int label;
    Object result;
    final UpperCenterLocalDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterLocalDelegate$fetchMainData$1(UpperCenterLocalDelegate upperCenterLocalDelegate, Continuation<? super UpperCenterLocalDelegate$fetchMainData$1> continuation) {
        super(continuation);
        this.this$0 = upperCenterLocalDelegate;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UpperCenterLocalDelegate.a(this.this$0, false, this);
    }
}
