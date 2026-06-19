package com.bilibili.playset.widget.favorite;

import com.bilibili.lib.coroutineextension.BiliCallExtKt;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.okretro.call.BiliCall;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$sortPlaylistCatching$2.class */
final class FavoriteApiHelper$sortPlaylistCatching$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final long $playlistId;
    final String $sortOps;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$sortPlaylistCatching$2(String str, long j7, Continuation<? super FavoriteApiHelper$sortPlaylistCatching$2> continuation) {
        super(1, continuation);
        this.$sortOps = str;
        this.$playlistId = j7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FavoriteApiHelper$sortPlaylistCatching$2(this.$sortOps, this.$playlistId, continuation);
    }

    public final Object invoke(Continuation<? super String> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BiliCall<GeneralResponse<String>> biliCallSortPlaySetMedias = ((FavoriteService) ServiceGenerator.createService(FavoriteService.class)).sortPlaySetMedias(this.$sortOps, this.$playlistId);
            this.label = 1;
            Object data = BiliCallExtKt.getData(biliCallSortPlaySetMedias, this);
            obj = data;
            if (data == coroutine_suspended) {
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
