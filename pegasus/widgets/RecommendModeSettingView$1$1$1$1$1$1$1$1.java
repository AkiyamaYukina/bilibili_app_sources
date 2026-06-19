package com.bilibili.pegasus.widgets;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/RecommendModeSettingView$1$1$1$1$1$1$1$1.class */
final class RecommendModeSettingView$1$1$1$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final RecommendModeSettingView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendModeSettingView$1$1$1$1$1$1$1$1(RecommendModeSettingView recommendModeSettingView, Continuation<? super RecommendModeSettingView$1$1$1$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = recommendModeSettingView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendModeSettingView$1$1$1$1$1$1$1$1(this.this$0, continuation);
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
        RecommendModeSettingView recommendModeSettingView = this.this$0;
        int i7 = RecommendModeSettingView.f79190e;
        recommendModeSettingView.d(false);
        return Unit.INSTANCE;
    }
}
