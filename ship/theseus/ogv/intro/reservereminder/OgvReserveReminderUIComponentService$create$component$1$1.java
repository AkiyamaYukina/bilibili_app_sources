package com.bilibili.ship.theseus.ogv.intro.reservereminder;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/reservereminder/OgvReserveReminderUIComponentService$create$component$1$1.class */
public final class OgvReserveReminderUIComponentService$create$component$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableStateFlow<Boolean> $reserved;
    final OgvReserveReminderVo $vo;
    int label;
    final OgvReserveReminderUIComponentService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvReserveReminderUIComponentService$create$component$1$1(OgvReserveReminderUIComponentService ogvReserveReminderUIComponentService, OgvReserveReminderVo ogvReserveReminderVo, MutableStateFlow<Boolean> mutableStateFlow, Continuation<? super OgvReserveReminderUIComponentService$create$component$1$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvReserveReminderUIComponentService;
        this.$vo = ogvReserveReminderVo;
        this.$reserved = mutableStateFlow;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvReserveReminderUIComponentService$create$component$1$1(this.this$0, this.$vo, this.$reserved, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OgvReserveReminderUIComponentService ogvReserveReminderUIComponentService = this.this$0;
            OgvReserveReminderVo ogvReserveReminderVo = this.$vo;
            MutableStateFlow<Boolean> mutableStateFlow = this.$reserved;
            this.label = 1;
            if (OgvReserveReminderUIComponentService.a(ogvReserveReminderUIComponentService, ogvReserveReminderVo, mutableStateFlow, this) == coroutine_suspended) {
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
