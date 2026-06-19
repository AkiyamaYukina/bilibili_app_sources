package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import com.bilibili.app.gemini.ui.RunningUIComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageService$runPackageFloatLayer$1$1$1.class */
public final class CheesePackageService$runPackageFloatLayer$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RunningUIComponent $runningUIComponent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePackageService$runPackageFloatLayer$1$1$1(RunningUIComponent runningUIComponent, Continuation<? super CheesePackageService$runPackageFloatLayer$1$1$1> continuation) {
        super(1, continuation);
        this.$runningUIComponent = runningUIComponent;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheesePackageService$runPackageFloatLayer$1$1$1(this.$runningUIComponent, continuation);
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
            RunningUIComponent runningUIComponent = this.$runningUIComponent;
            this.label = 1;
            if (runningUIComponent.a(this) == coroutine_suspended) {
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
