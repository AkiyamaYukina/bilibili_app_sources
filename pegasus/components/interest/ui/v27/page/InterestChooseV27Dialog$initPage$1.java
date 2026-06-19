package com.bilibili.pegasus.components.interest.ui.v27.page;

import aq0.C4872l0;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog$initPage$1.class */
final class InterestChooseV27Dialog$initPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV27Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v27.page.InterestChooseV27Dialog$initPage$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v27/page/InterestChooseV27Dialog$initPage$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Ho0.b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV27Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV27Dialog interestChooseV27Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV27Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Ho0.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<InterestChoose> stateFlow;
            InterestChoose interestChoose;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ho0.b bVar = (Ho0.b) this.L$0;
            C4872l0 c4872l0 = this.this$0.h;
            if (c4872l0 == null || c4872l0.f54087d.getCurrentItem() != bVar.f8736a) {
                C4872l0 c4872l02 = this.this$0.h;
                if (c4872l02 != null) {
                    c4872l02.f54087d.setCurrentItem(bVar.f8736a);
                }
                if (!bVar.f8737b.isEmpty()) {
                    InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
                    if (interestChooseV27PageViewModel == null || (stateFlow = interestChooseV27PageViewModel.f76495b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                        return Unit.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    List<InterestChooseItem> listU = interestChoose.u();
                    if (listU != null) {
                        Iterator<T> it = listU.iterator();
                        int i7 = 0;
                        while (true) {
                            int i8 = i7;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            InterestChooseItem interestChooseItem = (InterestChooseItem) next;
                            if (interestChooseItem.isSelected()) {
                                arrayList.add(Boxing.boxLong(interestChooseItem.getId()));
                                String name = interestChooseItem.getName();
                                String str = name;
                                if (name == null) {
                                    str = "";
                                }
                                arrayList2.add(str);
                                arrayList3.add(Boxing.boxInt(i9));
                            }
                            i7 = i9;
                        }
                    }
                    com.bilibili.pegasus.components.interest.e.v(bVar.f8736a == 0 ? 2 : 1, interestChoose.D(), interestChoose.O(), com.bilibili.pegasus.components.interest.d.a(arrayList), com.bilibili.pegasus.components.interest.d.a(arrayList2), com.bilibili.pegasus.components.interest.d.a(arrayList3), arrayList.size(), com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.request.b.g() ? "1" : "2");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV27Dialog$initPage$1(InterestChooseV27Dialog interestChooseV27Dialog, Continuation<? super InterestChooseV27Dialog$initPage$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV27Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV27Dialog$initPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<Ho0.b> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV27PageViewModel interestChooseV27PageViewModel = c.f76482a;
            if (interestChooseV27PageViewModel != null && (flow = interestChooseV27PageViewModel.f76505m) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
