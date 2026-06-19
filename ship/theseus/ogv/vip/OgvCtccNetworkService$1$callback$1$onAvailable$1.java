package com.bilibili.ship.theseus.ogv.vip;

import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ogv.playviewextra.EpUserStatus;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/OgvCtccNetworkService$1$callback$1$onAvailable$1.class */
public final class OgvCtccNetworkService$1$callback$1$onAvailable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final OgvCtccNetworkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvCtccNetworkService$1$callback$1$onAvailable$1(OgvCtccNetworkService ogvCtccNetworkService, Continuation<? super OgvCtccNetworkService$1$callback$1$onAvailable$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvCtccNetworkService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvCtccNetworkService$1$callback$1$onAvailable$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        j jVarJ;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            EpUserStatus epUserStatus = (EpUserStatus) this.this$0.f94830b.getValue();
            if (Intrinsics.areEqual(epUserStatus != null ? epUserStatus.f94345c : null, "CAN_WATCH_CTCC_HOME_NETWORK") && (jVarJ = this.this$0.f94831c.j()) != null) {
                this.label = 1;
                if (jVarJ.E(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
