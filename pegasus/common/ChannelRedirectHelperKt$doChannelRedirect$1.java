package com.bilibili.pegasus.common;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.text.C0;
import com.bapis.bilibili.app.show.mixture.v1.ChannelRedirectReply;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.studio.centerplus.network.entity.PreviewData;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/ChannelRedirectHelperKt$doChannelRedirect$1.class */
public final class ChannelRedirectHelperKt$doChannelRedirect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $id;
    final Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelRedirectHelperKt$doChannelRedirect$1(long j7, Uri uri, Continuation<? super ChannelRedirectHelperKt$doChannelRedirect$1> continuation) {
        super(2, continuation);
        this.$id = j7;
        this.$uri = uri;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelRedirectHelperKt$doChannelRedirect$1(this.$id, this.$uri, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChannelRedirectReply channelRedirectReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        boolean z6 = true;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                C0.c(this.$id, "doChannelRedirect, start request, id = ", "[Pegasus]ChannelRedirectHelper");
                ChannelRedirectHelperKt$doChannelRedirect$1$replay$1 channelRedirectHelperKt$doChannelRedirect$1$replay$1 = new ChannelRedirectHelperKt$doChannelRedirect$1$replay$1(this.$id, null);
                this.label = 1;
                Object objWithTimeout = TimeoutKt.withTimeout(PreviewData.ChargeSinglePriceConfig.DEFAULT_MAX_PRICE, channelRedirectHelperKt$doChannelRedirect$1$replay$1, this);
                obj = objWithTimeout;
                if (objWithTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            channelRedirectReply = (ChannelRedirectReply) obj;
            if (channelRedirectReply != null) {
                z6 = false;
            }
            BLog.i("[Pegasus]ChannelRedirectHelper", "doChannelRedirect, end request, isValid = " + z6 + ", newUri = " + (channelRedirectReply != null ? channelRedirectReply.getUrl() : null) + ", redirect = " + (channelRedirectReply != null ? Boxing.boxLong(channelRedirectReply.getCode()) : null) + ",");
        } catch (Exception e7) {
            BLog.e("[Pegasus]ChannelRedirectHelper", e7.getCause());
        }
        if (channelRedirectReply == null) {
            return Unit.INSTANCE;
        }
        if (channelRedirectReply.getCode() == 1) {
            String url = channelRedirectReply.getUrl();
            if (url != null && url.length() != 0) {
                BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(channelRedirectReply.getUrl()), (Context) null, 2, (Object) null);
            }
        } else {
            BLRouter.routeTo$default(RouteRequestKt.toRouteRequest(this.$uri.buildUpon().appendQueryParameter("do_not_channel_redirect_to_search", "1").build()), (Context) null, 2, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
