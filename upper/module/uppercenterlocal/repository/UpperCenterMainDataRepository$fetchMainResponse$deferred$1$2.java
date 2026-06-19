package com.bilibili.upper.module.uppercenterlocal.repository;

import com.bilibili.upper.module.uppercenterlocal.repository.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/repository/UpperCenterMainDataRepository$fetchMainResponse$deferred$1$2.class */
final class UpperCenterMainDataRepository$fetchMainResponse$deferred$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super a.C1236a>, Object> {
    final boolean $fromH5;
    final CoroutineScope $scope;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterMainDataRepository$fetchMainResponse$deferred$1$2(boolean z6, a aVar, CoroutineScope coroutineScope, Continuation<? super UpperCenterMainDataRepository$fetchMainResponse$deferred$1$2> continuation) {
        super(2, continuation);
        this.$fromH5 = z6;
        this.this$0 = aVar;
        this.$scope = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterMainDataRepository$fetchMainResponse$deferred$1$2(this.$fromH5, this.this$0, this.$scope, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super a.C1236a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.module.uppercenterlocal.repository.UpperCenterMainDataRepository$fetchMainResponse$deferred$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
