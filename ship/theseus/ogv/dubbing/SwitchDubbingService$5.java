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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$5.class */
final class SwitchDubbingService$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$5$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f91832a;

        public a(q qVar) {
            this.f91832a = qVar;
        }

        public final Object emit(Object obj, Continuation continuation) {
            this.f91832a.f91898n.setVisibility(((PlayDubbingInfo) obj) != null ? 0 : 8);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$5(q qVar, Continuation<? super SwitchDubbingService$5> continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchDubbingService$5(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
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
            this.this$0.f91898n.setVisibility(8);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.f91898n.setVisibility(8);
            throw th;
        }
    }
}
