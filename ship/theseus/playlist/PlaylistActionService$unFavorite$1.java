package com.bilibili.ship.theseus.playlist;

import androidx.compose.ui.text.font.C4496a;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.playlist.C6241f;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistActionService$unFavorite$1.class */
final class PlaylistActionService$unFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $id;
    final Function0<Unit> $onSuccess;
    int label;
    final C6241f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistActionService$unFavorite$1(C6241f c6241f, long j7, Function0<Unit> function0, Continuation<? super PlaylistActionService$unFavorite$1> continuation) {
        super(2, continuation);
        this.this$0 = c6241f;
        this.$id = j7;
        this.$onSuccess = function0;
    }

    private static final PlaylistInfo invokeSuspend$lambda$0$0(PlaylistInfo playlistInfo) {
        return playlistInfo.i(false);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistActionService$unFavorite$1(this.this$0, this.$id, this.$onSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        MutableStateFlow<PlaylistInfo> mutableStateFlow;
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C6241f c6241f = this.this$0;
            C6241f.a aVar = c6241f.f95755l;
            long j7 = this.$id;
            String str = c6241f.f95753j.a().f123881c;
            String str2 = this.this$0.f95753j.a().f123880b;
            this.this$0.getClass();
            String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
            this.label = 1;
            Object objUnFavorite = aVar.unFavorite(j7, str, str2, strCurrentPolarisActionId, this);
            obj = objUnFavorite;
            if (objUnFavorite == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BiliApiResponse biliApiResponse = (BiliApiResponse) obj;
        C6241f c6241f2 = this.this$0;
        Function0<Unit> function0 = this.$onSuccess;
        if (biliApiResponse instanceof BiliApiResponse.BusinessFailure) {
            BiliApiResponse.BusinessFailure businessFailure = (BiliApiResponse.BusinessFailure) biliApiResponse;
            BLog.e("PlaylistActionService$unFavorite$1-invokeSuspend", "[theseus-playlist-PlaylistActionService$unFavorite$1-invokeSuspend] " + androidx.core.app.o.a(businessFailure.getCode(), "onBusinessFailure, ", " ", businessFailure.getMessage()), (Throwable) null);
            com.bilibili.ship.theseus.united.utils.q.c(businessFailure.getMessage());
        } else if (biliApiResponse instanceof BiliApiResponse.ServiceUnavailable) {
            BLog.e("PlaylistActionService$unFavorite$1-invokeSuspend", "[theseus-playlist-PlaylistActionService$unFavorite$1-invokeSuspend] " + C4496a.a("onServiceUnavailable, ", ((BiliApiResponse.ServiceUnavailable) biliApiResponse).getException().getMessage()), (Throwable) null);
            com.bilibili.ship.theseus.united.utils.q.b(2131846937);
        } else {
            if (!(biliApiResponse instanceof BiliApiResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            PlaylistRepository playlistRepository = c6241f2.f95748d;
            do {
                mutableStateFlow = playlistRepository.f95101i;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, invokeSuspend$lambda$0$0((PlaylistInfo) value)));
            com.bilibili.ship.theseus.united.utils.q.b(2131851573);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
