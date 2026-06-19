package com.bilibili.ship.theseus.playlist.di.driver;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlaylistScopeDriverImpl$loadCachedData$1.class */
final class PlaylistScopeDriverImpl$loadCachedData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScopeDriverImpl$loadCachedData$1(c cVar, Continuation<? super PlaylistScopeDriverImpl$loadCachedData$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistScopeDriverImpl$loadCachedData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1051
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlaylistScopeDriverImpl$loadCachedData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
