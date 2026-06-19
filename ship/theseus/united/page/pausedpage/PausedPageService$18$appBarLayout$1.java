package com.bilibili.ship.theseus.united.page.pausedpage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$18$appBarLayout$1.class */
public final class PausedPageService$18$appBarLayout$1 extends SuspendLambda implements Function2<C9268a.C1396a, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public PausedPageService$18$appBarLayout$1(Continuation<? super PausedPageService$18$appBarLayout$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PausedPageService$18$appBarLayout$1 pausedPageService$18$appBarLayout$1 = new PausedPageService$18$appBarLayout$1(continuation);
        pausedPageService$18$appBarLayout$1.L$0 = obj;
        return pausedPageService$18$appBarLayout$1;
    }

    public final Object invoke(C9268a.C1396a c1396a, Continuation<? super Boolean> continuation) {
        return create(c1396a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C9268a.C1396a c1396a = (C9268a.C1396a) this.L$0;
        return Boxing.boxBoolean((c1396a != null ? c1396a.f130936a : null) != null);
    }
}
