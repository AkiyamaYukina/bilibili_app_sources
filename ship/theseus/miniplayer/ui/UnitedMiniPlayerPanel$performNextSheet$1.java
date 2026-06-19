package com.bilibili.ship.theseus.miniplayer.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/miniplayer/ui/UnitedMiniPlayerPanel$performNextSheet$1.class */
final class UnitedMiniPlayerPanel$performNextSheet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UnitedMiniPlayerPanel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedMiniPlayerPanel$performNextSheet$1(UnitedMiniPlayerPanel unitedMiniPlayerPanel, Continuation<? super UnitedMiniPlayerPanel$performNextSheet$1> continuation) {
        super(2, continuation);
        this.this$0 = unitedMiniPlayerPanel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnitedMiniPlayerPanel$performNextSheet$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.miniplayer.ui.UnitedMiniPlayerPanel$performNextSheet$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
