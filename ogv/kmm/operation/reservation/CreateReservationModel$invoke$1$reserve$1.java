package com.bilibili.ogv.kmm.operation.reservation;

import com.bilibili.ktor.KApiResponse;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kntr.common.trio.toast.Toaster;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/CreateReservationModel$invoke$1$reserve$1.class */
final class CreateReservationModel$invoke$1$reserve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $oid;
    final String $scene;
    int label;
    final b this$0;
    final a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateReservationModel$invoke$1$reserve$1(b bVar, long j7, String str, a aVar, Continuation<? super CreateReservationModel$invoke$1$reserve$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$oid = j7;
        this.$scene = str;
        this.this$1 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateReservationModel$invoke$1$reserve$1(this.this$0, this.$oid, this.$scene, this.this$1, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.kmm.operation.reservation.api.a aVar = this.this$0.f68656a;
            long j7 = this.$oid;
            String str = this.$scene;
            this.label = 1;
            Object objA = aVar.a(j7, str, this);
            obj = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        KApiResponse.a aVar2 = (KApiResponse) obj;
        b bVar = this.this$0;
        a aVar3 = this.this$1;
        if (aVar2 instanceof KApiResponse.a) {
            KApiResponse.a aVar4 = aVar2;
            ILogger kLog = KLog_androidKt.getKLog();
            String str2 = aVar4.b;
            kLog.w("ReservationModel", str2 != null ? str2 : "");
        } else if (aVar2 instanceof KApiResponse.ServiceUnavailable) {
            Exception exception = ((KApiResponse.ServiceUnavailable) aVar2).getException();
            ILogger kLog2 = KLog_androidKt.getKLog();
            String message = exception.getMessage();
            kLog2.e("ReservationModel", message != null ? message : "", exception);
        } else {
            if (!(aVar2 instanceof KApiResponse.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Toaster.showToast$default(bVar.f68657b, ((com.bilibili.ogv.kmm.operation.reservation.api.b) ((KApiResponse.c) aVar2).a).f68653a, (ToastDuration) null, (ToastGravity) null, 6, (Object) null);
            aVar3.f68649a.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
