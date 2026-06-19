package com.bilibili.pegasus.components.interest.ui.v26;

import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubType;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageViewModel$secondPageItemFlow$1.class */
public final class InterestChooseMultiPageViewModel$secondPageItemFlow$1 extends SuspendLambda implements Function3<Integer, List<? extends InterestChooseItem>, Continuation<? super kp0.g>, Object> {
    int I$0;
    Object L$0;
    int label;

    public InterestChooseMultiPageViewModel$secondPageItemFlow$1(Continuation<? super InterestChooseMultiPageViewModel$secondPageItemFlow$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(int i7, List<InterestChooseItem> list, Continuation<? super kp0.g> continuation) {
        InterestChooseMultiPageViewModel$secondPageItemFlow$1 interestChooseMultiPageViewModel$secondPageItemFlow$1 = new InterestChooseMultiPageViewModel$secondPageItemFlow$1(continuation);
        interestChooseMultiPageViewModel$secondPageItemFlow$1.I$0 = i7;
        interestChooseMultiPageViewModel$secondPageItemFlow$1.L$0 = list;
        return interestChooseMultiPageViewModel$secondPageItemFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (List<InterestChooseItem>) obj2, (Continuation<? super kp0.g>) obj3);
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
        return new kp0.g(i7, arrayList.isEmpty() ? null : (InterestChooseItem) CollectionsKt.first(arrayList));
    }
}
