package com.bilibili.upper.module.manuscript.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$startTimer$1.class */
final class ManuscriptProgressDetailsViewModel$startTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $initialDelayMs;
    final long $intervalMs;
    long J$0;
    private Object L$0;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$startTimer$1(long j7, ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, long j8, Continuation<? super ManuscriptProgressDetailsViewModel$startTimer$1> continuation) {
        super(2, continuation);
        this.$initialDelayMs = j7;
        this.this$0 = manuscriptProgressDetailsViewModel;
        this.$intervalMs = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManuscriptProgressDetailsViewModel$startTimer$1 manuscriptProgressDetailsViewModel$startTimer$1 = new ManuscriptProgressDetailsViewModel$startTimer$1(this.$initialDelayMs, this.this$0, this.$intervalMs, continuation);
        manuscriptProgressDetailsViewModel$startTimer$1.L$0 = obj;
        return manuscriptProgressDetailsViewModel$startTimer$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0110 -> B:34:0x0116). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel$startTimer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
