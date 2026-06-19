package com.bilibili.pegasus.components.interest.ui.v30.page;

import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30FirstTab$initRv$3$1.class */
final class InterestChooseV30FirstTab$initRv$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV30FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV30FirstTab$initRv$3$1(InterestChooseV30FirstTab interestChooseV30FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV30FirstTab$initRv$3$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV30FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV30FirstTab$initRv$3$1(this.this$0, this.$item, this.$data, continuation);
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
        InterestChooseV30FirstTab interestChooseV30FirstTab = this.this$0;
        Object obj2 = this.$item;
        InterestChoose interestChoose = this.$data;
        interestChooseV30FirstTab.getClass();
        if (obj2 instanceof InterestChooseItem) {
            InterestChooseItem interestChooseItem = (InterestChooseItem) obj2;
            com.bilibili.pegasus.components.interest.e.l(interestChooseItem, interestChooseItem.getOriginPos() + 1, null, 0, 0, interestChoose.D(), interestChoose.O(), null, false, 412);
        }
        return Unit.INSTANCE;
    }
}
