package com.bilibili.pegasus.channelv3.movie.head;

import com.bapis.bilibili.app.interfaces.v1.MediaCommentReply;
import com.bapis.bilibili.app.interfaces.v1.MediaCommentReq;
import com.bapis.bilibili.app.interfaces.v1.MediaMoss;
import com.bapis.bilibili.app.interfaces.v1.MediaMossKtxKt;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/movie/head/ChannelMovieHeadVM$mediaCommentAuth$1.class */
final class ChannelMovieHeadVM$mediaCommentAuth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<MediaCommentReply, Unit> $action;
    final String $commentId;
    Object L$0;
    Object L$1;
    int label;
    final ChannelMovieHeadVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelMovieHeadVM$mediaCommentAuth$1(ChannelMovieHeadVM channelMovieHeadVM, String str, Function1<? super MediaCommentReply, Unit> function1, Continuation<? super ChannelMovieHeadVM$mediaCommentAuth$1> continuation) {
        super(2, continuation);
        this.this$0 = channelMovieHeadVM;
        this.$commentId = str;
        this.$action = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelMovieHeadVM$mediaCommentAuth$1(this.this$0, this.$commentId, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ChannelMovieHeadVM channelMovieHeadVM;
        ChannelMovieHeadVM channelMovieHeadVM2;
        MediaCommentReply mediaCommentReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            channelMovieHeadVM = this.this$0;
            try {
                MediaMoss mediaMoss = new MediaMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                MediaCommentReq mediaCommentReqBuild = MediaCommentReq.newBuilder().setId(this.$commentId).build();
                this.L$0 = channelMovieHeadVM;
                this.L$1 = channelMovieHeadVM;
                this.label = 1;
                obj = MediaMossKtxKt.suspendMediaComment(mediaMoss, mediaCommentReqBuild, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                channelMovieHeadVM2 = channelMovieHeadVM;
            } catch (Exception e7) {
                e = e7;
                channelMovieHeadVM2 = channelMovieHeadVM;
                BLog.e(this.this$0.f75379a, "get user media comment auth error.", e);
                mediaCommentReply = null;
                channelMovieHeadVM = channelMovieHeadVM2;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelMovieHeadVM = (ChannelMovieHeadVM) this.L$1;
            ChannelMovieHeadVM channelMovieHeadVM3 = (ChannelMovieHeadVM) this.L$0;
            channelMovieHeadVM2 = channelMovieHeadVM3;
            try {
                ResultKt.throwOnFailure(obj);
                channelMovieHeadVM2 = channelMovieHeadVM3;
            } catch (Exception e8) {
                e = e8;
                BLog.e(this.this$0.f75379a, "get user media comment auth error.", e);
                mediaCommentReply = null;
                channelMovieHeadVM = channelMovieHeadVM2;
            }
        }
        mediaCommentReply = (MediaCommentReply) obj;
        Function1<MediaCommentReply, Unit> function1 = this.$action;
        if (function1 != null) {
            function1.invoke(mediaCommentReply);
        }
        channelMovieHeadVM.f75381c = mediaCommentReply;
        return Unit.INSTANCE;
    }
}
