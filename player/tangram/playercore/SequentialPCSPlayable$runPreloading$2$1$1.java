package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.playercore.SequentialPCSPlayable;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$runPreloading$2$1$1.class */
public final class SequentialPCSPlayable$runPreloading$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final SequentialPCSPlayable.a $preloadEntry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayable$runPreloading$2$1$1(SequentialPCSPlayable.a aVar, Continuation<? super SequentialPCSPlayable$runPreloading$2$1$1> continuation) {
        super(2, continuation);
        this.$preloadEntry = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SequentialPCSPlayable$runPreloading$2$1$1(this.$preloadEntry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            throw new KotlinNothingValueException();
        }
        ResultKt.throwOnFailure(obj);
        this.$preloadEntry.getClass();
        this.label = 1;
        throw null;
    }
}
