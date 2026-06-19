package com.bilibili.pegasus.components.interest.ui.vm;

import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kp0.C7780c;
import kp0.C7781d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/vm/InterestChooseViewModel$interestChooseConfirmFlow$1.class */
public final class InterestChooseViewModel$interestChooseConfirmFlow$1 extends SuspendLambda implements Function4<List<? extends InterestChooseItem>, InterestChooseGender, InterestChooseAge, Continuation<? super Boolean>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final InterestChooseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseViewModel$interestChooseConfirmFlow$1(InterestChooseViewModel interestChooseViewModel, Continuation<? super InterestChooseViewModel$interestChooseConfirmFlow$1> continuation) {
        super(4, continuation);
        this.this$0 = interestChooseViewModel;
    }

    public final Object invoke(List<InterestChooseItem> list, InterestChooseGender interestChooseGender, InterestChooseAge interestChooseAge, Continuation<? super Boolean> continuation) {
        InterestChooseViewModel$interestChooseConfirmFlow$1 interestChooseViewModel$interestChooseConfirmFlow$1 = new InterestChooseViewModel$interestChooseConfirmFlow$1(this.this$0, continuation);
        interestChooseViewModel$interestChooseConfirmFlow$1.L$0 = list;
        interestChooseViewModel$interestChooseConfirmFlow$1.L$1 = interestChooseGender;
        interestChooseViewModel$interestChooseConfirmFlow$1.L$2 = interestChooseAge;
        return interestChooseViewModel$interestChooseConfirmFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean((C7780c.b((List) this.L$0).isEmpty() || (C7781d.f((InterestChoose) this.this$0.f76970a.getValue()) && ((InterestChooseAge) this.L$2) == null) || (C7781d.h((InterestChoose) this.this$0.f76970a.getValue()) && ((InterestChooseGender) this.L$1) == null)) ? false : true);
    }
}
