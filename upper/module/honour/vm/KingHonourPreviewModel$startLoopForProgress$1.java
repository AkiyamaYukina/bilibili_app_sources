package com.bilibili.upper.module.honour.vm;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/vm/KingHonourPreviewModel$startLoopForProgress$1.class */
final class KingHonourPreviewModel$startLoopForProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingHonourPreviewModel$startLoopForProgress$1(c cVar, Continuation<? super KingHonourPreviewModel$startLoopForProgress$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingHonourPreviewModel$startLoopForProgress$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 != 0 && i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            c cVar = this.this$0;
            if (!cVar.h) {
                return Unit.INSTANCE;
            }
            NI0.d dVar = cVar.f113381b;
            long realCurrentPosition = dVar.f17106a.getRealCurrentPosition();
            long duration = dVar.f17106a.getDuration();
            if (duration > 0) {
                cVar.f113384e.setValue(Boxing.boxInt((int) ((realCurrentPosition * ((long) 100)) / duration)));
            }
            this.label = 1;
        } while (DelayKt.delay(300L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
