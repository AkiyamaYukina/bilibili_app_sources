package com.bilibili.pegasus.components.interest.ui.v38.page;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4833J;
import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v38.vm.InterestChooseV38PageViewModel$special$$inlined$map$2;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$initRv$4.class */
final class InterestChooseV38Dialog$initRv$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV38Dialog this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v38.page.InterestChooseV38Dialog$initRv$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v38/page/InterestChooseV38Dialog$initRv$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV38Dialog this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV38Dialog;
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
            C4833J c4833j = this.this$0.f76930f;
            Yo0.g gVar = null;
            RecyclerView.Adapter adapter = (c4833j == null || (recyclerView = c4833j.f53722d) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof Yo0.g) {
                gVar = (Yo0.g) adapter;
            }
            if (gVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(gVar.f28988c, list));
                ((ArrayList) gVar.f28988c).clear();
                ((ArrayList) gVar.f28988c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(gVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV38Dialog$initRv$4(InterestChooseV38Dialog interestChooseV38Dialog, Continuation<? super InterestChooseV38Dialog$initRv$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV38Dialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV38Dialog$initRv$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV38PageViewModel$special$$inlined$map$2 interestChooseV38PageViewModel$special$$inlined$map$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV38PageViewModel interestChooseV38PageViewModel = d.f76936a;
            if (interestChooseV38PageViewModel != null && (interestChooseV38PageViewModel$special$$inlined$map$2 = interestChooseV38PageViewModel.f76954k) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV38PageViewModel$special$$inlined$map$2, anonymousClass1, this) == coroutine_suspended) {
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
