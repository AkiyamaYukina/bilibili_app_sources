package com.bilibili.playset.playlist.viewmodels;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$toTop$1$onDataSuccess$1.class */
final class PlaylistViewModelV2$toTop$1$onDataSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModelV2$toTop$1$onDataSuccess$1(PlaylistViewModelV2 playlistViewModelV2, Continuation<? super PlaylistViewModelV2$toTop$1$onDataSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistViewModelV2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistViewModelV2$toTop$1$onDataSuccess$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<Boolean> mutableSharedFlow = this.this$0.f85556r;
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            this.label = 1;
            if (mutableSharedFlow.emit(boolBoxBoolean, this) == coroutine_suspended) {
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
