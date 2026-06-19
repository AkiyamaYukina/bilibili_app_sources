package com.bilibili.pegasus.common;

import com.bapis.bilibili.app.show.mixture.v1.ApiMossKtxKt;
import com.bapis.bilibili.app.show.mixture.v1.ChannelRedirectReply;
import com.bapis.bilibili.app.show.mixture.v1.ChannelRedirectReq;
import com.bapis.bilibili.app.show.mixture.v1.MixtureMoss;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/ChannelRedirectHelperKt$doChannelRedirect$1$replay$1.class */
public final class ChannelRedirectHelperKt$doChannelRedirect$1$replay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChannelRedirectReply>, Object> {
    final long $id;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelRedirectHelperKt$doChannelRedirect$1$replay$1(long j7, Continuation<? super ChannelRedirectHelperKt$doChannelRedirect$1$replay$1> continuation) {
        super(2, continuation);
        this.$id = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelRedirectHelperKt$doChannelRedirect$1$replay$1(this.$id, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChannelRedirectReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChannelRedirectReq channelRedirectReqBuild = ChannelRedirectReq.newBuilder().setId(this.$id).build();
            MixtureMoss mixtureMoss = new MixtureMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
            this.label = 1;
            Object objSuspendChannelRedirect = ApiMossKtxKt.suspendChannelRedirect(mixtureMoss, channelRedirectReqBuild, this);
            obj = objSuspendChannelRedirect;
            if (objSuspendChannelRedirect == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
