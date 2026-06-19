package com.bilibili.sistersplayer.p2p.stun;

import androidx.appcompat.widget.C3259x;
import com.bilibili.sistersplayer.p2p.utils.ExtKt;
import com.bilibili.sistersplayer.p2p.utils.P2PLogger;
import java.net.InetSocketAddress;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/stun/StunCheck$checkV6$2$mappingDeferred$1.class */
public final class StunCheck$checkV6$2$mappingDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final List<String> $mappingServers;
    final StunClient $stunClient;
    int label;
    final StunCheck this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StunCheck$checkV6$2$mappingDeferred$1(StunClient stunClient, List<String> list, StunCheck stunCheck, Continuation<? super StunCheck$checkV6$2$mappingDeferred$1> continuation) {
        super(2, continuation);
        this.$stunClient = stunClient;
        this.$mappingServers = list;
        this.this$0 = stunCheck;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StunCheck$checkV6$2$mappingDeferred$1(this.$stunClient, this.$mappingServers, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StunClient stunClient = this.$stunClient;
            List<InetSocketAddress> listStunHostName2SocketAddress = ExtKt.stunHostName2SocketAddress(this.$mappingServers, 3478, true);
            this.label = 1;
            Object objCheckMapping = stunClient.CheckMapping(listStunHostName2SocketAddress, 1000, this);
            obj = objCheckMapping;
            if (objCheckMapping == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        P2PLogger.logI$default(this.this$0.logger, StunCheck.TAG, C3259x.a(iIntValue, "stunCheck CheckMapping "), null, 4, null);
        return Boxing.boxInt(iIntValue);
    }
}
