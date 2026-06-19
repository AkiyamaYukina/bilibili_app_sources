package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$checkToastInterval$lastShowTime$1.class */
final class CheeseAttendanceToastService$checkToastInterval$lastShowTime$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    int label;
    final CheeseAttendanceToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceToastService$checkToastInterval$lastShowTime$1(CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super CheeseAttendanceToastService$checkToastInterval$lastShowTime$1> continuation) {
        super(2, continuation);
        this.this$0 = cheeseAttendanceToastService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAttendanceToastService$checkToastInterval$lastShowTime$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxLong(((tv.danmaku.bili.widget.preference.a) this.this$0.f89278i.getValue()).a.getLong("attendance_toast_last_show_time", 0L));
    }
}
