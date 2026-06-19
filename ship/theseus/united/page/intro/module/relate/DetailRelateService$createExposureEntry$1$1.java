package com.bilibili.ship.theseus.united.page.intro.module.relate;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailRelateService$createExposureEntry$1$1.class */
public final class DetailRelateService$createExposureEntry$1$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    final Function0<Unit> $reportItemExposure;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRelateService$createExposureEntry$1$1(Function0<Unit> function0, Continuation<? super DetailRelateService$createExposureEntry$1$1> continuation) {
        super(2, continuation);
        this.$reportItemExposure = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DetailRelateService$createExposureEntry$1$1(this.$reportItemExposure, continuation);
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
        this.$reportItemExposure.invoke();
        return Unit.INSTANCE;
    }
}
