package com.bilibili.pegasus.components.interest.ui.v27.page;

import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27FirstTab$initRv$2$1.class */
final class InterestChooseV27FirstTab$initRv$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV27FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV27FirstTab$initRv$2$1(InterestChooseV27FirstTab interestChooseV27FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV27FirstTab$initRv$2$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV27FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV27FirstTab$initRv$2$1(this.this$0, this.$item, this.$data, continuation);
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
        InterestChooseV27FirstTab interestChooseV27FirstTab = this.this$0;
        Object obj2 = this.$item;
        InterestChoose interestChoose = this.$data;
        interestChooseV27FirstTab.getClass();
        if (obj2 instanceof InterestChooseGender) {
            InterestChooseGender interestChooseGender = (InterestChooseGender) obj2;
            if (!interestChooseGender.f77411g) {
                com.bilibili.pegasus.components.interest.e.h(interestChoose.D(), interestChooseGender.f77410f + 1, interestChoose.O(), interestChooseGender.getId(), interestChoose.o(), interestChooseGender.getTitle(), com.bilibili.pegasus.request.b.g() ? "1" : "2");
                InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
                if (interestChooseV27PageViewModel != null) {
                    interestChooseV27PageViewModel.d(interestChooseGender);
                }
            }
        } else if (obj2 instanceof InterestChooseAge) {
            InterestChooseAge interestChooseAge = (InterestChooseAge) obj2;
            if (!interestChooseAge.f77403e) {
                com.bilibili.pegasus.components.interest.e.h(interestChoose.D(), interestChooseAge.f77402d + 1, interestChoose.O(), interestChooseAge.getId(), interestChoose.b(), interestChooseAge.getTitle(), com.bilibili.pegasus.request.b.g() ? "1" : "2");
                InterestChooseV27PageViewModel interestChooseV27PageViewModel2 = c.f76482a;
                if (interestChooseV27PageViewModel2 != null) {
                    interestChooseV27PageViewModel2.c(interestChooseAge);
                }
            }
        } else if (obj2 instanceof InterestChooseItem) {
            InterestChooseItem interestChooseItem = (InterestChooseItem) obj2;
            if (interestChooseItem.getSubType() != InterestChooseSubType.RANDOM.getValue()) {
                int iD = interestChoose.D();
                long jO = interestChoose.O();
                long id = interestChooseItem.getId();
                String name = interestChooseItem.getName();
                String str = name;
                if (name == null) {
                    str = "";
                }
                com.bilibili.pegasus.components.interest.e.k(iD, jO, id, str, interestChooseItem.getOriginPos() + 1, null, 0, 0, !interestChooseItem.isSelected(), null, 1760);
            }
            InterestChooseV27PageViewModel interestChooseV27PageViewModel3 = c.f76482a;
            if (interestChooseV27PageViewModel3 != null) {
                interestChooseV27PageViewModel3.e(interestChooseItem);
            }
        }
        return Unit.INSTANCE;
    }
}
