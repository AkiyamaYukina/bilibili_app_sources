package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.Stun;
import com.bilibili.sistersplayer.p2p.stun.StunSocket;
import java.net.InetSocketAddress;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$CheckFiltering$result$1$pkt$1.class */
public final class StunClient$CheckFiltering$result$1$pkt$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Stun.Msg, ? extends InetSocketAddress>>, Object> {
    final InetSocketAddress $dest;
    final Stun.Msg $reqMsg;
    final StunSocket.Shared $socket;
    final int $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunClient$CheckFiltering$result$1$pkt$1(StunSocket.Shared shared, Stun.Msg msg, int i7, InetSocketAddress inetSocketAddress, Continuation<? super StunClient$CheckFiltering$result$1$pkt$1> continuation) {
        super(2, continuation);
        this.$socket = shared;
        this.$reqMsg = msg;
        this.$state = i7;
        this.$dest = inetSocketAddress;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StunClient$CheckFiltering$result$1$pkt$1(this.$socket, this.$reqMsg, this.$state, this.$dest, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Stun.Msg, ? extends InetSocketAddress>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:14:0x0046). Please report as a decompilation issue!!! */
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
            goto L46
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
        L28:
            r0 = r4
            com.bilibili.sistersplayer.p2p.stun.StunSocket$Shared r0 = r0.$socket
            r5 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = 200(0xc8, float:2.8E-43)
            r2 = r4
            java.lang.Object r0 = r0.receive(r1, r2)
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            r1 = r8
            if (r0 != r1) goto L46
            r0 = r8
            return r0
        L46:
            r0 = r5
            kotlin.Pair r0 = (kotlin.Pair) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L51
            r0 = 0
            return r0
        L51:
            r0 = r5
            java.lang.Object r0 = r0.getFirst()
            com.bilibili.sistersplayer.p2p.stun.Stun$Msg r0 = (com.bilibili.sistersplayer.p2p.stun.Stun.Msg) r0
            r1 = r4
            com.bilibili.sistersplayer.p2p.stun.Stun$Msg r1 = r1.$reqMsg
            boolean r0 = r0.IsTransIdEquals(r1)
            if (r0 != 0) goto L65
            goto L28
        L65:
            r0 = r4
            int r0 = r0.$state
            r1 = 1
            if (r0 != r1) goto L80
            r0 = r5
            java.lang.Object r0 = r0.getSecond()
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            r1 = r4
            java.net.InetSocketAddress r1 = r1.$dest
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
            r0 = r5
            return r0
        L80:
            r0 = r4
            int r0 = r0.$state
            r1 = 2
            if (r0 != r1) goto L28
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient$CheckFiltering$result$1$pkt$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
