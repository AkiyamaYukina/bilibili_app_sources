package com.bilibili.pegasus.components.interest.ui.v36.page;

import aq0.C4828E;
import com.bilibili.pegasus.components.interest.ui.v36.vm.InterestChooseV36PageViewModel;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog$initPage$1.class */
final class InterestChooseV36Dialog$initPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV36Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v36.page.InterestChooseV36Dialog$initPage$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v36/page/InterestChooseV36Dialog$initPage$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Vo0.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV36Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV36Dialog interestChooseV36Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV36Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Vo0.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<InterestChoose> stateFlow;
            InterestChoose interestChoose;
            List<InterestChooseItem> listU;
            StateFlow<InterestChoose> stateFlow2;
            C4828E c4828e;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Vo0.a aVar = (Vo0.a) this.L$0;
            C4828E c4828e2 = this.this$0.h;
            if (c4828e2 == null || c4828e2.f53693c.getCurrentItem() != aVar.f25632a) {
                int i7 = aVar.f25632a;
                int i8 = (i7 == 0 || (i7 == 1 && ((c4828e = this.this$0.h) == null || c4828e.f53693c.getCurrentItem() != 0))) ? 2 : 1;
                C4828E c4828e3 = this.this$0.h;
                if (c4828e3 != null) {
                    c4828e3.f53693c.setCurrentItem(aVar.f25632a);
                }
                InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
                if (interestChooseV36PageViewModel == null || (stateFlow = interestChooseV36PageViewModel.f76856b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                    return Unit.INSTANCE;
                }
                InterestChooseV36PageViewModel interestChooseV36PageViewModel2 = c.f76850a;
                InterestChoose interestChoose2 = (interestChooseV36PageViewModel2 == null || (stateFlow2 = interestChooseV36PageViewModel2.f76856b) == null) ? null : (InterestChoose) stateFlow2.getValue();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (interestChoose2 != null && (listU = interestChoose2.u()) != null) {
                    Iterator<T> it = listU.iterator();
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
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
                            arrayList3.add(Boxing.boxInt(i11));
                        }
                        i9 = i11;
                    }
                }
                com.bilibili.pegasus.components.interest.e.v(i8, interestChoose.D(), interestChoose.O(), com.bilibili.pegasus.components.interest.d.a(arrayList), com.bilibili.pegasus.components.interest.d.a(arrayList2), com.bilibili.pegasus.components.interest.d.a(arrayList3), arrayList.size(), com.bilibili.pegasus.components.interest.d.c(interestChoose), interestChoose.B());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV36Dialog$initPage$1(InterestChooseV36Dialog interestChooseV36Dialog, Continuation<? super InterestChooseV36Dialog$initPage$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV36Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV36Dialog$initPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<Vo0.a> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV36PageViewModel interestChooseV36PageViewModel = c.f76850a;
            if (interestChooseV36PageViewModel != null && (flow = interestChooseV36PageViewModel.f76867n) != null) {
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
