package com.bilibili.ship.theseus.ogv.videocard;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/OgvVideoCardService$fetchCardList$3.class */
final class OgvVideoCardService$fetchCardList$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final OgvVideoCardService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVideoCardService$fetchCardList$3(OgvVideoCardService ogvVideoCardService, Continuation<? super OgvVideoCardService$fetchCardList$3> continuation) {
        super(2, continuation);
        this.this$0 = ogvVideoCardService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVideoCardService$fetchCardList$3 ogvVideoCardService$fetchCardList$3 = new OgvVideoCardService$fetchCardList$3(this.this$0, continuation);
        ogvVideoCardService$fetchCardList$3.Z$0 = ((Boolean) obj).booleanValue();
        return ogvVideoCardService$fetchCardList$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.i(this.Z$0);
        OgvVideoCardService.k(this.this$0);
        return Unit.INSTANCE;
    }
}
