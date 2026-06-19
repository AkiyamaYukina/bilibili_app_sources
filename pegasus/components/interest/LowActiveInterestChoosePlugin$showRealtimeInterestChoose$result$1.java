package com.bilibili.pegasus.components.interest;

import com.bilibili.lib.arch.lifecycle.Resource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kp0.C7782e;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$showRealtimeInterestChoose$result$1.class */
final class LowActiveInterestChoosePlugin$showRealtimeInterestChoose$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<? extends C7782e>>, Object> {
    int label;

    public LowActiveInterestChoosePlugin$showRealtimeInterestChoose$result$1(Continuation<? super LowActiveInterestChoosePlugin$showRealtimeInterestChoose$result$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LowActiveInterestChoosePlugin$showRealtimeInterestChoose$result$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<C7782e>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            Object objD = com.bilibili.pegasus.request.b.d(1, null, this, 2);
            obj = objD;
            if (objD == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
