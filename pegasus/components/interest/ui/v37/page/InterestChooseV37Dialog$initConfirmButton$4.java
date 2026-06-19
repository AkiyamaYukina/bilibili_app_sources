package com.bilibili.pegasus.components.interest.ui.v37.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$initConfirmButton$4.class */
final class InterestChooseV37Dialog$initConfirmButton$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV37Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$initConfirmButton$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$initConfirmButton$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final InterestChooseV37Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog] */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ?? r02 = this.this$0;
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(r02.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV37Dialog$handleConfirmButtonClicked$1(r02, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV37Dialog$initConfirmButton$4(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super InterestChooseV37Dialog$initConfirmButton$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV37Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV37Dialog$initConfirmButton$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SharedFlow<Unit> sharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
            if (interestChooseV37PageViewModel != null && (sharedFlow = interestChooseV37PageViewModel.f76910l) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
