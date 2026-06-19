package com.bilibili.pegasus.components.interest.ui.udf.handlers;

import Do0.a;
import android.content.Context;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/handlers/ItemSelectHandler$clickItem$3.class */
final class ItemSelectHandler$clickItem$3 extends SuspendLambda implements Function2<FlowCollector<? super Do0.a>, Continuation<? super Unit>, Object> {
    final int $normalItemLimit;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemSelectHandler$clickItem$3(int i7, Continuation<? super ItemSelectHandler$clickItem$3> continuation) {
        super(2, continuation);
        this.$normalItemLimit = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0(int i7, Context context) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(context.getResources().getQuantityString(2131689723, i7), Arrays.copyOf(new Object[]{String.valueOf(i7)}, 1));
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ItemSelectHandler$clickItem$3 itemSelectHandler$clickItem$3 = new ItemSelectHandler$clickItem$3(this.$normalItemLimit, continuation);
        itemSelectHandler$clickItem$3.L$0 = obj;
        return itemSelectHandler$clickItem$3;
    }

    public final Object invoke(FlowCollector<? super Do0.a> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            a.b bVar = new a.b(new f(this.$normalItemLimit));
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
