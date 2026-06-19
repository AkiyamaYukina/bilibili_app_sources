package com.bilibili.playset.playlist.viewmodels;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModel$sortMedias$1.class */
public final class PlaylistViewModel$sortMedias$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    final String $sortOps;
    private Object L$0;
    int label;
    final PlaylistViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$sortMedias$1(String str, long j7, PlaylistViewModel playlistViewModel, Continuation<? super PlaylistViewModel$sortMedias$1> continuation) {
        super(2, continuation);
        this.$sortOps = str;
        this.$playlistId = j7;
        this.this$0 = playlistViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistViewModel$sortMedias$1 playlistViewModel$sortMedias$1 = new PlaylistViewModel$sortMedias$1(this.$sortOps, this.$playlistId, this.this$0, continuation);
        playlistViewModel$sortMedias$1.L$0 = obj;
        return playlistViewModel$sortMedias$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        Exception e7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                String str = this.$sortOps;
                long j7 = this.$playlistId;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (com.bilibili.playset.api.i.f(j7, str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e8) {
                coroutineScope2 = coroutineScope;
                e7 = e8;
                BLog.w("PlaylistViewModel", e7);
                CoroutineScopeKt.ensureActive(coroutineScope2);
                this.this$0.f85536q.setValue(Boxing.boxBoolean(false));
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            coroutineScope2 = coroutineScope3;
            try {
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope3;
            } catch (Exception e9) {
                e7 = e9;
                BLog.w("PlaylistViewModel", e7);
                CoroutineScopeKt.ensureActive(coroutineScope2);
                this.this$0.f85536q.setValue(Boxing.boxBoolean(false));
            }
        }
        CoroutineScopeKt.ensureActive(coroutineScope);
        coroutineScope2 = coroutineScope;
        this.this$0.f85536q.setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
