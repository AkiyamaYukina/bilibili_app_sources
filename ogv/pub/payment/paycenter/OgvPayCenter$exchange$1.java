package com.bilibili.ogv.pub.payment.paycenter;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/payment/paycenter/OgvPayCenter$exchange$1.class */
final class OgvPayCenter$exchange$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayCenter$exchange$1(c cVar, Continuation<? super OgvPayCenter$exchange$1> continuation) {
        super(continuation);
        this.this$0 = cVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, 0L, 0L, null, 0L, this);
    }
}
