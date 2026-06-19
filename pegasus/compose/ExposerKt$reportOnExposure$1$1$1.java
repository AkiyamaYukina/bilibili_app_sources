package com.bilibili.pegasus.compose;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/compose/ExposerKt$reportOnExposure$1$1$1.class */
final class ExposerKt$reportOnExposure$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final f $collector;
    final Function0<Unit> $onExpose;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposerKt$reportOnExposure$1$1$1(f fVar, Function0<Unit> function0, Continuation<? super ExposerKt$reportOnExposure$1$1$1> continuation) {
        super(2, continuation);
        this.$collector = fVar;
        this.$onExpose = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExposerKt$reportOnExposure$1$1$1(this.$collector, this.$onExpose, continuation);
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
                f fVar = this.$collector;
                Function0<Unit> function0 = this.$onExpose;
                this.label = 1;
                if (fVar.a(function0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new KotlinNothingValueException();
                }
                ResultKt.throwOnFailure(obj);
            }
            this.label = 2;
            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            this.$collector.b(null);
            throw th;
        }
    }
}
