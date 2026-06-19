package com.bilibili.pegasus.components.interest.ui.v33.page;

import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33FirstTab$initRv$3$1.class */
final class InterestChooseV33FirstTab$initRv$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV33FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV33FirstTab$initRv$3$1(InterestChooseV33FirstTab interestChooseV33FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV33FirstTab$initRv$3$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV33FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV33FirstTab$initRv$3$1(this.this$0, this.$item, this.$data, continuation);
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
        InterestChooseV33FirstTab interestChooseV33FirstTab = this.this$0;
        Object obj2 = this.$item;
        InterestChoose interestChoose = this.$data;
        interestChooseV33FirstTab.getClass();
        if (obj2 instanceof InterestChooseGender) {
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            InterestChooseGender interestChooseGender = (InterestChooseGender) obj2;
            com.bilibili.pegasus.components.interest.e.j(iD, jO, interestChooseGender.getId(), interestChoose.o(), interestChooseGender.f77410f + 1, interestChooseGender.getTitle(), null, false, 192);
        } else if (obj2 instanceof InterestChooseAge) {
            int iD2 = interestChoose.D();
            long jO2 = interestChoose.O();
            InterestChooseAge interestChooseAge = (InterestChooseAge) obj2;
            com.bilibili.pegasus.components.interest.e.j(iD2, jO2, interestChooseAge.getId(), interestChoose.b(), interestChooseAge.f77402d + 1, interestChooseAge.getTitle(), null, false, 192);
        }
        return Unit.INSTANCE;
    }
}
