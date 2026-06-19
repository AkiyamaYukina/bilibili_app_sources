package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$checkToastInterval$1.class */
final class CheeseAttendanceToastService$checkToastInterval$1 extends ContinuationImpl {
    int label;
    Object result;
    final CheeseAttendanceToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceToastService$checkToastInterval$1(CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super CheeseAttendanceToastService$checkToastInterval$1> continuation) {
        super(continuation);
        this.this$0 = cheeseAttendanceToastService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheeseAttendanceToastService.a(this.this$0, this);
    }
}
