package com.bilibili.pegasus.components.interest.ui.v34.page;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4893w;
import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v34.vm.InterestChooseV34PageViewModel$special$$inlined$map$1;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34SecondTab$initRv$3.class */
final class InterestChooseV34SecondTab$initRv$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV34SecondTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v34.page.InterestChooseV34SecondTab$initRv$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v34/page/InterestChooseV34SecondTab$initRv$3$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV34SecondTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV34SecondTab interestChooseV34SecondTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV34SecondTab;
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
            C4893w c4893w = this.this$0.f76766b;
            Qo0.h hVar = null;
            RecyclerView.Adapter adapter = (c4893w == null || (recyclerView = c4893w.f54179e) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof Qo0.h) {
                hVar = (Qo0.h) adapter;
            }
            if (hVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(hVar.f20120c, list));
                ((ArrayList) hVar.f20120c).clear();
                ((ArrayList) hVar.f20120c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(hVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV34SecondTab$initRv$3(InterestChooseV34SecondTab interestChooseV34SecondTab, Continuation<? super InterestChooseV34SecondTab$initRv$3> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV34SecondTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV34SecondTab$initRv$3(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV34PageViewModel$special$$inlined$map$1 interestChooseV34PageViewModel$special$$inlined$map$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV34PageViewModel interestChooseV34PageViewModel = e.f76773a;
            if (interestChooseV34PageViewModel != null && (interestChooseV34PageViewModel$special$$inlined$map$1 = interestChooseV34PageViewModel.f76786g) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV34PageViewModel$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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
