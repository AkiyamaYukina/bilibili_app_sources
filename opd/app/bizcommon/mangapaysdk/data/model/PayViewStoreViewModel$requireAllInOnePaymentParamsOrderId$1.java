package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayViewStoreViewModel$requireAllInOnePaymentParamsOrderId$1.class */
final class PayViewStoreViewModel$requireAllInOnePaymentParamsOrderId$1 extends ContinuationImpl {
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayViewStoreViewModel$requireAllInOnePaymentParamsOrderId$1(d dVar, Continuation<? super PayViewStoreViewModel$requireAllInOnePaymentParamsOrderId$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.S0(null, 0, 0, false, null, null, this);
    }
}
