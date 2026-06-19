package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.hls.PlaylistItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$p2pM4sFetch$resultJob$1.class */
public final class SistersPlayerLoader$p2pM4sFetch$resultJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.LongRef $delayTimeMs;
    final String $fragName;
    final PlaylistItem $item;
    final long $startTime;
    final String $url;
    int label;
    final SistersPlayerLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SistersPlayerLoader$p2pM4sFetch$resultJob$1(SistersPlayerLoader sistersPlayerLoader, String str, PlaylistItem playlistItem, long j7, String str2, Ref.LongRef longRef, Continuation<? super SistersPlayerLoader$p2pM4sFetch$resultJob$1> continuation) {
        super(2, continuation);
        this.this$0 = sistersPlayerLoader;
        this.$fragName = str;
        this.$item = playlistItem;
        this.$startTime = j7;
        this.$url = str2;
        this.$delayTimeMs = longRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SistersPlayerLoader$p2pM4sFetch$resultJob$1(this.this$0, this.$fragName, this.$item, this.$startTime, this.$url, this.$delayTimeMs, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.p2p.onFragmentFinished(this.$fragName, this.this$0.fragmentFinished(this.$item, this.$startTime, this.$url));
            long j7 = this.$delayTimeMs.element;
            if (j7 > 0) {
                this.label = 1;
                if (DelayKt.delay(j7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        P2P p2p = this.this$0.p2p;
        String str = this.$fragName;
        this.label = 2;
        if (p2p.stopDownloadFragment(str, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
