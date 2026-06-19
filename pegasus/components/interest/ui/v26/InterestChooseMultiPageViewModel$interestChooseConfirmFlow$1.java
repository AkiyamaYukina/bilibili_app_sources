package com.bilibili.pegasus.components.interest.ui.v26;

import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubSection;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1.class */
public final class InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1 extends SuspendLambda implements Function3<List<? extends InterestChooseItem>, kp0.g, Continuation<? super C7779b>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final InterestChooseMultiPageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1(InterestChooseMultiPageViewModel interestChooseMultiPageViewModel, Continuation<? super InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1> continuation) {
        super(3, continuation);
        this.this$0 = interestChooseMultiPageViewModel;
    }

    public final Object invoke(List<InterestChooseItem> list, kp0.g gVar, Continuation<? super C7779b> continuation) {
        InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1 interestChooseMultiPageViewModel$interestChooseConfirmFlow$1 = new InterestChooseMultiPageViewModel$interestChooseConfirmFlow$1(this.this$0, continuation);
        interestChooseMultiPageViewModel$interestChooseConfirmFlow$1.L$0 = list;
        interestChooseMultiPageViewModel$interestChooseConfirmFlow$1.L$1 = gVar;
        return interestChooseMultiPageViewModel$interestChooseConfirmFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z6;
        boolean z7;
        InterestChooseItem interestChooseItem;
        InterestChooseItem interestChooseItem2;
        List<InterestChooseSubSection> subSections;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) this.L$0;
        kp0.g gVar = (kp0.g) this.L$1;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (((InterestChooseItem) obj2).isSelected()) {
                arrayList.add(obj2);
            }
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z6 = false;
        } else {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((InterestChooseItem) it.next()).getSubType() == InterestChooseSubType.RANDOM.getValue()) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
        }
        int size = arrayList.size();
        InterestChooseItem interestChooseItem3 = gVar.f122943b;
        if (interestChooseItem3 == null || (subSections = interestChooseItem3.getSubSections()) == null) {
            z7 = false;
            break;
        }
        List<InterestChooseSubSection> list3 = subSections;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it2 = list3.iterator();
            loop1: while (it2.hasNext()) {
                List<InterestChooseSubItem> subItems = ((InterestChooseSubSection) it2.next()).getSubItems();
                if (subItems != null) {
                    List<InterestChooseSubItem> list4 = subItems;
                    if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                        Iterator<T> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            if (((InterestChooseSubItem) it3.next()).f77422g) {
                                break;
                            }
                        }
                    }
                }
                z7 = false;
            }
        }
        z7 = true;
        int i7 = gVar.f122942a;
        boolean z8 = (i7 == 0 && (z6 || size > 0)) || (i7 == 1 && z7);
        String confirmText = null;
        if (i7 != 0) {
            InterestChooseItem interestChooseItem4 = gVar.f122943b;
            if (interestChooseItem4 != null) {
                confirmText = interestChooseItem4.getConfirmText();
            }
        } else if (size == 1 && (interestChooseItem2 = (InterestChooseItem) arrayList.get(0)) != null && (interestChooseItem2.getSubType() == InterestChooseSubType.BUBBLE.getValue() || interestChooseItem2.getSubType() == InterestChooseSubType.OPTION.getValue())) {
            InterestChoose interestChoose = (InterestChoose) this.this$0.f76435a.getValue();
            if (interestChoose != null) {
                confirmText = interestChoose.j();
            }
        } else {
            InterestChoose interestChoose2 = (InterestChoose) this.this$0.f76435a.getValue();
            if (interestChoose2 != null) {
                confirmText = interestChoose2.i();
            }
        }
        return new C7779b(gVar.f122942a, confirmText, (size == 0 && z6) ? false : true, z8 && ((i7 == 0 && (size > 1 || (size == 1 && ((interestChooseItem = (InterestChooseItem) arrayList.get(0)) == null || !(interestChooseItem.getSubType() == InterestChooseSubType.BUBBLE.getValue() || interestChooseItem.getSubType() == InterestChooseSubType.OPTION.getValue()))))) || (i7 == 1 && z7)), z8);
    }
}
