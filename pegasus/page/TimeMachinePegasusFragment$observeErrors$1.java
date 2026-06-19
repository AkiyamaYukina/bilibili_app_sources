package com.bilibili.pegasus.page;

import android.view.View;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import mp0.InterfaceC8027b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$observeErrors$1.class */
final class TimeMachinePegasusFragment$observeErrors$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final TimeMachinePegasusFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.TimeMachinePegasusFragment$observeErrors$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachinePegasusFragment$observeErrors$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC8027b, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TimeMachinePegasusFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TimeMachinePegasusFragment timeMachinePegasusFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = timeMachinePegasusFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(InterfaceC8027b interfaceC8027b, Continuation<? super Unit> continuation) {
            return create(interfaceC8027b, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            com.bilibili.pegasus.components.graduation.S s7;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC8027b interfaceC8027b = (InterfaceC8027b) this.L$0;
            if (interfaceC8027b instanceof InterfaceC8027b.C1328b) {
                TimeMachinePegasusFragment timeMachinePegasusFragment = this.this$0;
                if (((ArrayList) timeMachinePegasusFragment.getMAdapter().f79073b).isEmpty()) {
                    timeMachinePegasusFragment.sf(2131236306, 2131841412);
                } else if (timeMachinePegasusFragment.f78348y == null) {
                    int i7 = ConnectivityMonitor.getInstance().isNetworkActive() ? 2131841569 : 2131841662;
                    com.bilibili.pegasus.components.graduation.S s8 = timeMachinePegasusFragment.f78334k;
                    if (s8 != null) {
                        s8.c(timeMachinePegasusFragment.getString(i7));
                    }
                }
            } else if (interfaceC8027b instanceof InterfaceC8027b.a) {
                TimeMachinePegasusFragment timeMachinePegasusFragment2 = this.this$0;
                if (timeMachinePegasusFragment2.lf().h.f123310b && ((ArrayList) timeMachinePegasusFragment2.getMAdapter().f79073b).isEmpty()) {
                    timeMachinePegasusFragment2.sf(2131236937, 2131841350);
                } else if (timeMachinePegasusFragment2.f78348y == null && (s7 = timeMachinePegasusFragment2.f78334k) != null) {
                    s7.c(timeMachinePegasusFragment2.getString(2131845224));
                }
            } else {
                if (!(interfaceC8027b instanceof InterfaceC8027b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                View view = this.this$0.f78335l;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachinePegasusFragment$observeErrors$1(TimeMachinePegasusFragment timeMachinePegasusFragment, Continuation<? super TimeMachinePegasusFragment$observeErrors$1> continuation) {
        super(2, continuation);
        this.this$0 = timeMachinePegasusFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeMachinePegasusFragment$observeErrors$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<InterfaceC8027b> flow = this.this$0.lf().f78365l;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
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
