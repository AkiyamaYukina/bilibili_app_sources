package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$8$1.class */
public final class TheseusInteractVideoService$runNode$2$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final TheseusInteractVideoService$runNode$2.a $playable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$runNode$2$8$1(TheseusInteractVideoService$runNode$2.a aVar, Continuation<? super TheseusInteractVideoService$runNode$2$8$1> continuation) {
        super(2, continuation);
        this.$playable = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$runNode$2$8$1(this.$playable, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusInteractVideoService$runNode$2.a aVar = this.$playable;
            this.label = 1;
            if (aVar.y(0L, false, this) == coroutine_suspended) {
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
