package com.bilibili.studio.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$suspendStart$errorHandler$1$1.class */
public final class MaterialTask$suspendStart$errorHandler$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Throwable $throwable;
    int label;
    final MaterialTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTask$suspendStart$errorHandler$1$1(MaterialTask materialTask, Throwable th, Continuation<? super MaterialTask$suspendStart$errorHandler$1$1> continuation) {
        super(2, continuation);
        this.this$0 = materialTask;
        this.$throwable = th;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MaterialTask$suspendStart$errorHandler$1$1(this.this$0, this.$throwable, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MaterialTask materialTask = this.this$0;
            Throwable th = this.$throwable;
            this.label = 1;
            if (MaterialTask.access$notifyFailed(materialTask, th, this) == coroutine_suspended) {
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
