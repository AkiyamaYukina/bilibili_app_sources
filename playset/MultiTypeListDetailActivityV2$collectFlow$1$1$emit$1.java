package com.bilibili.playset;

import com.bilibili.playset.MultiTypeListDetailActivityV2$collectFlow$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/MultiTypeListDetailActivityV2$collectFlow$1$1$emit$1.class */
public final class MultiTypeListDetailActivityV2$collectFlow$1$1$emit$1 extends ContinuationImpl {
    int label;
    Object result;
    final MultiTypeListDetailActivityV2$collectFlow$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiTypeListDetailActivityV2$collectFlow$1$1$emit$1(MultiTypeListDetailActivityV2$collectFlow$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super MultiTypeListDetailActivityV2$collectFlow$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation<? super Unit>) this);
    }
}
