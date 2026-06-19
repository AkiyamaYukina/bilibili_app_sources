package com.bilibili.ship.theseus.ogv.videocard;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$fetchCardList$2.class */
final class OgvVideoCardService$fetchCardList$2 extends SuspendLambda implements Function2<com.bilibili.community.follow.b, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final OgvVideoCardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$fetchCardList$2(OgvVideoCardService ogvVideoCardService, Continuation<? super OgvVideoCardService$fetchCardList$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoCardService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVideoCardService$fetchCardList$2 ogvVideoCardService$fetchCardList$2 = new OgvVideoCardService$fetchCardList$2(this.this$0, continuation);
        ogvVideoCardService$fetchCardList$2.L$0 = obj;
        return ogvVideoCardService$fetchCardList$2;
    }

    public final Object invoke(com.bilibili.community.follow.b bVar, Continuation<? super Unit> continuation) {
        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.h(((com.bilibili.community.follow.b) this.L$0).a);
        OgvVideoCardService.k(this.this$0);
        return Unit.INSTANCE;
    }
}
