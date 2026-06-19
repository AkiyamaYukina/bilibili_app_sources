package com.bilibili.pegasus.components.interest.ui.v29.page;

import aq0.C4872l0;
import com.bilibili.lib.theme.R$color;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v29.vm.InterestChooseV29PageViewModel$special$$inlined$map$2;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kp0.C7779b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29Dialog$initConfirmButton$2.class */
final class InterestChooseV29Dialog$initConfirmButton$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV29Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v29.page.InterestChooseV29Dialog$initConfirmButton$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v29/page/InterestChooseV29Dialog$initConfirmButton$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7779b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV29Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV29Dialog interestChooseV29Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV29Dialog;
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
            TintTextView tintTextView2;
            TintTextView tintTextView3;
            TintTextView tintTextView4;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C7779b c7779b = (C7779b) this.L$0;
            C4872l0 c4872l0 = this.this$0.h;
            if (c4872l0 != null && (tintTextView4 = c4872l0.f54086c) != null) {
                tintTextView4.setText(c7779b.f122930d);
            }
            C4872l0 c4872l02 = this.this$0.h;
            if (c4872l02 != null && (tintTextView3 = c4872l02.f54086c) != null) {
                tintTextView3.setSelected(c7779b.f122929c);
            }
            C4872l0 c4872l03 = this.this$0.h;
            if (c4872l03 != null && (tintTextView2 = c4872l03.f54086c) != null) {
                tintTextView2.setVisibility(c7779b.f122927a ? 0 : 8);
            }
            InterestChooseV29Dialog interestChooseV29Dialog = this.this$0;
            C4872l0 c4872l04 = interestChooseV29Dialog.h;
            if (c4872l04 != null && (tintTextView = c4872l04.f54086c) != null) {
                tintTextView.setTextColor(interestChooseV29Dialog.getResources().getColor(c7779b.f122929c ? R$color.Wh0_u : R$color.Text3));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV29Dialog$initConfirmButton$2(InterestChooseV29Dialog interestChooseV29Dialog, Continuation<? super InterestChooseV29Dialog$initConfirmButton$2> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV29Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV29Dialog$initConfirmButton$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV29PageViewModel$special$$inlined$map$2 interestChooseV29PageViewModel$special$$inlined$map$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV29PageViewModel interestChooseV29PageViewModel = b.f76540a;
            if (interestChooseV29PageViewModel != null && (interestChooseV29PageViewModel$special$$inlined$map$2 = interestChooseV29PageViewModel.h) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV29PageViewModel$special$$inlined$map$2, anonymousClass1, this) == coroutine_suspended) {
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
