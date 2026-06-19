package com.bilibili.pegasus.recommendlabel;

import com.bilibili.pegasus.recommendlabel.InterfaceC5755y;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/RecommendLabelStateHolder$managerLabel$2.class */
final class RecommendLabelStateHolder$managerLabel$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendLabelStateHolder$managerLabel$2(l0 l0Var, Continuation<? super RecommendLabelStateHolder$managerLabel$2> continuation) {
        super(2, continuation);
        this.this$0 = l0Var;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RecommendLabelStateHolder$managerLabel$2 recommendLabelStateHolder$managerLabel$2 = new RecommendLabelStateHolder$managerLabel$2(this.this$0, continuation);
        recommendLabelStateHolder$managerLabel$2.L$0 = obj;
        return recommendLabelStateHolder$managerLabel$2;
    }

    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return create(str, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            str = (String) this.L$0;
            MutableSharedFlow<InterfaceC5755y> mutableSharedFlow = this.this$0.f78758b;
            InterfaceC5755y.a aVar = new InterfaceC5755y.a("操作失败");
            this.L$0 = str;
            this.label = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str2;
        }
        q4.M.b("managerLabel error:", str, "RecommendLabelPage");
        return Unit.INSTANCE;
    }
}
