package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/ItemSelectHandler$clickAge$2.class */
final class ItemSelectHandler$clickAge$2 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    final Actions.a.C0490a $action;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSelectHandler$clickAge$2(Actions.a.C0490a c0490a, Continuation<? super ItemSelectHandler$clickAge$2> continuation) {
        super(2, continuation);
        this.$action = c0490a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ItemSelectHandler$clickAge$2 itemSelectHandler$clickAge$2 = new ItemSelectHandler$clickAge$2(this.$action, continuation);
        itemSelectHandler$clickAge$2.L$0 = obj;
        return itemSelectHandler$clickAge$2;
    }

    public final Object invoke(FlowCollector<? super Actions> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Actions.ReportActions.a aVar = new Actions.ReportActions.a("main.interest-select.extra-btn.0.click", this.$action.f76413a);
            this.label = 1;
            if (flowCollector.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
