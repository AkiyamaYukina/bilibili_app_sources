package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$emitNodeAction$1.class */
public final class TheseusInteractVideoService$emitNodeAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final TheseusInteractVideoService.a $action;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$emitNodeAction$1(TheseusInteractVideoService theseusInteractVideoService, TheseusInteractVideoService.a aVar, Continuation<? super TheseusInteractVideoService$emitNodeAction$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$action = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$emitNodeAction$1(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<TheseusInteractVideoService.a> mutableSharedFlow = this.this$0.f99909z;
            TheseusInteractVideoService.a aVar = this.$action;
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
