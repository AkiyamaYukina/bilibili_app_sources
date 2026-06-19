package com.bilibili.ship.theseus.ugc.cachevideo;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/cachevideo/UgcCacheVideoService2$showDownload$2.class */
final class UgcCacheVideoService2$showDownload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UgcCacheVideoService2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcCacheVideoService2$showDownload$2(UgcCacheVideoService2 ugcCacheVideoService2, Continuation<? super UgcCacheVideoService2$showDownload$2> continuation) {
        super(2, continuation);
        this.this$0 = ugcCacheVideoService2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcCacheVideoService2$showDownload$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 1351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.cachevideo.UgcCacheVideoService2$showDownload$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
