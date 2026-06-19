package com.bilibili.ship.theseus.ugc.charge;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/charge/ChargeResidentBarService$keepDisplaying$1.class */
final class ChargeResidentBarService$keepDisplaying$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final ChargeResidentBarService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargeResidentBarService$keepDisplaying$1(ChargeResidentBarService chargeResidentBarService, Continuation<? super ChargeResidentBarService$keepDisplaying$1> continuation) {
        super(continuation);
        this.this$0 = chargeResidentBarService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChargeResidentBarService.a(this.this$0, null, null, this);
    }
}
