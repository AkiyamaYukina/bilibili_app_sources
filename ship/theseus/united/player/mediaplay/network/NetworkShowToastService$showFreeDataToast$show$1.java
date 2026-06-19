package com.bilibili.ship.theseus.united.player.mediaplay.network;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/NetworkShowToastService$showFreeDataToast$show$1.class */
final class NetworkShowToastService$showFreeDataToast$show$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkShowToastService$showFreeDataToast$show$1(m mVar, Continuation<? super NetworkShowToastService$showFreeDataToast$show$1> continuation) {
        super(1, continuation);
        this.this$0 = mVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new NetworkShowToastService$showFreeDataToast$show$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L68
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            tv.danmaku.biliplayerv2.utils.PlayerFreeTypeHelper r0 = tv.danmaku.biliplayerv2.utils.PlayerFreeTypeHelper.INSTANCE
            r1 = r4
            com.bilibili.ship.theseus.united.player.mediaplay.network.m r1 = r1.this$0
            android.content.Context r1 = r1.f104582a
            java.lang.String r0 = r0.getFreeDataTypeToastValue(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L43
            r0 = r7
            r5 = r0
            r0 = r7
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L50
        L43:
            r0 = r4
            com.bilibili.ship.theseus.united.player.mediaplay.network.m r0 = r0.this$0
            android.content.Context r0 = r0.f104582a
            r1 = 2131847317(0x7f116895, float:1.9328108E38)
            java.lang.String r0 = r0.getString(r1)
            r5 = r0
        L50:
            r0 = r4
            com.bilibili.ship.theseus.united.player.mediaplay.network.m r0 = r0.this$0
            r7 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r5
            r2 = r4
            java.lang.Object r0 = r0.d(r1, r2)
            r1 = r8
            if (r0 != r1) goto L68
            r0 = r8
            return r0
        L68:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.mediaplay.network.NetworkShowToastService$showFreeDataToast$show$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
