package com.bilibili.ogv.kmm.operation.banner;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/CreateHdrVideoModel$invoke$1$hdrVideoUi$2$1$1$1$1.class */
final class CreateHdrVideoModel$invoke$1$hdrVideoUi$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final T this$0;
    final U this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateHdrVideoModel$invoke$1$hdrVideoUi$2$1$1$1$1(T t7, U u7, Continuation<? super CreateHdrVideoModel$invoke$1$hdrVideoUi$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = t7;
        this.this$1 = u7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateHdrVideoModel$invoke$1$hdrVideoUi$2$1$1$1$1(this.this$0, this.this$1, continuation);
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
        this.this$0.f68054i = "click";
        U u7 = this.this$1;
        u7.f68065c.a(C8770a.a(new StringBuilder("pgc."), u7.f68064b, ".pop.0.click"), T.a(this.this$0));
        return Unit.INSTANCE;
    }
}
