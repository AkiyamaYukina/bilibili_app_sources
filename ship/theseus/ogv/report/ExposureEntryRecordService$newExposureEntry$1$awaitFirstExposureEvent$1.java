package com.bilibili.ship.theseus.ogv.report;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/report/ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1.class */
final class ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1 extends ContinuationImpl {
    int label;
    Object result;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1(a aVar, Continuation<? super ExposureEntryRecordService$newExposureEntry$1$awaitFirstExposureEvent$1> continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
