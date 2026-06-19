package com.bilibili.ship.theseus.ugc.fitnesscollection;

import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/fitnesscollection/UgcFitnessCollectionService$2$1$invokeSuspend$$inlined$awaitCancel$1.class */
public final class UgcFitnessCollectionService$2$1$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UgcFitnessCollectionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcFitnessCollectionService$2$1$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, UgcFitnessCollectionService ugcFitnessCollectionService) {
        super(2, continuation);
        this.this$0 = ugcFitnessCollectionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcFitnessCollectionService$2$1$invokeSuspend$$inlined$awaitCancel$1(continuation, this.this$0);
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
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            E e7 = this.this$0.f96912c;
            e7.f101461k.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
