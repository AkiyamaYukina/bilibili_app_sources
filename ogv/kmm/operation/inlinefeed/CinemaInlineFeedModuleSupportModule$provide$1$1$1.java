package com.bilibili.ogv.kmm.operation.inlinefeed;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/CinemaInlineFeedModuleSupportModule$provide$1$1$1.class */
final class CinemaInlineFeedModuleSupportModule$provide$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final e $model;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CinemaInlineFeedModuleSupportModule$provide$1$1$1(e eVar, Continuation<? super CinemaInlineFeedModuleSupportModule$provide$1$1$1> continuation) {
        super(2, continuation);
        this.$model = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CinemaInlineFeedModuleSupportModule$provide$1$1$1(this.$model, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.kmm.operation.inlinevideo.b bVar = this.$model.f68379c;
            if (bVar != null) {
                this.label = 1;
                if (bVar.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
