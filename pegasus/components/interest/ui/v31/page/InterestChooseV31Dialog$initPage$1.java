package com.bilibili.pegasus.components.interest.ui.v31.page;

import androidx.viewpager2.widget.ViewPager2;
import aq0.C4859f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31Dialog$initPage$1.class */
final class InterestChooseV31Dialog$initPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV31Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v31.page.InterestChooseV31Dialog$initPage$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v31/page/InterestChooseV31Dialog$initPage$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Fo0.k, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV31Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV31Dialog interestChooseV31Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV31Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Fo0.k kVar, Continuation<? super Unit> continuation) {
            return create(kVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            C4859f c4859f;
            ViewPager2 viewPager2;
            ViewPager2 viewPager22;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i7 = ((Fo0.k) this.L$0).f6372c;
            C4859f c4859f2 = this.this$0.f76600n;
            if ((c4859f2 == null || (viewPager22 = c4859f2.f54030c) == null || viewPager22.getCurrentItem() != i7) && (c4859f = this.this$0.f76600n) != null && (viewPager2 = c4859f.f54030c) != null) {
                viewPager2.setCurrentItem(i7);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV31Dialog$initPage$1(InterestChooseV31Dialog interestChooseV31Dialog, Continuation<? super InterestChooseV31Dialog$initPage$1> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV31Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV31Dialog$initPage$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<Fo0.k> stateFlow = this.this$0.kf().f76634g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
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
