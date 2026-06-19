package com.bilibili.pegasus.components.interest.ui.v28.page;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.pegasus.components.interest.ui.v27.vm.InterestChooseV27PageViewModel;
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
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28Dialog$initConfirmButton$4.class */
final class InterestChooseV28Dialog$initConfirmButton$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV28Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog$initConfirmButton$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v28/page/InterestChooseV28Dialog$initConfirmButton$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        boolean Z$0;
        int label;
        final InterestChooseV28Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV28Dialog interestChooseV28Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV28Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [androidx.fragment.app.Fragment, com.bilibili.pegasus.components.interest.ui.v28.page.InterestChooseV28Dialog] */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.Z$0) {
                ?? r02 = this.this$0;
                BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(r02.getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new InterestChooseV28Dialog$handleConfirmButtonClicked$1(r02, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV28Dialog$initConfirmButton$4(InterestChooseV28Dialog interestChooseV28Dialog, Continuation<? super InterestChooseV28Dialog$initConfirmButton$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV28Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV28Dialog$initConfirmButton$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        StateFlow<Boolean> stateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV27PageViewModel interestChooseV27PageViewModel = e.f76528a;
            if (interestChooseV27PageViewModel != null && (stateFlow = interestChooseV27PageViewModel.f76497d) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
