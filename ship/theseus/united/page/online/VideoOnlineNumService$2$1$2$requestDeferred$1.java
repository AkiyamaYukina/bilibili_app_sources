package com.bilibili.ship.theseus.united.page.online;

import com.bapis.bilibili.app.playeronline.v1.OnlineMossKtxKt;
import com.bapis.bilibili.app.playeronline.v1.PlayerOnlineMoss;
import com.bapis.bilibili.app.playeronline.v1.PlayerOnlineReply;
import com.bapis.bilibili.app.playeronline.v1.PlayerOnlineReq;
import com.bilibili.bangumi.logic.page.detail.service.e;
import com.bilibili.lib.moss.api.CallOptions;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNumService$2$1$2$requestDeferred$1.class */
public final class VideoOnlineNumService$2$1$2$requestDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $avid;
    final long $cid;
    final Ref.BooleanRef $isNewPlay;
    int label;
    final VideoOnlineNumService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoOnlineNumService$2$1$2$requestDeferred$1(long j7, long j8, Ref.BooleanRef booleanRef, VideoOnlineNumService videoOnlineNumService, Continuation<? super VideoOnlineNumService$2$1$2$requestDeferred$1> continuation) {
        super(2, continuation);
        this.$avid = j7;
        this.$cid = j8;
        this.$isNewPlay = booleanRef;
        this.this$0 = videoOnlineNumService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VideoOnlineNumService$2$1$2$requestDeferred$1(this.$avid, this.$cid, this.$isNewPlay, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        PlayerOnlineReply playerOnlineReply;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayerOnlineReq playerOnlineReqBuild = PlayerOnlineReq.newBuilder().setAid(this.$avid).setCid(this.$cid).setPlayOpen(this.$isNewPlay.element).build();
                BLog.i("VideoOnlineNumService$2$1$2$requestDeferred$1-invokeSuspend", "[theseus-united-VideoOnlineNumService$2$1$2$requestDeferred$1-invokeSuspend] " + ("aid: " + this.$avid + ", cid: " + this.$cid + ", playNew: " + this.$isNewPlay.element));
                PlayerOnlineMoss playerOnlineMoss = new PlayerOnlineMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
                this.label = 1;
                Object objSuspendPlayerOnline = OnlineMossKtxKt.suspendPlayerOnline(playerOnlineMoss, playerOnlineReqBuild, this);
                obj = objSuspendPlayerOnline;
                if (objSuspendPlayerOnline == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            playerOnlineReply = (PlayerOnlineReply) obj;
        } catch (CancellationException e7) {
            throw e7;
        } catch (Exception e8) {
            e.a("[theseus-united-VideoOnlineNumService$2$1$2$requestDeferred$1-invokeSuspend] ", N4.a.a("requestDeferred error ", e8), "VideoOnlineNumService$2$1$2$requestDeferred$1-invokeSuspend", (Throwable) null);
        }
        if (playerOnlineReply == null) {
            return Unit.INSTANCE;
        }
        this.$isNewPlay.element = false;
        VideoOnlineNumService.a(this.this$0, this.$avid, this.$cid, playerOnlineReply);
        BLog.i("VideoOnlineNumService$2$1$2$requestDeferred$1-invokeSuspend", "[theseus-united-VideoOnlineNumService$2$1$2$requestDeferred$1-invokeSuspend] " + playerOnlineReply.toString());
        return Unit.INSTANCE;
    }
}
