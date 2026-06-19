package com.bilibili.pegasus.components.interest.ui.v35.page;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4825B;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v35.vm.InterestChooseV35PageViewModel$special$$inlined$map$3;
import com.bilibili.pegasus.data.interestchoose.InterestChooseItem;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35SecondTab$initRv$3.class */
final class InterestChooseV35SecondTab$initRv$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV35SecondTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v35.page.InterestChooseV35SecondTab$initRv$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v35/page/InterestChooseV35SecondTab$initRv$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV35SecondTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV35SecondTab interestChooseV35SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV35SecondTab;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(List<InterestChooseItem> list, Continuation<? super Unit> continuation) {
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
            C4825B c4825b = this.this$0.f76800b;
            So0.i iVar = null;
            RecyclerView.Adapter adapter = (c4825b == null || (recyclerView = c4825b.f53666e) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof So0.i) {
                iVar = (So0.i) adapter;
            }
            if (iVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(iVar.f23083c, list));
                ((ArrayList) iVar.f23083c).clear();
                ((ArrayList) iVar.f23083c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(iVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV35SecondTab$initRv$3(InterestChooseV35SecondTab interestChooseV35SecondTab, Continuation<? super InterestChooseV35SecondTab$initRv$3> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV35SecondTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV35SecondTab$initRv$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV35PageViewModel$special$$inlined$map$3 interestChooseV35PageViewModel$special$$inlined$map$3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV35PageViewModel interestChooseV35PageViewModel = c.f76804a;
            if (interestChooseV35PageViewModel != null && (interestChooseV35PageViewModel$special$$inlined$map$3 = interestChooseV35PageViewModel.f76826l) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV35PageViewModel$special$$inlined$map$3, anonymousClass1, this) == coroutine_suspended) {
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
