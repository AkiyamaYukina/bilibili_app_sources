package com.bilibili.ogv.operation3.module.report.vip;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/report/vip/VipReport$invoke$1.class */
public final class VipReport$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $eventId;
    final long $mid;
    final Map<String, String> $report;
    int label;
    final VipReport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipReport$invoke$1(VipReport vipReport, long j7, String str, Map<String, String> map, Continuation<? super VipReport$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = vipReport;
        this.$mid = j7;
        this.$eventId = str;
        this.$report = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipReport$invoke$1(this.this$0, this.$mid, this.$eventId, this.$report, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c cVar = this.this$0.f71411a;
            long j7 = this.$mid;
            String str = this.$eventId;
            Map<String, String> map = this.$report;
            this.label = 1;
            if (cVar.a(j7, str, map, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
