package com.bilibili.music.podcast.moss;

import com.bapis.bilibili.app.listener.v1.FavItemAddReq;
import com.bapis.bilibili.app.listener.v1.FavItemAddResp;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.ListenerMossKtxKt;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bilibili.lib.moss.api.CallOptions;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/MusicMossApiService$favToDefaultCatching$2.class */
final class MusicMossApiService$favToDefaultCatching$2 extends SuspendLambda implements Function1<Continuation<? super FavItemAddResp>, Object> {
    final int $itemType;
    final long $oid;
    final long $sid;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMossApiService$favToDefaultCatching$2(long j7, long j8, int i7, Continuation<? super MusicMossApiService$favToDefaultCatching$2> continuation) {
        super(1, continuation);
        this.$oid = j7;
        this.$sid = j8;
        this.$itemType = i7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MusicMossApiService$favToDefaultCatching$2(this.$oid, this.$sid, this.$itemType, continuation);
    }

    public final Object invoke(Continuation<? super FavItemAddResp> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FavItemAddReq favItemAddReqBuild = FavItemAddReq.newBuilder().setIsFastAddFav(true).setPlay(PlayItem.newBuilder().setOid(this.$oid).addSubId(this.$sid).setItemType(this.$itemType).build()).build();
            ListenerMoss listenerMoss = new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
            this.label = 1;
            Object objSuspendFavItemAdd = ListenerMossKtxKt.suspendFavItemAdd(listenerMoss, favItemAddReqBuild, this);
            obj = objSuspendFavItemAdd;
            if (objSuspendFavItemAdd == coroutine_suspended) {
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
