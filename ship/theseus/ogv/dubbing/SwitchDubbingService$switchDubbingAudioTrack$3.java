package com.bilibili.ship.theseus.ogv.dubbing;

import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/dubbing/SwitchDubbingService$switchDubbingAudioTrack$3.class */
final class SwitchDubbingService$switchDubbingAudioTrack$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchDubbingService$switchDubbingAudioTrack$3(q qVar, Continuation<? super SwitchDubbingService$switchDubbingAudioTrack$3> continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    private static final Unit invokeSuspend$lambda$0(q qVar, com.bilibili.ogv.infra.coroutine.c cVar) {
        cVar.b(new SwitchDubbingService$switchDubbingAudioTrack$3$1$1(qVar, null));
        cVar.b(new SwitchDubbingService$switchDubbingAudioTrack$3$1$2(qVar, null));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SwitchDubbingService$switchDubbingAudioTrack$3(this.this$0, continuation);
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
            this.label = 1;
            ArrayList arrayList = new ArrayList();
            invokeSuspend$lambda$0(qVar, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
            if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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
