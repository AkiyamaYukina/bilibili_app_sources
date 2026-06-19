package com.bilibili.ship.theseus.united.page.intro.module.owner;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/owner/OwnerService$triggerProgressFollowGuide$2.class */
final class OwnerService$triggerProgressFollowGuide$2 extends SuspendLambda implements Function2<Duration, Continuation<? super Boolean>, Object> {
    final long $lowerBound;
    final long $upperBound;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerService$triggerProgressFollowGuide$2(long j7, long j8, Continuation<? super OwnerService$triggerProgressFollowGuide$2> continuation) {
        super(2, continuation);
        this.$lowerBound = j7;
        this.$upperBound = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OwnerService$triggerProgressFollowGuide$2 ownerService$triggerProgressFollowGuide$2 = new OwnerService$triggerProgressFollowGuide$2(this.$lowerBound, this.$upperBound, continuation);
        ownerService$triggerProgressFollowGuide$2.J$0 = ((Duration) obj).unbox-impl();
        return ownerService$triggerProgressFollowGuide$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m9489invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
    }

    /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
    public final Object m9489invokeVtjQ1oo(long j7, Continuation<? super Boolean> continuation) {
        return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        long j7 = this.J$0;
        boolean z6 = false;
        if (Duration.box-impl(j7).compareTo(Duration.box-impl(this.$lowerBound)) >= 0) {
            z6 = false;
            if (Duration.box-impl(j7).compareTo(Duration.box-impl(this.$upperBound)) <= 0) {
                z6 = true;
            }
        }
        return Boxing.boxBoolean(z6);
    }
}
