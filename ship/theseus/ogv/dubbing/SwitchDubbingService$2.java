package com.bilibili.ship.theseus.ogv.dubbing;

import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$2.class */
final class SwitchDubbingService$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f91828a;

        public a(q qVar) {
            this.f91828a = qVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f91828a.f91900p = (PlayDubbingInfo) obj;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$2(q qVar, Continuation<? super SwitchDubbingService$2> continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchDubbingService$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            q qVar = this.this$0;
            Flow<PlayDubbingInfo> flow = qVar.f91889d;
            a aVar = new a(qVar);
            this.label = 1;
            if (flow.collect(aVar, this) == coroutine_suspended) {
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
