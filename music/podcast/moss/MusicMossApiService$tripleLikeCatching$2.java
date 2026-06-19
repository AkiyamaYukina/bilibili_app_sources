package com.bilibili.music.podcast.moss;

import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.ListenerMossKtxKt;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bapis.bilibili.app.listener.v1.TripleLikeReq;
import com.bapis.bilibili.app.listener.v1.TripleLikeResp;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/MusicMossApiService$tripleLikeCatching$2.class */
final class MusicMossApiService$tripleLikeCatching$2 extends SuspendLambda implements Function1<Continuation<? super TripleLikeResp>, Object> {
    final long $oid;
    final long $sid;
    final int $type;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMossApiService$tripleLikeCatching$2(long j7, long j8, int i7, Continuation<? super MusicMossApiService$tripleLikeCatching$2> continuation) {
        super(1, continuation);
        this.$oid = j7;
        this.$sid = j8;
        this.$type = i7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MusicMossApiService$tripleLikeCatching$2(this.$oid, this.$sid, this.$type, continuation);
    }

    public final Object invoke(Continuation<? super TripleLikeResp> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TripleLikeReq tripleLikeReqBuild = TripleLikeReq.newBuilder().setItem(PlayItem.newBuilder().setOid(this.$oid).addSubId(this.$sid).setItemType(this.$type).build()).build();
            ListenerMoss listenerMoss = new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
            this.label = 1;
            Object objSuspendTripleLike = ListenerMossKtxKt.suspendTripleLike(listenerMoss, tripleLikeReqBuild, this);
            obj = objSuspendTripleLike;
            if (objSuspendTripleLike == coroutine_suspended) {
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
