package com.bilibili.pegasus.components.interest.ui.v34.page;

import androidx.core.content.ContextCompat;
import aq0.C4885s;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34Dialog$initConfirmButton$2.class */
final class InterestChooseV34Dialog$initConfirmButton$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV34Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34Dialog$initConfirmButton$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34Dialog$initConfirmButton$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7779b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV34Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV34Dialog interestChooseV34Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV34Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C7779b c7779b, Continuation<? super Unit> continuation) {
            return create(c7779b, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            TintTextView tintTextView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C7779b c7779b = (C7779b) this.L$0;
            C4885s c4885s = this.this$0.h;
            if (c4885s != null && (tintTextView = c4885s.f54140b) != null) {
                tintTextView.setText(c7779b.f122930d);
                boolean z6 = c7779b.f122929c;
                tintTextView.setSelected(z6);
                tintTextView.setVisibility(c7779b.f122927a ? 0 : 8);
                tintTextView.setTextColor(ContextCompat.getColor(tintTextView.getContext(), z6 ? R$color.Wh0_u : R$color.Text3));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV34Dialog$initConfirmButton$2(InterestChooseV34Dialog interestChooseV34Dialog, Continuation<? super InterestChooseV34Dialog$initConfirmButton$2> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV34Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV34Dialog$initConfirmButton$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Flow<C7779b> flow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
            if (interestChooseV34PageViewModel != null && (flow = interestChooseV34PageViewModel.f76790l) != null) {
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
