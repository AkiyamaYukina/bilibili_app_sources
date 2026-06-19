package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/KingPositionService$onLikeClicked$2$1.class */
final class KingPositionService$onLikeClicked$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final KingPositionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KingPositionService$onLikeClicked$2$1(KingPositionService kingPositionService, Continuation<? super KingPositionService$onLikeClicked$2$1> continuation) {
        super(2, continuation);
        this.this$0 = kingPositionService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KingPositionService$onLikeClicked$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        KingPositionService kingPositionService = this.this$0;
        kingPositionService.i(KingPositionService.a.a(kingPositionService.d(), false, true, false, false, null, 29));
        return Unit.INSTANCE;
    }
}
