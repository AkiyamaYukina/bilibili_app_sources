package com.bilibili.music.podcast.moss;

import com.bapis.bilibili.app.listener.v1.FavFolderListReq;
import com.bapis.bilibili.app.listener.v1.FavFolderListResp;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bapis.bilibili.app.listener.v1.ListenerMossKtxKt;
import com.bapis.bilibili.app.listener.v1.PlayItem;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.music.podcast.collection.data.FavFolderListRespResult;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/MusicMossApiService$getFavFolderListCatching$2.class */
final class MusicMossApiService$getFavFolderListCatching$2 extends SuspendLambda implements Function1<Continuation<? super FavFolderListRespResult>, Object> {
    final PlayItem $playItem;
    final List<Integer> $typeList;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMossApiService$getFavFolderListCatching$2(List<Integer> list, PlayItem playItem, Continuation<? super MusicMossApiService$getFavFolderListCatching$2> continuation) {
        super(1, continuation);
        this.$typeList = list;
        this.$playItem = playItem;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MusicMossApiService$getFavFolderListCatching$2(this.$typeList, this.$playItem, continuation);
    }

    public final Object invoke(Continuation<? super FavFolderListRespResult> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            FavFolderListReq favFolderListReqBuild = FavFolderListReq.newBuilder().addAllFolderTypes(this.$typeList).setItem(this.$playItem).build();
            ListenerMoss listenerMoss = new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null);
            this.label = 1;
            Object objSuspendFavFolderList = ListenerMossKtxKt.suspendFavFolderList(listenerMoss, favFolderListReqBuild, this);
            obj = objSuspendFavFolderList;
            if (objSuspendFavFolderList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        FavFolderListResp favFolderListResp = (FavFolderListResp) obj;
        return favFolderListResp != null ? new FavFolderListRespResult(favFolderListResp) : null;
    }
}
