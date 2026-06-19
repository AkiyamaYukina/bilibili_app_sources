package com.bilibili.ogv.secondary.part;

import com.bilibili.ogv.secondary.part.PartReadyUiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/PartReadyUiService$1$3$3$emit$1.class */
public final class PartReadyUiService$1$3$3$emit$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    Object result;
    final PartReadyUiService.AnonymousClass1.AnonymousClass3.C04583<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PartReadyUiService$1$3$3$emit$1(PartReadyUiService.AnonymousClass1.AnonymousClass3.C04583<? super T> c04583, Continuation<? super PartReadyUiService$1$3$3$emit$1> continuation) {
        super(continuation);
        this.this$0 = c04583;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(false, (Continuation<? super Unit>) this);
    }
}
