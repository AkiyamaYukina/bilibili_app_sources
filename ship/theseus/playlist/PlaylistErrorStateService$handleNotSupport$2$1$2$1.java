package com.bilibili.ship.theseus.playlist;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$handleNotSupport$2$1$2$1.class */
public final class PlaylistErrorStateService$handleNotSupport$2$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistErrorStateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistErrorStateService$handleNotSupport$2$1$2$1(PlaylistErrorStateService playlistErrorStateService, Continuation<? super PlaylistErrorStateService$handleNotSupport$2$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistErrorStateService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistErrorStateService$handleNotSupport$2$1$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlaylistErrorStateService playlistErrorStateService = this.this$0;
            PlaylistSchedulingService playlistSchedulingService = playlistErrorStateService.f95035c;
            boolean z6 = playlistErrorStateService.f95034b.f95092O;
            this.label = 1;
            if (PlaylistSchedulingService.i(playlistSchedulingService, !z6, true, this, 4) == coroutine_suspended) {
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
