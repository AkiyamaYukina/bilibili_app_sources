package com.bilibili.pegasus.components.interest.ui.v30.page;

import Jh.v;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel;
import com.bilibili.pegasus.components.interest.ui.v30.vm.InterestChooseV30PageViewModel$special$$inlined$map$2;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30FirstTab$initRv$4.class */
final class InterestChooseV30FirstTab$initRv$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseV30FirstTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v30.page.InterestChooseV30FirstTab$initRv$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v30/page/InterestChooseV30FirstTab$initRv$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends Object>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseV30FirstTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseV30FirstTab interestChooseV30FirstTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseV30FirstTab;
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
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            v vVar = this.this$0.f76566b;
            v vVar2 = vVar;
            if (vVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                vVar2 = null;
            }
            RecyclerView.Adapter adapter = vVar2.d.getAdapter();
            Lo0.f fVar = null;
            if (adapter instanceof Lo0.f) {
                fVar = (Lo0.f) adapter;
            }
            if (fVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(fVar.f14747c, list));
                ((ArrayList) fVar.f14747c).clear();
                ((ArrayList) fVar.f14747c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(fVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseV30FirstTab$initRv$4(InterestChooseV30FirstTab interestChooseV30FirstTab, Continuation<? super InterestChooseV30FirstTab$initRv$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseV30FirstTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseV30FirstTab$initRv$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseV30PageViewModel$special$$inlined$map$2 interestChooseV30PageViewModel$special$$inlined$map$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseV30PageViewModel interestChooseV30PageViewModel = e.f76574a;
            if (interestChooseV30PageViewModel != null && (interestChooseV30PageViewModel$special$$inlined$map$2 = interestChooseV30PageViewModel.f76584e) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseV30PageViewModel$special$$inlined$map$2, anonymousClass1, this) == coroutine_suspended) {
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
