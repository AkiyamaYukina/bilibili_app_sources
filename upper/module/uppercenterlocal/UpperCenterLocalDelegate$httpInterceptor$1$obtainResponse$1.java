package com.bilibili.upper.module.uppercenterlocal;

import com.bilibili.upper.module.uppercenterlocal.UpperCenterLocalDelegate;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$httpInterceptor$1$obtainResponse$1.class */
final class UpperCenterLocalDelegate$httpInterceptor$1$obtainResponse$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final UpperCenterLocalDelegate.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterLocalDelegate$httpInterceptor$1$obtainResponse$1(UpperCenterLocalDelegate.b bVar, Continuation<? super UpperCenterLocalDelegate$httpInterceptor$1$obtainResponse$1> continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, this);
    }
}
