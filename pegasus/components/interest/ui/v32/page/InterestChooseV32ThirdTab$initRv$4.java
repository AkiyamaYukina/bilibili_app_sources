package com.bilibili.pegasus.components.interest.ui.v32.page;

import Fo0.o;
import No0.w;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4879p;
import com.bilibili.pegasus.components.interest.ui.udf.model.InterestChooseItemUi;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel$special$$inlined$map$4;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32ThirdTab$initRv$4.class */
final class InterestChooseV32ThirdTab$initRv$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV32ThirdTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32ThirdTab$initRv$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32ThirdTab$initRv$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<o, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV32ThirdTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV32ThirdTab interestChooseV32ThirdTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV32ThirdTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(o oVar, Continuation<? super Unit> continuation) {
            return create(oVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            o oVar = (o) this.L$0;
            C4879p c4879p = this.this$0.f76671b;
            w wVar = null;
            RecyclerView.Adapter adapter = (c4879p == null || (recyclerView = c4879p.f54118d) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof w) {
                wVar = (w) adapter;
            }
            if (wVar != null) {
                List<InterestChooseItemUi> list = oVar.f6385a;
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(wVar.f17401d, list));
                ((ArrayList) wVar.f17401d).clear();
                ((ArrayList) wVar.f17401d).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(wVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV32ThirdTab$initRv$4(InterestChooseV32ThirdTab interestChooseV32ThirdTab, Continuation<? super InterestChooseV32ThirdTab$initRv$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV32ThirdTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV32ThirdTab$initRv$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV32PageViewModel$special$$inlined$map$4 interestChooseV32PageViewModel$special$$inlined$map$4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = this.this$0.hf();
            if (interestChooseV32PageViewModelHf != null && (interestChooseV32PageViewModel$special$$inlined$map$4 = interestChooseV32PageViewModelHf.f76700j) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV32PageViewModel$special$$inlined$map$4, anonymousClass1, this) == coroutine_suspended) {
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
