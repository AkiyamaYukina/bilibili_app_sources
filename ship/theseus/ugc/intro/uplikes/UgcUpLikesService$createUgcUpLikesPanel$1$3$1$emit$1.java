package com.bilibili.ship.theseus.ugc.intro.uplikes;

import com.bilibili.ship.theseus.ugc.intro.uplikes.UgcUpLikesService$createUgcUpLikesPanel$1$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UgcUpLikesService$createUgcUpLikesPanel$1$3$1$emit$1.class */
public final class UgcUpLikesService$createUgcUpLikesPanel$1$3$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final UgcUpLikesService$createUgcUpLikesPanel$1$3.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UgcUpLikesService$createUgcUpLikesPanel$1$3$1$emit$1(UgcUpLikesService$createUgcUpLikesPanel$1$3.AnonymousClass1<? super T> anonymousClass1, Continuation<? super UgcUpLikesService$createUgcUpLikesPanel$1$3$1$emit$1> continuation) {
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
