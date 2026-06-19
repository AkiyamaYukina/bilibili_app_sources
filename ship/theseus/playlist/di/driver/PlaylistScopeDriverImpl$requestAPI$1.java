package com.bilibili.ship.theseus.playlist.di.driver;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlaylistScopeDriverImpl$requestAPI$1.class */
final class PlaylistScopeDriverImpl$requestAPI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScopeDriverImpl$requestAPI$1(c cVar, Continuation<? super PlaylistScopeDriverImpl$requestAPI$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistScopeDriverImpl$requestAPI$1 playlistScopeDriverImpl$requestAPI$1 = new PlaylistScopeDriverImpl$requestAPI$1(this.this$0, continuation);
        playlistScopeDriverImpl$requestAPI$1.L$0 = obj;
        return playlistScopeDriverImpl$requestAPI$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlaylistScopeDriverImpl$requestAPI$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
