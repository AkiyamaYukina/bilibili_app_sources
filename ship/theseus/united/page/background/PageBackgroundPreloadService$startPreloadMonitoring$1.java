package com.bilibili.ship.theseus.united.page.background;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$startPreloadMonitoring$1.class */
final class PageBackgroundPreloadService$startPreloadMonitoring$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PageBackgroundPreloadService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$startPreloadMonitoring$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$startPreloadMonitoring$1$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
        int label;
        final PageBackgroundPreloadService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PageBackgroundPreloadService pageBackgroundPreloadService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pageBackgroundPreloadService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
            return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PageBackgroundPreloadService pageBackgroundPreloadService = this.this$0;
            Job job = pageBackgroundPreloadService.f99023i;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            pageBackgroundPreloadService.f99023i = null;
            pageBackgroundPreloadService.f99023i = BuildersKt.launch$default(pageBackgroundPreloadService.f99016a, (CoroutineContext) null, (CoroutineStart) null, new PageBackgroundPreloadService$triggerWaitPreloadNextVideo$1(pageBackgroundPreloadService, null), 3, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageBackgroundPreloadService$startPreloadMonitoring$1(PageBackgroundPreloadService pageBackgroundPreloadService, Continuation<? super PageBackgroundPreloadService$startPreloadMonitoring$1> continuation) {
        super(2, continuation);
        this.this$0 = pageBackgroundPreloadService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean invokeSuspend$lambda$0(lv0.C7893a.C1318a r5, lv0.C7893a.C1318a r6) {
        /*
            r0 = r6
            if (r0 == 0) goto L34
            r0 = r5
            if (r0 == 0) goto L2f
            r0 = r5
            lv0.a$a$a r0 = r0.f123395a
            r5 = r0
            r0 = r5
            long r0 = r0.f123397a
            r8 = r0
            r0 = r6
            lv0.a$a$a r0 = r0.f123395a
            r6 = r0
            r0 = r8
            r1 = r6
            long r1 = r1.f123397a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2f
            r0 = r5
            long r0 = r0.f123398b
            r1 = r6
            long r1 = r1.f123398b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2f
            goto L34
        L2f:
            r0 = 0
            r7 = r0
            goto L36
        L34:
            r0 = 1
            r7 = r0
        L36:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService$startPreloadMonitoring$1.invokeSuspend$lambda$0(lv0.a$a, lv0.a$a):boolean");
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PageBackgroundPreloadService$startPreloadMonitoring$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.this$0.f99021f.f123393f, (Function2) new Object());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
