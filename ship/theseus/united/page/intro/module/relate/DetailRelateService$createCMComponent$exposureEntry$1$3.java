package com.bilibili.ship.theseus.united.page.intro.module.relate;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createCMComponent$exposureEntry$1$3.class */
final class DetailRelateService$createCMComponent$exposureEntry$1$3 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    final o0 $card;
    int label;
    final DetailRelateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createCMComponent$exposureEntry$1$3(DetailRelateService detailRelateService, o0 o0Var, Continuation<? super DetailRelateService$createCMComponent$exposureEntry$1$3> continuation) {
        super(2, continuation);
        this.this$0 = detailRelateService;
        this.$card = o0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailRelateService$createCMComponent$exposureEntry$1$3(this.this$0, this.$card, continuation);
    }

    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DetailRelateService detailRelateService = this.this$0;
        o0 o0Var = this.$card;
        detailRelateService.q(o0Var, DetailRelateService.b(detailRelateService, o0Var));
        return Unit.INSTANCE;
    }
}
