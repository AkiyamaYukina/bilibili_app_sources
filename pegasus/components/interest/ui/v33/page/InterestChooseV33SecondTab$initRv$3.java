package com.bilibili.pegasus.components.interest.ui.v33.page;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4891v;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v33.vm.InterestChooseV33PageViewModel$special$$inlined$map$1;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33SecondTab$initRv$3.class */
final class InterestChooseV33SecondTab$initRv$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV33SecondTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v33.page.InterestChooseV33SecondTab$initRv$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v33/page/InterestChooseV33SecondTab$initRv$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV33SecondTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV33SecondTab interestChooseV33SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV33SecondTab;
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
            C4891v c4891v = this.this$0.f76721b;
            Oo0.h hVar = null;
            RecyclerView.Adapter adapter = (c4891v == null || (recyclerView = c4891v.f54168e) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof Oo0.h) {
                hVar = (Oo0.h) adapter;
            }
            if (hVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(hVar.f17982c, list));
                ((ArrayList) hVar.f17982c).clear();
                ((ArrayList) hVar.f17982c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(hVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV33SecondTab$initRv$3(InterestChooseV33SecondTab interestChooseV33SecondTab, Continuation<? super InterestChooseV33SecondTab$initRv$3> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV33SecondTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV33SecondTab$initRv$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV33PageViewModel$special$$inlined$map$1 interestChooseV33PageViewModel$special$$inlined$map$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV33PageViewModel interestChooseV33PageViewModel = c.f76724a;
            if (interestChooseV33PageViewModel != null && (interestChooseV33PageViewModel$special$$inlined$map$1 = interestChooseV33PageViewModel.f76744i) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV33PageViewModel$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
