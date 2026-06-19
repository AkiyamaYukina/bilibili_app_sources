package com.bilibili.player.tangram.playercore;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$errorEffectOnPlay$2$1$1.class */
final class PCSPlayableImpl$errorEffectOnPlay$2$1$1 extends SuspendLambda implements Function1<Continuation<? super InterfaceC5778f>, Object> {
    Object L$0;
    int label;
    final PCSPlayableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$errorEffectOnPlay$2$1$1(PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$errorEffectOnPlay$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = pCSPlayableImpl;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PCSPlayableImpl$errorEffectOnPlay$2$1$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super InterfaceC5778f> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Function2 function2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PCSPlayableImpl pCSPlayableImpl = this.this$0;
            function2 = pCSPlayableImpl.f79415c;
            this.L$0 = function2;
            this.label = 1;
            Object objQ = PCSPlayableImpl.Q(pCSPlayableImpl, null, this, 3);
            obj = objQ;
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            function2 = (Function2) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
        Object objInvoke = function2.invoke(obj, this);
        obj = objInvoke;
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        return obj;
    }
}
