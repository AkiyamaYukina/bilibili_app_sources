package com.bilibili.opd.app.bizcommon.mangapaysdk.data.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/data/model/PayViewStoreViewModel$checkConsumeIsSuccess$1.class */
final class PayViewStoreViewModel$checkConsumeIsSuccess$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayViewStoreViewModel$checkConsumeIsSuccess$1(d dVar, Continuation<? super PayViewStoreViewModel$checkConsumeIsSuccess$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.I0(this.this$0, null, null, null, this);
    }
}
