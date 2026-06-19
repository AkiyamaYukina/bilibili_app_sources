package com.bilibili.ship.theseus.playlist;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistService$initPlaylist$5.class */
final class PlaylistService$initPlaylist$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.playlist.uicomponent.D $component;
    int label;
    final E this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistService$initPlaylist$5(E e7, com.bilibili.ship.theseus.playlist.uicomponent.D d7, Continuation<? super PlaylistService$initPlaylist$5> continuation) {
        super(2, continuation);
        this.this$0 = e7;
        this.$component = d7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistService$initPlaylist$5(this.this$0, this.$component, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            E e7 = this.this$0;
            com.bilibili.ship.theseus.playlist.uicomponent.D d7 = this.$component;
            this.label = 1;
            e7.getClass();
            if (CoroutineScopeKt.coroutineScope(new PlaylistService$collectListExposureEffect$2(d7, e7, null), this) == coroutine_suspended) {
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
