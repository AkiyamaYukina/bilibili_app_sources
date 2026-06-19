package com.bilibili.player.tangram.playercore;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$awaitFirstFrame$2.class */
public final class SequentialPCSPlayable$awaitFirstFrame$2 extends SuspendLambda implements Function2<v, Continuation<? super Long>, Object> {
    Object L$0;
    int label;

    public SequentialPCSPlayable$awaitFirstFrame$2(Continuation<? super SequentialPCSPlayable$awaitFirstFrame$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequentialPCSPlayable$awaitFirstFrame$2 sequentialPCSPlayable$awaitFirstFrame$2 = new SequentialPCSPlayable$awaitFirstFrame$2(continuation);
        sequentialPCSPlayable$awaitFirstFrame$2.L$0 = obj;
        return sequentialPCSPlayable$awaitFirstFrame$2;
    }

    public final Object invoke(v vVar, Continuation<? super Long> continuation) {
        return create(vVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 == 1) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxLong(((Number) obj).longValue());
            }
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            throw new KotlinNothingValueException();
        }
        ResultKt.throwOnFailure(obj);
        v vVar = (v) this.L$0;
        if (vVar == null) {
            this.label = 2;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        }
        this.label = 1;
        Object objU = vVar.u(this);
        obj = objU;
        if (objU == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Boxing.boxLong(((Number) obj).longValue());
    }
}
