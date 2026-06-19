package com.bilibili.ship.theseus.united.page.interactvideo;

import com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$runNode$2$8$4.class */
public final class TheseusInteractVideoService$runNode$2$8$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final TheseusInteractVideoService.a $action;
    int label;
    final TheseusInteractVideoService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusInteractVideoService$runNode$2$8$4(TheseusInteractVideoService theseusInteractVideoService, TheseusInteractVideoService.a aVar, Continuation<? super TheseusInteractVideoService$runNode$2$8$4> continuation) {
        super(2, continuation);
        this.this$0 = theseusInteractVideoService;
        this.$action = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TheseusInteractVideoService$runNode$2$8$4(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusInteractVideoService theseusInteractVideoService = this.this$0;
            TheseusInteractVideoService.a.c cVar = (TheseusInteractVideoService.a.c) this.$action;
            boolean z6 = cVar.f99913a;
            boolean z7 = cVar.f99914b;
            this.label = 1;
            if (TheseusInteractVideoService.f(theseusInteractVideoService, z6, z7, this) == coroutine_suspended) {
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
