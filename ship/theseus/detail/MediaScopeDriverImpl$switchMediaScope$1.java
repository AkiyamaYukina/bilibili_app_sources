package com.bilibili.ship.theseus.detail;

import ev0.InterfaceC7008a;
import ev0.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/MediaScopeDriverImpl$switchMediaScope$1.class */
final class MediaScopeDriverImpl$switchMediaScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ev0.g $cachedPlayData;
    final ev0.h $fastPlayData;
    final l $sharedPlayData;
    final InterfaceC7008a.C1258a $startParams;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaScopeDriverImpl$switchMediaScope$1(l lVar, ev0.g gVar, c cVar, InterfaceC7008a.C1258a c1258a, ev0.h hVar, Continuation<? super MediaScopeDriverImpl$switchMediaScope$1> continuation) {
        super(2, continuation);
        this.$sharedPlayData = lVar;
        this.$cachedPlayData = gVar;
        this.this$0 = cVar;
        this.$startParams = c1258a;
        this.$fastPlayData = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaScopeDriverImpl$switchMediaScope$1(this.$sharedPlayData, this.$cachedPlayData, this.this$0, this.$startParams, this.$fastPlayData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.MediaScopeDriverImpl$switchMediaScope$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
