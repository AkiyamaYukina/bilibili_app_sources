package com.bilibili.pegasus.components.interest.ui.v26;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import aq0.C4880p0;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogFirstTab$initFirstClassList$4.class */
final class InterestChooseDialogFirstTab$initFirstClassList$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final InterestChooseDialogFirstTab this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.interest.ui.v26.InterestChooseDialogFirstTab$initFirstClassList$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/v26/InterestChooseDialogFirstTab$initFirstClassList$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends InterestChooseItem>, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final InterestChooseDialogFirstTab this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterestChooseDialogFirstTab interestChooseDialogFirstTab, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = interestChooseDialogFirstTab;
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
            C4880p0 c4880p0 = this.this$0.f76433b;
            j jVar = null;
            RecyclerView.Adapter adapter = (c4880p0 == null || (recyclerView = c4880p0.f54122b) == null) ? null : recyclerView.getAdapter();
            if (adapter instanceof j) {
                jVar = (j) adapter;
            }
            if (jVar != null) {
                DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new Bo0.i(jVar.f76459c, list));
                ((ArrayList) jVar.f76459c).clear();
                ((ArrayList) jVar.f76459c).addAll(list);
                diffResultCalculateDiff.dispatchUpdatesTo(jVar);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterestChooseDialogFirstTab$initFirstClassList$4(InterestChooseDialogFirstTab interestChooseDialogFirstTab, Continuation<? super InterestChooseDialogFirstTab$initFirstClassList$4> continuation) {
        super(2, continuation);
        this.this$0 = interestChooseDialogFirstTab;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InterestChooseDialogFirstTab$initFirstClassList$4(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        InterestChooseMultiPageViewModel$special$$inlined$map$2 interestChooseMultiPageViewModel$special$$inlined$map$2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterestChooseMultiPageViewModel interestChooseMultiPageViewModel = l.f76461a;
            if (interestChooseMultiPageViewModel != null && (interestChooseMultiPageViewModel$special$$inlined$map$2 = interestChooseMultiPageViewModel.f76439e) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(interestChooseMultiPageViewModel$special$$inlined$map$2, anonymousClass1, this) == coroutine_suspended) {
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
