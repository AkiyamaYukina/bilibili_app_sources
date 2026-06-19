package com.bilibili.ship.theseus.ogv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yl0.InterfaceC9062a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvTFOpenMembershipService$insertOgvDetailPlayEvent$1.class */
final class OgvTFOpenMembershipService$insertOgvDetailPlayEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $realTime;
    final int $status;
    int label;
    final OgvTFOpenMembershipService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvTFOpenMembershipService$insertOgvDetailPlayEvent$1(OgvTFOpenMembershipService ogvTFOpenMembershipService, int i7, long j7, Continuation<? super OgvTFOpenMembershipService$insertOgvDetailPlayEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvTFOpenMembershipService;
        this.$status = i7;
        this.$realTime = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvTFOpenMembershipService$insertOgvDetailPlayEvent$1(this.this$0, this.$status, this.$realTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC9062a interfaceC9062a = this.this$0.f91341d;
            int i8 = this.$status;
            long j7 = this.$realTime;
            this.label = 1;
            if (interfaceC9062a.d(i8, j7) == coroutine_suspended) {
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
