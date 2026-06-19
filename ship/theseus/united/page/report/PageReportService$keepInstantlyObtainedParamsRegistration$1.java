package com.bilibili.ship.theseus.united.page.report;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/report/PageReportService$keepInstantlyObtainedParamsRegistration$1.class */
final class PageReportService$keepInstantlyObtainedParamsRegistration$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final PageReportService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageReportService$keepInstantlyObtainedParamsRegistration$1(PageReportService pageReportService, Continuation<? super PageReportService$keepInstantlyObtainedParamsRegistration$1> continuation) {
        super(continuation);
        this.this$0 = pageReportService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
