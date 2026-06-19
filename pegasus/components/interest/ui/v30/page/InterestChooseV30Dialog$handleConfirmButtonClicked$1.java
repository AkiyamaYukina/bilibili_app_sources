package com.bilibili.pegasus.components.interest.ui.v30.page;

import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import com.bilibili.pegasus.data.interestchoose.InterestChooseSubItem;
import com.bilibili.studio.material.util.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30Dialog$handleConfirmButtonClicked$1.class */
final class InterestChooseV30Dialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV30Dialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV30Dialog$handleConfirmButtonClicked$1(InterestChooseV30Dialog interestChooseV30Dialog, Continuation<? super InterestChooseV30Dialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV30Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV30Dialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<C7779b> flow;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        InterestChooseV30PageViewModel interestChooseV30PageViewModel;
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV30PageViewModel interestChooseV30PageViewModel2 = e.f76574a;
            if (interestChooseV30PageViewModel2 != null && (flow = interestChooseV30PageViewModel2.f76588j) != null) {
                this.label = 1;
                Object objFirst = FlowKt.first(flow, this);
                obj = objFirst;
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C7779b c7779b = (C7779b) obj;
        if (c7779b != null) {
            InterestChooseV30PageViewModel interestChooseV30PageViewModel3 = e.f76574a;
            if (interestChooseV30PageViewModel3 == null || (stateFlow = interestChooseV30PageViewModel3.f76581b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return Unit.INSTANCE;
            }
            boolean z6 = c7779b.f122928b;
            int i8 = c7779b.f122931e;
            if (z6) {
                InterestChooseV30Dialog interestChooseV30Dialog = this.this$0;
                int i9 = 0;
                interestChooseV30Dialog.f76562e = false;
                interestChooseV30Dialog.f76563f = true;
                List<InterestChooseItem> listU = interestChoose.u();
                if (listU != null) {
                    List<InterestChooseItem> list = listU;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (true) {
                        arrayList = arrayList2;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((InterestChooseItem) next).isSelected()) {
                            arrayList2.add(next);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    ArrayList arrayList3 = new ArrayList();
                    List<InterestChooseItem> listU2 = interestChoose.u();
                    if (listU2 != null) {
                        for (Object obj2 : listU2) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            if (((InterestChooseItem) obj2).isSelected()) {
                                arrayList3.add(Integer.valueOf(i10));
                            }
                            i9 = i10;
                        }
                    }
                    if (i8 == 0) {
                        com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList3), null, null, null, 0, null, null, null, null, null, null, null, 524256);
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        List<InterestChooseItem> listU3 = interestChoose.u();
                        if (listU3 != null) {
                            for (InterestChooseItem interestChooseItem : listU3) {
                                List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                                if (subItems != null) {
                                    List<InterestChooseSubItem> list2 = subItems;
                                    ArrayList<InterestChooseSubItem> arrayList7 = new ArrayList();
                                    for (Object obj3 : list2) {
                                        if (((InterestChooseSubItem) obj3).f77422g) {
                                            arrayList7.add(obj3);
                                        }
                                    }
                                    for (InterestChooseSubItem interestChooseSubItem : arrayList7) {
                                        arrayList4.add(Integer.valueOf(interestChooseSubItem.i()));
                                        String strJ = interestChooseSubItem.j();
                                        String str = strJ;
                                        if (strJ == null) {
                                            str = "";
                                        }
                                        arrayList5.add(str);
                                        arrayList6.add((interestChooseItem.getOriginPos() + 1) + UtilsKt.DOT + (interestChooseSubItem.f77423i + 1));
                                    }
                                }
                            }
                        }
                        com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList3), com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), arrayList4.size(), null, null, null, null, null, null, null, 523776);
                    }
                    interestChooseV30Dialog.kc(null);
                }
            } else if (i8 == 0 && c7779b.f122929c && (interestChooseV30PageViewModel = e.f76574a) != null) {
                interestChooseV30PageViewModel.f76586g.setValue(1);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
