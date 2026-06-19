package com.bilibili.pegasus.components.interest.ui.v32.page;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4879p;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v32.vm.InterestChooseV32PageViewModel$special$$inlined$map$2;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32FirstTab$initRv$4.class */
final class InterestChooseV32FirstTab$initRv$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV32FirstTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v32.page.InterestChooseV32FirstTab$initRv$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v32/page/InterestChooseV32FirstTab$initRv$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Fo0.d, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV32FirstTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV32FirstTab interestChooseV32FirstTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV32FirstTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Fo0.d dVar, Continuation<? super Unit> continuation) {
            return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            RecyclerView recyclerView;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Fo0.d dVar = (Fo0.d) this.L$0;
            C4879p c4879p = this.this$0.f76667b;
            No0.i iVar = null;
            RecyclerView.Adapter adapter = (c4879p == null || (recyclerView = c4879p.f54118d) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof No0.i) {
                iVar = (No0.i) adapter;
            }
            if (iVar != null) {
                List<Fo0.c> listA = dVar.a();
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(iVar.f17366e, listA));
                ((ArrayList) iVar.f17366e).clear();
                ((ArrayList) iVar.f17366e).addAll(listA);
                diffResultCalculateDiff.dispatchUpdatesTo(iVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV32FirstTab$initRv$4(InterestChooseV32FirstTab interestChooseV32FirstTab, Continuation<? super InterestChooseV32FirstTab$initRv$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV32FirstTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV32FirstTab$initRv$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV32PageViewModel$special$$inlined$map$2 interestChooseV32PageViewModel$special$$inlined$map$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV32PageViewModel interestChooseV32PageViewModelHf = this.this$0.hf();
            if (interestChooseV32PageViewModelHf != null && (interestChooseV32PageViewModel$special$$inlined$map$2 = interestChooseV32PageViewModelHf.f76699i) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV32PageViewModel$special$$inlined$map$2, anonymousClass1, this) == coroutine_suspended) {
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
