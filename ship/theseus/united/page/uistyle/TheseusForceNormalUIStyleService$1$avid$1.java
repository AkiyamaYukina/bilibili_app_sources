package com.bilibili.ship.theseus.united.page.uistyle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusForceNormalUIStyleService$1$avid$1.class */
public final class TheseusForceNormalUIStyleService$1$avid$1 extends SuspendLambda implements Function2<Long, Continuation<? super Boolean>, Object> {
    long J$0;
    int label;

    public TheseusForceNormalUIStyleService$1$avid$1(Continuation<? super TheseusForceNormalUIStyleService$1$avid$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusForceNormalUIStyleService$1$avid$1 theseusForceNormalUIStyleService$1$avid$1 = new TheseusForceNormalUIStyleService$1$avid$1(continuation);
        theseusForceNormalUIStyleService$1$avid$1.J$0 = ((Number) obj).longValue();
        return theseusForceNormalUIStyleService$1$avid$1;
    }

    public final Object invoke(long j7, Continuation<? super Boolean> continuation) {
        return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (Continuation<? super Boolean>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.J$0 > 0);
    }
}
