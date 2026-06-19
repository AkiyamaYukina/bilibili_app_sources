package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.ship.theseus.cheese.biz.additional.CheeseAdditionalRepo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceToastService$scheduleRefreshTask$2.class */
final class CheeseAttendanceToastService$scheduleRefreshTask$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $interval;
    int label;
    final CheeseAttendanceToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceToastService$scheduleRefreshTask$2(long j7, CheeseAttendanceToastService cheeseAttendanceToastService, Continuation<? super CheeseAttendanceToastService$scheduleRefreshTask$2> continuation) {
        super(2, continuation);
        this.$interval = j7;
        this.this$0 = cheeseAttendanceToastService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAttendanceToastService$scheduleRefreshTask$2(this.$interval, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$interval;
            this.label = 1;
            if (DelayKt.delay-VtjQ1oo(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        defpackage.a.b("[theseus-cheese-CheeseAttendanceToastService$scheduleRefreshTask$2-invokeSuspend] ", C4496a.a("Refreshing additional info after ", Duration.toString-impl(this.$interval)), "CheeseAttendanceToastService$scheduleRefreshTask$2-invokeSuspend");
        CheeseAdditionalRepo cheeseAdditionalRepo = this.this$0.f89272b;
        this.label = 2;
        if (cheeseAdditionalRepo.a(this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
