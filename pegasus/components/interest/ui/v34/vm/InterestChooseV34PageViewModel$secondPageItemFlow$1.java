package com.bilibili.pegasus.components.interest.ui.v34.vm;

import Ro0.a;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/vm/InterestChooseV34PageViewModel$secondPageItemFlow$1.class */
public final class InterestChooseV34PageViewModel$secondPageItemFlow$1 extends SuspendLambda implements Function3<Integer, List<? extends InterestChooseItem>, Continuation<? super a>, Object> {
    int I$0;
    Object L$0;
    int label;

    public InterestChooseV34PageViewModel$secondPageItemFlow$1(Continuation<? super InterestChooseV34PageViewModel$secondPageItemFlow$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(int i7, List<InterestChooseItem> list, Continuation<? super a> continuation) {
        InterestChooseV34PageViewModel$secondPageItemFlow$1 interestChooseV34PageViewModel$secondPageItemFlow$1 = new InterestChooseV34PageViewModel$secondPageItemFlow$1(continuation);
        interestChooseV34PageViewModel$secondPageItemFlow$1.I$0 = i7;
        interestChooseV34PageViewModel$secondPageItemFlow$1.L$0 = list;
        return interestChooseV34PageViewModel$secondPageItemFlow$1.invokeSuspend(Unit.INSTANCE);
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
        List<InterestChooseItem> list = (List) this.L$0;
        ArrayList arrayList = new ArrayList();
        for (InterestChooseItem interestChooseItem : list) {
            List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
            InterestChooseItem interestChooseItemCopy$default = null;
            if (subItems != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : subItems) {
                    if (((InterestChooseSubItem) obj2).f77422g) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                interestChooseItemCopy$default = null;
                if (arrayList2 != null) {
                    interestChooseItemCopy$default = InterestChooseItem.copy$default(interestChooseItem, 0L, null, null, null, null, 0, null, null, arrayList2, 0, 0, false, 0, false, 0, 32511, null);
                }
            }
            if (interestChooseItemCopy$default != null) {
                arrayList.add(interestChooseItemCopy$default);
            }
        }
        return new a(i7, arrayList);
    }
}
