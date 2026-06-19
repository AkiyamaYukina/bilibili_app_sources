package com.bilibili.ship.theseus.united.player.mediaplay.network;

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
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/MediaNetworkRepository$requestTFInfo$2.class */
final class MediaNetworkRepository$requestTFInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super r>, Object> {
    int label;

    public MediaNetworkRepository$requestTFInfo$2(Continuation<? super MediaNetworkRepository$requestTFInfo$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaNetworkRepository$requestTFInfo$2(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super r> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        r rVarA;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            TFInfoReply tFInfoReplyExecuteTFInfo = new ViewMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).executeTFInfo(TFInfoReq.newBuilder().build());
            rVarA = null;
            if (tFInfoReplyExecuteTFInfo != null) {
                rVarA = b.a(tFInfoReplyExecuteTFInfo);
            }
        } catch (Exception e7) {
            BLog.w("MediaNetworkRepository$requestTFInfo$2-invokeSuspend", "[theseus-united-MediaNetworkRepository$requestTFInfo$2-invokeSuspend] requestTFInfo error", e7);
            rVarA = null;
        }
        return rVarA;
    }
}
