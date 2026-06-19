package com.bilibili.pegasus.components.interest.ui.v34.page;

import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34FirstTab$initRv$2$1.class */
final class InterestChooseV34FirstTab$initRv$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterestChoose $data;
    final Object $item;
    int label;
    final InterestChooseV34FirstTab this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV34FirstTab$initRv$2$1(InterestChooseV34FirstTab interestChooseV34FirstTab, Object obj, InterestChoose interestChoose, Continuation<? super InterestChooseV34FirstTab$initRv$2$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV34FirstTab;
        this.$item = obj;
        this.$data = interestChoose;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV34FirstTab$initRv$2$1(this.this$0, this.$item, this.$data, continuation);
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
        InterestChooseV34FirstTab interestChooseV34FirstTab = this.this$0;
        Object obj2 = this.$item;
        InterestChoose interestChoose = this.$data;
        interestChooseV34FirstTab.getClass();
        InterestChoose interestChooseA = null;
        if (obj2 instanceof InterestChooseGender) {
            InterestChooseGender interestChooseGender = (InterestChooseGender) obj2;
            if (!interestChooseGender.f77411g) {
                com.bilibili.pegasus.components.interest.e.h(interestChoose.D(), interestChooseGender.f77410f + 1, interestChoose.O(), interestChooseGender.getId(), interestChoose.o(), interestChooseGender.getTitle(), com.bilibili.pegasus.request.b.g() ? "1" : "2");
                InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
                if (interestChooseV34PageViewModel != null) {
                    MutableStateFlow<InterestChoose> mutableStateFlow = interestChooseV34PageViewModel.f76782c;
                    InterestChoose interestChoose2 = (InterestChoose) mutableStateFlow.getValue();
                    if (interestChoose2 != null && (listQ = interestChoose2.q()) != null) {
                        InterestChoose interestChoose3 = (InterestChoose) mutableStateFlow.getValue();
                        if (interestChoose3 != null) {
                            List mutableList = CollectionsKt.toMutableList(listQ);
                            int i7 = 0;
                            for (Object obj3 : mutableList) {
                                if (i7 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                InterestChooseGender interestChooseGender2 = (InterestChooseGender) obj3;
                                mutableList.set(i7, InterestChooseGender.a(interestChooseGender2, null, 0, interestChooseGender2.f77410f == interestChooseGender.f77410f, 191));
                                i7++;
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
                com.bilibili.pegasus.components.interest.e.h(interestChoose.D(), interestChooseAge.f77402d + 1, interestChoose.O(), interestChooseAge.getId(), interestChoose.b(), interestChooseAge.getTitle(), com.bilibili.pegasus.request.b.g() ? "1" : "2");
                InterestChooseV34PageViewModel interestChooseV34PageViewModel2 = e.f76773a;
                if (interestChooseV34PageViewModel2 != null) {
                    MutableStateFlow<InterestChoose> mutableStateFlow2 = interestChooseV34PageViewModel2.f76782c;
                    InterestChoose interestChoose4 = (InterestChoose) mutableStateFlow2.getValue();
                    if (interestChoose4 != null && (listC = interestChoose4.c()) != null) {
                        InterestChoose interestChoose5 = (InterestChoose) mutableStateFlow2.getValue();
                        InterestChoose interestChooseA2 = null;
                        if (interestChoose5 != null) {
                            List mutableList2 = CollectionsKt.toMutableList(listC);
                            int i8 = 0;
                            for (Object obj4 : mutableList2) {
                                if (i8 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                InterestChooseAge interestChooseAge2 = (InterestChooseAge) obj4;
                                mutableList2.set(i8, InterestChooseAge.a(interestChooseAge2, 0, interestChooseAge.f77402d == interestChooseAge2.f77402d, 47));
                                i8++;
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
