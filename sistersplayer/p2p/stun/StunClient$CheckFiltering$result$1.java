package com.bilibili.sistersplayer.p2p.stun;

import com.bilibili.sistersplayer.p2p.stun.Stun;
import com.bilibili.sistersplayer.p2p.stun.StunSocket;
import java.net.InetSocketAddress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunClient$CheckFiltering$result$1.class */
public final class StunClient$CheckFiltering$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final InetSocketAddress $dest;
    final Stun.Msg $reqMsg;
    final byte[] $sendbuf;
    final StunSocket.Shared $socket;
    final int $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunClient$CheckFiltering$result$1(StunSocket.Shared shared, byte[] bArr, InetSocketAddress inetSocketAddress, Stun.Msg msg, int i7, Continuation<? super StunClient$CheckFiltering$result$1> continuation) {
        super(2, continuation);
        this.$socket = shared;
        this.$sendbuf = bArr;
        this.$dest = inetSocketAddress;
        this.$reqMsg = msg;
        this.$state = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StunClient$CheckFiltering$result$1(this.$socket, this.$sendbuf, this.$dest, this.$reqMsg, this.$state, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0085 -> B:21:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.p2p.stun.StunClient$CheckFiltering$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
