package com.bilibili.ship.theseus.united.player.mediaplay.network;

import com.bilibili.lib.neuron.api.Neurons;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/NetworkShowToastService$showCellularToast$show$1.class */
final class NetworkShowToastService$showCellularToast$show$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final String $text;
    int label;
    final m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkShowToastService$showCellularToast$show$1(m mVar, String str, Continuation<? super NetworkShowToastService$showCellularToast$show$1> continuation) {
        super(1, continuation);
        this.this$0 = mVar;
        this.$text = str;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NetworkShowToastService$showCellularToast$show$1(this.this$0, this.$text, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Neurons.report$default(false, 9, "player.player.toast-dataplan.dataplan-show.player", (Map) null, (String) null, 0, 56, (Object) null);
            m mVar = this.this$0;
            String str = this.$text;
            this.label = 1;
            if (mVar.d(str, this) == coroutine_suspended) {
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
