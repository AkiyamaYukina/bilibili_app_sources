package com.bilibili.pegasus.components.interest.ui.v37.page;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4839P;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v37.vm.InterestChooseV37PageViewModel$special$$inlined$map$2;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$initRv$5.class */
final class InterestChooseV37Dialog$initRv$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV37Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v37.page.InterestChooseV37Dialog$initRv$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v37/page/InterestChooseV37Dialog$initRv$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV37Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV37Dialog;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(List<? extends Object> list, Continuation<? super Unit> continuation) {
            return create(list, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            C4839P c4839p = this.this$0.f76881f;
            Wo0.d dVar = null;
            RecyclerView.Adapter adapter = (c4839p == null || (recyclerView = c4839p.f53805d) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof Wo0.d) {
                dVar = (Wo0.d) adapter;
            }
            if (dVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(dVar.f27021c, list));
                ((ArrayList) dVar.f27021c).clear();
                ((ArrayList) dVar.f27021c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(dVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV37Dialog$initRv$5(InterestChooseV37Dialog interestChooseV37Dialog, Continuation<? super InterestChooseV37Dialog$initRv$5> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV37Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV37Dialog$initRv$5(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV37PageViewModel$special$$inlined$map$2 interestChooseV37PageViewModel$special$$inlined$map$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV37PageViewModel interestChooseV37PageViewModel = j.f76896a;
            if (interestChooseV37PageViewModel != null && (interestChooseV37PageViewModel$special$$inlined$map$2 = interestChooseV37PageViewModel.f76911m) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV37PageViewModel$special$$inlined$map$2, anonymousClass1, this) == coroutine_suspended) {
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
