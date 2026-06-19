package com.bilibili.pegasus.components.interest.ui.v35.page;

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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35FirstTab$initRv$3$1.class */
final class InterestChooseV35FirstTab$initRv$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV35FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV35FirstTab$initRv$3$1(InterestChooseV35FirstTab interestChooseV35FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV35FirstTab$initRv$3$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV35FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV35FirstTab$initRv$3$1(this.this$0, this.$item, this.$data, continuation);
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
        InterestChooseV35FirstTab interestChooseV35FirstTab = this.this$0;
        Object obj2 = this.$item;
        InterestChoose interestChoose = this.$data;
        interestChooseV35FirstTab.getClass();
        if (obj2 instanceof InterestChooseGender) {
            int iD = interestChoose.D();
            long jO = interestChoose.O();
            InterestChooseGender interestChooseGender = (InterestChooseGender) obj2;
            long id = interestChooseGender.getId();
            String strO = interestChoose.o();
            int i7 = interestChooseGender.f77410f;
            String title = interestChooseGender.getTitle();
            String strB = interestChoose.B();
            if (strB == null) {
                strB = "";
            }
            com.bilibili.pegasus.components.interest.e.j(iD, jO, id, strO, i7 + 1, title, strB, false, 128);
        } else if (obj2 instanceof InterestChooseAge) {
            int iD2 = interestChoose.D();
            long jO2 = interestChoose.O();
            InterestChooseAge interestChooseAge = (InterestChooseAge) obj2;
            long id2 = interestChooseAge.getId();
            String strB2 = interestChoose.b();
            int i8 = interestChooseAge.f77402d;
            String title2 = interestChooseAge.getTitle();
            String strB3 = interestChoose.B();
            if (strB3 == null) {
                strB3 = "";
            }
            com.bilibili.pegasus.components.interest.e.j(iD2, jO2, id2, strB2, i8 + 1, title2, strB3, false, 128);
        }
        return Unit.INSTANCE;
    }
}
