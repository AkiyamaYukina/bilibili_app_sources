package com.bilibili.pegasus.components.interest.ui.v38.page;

import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$handleConfirmButtonClicked$1.class */
final class InterestChooseV38Dialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV38Dialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV38Dialog$handleConfirmButtonClicked$1(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super InterestChooseV38Dialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV38Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV38Dialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<C7779b> flow;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        ArrayList arrayList;
        Iterator it;
        String str;
        StateFlow<InterestChoose> stateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
            if (interestChooseV38PageViewModel != null && (flow = interestChooseV38PageViewModel.f76960q) != null) {
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
            InterestChooseV38PageViewModel interestChooseV38PageViewModel2 = d.f76936a;
            if (interestChooseV38PageViewModel2 == null || (stateFlow = interestChooseV38PageViewModel2.f76946b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return Unit.INSTANCE;
            }
            InterestChooseV38PageViewModel interestChooseV38PageViewModel3 = d.f76936a;
            InterestChoose interestChoose2 = (interestChooseV38PageViewModel3 == null || (stateFlow2 = interestChooseV38PageViewModel3.f76946b) == null) ? null : (InterestChoose) stateFlow2.getValue();
            boolean z6 = c7779b.f122928b;
            int i8 = 0;
            int i9 = 0;
            int i10 = c7779b.f122931e;
            if (z6) {
                if (interestChoose2 != null) {
                    InterestChooseV38Dialog interestChooseV38Dialog = this.this$0;
                    interestChooseV38Dialog.f76385d = true;
                    List<InterestChooseItem> listU = interestChoose2.u();
                    if (listU != null) {
                        List<InterestChooseItem> list = listU;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = list.iterator();
                        while (true) {
                            arrayList = arrayList2;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (((InterestChooseItem) next).isSelected()) {
                                arrayList2.add(next);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    ArrayList arrayList3 = (arrayList == null || arrayList.isEmpty()) ? null : arrayList;
                    if (arrayList3 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        List<InterestChooseItem> listU2 = interestChoose2.u();
                        if (listU2 != null) {
                            Iterator<T> it3 = listU2.iterator();
                            while (true) {
                                int i11 = i9;
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                i9 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((InterestChooseItem) next2).isSelected()) {
                                    arrayList4.add(Integer.valueOf(i9));
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        List<InterestChooseItem> listU3 = interestChoose2.u();
                        if (listU3 != null) {
                            for (InterestChooseItem interestChooseItem : listU3) {
                                if (interestChooseItem.getDefaultSelected() == 1) {
                                    arrayList5.add(Long.valueOf(interestChooseItem.getId()));
                                    String name = interestChooseItem.getName();
                                    String str2 = name;
                                    if (name == null) {
                                        str2 = "";
                                    }
                                    arrayList6.add(str2);
                                }
                                List<InterestChooseSubItem> subItems = interestChooseItem.getSubItems();
                                if (subItems != null) {
                                    List<InterestChooseSubItem> list2 = subItems;
                                    ArrayList<InterestChooseSubItem> arrayList9 = new ArrayList();
                                    for (Object obj2 : list2) {
                                        if (((InterestChooseSubItem) obj2).b() == 1) {
                                            arrayList9.add(obj2);
                                        }
                                    }
                                    for (InterestChooseSubItem interestChooseSubItem : arrayList9) {
                                        arrayList7.add(Integer.valueOf(interestChooseSubItem.i()));
                                        String strJ = interestChooseSubItem.j();
                                        String str3 = strJ;
                                        if (strJ == null) {
                                            str3 = "";
                                        }
                                        arrayList8.add(str3);
                                    }
                                }
                            }
                        }
                        if (i10 == 0) {
                            com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList3, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList4), null, null, null, 0, null, interestChoose.B(), null, com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), com.bilibili.pegasus.components.interest.d.a(arrayList7), com.bilibili.pegasus.components.interest.d.a(arrayList8), 400352);
                        } else {
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            List<InterestChooseItem> listU4 = interestChoose2.u();
                            if (listU4 != null) {
                                Iterator it4 = listU4.iterator();
                                String str4 = "";
                                while (it4.hasNext()) {
                                    InterestChooseItem interestChooseItem2 = (InterestChooseItem) it4.next();
                                    List<InterestChooseSubItem> subItems2 = interestChooseItem2.getSubItems();
                                    if (subItems2 != null) {
                                        List<InterestChooseSubItem> list3 = subItems2;
                                        ArrayList arrayList13 = new ArrayList();
                                        for (Object obj3 : list3) {
                                            if (((InterestChooseSubItem) obj3).f77422g) {
                                                arrayList13.add(obj3);
                                            }
                                        }
                                        Iterator it5 = it4;
                                        Iterator it6 = arrayList13.iterator();
                                        while (true) {
                                            it = it5;
                                            str = str4;
                                            if (it6.hasNext()) {
                                                InterestChooseSubItem interestChooseSubItem2 = (InterestChooseSubItem) it6.next();
                                                arrayList10.add(Integer.valueOf(interestChooseSubItem2.i()));
                                                String strJ2 = interestChooseSubItem2.j();
                                                String str5 = strJ2;
                                                if (strJ2 == null) {
                                                    str5 = str4;
                                                }
                                                arrayList11.add(str5);
                                                arrayList12.add((interestChooseItem2.getOriginPos() + 1) + UtilsKt.DOT + (interestChooseSubItem2.f77423i + 1));
                                            }
                                        }
                                    } else {
                                        it = it4;
                                        str = str4;
                                    }
                                    str4 = str;
                                    it4 = it;
                                }
                            }
                            com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), arrayList3, com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.components.interest.d.a(arrayList4), com.bilibili.pegasus.components.interest.d.a(arrayList10), com.bilibili.pegasus.components.interest.d.a(arrayList11), com.bilibili.pegasus.components.interest.d.a(arrayList12), arrayList10.size(), null, interestChoose.B(), null, com.bilibili.pegasus.components.interest.d.a(arrayList5), com.bilibili.pegasus.components.interest.d.a(arrayList6), com.bilibili.pegasus.components.interest.d.a(arrayList7), com.bilibili.pegasus.components.interest.d.a(arrayList8), 399872);
                        }
                        interestChooseV38Dialog.kc(null);
                    }
                }
            } else if (i10 == 0 && c7779b.f122929c) {
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                List<InterestChooseItem> listU5 = interestChoose.u();
                if (listU5 != null) {
                    for (Object obj4 : listU5) {
                        int i12 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        InterestChooseItem interestChooseItem3 = (InterestChooseItem) obj4;
                        if (interestChooseItem3.isSelected()) {
                            arrayList14.add(Boxing.boxLong(interestChooseItem3.getId()));
                            String name2 = interestChooseItem3.getName();
                            String str6 = name2;
                            if (name2 == null) {
                                str6 = "";
                            }
                            arrayList15.add(str6);
                            arrayList16.add(Boxing.boxInt(i12));
                        }
                        i8 = i12;
                    }
                }
                com.bilibili.pegasus.components.interest.e.v(1, interestChoose.D(), interestChoose.O(), com.bilibili.pegasus.components.interest.d.a(arrayList14), com.bilibili.pegasus.components.interest.d.a(arrayList15), com.bilibili.pegasus.components.interest.d.a(arrayList16), arrayList14.size(), com.bilibili.pegasus.components.interest.d.c(interestChoose), interestChoose.B());
                InterestChooseV38PageViewModel interestChooseV38PageViewModel4 = d.f76936a;
                if (interestChooseV38PageViewModel4 != null) {
                    interestChooseV38PageViewModel4.a(1);
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
