package com.bilibili.ogv.operation2;

import androidx.lifecycle.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3.class */
final class BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3 extends SuspendLambda implements Function2<Lifecycle.State, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3(Continuation<? super BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3 bangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3 = new BangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3(continuation);
        bangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3.L$0 = obj;
        return bangumiHomeFlowAnimationLayer$awaitAllowingToScroll$3;
    }

    public final Object invoke(Lifecycle.State state, Continuation<? super Boolean> continuation) {
        return create(state, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((Lifecycle.State) this.L$0) == Lifecycle.State.RESUMED);
    }
}
