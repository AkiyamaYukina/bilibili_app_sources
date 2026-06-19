package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/CheesePriceWeakenPublisherComponent$bind$1.class */
public final class CheesePriceWeakenPublisherComponent$bind$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final CheesePriceWeakenPublisherComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePriceWeakenPublisherComponent$bind$1(CheesePriceWeakenPublisherComponent cheesePriceWeakenPublisherComponent, Continuation<? super CheesePriceWeakenPublisherComponent$bind$1> continuation) {
        super(continuation);
        this.this$0 = cheesePriceWeakenPublisherComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
