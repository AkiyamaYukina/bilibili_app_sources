package com.bilibili.ship.theseus.united.page.charge;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeRepository$keepChargeAdUnlocking$1.class */
final class ChargeRepository$keepChargeAdUnlocking$1 extends ContinuationImpl {
    int label;
    Object result;
    final ChargeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeRepository$keepChargeAdUnlocking$1(ChargeRepository chargeRepository, Continuation<? super ChargeRepository$keepChargeAdUnlocking$1> continuation) {
        super(continuation);
        this.this$0 = chargeRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
