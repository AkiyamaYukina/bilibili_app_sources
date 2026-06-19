package com.bilibili.pegasus.components.interest;

import com.bilibili.pegasus.PegasusVisibleState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/LowActiveInterestChoosePlugin$waitSplashVisible$2.class */
final class LowActiveInterestChoosePlugin$waitSplashVisible$2 extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final LowActiveInterestChoosePlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowActiveInterestChoosePlugin$waitSplashVisible$2(LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin, Continuation<? super LowActiveInterestChoosePlugin$waitSplashVisible$2> continuation) {
        super(2, continuation);
        this.this$0 = lowActiveInterestChoosePlugin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ProducerScope producerScope) {
        producerScope.trySend-JP2dKIU(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LowActiveInterestChoosePlugin$waitSplashVisible$2 lowActiveInterestChoosePlugin$waitSplashVisible$2 = new LowActiveInterestChoosePlugin$waitSplashVisible$2(this.this$0, continuation);
        lowActiveInterestChoosePlugin$waitSplashVisible$2.L$0 = obj;
        return lowActiveInterestChoosePlugin$waitSplashVisible$2;
    }

    public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            LowActiveInterestChoosePlugin lowActiveInterestChoosePlugin = this.this$0;
            v vVar = new v(producerScope);
            if (PegasusVisibleState.getVisibleFromSplash-impl(lowActiveInterestChoosePlugin.getVisibleState-XRWi58s())) {
                vVar.invoke();
            } else {
                lowActiveInterestChoosePlugin.f76284r = vVar;
            }
            this.label = 1;
            if (ProduceKt.awaitClose$default(producerScope, (Function0) null, this, 1, (Object) null) == coroutine_suspended) {
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
