package com.bilibili.ship.theseus.cheese.di;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/di/CheeseFragmentCreatorModule$provideCreator$1$keepFragmentRegistration$1.class */
final class CheeseFragmentCreatorModule$provideCreator$1$keepFragmentRegistration$1 extends ContinuationImpl {
    int label;
    Object result;
    final k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseFragmentCreatorModule$provideCreator$1$keepFragmentRegistration$1(k kVar, Continuation<? super CheeseFragmentCreatorModule$provideCreator$1$keepFragmentRegistration$1> continuation) {
        super(continuation);
        this.this$0 = kVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
