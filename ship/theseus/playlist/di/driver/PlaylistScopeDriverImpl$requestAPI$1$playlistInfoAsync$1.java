package com.bilibili.ship.theseus.playlist.di.driver;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.okretro.response.BiliApiResponseKt;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.playlist.di.driver.c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlaylistScopeDriverImpl$requestAPI$1$playlistInfoAsync$1.class */
public final class PlaylistScopeDriverImpl$requestAPI$1$playlistInfoAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PlaylistInfo>>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistScopeDriverImpl$requestAPI$1$playlistInfoAsync$1(c cVar, Continuation<? super PlaylistScopeDriverImpl$requestAPI$1$playlistInfoAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistScopeDriverImpl$requestAPI$1$playlistInfoAsync$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<PlaylistInfo>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c cVar = this.this$0;
            com.bilibili.ship.theseus.playlist.util.c cVar2 = cVar.f95485i;
            c.a aVar = cVar.f95479b;
            long j7 = aVar.f95488a;
            int i8 = aVar.f95489b;
            String str = aVar.f95490c;
            this.label = 1;
            Object playlistBasicInfo = cVar2.getPlaylistBasicInfo(j7, i8, str, this);
            obj = playlistBasicInfo;
            if (playlistBasicInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Result.box-impl(BiliApiResponseKt.asResult((BiliApiResponse) obj));
    }
}
