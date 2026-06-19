package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$reportSwitchClarity$2$emit_Ivnldq8$1.class */
public final class TheseusPlayerQualityService$reportSwitchClarity$2$emit_Ivnldq8$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final TheseusPlayerQualityService$reportSwitchClarity$2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TheseusPlayerQualityService$reportSwitchClarity$2$emit_Ivnldq8$1(TheseusPlayerQualityService$reportSwitchClarity$2<? super T> theseusPlayerQualityService$reportSwitchClarity$2, Continuation<? super TheseusPlayerQualityService$reportSwitchClarity$2$emit_Ivnldq8$1> continuation) {
        super(continuation);
        this.this$0 = theseusPlayerQualityService$reportSwitchClarity$2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, (Continuation<? super Unit>) this);
    }
}
