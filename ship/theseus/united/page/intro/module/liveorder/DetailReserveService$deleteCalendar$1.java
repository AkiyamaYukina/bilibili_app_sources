package com.bilibili.ship.theseus.united.page.intro.module.liveorder;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/liveorder/DetailReserveService$deleteCalendar$1.class */
final class DetailReserveService$deleteCalendar$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final DetailReserveService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReserveService$deleteCalendar$1(DetailReserveService detailReserveService, Continuation<? super DetailReserveService$deleteCalendar$1> continuation) {
        super(continuation);
        this.this$0 = detailReserveService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DetailReserveService.c(null, this.this$0, this);
    }
}
