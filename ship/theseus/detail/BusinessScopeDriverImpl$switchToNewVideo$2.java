package com.bilibili.ship.theseus.detail;

import ev0.InterfaceC7008a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$switchToNewVideo$2.class */
public final class BusinessScopeDriverImpl$switchToNewVideo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final InterfaceC7008a.C1258a $startParams;
    Object L$0;
    int label;
    final BusinessScopeDriverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessScopeDriverImpl$switchToNewVideo$2(InterfaceC7008a.C1258a c1258a, BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super BusinessScopeDriverImpl$switchToNewVideo$2> continuation) {
        super(2, continuation);
        this.$startParams = c1258a;
        this.this$0 = businessScopeDriverImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BusinessScopeDriverImpl$switchToNewVideo$2(this.$startParams, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$switchToNewVideo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
