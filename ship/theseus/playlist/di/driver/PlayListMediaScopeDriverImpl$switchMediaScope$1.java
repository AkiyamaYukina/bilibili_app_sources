package com.bilibili.ship.theseus.playlist.di.driver;

import ev0.InterfaceC7008a;
import ev0.g;
import ev0.h;
import ev0.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$switchMediaScope$1.class */
public final class PlayListMediaScopeDriverImpl$switchMediaScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final g $cachedPlayData;
    final h $fastPlayData;
    final l $sharedPlayData;
    final InterfaceC7008a.C1258a $startParams;
    int label;
    final PlayListMediaScopeDriverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayListMediaScopeDriverImpl$switchMediaScope$1(l lVar, g gVar, PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, InterfaceC7008a.C1258a c1258a, h hVar, Continuation<? super PlayListMediaScopeDriverImpl$switchMediaScope$1> continuation) {
        super(2, continuation);
        this.$sharedPlayData = lVar;
        this.$cachedPlayData = gVar;
        this.this$0 = playListMediaScopeDriverImpl;
        this.$startParams = c1258a;
        this.$fastPlayData = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayListMediaScopeDriverImpl$switchMediaScope$1(this.$sharedPlayData, this.$cachedPlayData, this.this$0, this.$startParams, this.$fastPlayData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl$switchMediaScope$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
