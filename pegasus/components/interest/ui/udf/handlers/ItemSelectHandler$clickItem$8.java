package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/ItemSelectHandler$clickItem$8.class */
final class ItemSelectHandler$clickItem$8 extends SuspendLambda implements Function2<FlowCollector<? super Actions>, Continuation<? super Unit>, Object> {
    final Fo0.j $item;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSelectHandler$clickItem$8(Fo0.j jVar, Continuation<? super ItemSelectHandler$clickItem$8> continuation) {
        super(2, continuation);
        this.$item = jVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ItemSelectHandler$clickItem$8 itemSelectHandler$clickItem$8 = new ItemSelectHandler$clickItem$8(this.$item, continuation);
        itemSelectHandler$clickItem$8.L$0 = obj;
        return itemSelectHandler$clickItem$8;
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
            Actions.ReportActions.b bVar = new Actions.ReportActions.b(this.$item, Actions.ReportActions.Type.Click);
            this.label = 1;
            if (flowCollector.emit(bVar, this) == coroutine_suspended) {
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
