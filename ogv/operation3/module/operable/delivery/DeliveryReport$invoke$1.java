package com.bilibili.ogv.operation3.module.operable.delivery;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/operable/delivery/DeliveryReport$invoke$1.class */
public final class DeliveryReport$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Map<String, String> $data;
    final int $eventType;
    int label;
    final DeliveryReport this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryReport$invoke$1(DeliveryReport deliveryReport, Map<String, String> map, int i7, Continuation<? super DeliveryReport$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = deliveryReport;
        this.$data = map;
        this.$eventType = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DeliveryReport$invoke$1(this.this$0, this.$data, this.$eventType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            a aVar = this.this$0.f71388a;
            Map<String, String> map = this.$data;
            int i8 = this.$eventType;
            this.label = 1;
            if (aVar.a(i8, map, this) == coroutine_suspended) {
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
