package com.bilibili.lib.projection.internal.search;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/ProjectionSearchFragment$ssdpCheck$1.class */
final class ProjectionSearchFragment$ssdpCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ProjectionSearchFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectionSearchFragment$ssdpCheck$1(ProjectionSearchFragment projectionSearchFragment, Continuation<? super ProjectionSearchFragment$ssdpCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = projectionSearchFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProjectionSearchFragment$ssdpCheck$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01f4 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.ProjectionSearchFragment$ssdpCheck$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
