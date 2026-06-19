package com.bilibili.ship.theseus.united.page.miniplayer;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/miniplayer/MiniPlayerSuppressionService$observeCloudConfig$1.class */
final class MiniPlayerSuppressionService$observeCloudConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MiniPlayerSuppressionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniPlayerSuppressionService$observeCloudConfig$1(MiniPlayerSuppressionService miniPlayerSuppressionService, Continuation<? super MiniPlayerSuppressionService$observeCloudConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = miniPlayerSuppressionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MiniPlayerSuppressionService$observeCloudConfig$1(this.this$0, continuation);
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
                MiniPlayerSuppressionService.a(this.this$0);
                MiniPlayerSuppressionService miniPlayerSuppressionService = this.this$0;
                miniPlayerSuppressionService.f102041j.addCloudConfigObserver(miniPlayerSuppressionService.f102043l);
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
            MiniPlayerSuppressionService miniPlayerSuppressionService2 = this.this$0;
            miniPlayerSuppressionService2.f102041j.removeCloudConfigObserver(miniPlayerSuppressionService2.f102043l);
            throw th;
        }
    }
}
