package com.bilibili.ship.theseus.playlist.di.biz;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1.class */
final class PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final d $scrollListener;
    private Object L$0;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1(e eVar, d dVar, Continuation<? super PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$scrollListener = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1 playlistFloatingSuppressService$addIntroRecyclerScrollStateListener$1 = new PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1(this.this$0, this.$scrollListener, continuation);
        playlistFloatingSuppressService$addIntroRecyclerScrollStateListener$1.L$0 = obj;
        return playlistFloatingSuppressService$addIntroRecyclerScrollStateListener$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        this.this$0.f95371d.a(this.$scrollListener);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlaylistFloatingSuppressService$addIntroRecyclerScrollStateListener$1$invokeSuspend$$inlined$awaitCancel$1(null, this.this$0, this.$scrollListener), 3, (Object) null);
        return Unit.INSTANCE;
    }
}
