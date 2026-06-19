package com.bilibili.playerbizcommon.features.network;

import com.bapis.bilibili.app.view.v1.TFInfoReply;
import com.bapis.bilibili.app.view.v1.TFInfoReq;
import com.bapis.bilibili.app.view.v1.ViewMoss;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/network/PlayerNetworkService$fetcherToastDataFromRemote$2.class */
final class PlayerNetworkService$fetcherToastDataFromRemote$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TFInfoReply>, Object> {
    int label;

    public PlayerNetworkService$fetcherToastDataFromRemote$2(Continuation<? super PlayerNetworkService$fetcherToastDataFromRemote$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerNetworkService$fetcherToastDataFromRemote$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TFInfoReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        TFInfoReply tFInfoReplyExecuteTFInfo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            tFInfoReplyExecuteTFInfo = new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTFInfo(TFInfoReq.newBuilder().build());
        } catch (Exception e7) {
            tFInfoReplyExecuteTFInfo = null;
        }
        return tFInfoReplyExecuteTFInfo;
    }
}
