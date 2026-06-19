package com.bilibili.upper.module.manuscript.vm;

import com.bilibili.upper.module.manuscript.bean.ManuscriptVideosEntity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$requestAllData$1$videosTaskResult$1.class */
public final class ManuscriptProgressDetailsViewModel$requestAllData$1$videosTaskResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ManuscriptVideosEntity>>, Object> {
    final long $aid;
    final long $pn;
    final long $ps;
    final long $taskId;
    Object L$0;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$requestAllData$1$videosTaskResult$1(long j7, ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, long j8, long j9, long j10, Continuation<? super ManuscriptProgressDetailsViewModel$requestAllData$1$videosTaskResult$1> continuation) {
        super(2, continuation);
        this.$taskId = j7;
        this.this$0 = manuscriptProgressDetailsViewModel;
        this.$aid = j8;
        this.$pn = j9;
        this.$ps = j10;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptProgressDetailsViewModel$requestAllData$1$videosTaskResult$1(this.$taskId, this.this$0, this.$aid, this.$pn, this.$ps, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ManuscriptVideosEntity>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel$requestAllData$1$videosTaskResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
