package com.bilibili.upper.module.manuscript.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$requestAllData$1.class */
final class ManuscriptProgressDetailsViewModel$requestAllData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $aid;
    final long $pn;
    final long $ps;
    final long $taskId;
    final int $videoIndex;
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$requestAllData$1(ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, int i7, long j7, long j8, long j9, long j10, Continuation<? super ManuscriptProgressDetailsViewModel$requestAllData$1> continuation) {
        super(2, continuation);
        this.this$0 = manuscriptProgressDetailsViewModel;
        this.$videoIndex = i7;
        this.$taskId = j7;
        this.$aid = j8;
        this.$pn = j9;
        this.$ps = j10;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ManuscriptProgressDetailsViewModel$requestAllData$1 manuscriptProgressDetailsViewModel$requestAllData$1 = new ManuscriptProgressDetailsViewModel$requestAllData$1(this.this$0, this.$videoIndex, this.$taskId, this.$aid, this.$pn, this.$ps, continuation);
        manuscriptProgressDetailsViewModel$requestAllData$1.L$0 = obj;
        return manuscriptProgressDetailsViewModel$requestAllData$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel$requestAllData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
