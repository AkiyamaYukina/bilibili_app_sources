package com.bilibili.pegasus.components.interest.ui.v26;

import aq0.C4872l0;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageDialog$initPage$1.class */
final class InterestChooseMultiPageDialog$initPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseMultiPageDialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseMultiPageDialog$initPage$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseMultiPageDialog$initPage$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<kp0.g, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseMultiPageDialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseMultiPageDialog interestChooseMultiPageDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseMultiPageDialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(kp0.g gVar, Continuation<? super Unit> continuation) {
            return create(gVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            StateFlow<InterestChoose> stateFlow;
            InterestChoose interestChoose;
            StateFlow<InterestChoose> stateFlow2;
            InterestChoose interestChoose2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kp0.g gVar = (kp0.g) this.L$0;
            C4872l0 c4872l0 = this.this$0.h;
            if (c4872l0 == null || c4872l0.f54087d.getCurrentItem() != gVar.f122942a) {
                C4872l0 c4872l02 = this.this$0.h;
                if (c4872l02 != null) {
                    c4872l02.f54087d.setCurrentItem(gVar.f122942a);
                }
                InterestChooseItem interestChooseItem = gVar.f122943b;
                if (interestChooseItem != null) {
                    String name = interestChooseItem.getName();
                    InterestChooseItem interestChooseItem2 = gVar.f122943b;
                    long id = interestChooseItem2.getId();
                    int originPos = interestChooseItem2.getOriginPos();
                    int i7 = gVar.f122942a == 0 ? 2 : 1;
                    InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
                    int iD = (interestChooseMultiPageViewModel == null || (stateFlow2 = interestChooseMultiPageViewModel.f76436b) == null || (interestChoose2 = (InterestChoose) stateFlow2.getValue()) == null) ? 0 : interestChoose2.D();
                    InterestChooseMultiPageViewModel interestChooseMultiPageViewModel2 = l.f76461a;
                    Neurons.reportClick(true, "main.interest-select.step-btn.0.click", MapsKt.mapOf(new Pair[]{TuplesKt.to("interest_id", String.valueOf(id)), TuplesKt.to("interest_name", name), TuplesKt.to("interest_pos", String.valueOf(originPos + 1)), TuplesKt.to("action_type", String.valueOf(i7)), TuplesKt.to("style", String.valueOf(iD)), TuplesKt.to("unique_id", String.valueOf((interestChooseMultiPageViewModel2 == null || (stateFlow = interestChooseMultiPageViewModel2.f76436b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) ? 0L : interestChoose.O())), TuplesKt.to("strategy", com.bilibili.pegasus.request.b.g() ? "1" : "2")}));
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseMultiPageDialog$initPage$1(InterestChooseMultiPageDialog interestChooseMultiPageDialog, Continuation<? super InterestChooseMultiPageDialog$initPage$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseMultiPageDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseMultiPageDialog$initPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<kp0.g> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
            if (interestChooseMultiPageViewModel != null && (flow = interestChooseMultiPageViewModel.f76438d) != null) {
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
