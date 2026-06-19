package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseSubItemUi;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/ItemSelectHandler$clickSubItem$4.class */
final class ItemSelectHandler$clickSubItem$4 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    final Actions.a.d $action;
    final InterestChooseSubItemUi $subItem;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSelectHandler$clickSubItem$4(Actions.a.d dVar, InterestChooseSubItemUi interestChooseSubItemUi, Continuation<? super ItemSelectHandler$clickSubItem$4> continuation) {
        super(2, continuation);
        this.$action = dVar;
        this.$subItem = interestChooseSubItemUi;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ItemSelectHandler$clickSubItem$4 itemSelectHandler$clickSubItem$4 = new ItemSelectHandler$clickSubItem$4(this.$action, this.$subItem, continuation);
        itemSelectHandler$clickSubItem$4.L$0 = obj;
        return itemSelectHandler$clickSubItem$4;
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
            Actions.ReportActions.d dVar = new Actions.ReportActions.d(this.$action.f76416a, this.$subItem, Actions.ReportActions.Type.Click);
            this.label = 1;
            if (flowCollector.emit(dVar, this) == coroutine_suspended) {
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
