package com.bilibili.ship.theseus.cheese.biz.certificate;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$checkIfMeetDurationThreshold$2.class */
final class CheeseCertificateService$checkIfMeetDurationThreshold$2 extends SuspendLambda implements Function2<Duration, Continuation<? super Boolean>, Object> {
    final long $threshold;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseCertificateService$checkIfMeetDurationThreshold$2(long j7, Continuation<? super CheeseCertificateService$checkIfMeetDurationThreshold$2> continuation) {
        super(2, continuation);
        this.$threshold = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheeseCertificateService$checkIfMeetDurationThreshold$2 cheeseCertificateService$checkIfMeetDurationThreshold$2 = new CheeseCertificateService$checkIfMeetDurationThreshold$2(this.$threshold, continuation);
        cheeseCertificateService$checkIfMeetDurationThreshold$2.J$0 = ((Duration) obj).unbox-impl();
        return cheeseCertificateService$checkIfMeetDurationThreshold$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m8821invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
    }

    /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
    public final Object m8821invokeVtjQ1oo(long j7, Continuation<? super Boolean> continuation) {
        return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(Duration.compareTo-LRDsOJo(this.J$0, this.$threshold) >= 0);
    }
}
