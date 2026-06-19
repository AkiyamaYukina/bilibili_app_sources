package com.bilibili.upper.module.manuscript.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/vm/ManuscriptProgressDetailsViewModel$getTranscodingData$1.class */
public final class ManuscriptProgressDetailsViewModel$getTranscodingData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $aid;
    final long $cid;
    Object L$0;
    int label;
    final ManuscriptProgressDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManuscriptProgressDetailsViewModel$getTranscodingData$1(long j7, long j8, ManuscriptProgressDetailsViewModel manuscriptProgressDetailsViewModel, Continuation<? super ManuscriptProgressDetailsViewModel$getTranscodingData$1> continuation) {
        super(2, continuation);
        this.$cid = j7;
        this.$aid = j8;
        this.this$0 = manuscriptProgressDetailsViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ManuscriptProgressDetailsViewModel$getTranscodingData$1(this.$cid, this.$aid, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.manuscript.vm.ManuscriptProgressDetailsViewModel$getTranscodingData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
