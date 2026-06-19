package com.bilibili.ship.theseus.united.player;

import com.bilibili.ship.theseus.keel.player.h;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$1.class */
public final class TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final float $speed;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$1(e eVar, float f7, Continuation<? super TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = eVar;
        this.$speed = f7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1$1$1(this.this$0, this.$speed, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            h hVar = this.this$0.f104455g;
            float f7 = this.$speed;
            this.label = 1;
            if (hVar.f91108b.c(f7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
