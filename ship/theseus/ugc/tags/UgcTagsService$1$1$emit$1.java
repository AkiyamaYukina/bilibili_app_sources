package com.bilibili.ship.theseus.ugc.tags;

import com.bilibili.ship.theseus.ugc.tags.UgcTagsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/tags/UgcTagsService$1$1$emit$1.class */
public final class UgcTagsService$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final UgcTagsService.AnonymousClass1.C09261<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UgcTagsService$1$1$emit$1(UgcTagsService.AnonymousClass1.C09261<? super T> c09261, Continuation<? super UgcTagsService$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c09261;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation<? super Unit>) this);
    }
}
