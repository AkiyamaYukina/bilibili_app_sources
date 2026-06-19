package com.bilibili.pegasus.components.interest.ui.v35.vm;

import To0.a;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubType;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/vm/InterestChooseV35PageViewModel$secondPageItemFlow$1.class */
public final class InterestChooseV35PageViewModel$secondPageItemFlow$1 extends SuspendLambda implements Function3<Integer, List<? extends InterestChooseItem>, Continuation<? super a>, Object> {
    int I$0;
    Object L$0;
    int label;

    public InterestChooseV35PageViewModel$secondPageItemFlow$1(Continuation<? super InterestChooseV35PageViewModel$secondPageItemFlow$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(int i7, List<InterestChooseItem> list, Continuation<? super a> continuation) {
        InterestChooseV35PageViewModel$secondPageItemFlow$1 interestChooseV35PageViewModel$secondPageItemFlow$1 = new InterestChooseV35PageViewModel$secondPageItemFlow$1(continuation);
        interestChooseV35PageViewModel$secondPageItemFlow$1.I$0 = i7;
        interestChooseV35PageViewModel$secondPageItemFlow$1.L$0 = list;
        return interestChooseV35PageViewModel$secondPageItemFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (List<InterestChooseItem>) obj2, (Continuation<? super a>) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = this.I$0;
        List list = (List) this.L$0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            InterestChooseItem interestChooseItem = (InterestChooseItem) obj2;
            if (interestChooseItem.isSelected() && interestChooseItem.getSubType() != InterestChooseSubType.RANDOM.getValue()) {
                arrayList.add(obj2);
            }
        }
        return new a(i7, arrayList);
    }
}
