package com.bilibili.pegasus.page;

import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.pegasus.PegasusHolderData;
import com.bilibili.pegasus.page.TimeMachinePegasusFragment$initFeeds$5;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mp0.C8026a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$5.class */
final class TimeMachinePegasusFragment$initFeeds$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final GraduationRecyclerView $recyclerView;
    int label;
    final TimeMachinePegasusFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.TimeMachinePegasusFragment$initFeeds$5$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$5$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C8026a, Continuation<? super Unit>, Object> {
        final GraduationRecyclerView $recyclerView;
        Object L$0;
        int label;
        final TimeMachinePegasusFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeMachinePegasusFragment timeMachinePegasusFragment, GraduationRecyclerView graduationRecyclerView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = timeMachinePegasusFragment;
            this.$recyclerView = graduationRecyclerView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(TimeMachinePegasusFragment timeMachinePegasusFragment) {
            bY.c<RecyclerView> cVar;
            C5724m c5724m = timeMachinePegasusFragment.f78338o;
            if (c5724m != null) {
                c5724m.c();
            }
            C5728q c5728q = timeMachinePegasusFragment.f78339p;
            if (c5728q == null || (cVar = c5728q.f78434c) == null) {
                return;
            }
            cVar.i();
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$recyclerView, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(C8026a c8026a, Continuation<? super Unit> continuation) {
            return create(c8026a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C8026a c8026a = (C8026a) this.L$0;
            List<PegasusHolderData> list = c8026a.f123826a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof ip0.d) {
                    arrayList.add(obj2);
                }
            }
            this.this$0.getMAdapter().O(this.this$0.getMAdapter().f79073b, arrayList, null);
            Function1<RecyclerView, Unit> function1 = c8026a.f123829d;
            if (function1 != null) {
                function1.invoke(this.$recyclerView);
            }
            if (!arrayList.isEmpty()) {
                x xVar = this.this$0.f78337n;
                if (xVar != null) {
                    x.b(xVar);
                }
                GraduationRecyclerView graduationRecyclerView = this.$recyclerView;
                final TimeMachinePegasusFragment timeMachinePegasusFragment = this.this$0;
                graduationRecyclerView.post(new Runnable(timeMachinePegasusFragment) { // from class: com.bilibili.pegasus.page.G

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final TimeMachinePegasusFragment f78286a;

                    {
                        this.f78286a = timeMachinePegasusFragment;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        TimeMachinePegasusFragment$initFeeds$5.AnonymousClass1.invokeSuspend$lambda$0(this.f78286a);
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachinePegasusFragment$initFeeds$5(TimeMachinePegasusFragment timeMachinePegasusFragment, GraduationRecyclerView graduationRecyclerView, Continuation<? super TimeMachinePegasusFragment$initFeeds$5> continuation) {
        super(2, continuation);
        this.this$0 = timeMachinePegasusFragment;
        this.$recyclerView = graduationRecyclerView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeMachinePegasusFragment$initFeeds$5(this.this$0, this.$recyclerView, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<C8026a> flow = this.this$0.lf().f78363j;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$recyclerView, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
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
