package com.bilibili.upper.module.manuscript.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$refreshVideosData$1.class */
final class ManuscriptProgressDetailsViewModel$refreshVideosData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $aid;
    final long $pn;
    final long $ps;
    final long $taskId;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$refreshVideosData$1(long j7, ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, long j8, long j9, long j10, Continuation<? super ManuscriptProgressDetailsViewModel$refreshVideosData$1> continuation) {
        super(2, continuation);
        this.$aid = j7;
        this.this$0 = manuscriptProgressDetailsViewModel;
        this.$pn = j8;
        this.$ps = j9;
        this.$taskId = j10;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptProgressDetailsViewModel$refreshVideosData$1(this.$aid, this.this$0, this.$pn, this.$ps, this.$taskId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8 A[EDGE_INSN: B:61:0x01e8->B:56:0x01e8 BREAK  A[LOOP:0: B:52:0x01c7->B:63:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel$refreshVideosData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
