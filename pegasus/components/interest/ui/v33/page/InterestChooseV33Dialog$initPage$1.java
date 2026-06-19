package com.bilibili.pegasus.components.interest.ui.v33.page;

import aq0.C4885s;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$initPage$1.class */
final class InterestChooseV33Dialog$initPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV33Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33Dialog$initPage$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33Dialog$initPage$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Po0.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV33Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV33Dialog interestChooseV33Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV33Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Po0.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<InterestChoose> stateFlow;
            InterestChoose interestChoose;
            int i7;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Po0.a aVar = (Po0.a) this.L$0;
            InterestChooseV33Dialog interestChooseV33Dialog = this.this$0;
            interestChooseV33Dialog.f76715i = aVar.f19040b;
            C4885s c4885s = interestChooseV33Dialog.h;
            int i8 = aVar.f19039a;
            if (c4885s == null || c4885s.f54141c.getCurrentItem() != i8) {
                C4885s c4885s2 = this.this$0.h;
                if (c4885s2 != null) {
                    c4885s2.f54141c.setCurrentItem(i8);
                }
                InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
                if (interestChooseV33PageViewModel == null || (stateFlow = interestChooseV33PageViewModel.f76742f) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                    return Unit.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = aVar.f19040b.iterator();
                while (true) {
                    i7 = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    InterestChooseItem interestChooseItem = (InterestChooseItem) it.next();
                    arrayList.add(Boxing.boxLong(interestChooseItem.getId()));
                    String name = interestChooseItem.getName();
                    String str = name;
                    if (name == null) {
                        str = "";
                    }
                    arrayList2.add(str);
                    arrayList3.add(Boxing.boxInt(interestChooseItem.getOriginPos() + 1));
                }
                if (i8 == 0) {
                    i7 = 2;
                }
                com.bilibili.pegasus.components.interest.e.v(i7, interestChoose.D(), interestChoose.O(), com.bilibili.pegasus.components.interest.d.a(arrayList), com.bilibili.pegasus.components.interest.d.a(arrayList2), com.bilibili.pegasus.components.interest.d.a(arrayList3), arrayList.size(), com.bilibili.pegasus.components.interest.d.c(interestChoose), com.bilibili.pegasus.request.b.g() ? "1" : "2");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV33Dialog$initPage$1(InterestChooseV33Dialog interestChooseV33Dialog, Continuation<? super InterestChooseV33Dialog$initPage$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV33Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV33Dialog$initPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<Po0.a> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
            if (interestChooseV33PageViewModel != null && (flow = interestChooseV33PageViewModel.f76748m) != null) {
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
