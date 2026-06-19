package com.bilibili.pegasus.components.interest.ui.v35.page;

import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseAge;
import com.bilibili.pegasus.data.interestchoose.InterestChooseGender;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35FirstTab$initRv$2$1.class */
final class InterestChooseV35FirstTab$initRv$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV35FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV35FirstTab$initRv$2$1(InterestChooseV35FirstTab interestChooseV35FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV35FirstTab$initRv$2$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV35FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV35FirstTab$initRv$2$1(this.this$0, this.$item, this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List<InterestChooseAge> listC;
        List<InterestChooseGender> listQ;
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
            InterestChooseGender interestChooseGender = (InterestChooseGender) obj2;
            if (!interestChooseGender.f77411g) {
                int iD = interestChoose.D();
                long jO = interestChoose.O();
                long id = interestChooseGender.getId();
                String strO = interestChoose.o();
                int i7 = interestChooseGender.f77410f;
                String title = interestChooseGender.getTitle();
                String strB = interestChoose.B();
                if (strB == null) {
                    strB = "";
                }
                com.bilibili.pegasus.components.interest.e.h(iD, i7 + 1, jO, id, strO, title, strB);
                InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
                if (interestChooseV35PageViewModel != null) {
                    MutableStateFlow<InterestChoose> mutableStateFlow = interestChooseV35PageViewModel.f76816a;
                    InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
                    if (interestChoose2 != null && (listQ = interestChoose2.q()) != null) {
                        InterestChoose interestChoose3 = (InterestChoose) mutableStateFlow.getValue();
                        InterestChoose interestChooseA = null;
                        if (interestChoose3 != null) {
                            List mutableList = CollectionsKt.toMutableList(listQ);
                            int i8 = 0;
                            for (Object obj3 : mutableList) {
                                if (i8 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                InterestChooseGender interestChooseGender2 = (InterestChooseGender) obj3;
                                mutableList.set(i8, InterestChooseGender.a(interestChooseGender2, null, 0, interestChooseGender2.f77410f == interestChooseGender.f77410f, 191));
                                i8++;
                            }
                            Unit unit = Unit.INSTANCE;
                            interestChooseA = InterestChoose.a(interestChoose3, null, mutableList, null, 536870847);
                        }
                        mutableStateFlow.setValue(interestChooseA);
                    }
                }
            }
        } else if (obj2 instanceof InterestChooseAge) {
            InterestChooseAge interestChooseAge = (InterestChooseAge) obj2;
            if (!interestChooseAge.f77403e) {
                int iD2 = interestChoose.D();
                long jO2 = interestChoose.O();
                long id2 = interestChooseAge.getId();
                String strB2 = interestChoose.b();
                int i9 = interestChooseAge.f77402d;
                String title2 = interestChooseAge.getTitle();
                String strB3 = interestChoose.B();
                if (strB3 == null) {
                    strB3 = "";
                }
                com.bilibili.pegasus.components.interest.e.h(iD2, i9 + 1, jO2, id2, strB2, title2, strB3);
                InterestChooseV35PageViewModel interestChooseV35PageViewModel2 = c.f76804a;
                if (interestChooseV35PageViewModel2 != null) {
                    MutableStateFlow<InterestChoose> mutableStateFlow2 = interestChooseV35PageViewModel2.f76816a;
                    InterestChoose interestChoose4 = (InterestChoose) mutableStateFlow2.getValue();
                    if (interestChoose4 != null && (listC = interestChoose4.c()) != null) {
                        InterestChoose interestChoose5 = (InterestChoose) mutableStateFlow2.getValue();
                        InterestChoose interestChooseA2 = null;
                        if (interestChoose5 != null) {
                            List mutableList2 = CollectionsKt.toMutableList(listC);
                            int i10 = 0;
                            for (Object obj4 : mutableList2) {
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                InterestChooseAge interestChooseAge2 = (InterestChooseAge) obj4;
                                mutableList2.set(i10, InterestChooseAge.a(interestChooseAge2, 0, interestChooseAge.f77402d == interestChooseAge2.f77402d, 47));
                                i10++;
                            }
                            Unit unit2 = Unit.INSTANCE;
                            interestChooseA2 = InterestChoose.a(interestChoose5, null, null, mutableList2, 536870783);
                        }
                        mutableStateFlow2.setValue(interestChooseA2);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
