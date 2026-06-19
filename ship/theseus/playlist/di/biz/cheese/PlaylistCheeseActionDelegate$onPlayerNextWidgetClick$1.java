package com.bilibili.ship.theseus.playlist.di.biz.cheese;

import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/cheese/PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1.class */
public final class PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistCheeseActionDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1(PlaylistCheeseActionDelegate playlistCheeseActionDelegate, Continuation<? super PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistCheeseActionDelegate;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BLog.i("PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1-invokeSuspend", "[theseus-playlist-PlaylistCheeseActionDelegate$onPlayerNextWidgetClick$1-invokeSuspend] Handling manually next");
            PlaylistSchedulingService playlistSchedulingService = this.this$0.f95360b;
            this.label = 1;
            if (PlaylistSchedulingService.i(playlistSchedulingService, false, true, this, 5) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
