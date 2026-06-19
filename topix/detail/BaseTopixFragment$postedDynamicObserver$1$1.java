package com.bilibili.topix.detail;

import PD0.C2765g;
import com.bilibili.topix.widget.TopixSwipeRefreshLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import yi.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/detail/BaseTopixFragment$postedDynamicObserver$1$1.class */
public final class BaseTopixFragment$postedDynamicObserver$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BaseTopixFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTopixFragment$postedDynamicObserver$1$1(BaseTopixFragment baseTopixFragment, Continuation<? super BaseTopixFragment$postedDynamicObserver$1$1> continuation) {
        super(2, continuation);
        this.this$0 = baseTopixFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTopixFragment$postedDynamicObserver$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        TopixSwipeRefreshLayout topixSwipeRefreshLayout;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C2765g c2765g = this.this$0.f112613b;
        if (c2765g != null && (topixSwipeRefreshLayout = c2765g.f18741j) != null) {
            topixSwipeRefreshLayout.setRefreshing(true);
        }
        BaseTopixFragment baseTopixFragment = this.this$0;
        a0 a0Var = baseTopixFragment.f112617f;
        if (a0Var != null) {
            c cVarA = a0Var.a(baseTopixFragment.vf());
            if (cVarA != null) {
                if (!(cVarA instanceof c)) {
                    cVarA = null;
                }
                c cVar = cVarA;
                if (cVar != null) {
                    cVar.d();
                }
            }
        }
        this.this$0.Ef(false);
        return Unit.INSTANCE;
    }
}
