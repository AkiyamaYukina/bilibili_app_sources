package com.bilibili.pegasus.components.interest.ui.v29.page;

import com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29Dialog$handleConfirmButtonClicked$1.class */
final class InterestChooseV29Dialog$handleConfirmButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV29Dialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV29Dialog$handleConfirmButtonClicked$1(InterestChooseV29Dialog interestChooseV29Dialog, Continuation<? super InterestChooseV29Dialog$handleConfirmButtonClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV29Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV29Dialog$handleConfirmButtonClicked$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV29PageViewModel$special$$inlined$map$2 interestChooseV29PageViewModel$special$$inlined$map$2;
        StateFlow<InterestChoose> stateFlow;
        InterestChoose interestChoose;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV29PageViewModel interestChooseV29PageViewModel = b.f76540a;
            if (interestChooseV29PageViewModel != null && (interestChooseV29PageViewModel$special$$inlined$map$2 = interestChooseV29PageViewModel.h) != null) {
                this.label = 1;
                Object objFirst = FlowKt.first(interestChooseV29PageViewModel$special$$inlined$map$2, this);
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
            InterestChooseV29PageViewModel interestChooseV29PageViewModel2 = b.f76540a;
            if (interestChooseV29PageViewModel2 == null || (stateFlow = interestChooseV29PageViewModel2.f76549b) == null || (interestChoose = (InterestChoose) stateFlow.getValue()) == null) {
                return Unit.INSTANCE;
            }
            if (c7779b.f122929c) {
                InterestChooseV29Dialog interestChooseV29Dialog = this.this$0;
                interestChooseV29Dialog.f76375e = false;
                interestChooseV29Dialog.f76376f = true;
                com.bilibili.pegasus.components.interest.e.c(interestChoose.D(), interestChoose.O(), CollectionsKt.emptyList(), com.bilibili.pegasus.components.interest.d.c(interestChoose), null, null, null, null, 0, null, null, null, null, null, null, null, 524256);
                interestChooseV29Dialog.kc(null);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
