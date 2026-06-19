package com.bilibili.pegasus.page;

import com.bilibili.pegasus.Action;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$7.class */
final class TimeMachinePegasusFragment$initFeeds$7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.pegasus.widget.h $loadMoreListener;
    int label;
    final TimeMachinePegasusFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.TimeMachinePegasusFragment$initFeeds$7$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$initFeeds$7$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Action, Continuation<? super Unit>, Object> {
        final com.bilibili.pegasus.widget.h $loadMoreListener;
        Object L$0;
        int label;
        final TimeMachinePegasusFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeMachinePegasusFragment timeMachinePegasusFragment, com.bilibili.pegasus.widget.h hVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = timeMachinePegasusFragment;
            this.$loadMoreListener = hVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$loadMoreListener, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Action action, Continuation<? super Unit> continuation) {
            return create(action, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.page.TimeMachinePegasusFragment$initFeeds$7.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachinePegasusFragment$initFeeds$7(TimeMachinePegasusFragment timeMachinePegasusFragment, com.bilibili.pegasus.widget.h hVar, Continuation<? super TimeMachinePegasusFragment$initFeeds$7> continuation) {
        super(2, continuation);
        this.this$0 = timeMachinePegasusFragment;
        this.$loadMoreListener = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeMachinePegasusFragment$initFeeds$7(this.this$0, this.$loadMoreListener, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<Action> sharedFlow = this.this$0.lf().f78360f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$loadMoreListener, null);
            this.label = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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
