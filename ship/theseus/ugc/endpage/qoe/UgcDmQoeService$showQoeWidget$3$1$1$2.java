package com.bilibili.ship.theseus.ugc.endpage.qoe;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/qoe/UgcDmQoeService$showQoeWidget$3$1$1$2.class */
final class UgcDmQoeService$showQoeWidget$3$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final q $ugcDmQoeDialogComponent;
    int label;
    final x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcDmQoeService$showQoeWidget$3$1$1$2(x xVar, q qVar, Continuation<? super UgcDmQoeService$showQoeWidget$3$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$ugcDmQoeDialogComponent = qVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcDmQoeService$showQoeWidget$3$1$1$2(this.this$0, this.$ugcDmQoeDialogComponent, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f96777e;
            q qVar = this.$ugcDmQoeDialogComponent;
            this.label = 1;
            if (theseusFloatLayerService.f(qVar, null, this) == coroutine_suspended) {
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
