package com.bilibili.sistersplayer.p2p;

import com.bilibili.sistersplayer.hls.FetchResult;
import com.bilibili.sistersplayer.hls.PlaylistItem;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/SistersPlayerLoader$m4sFetchAsStream$1$1.class */
public final class SistersPlayerLoader$m4sFetchAsStream$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PlaylistItem $item;
    final long $startTime;
    int label;
    final SistersPlayerLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SistersPlayerLoader$m4sFetchAsStream$1$1(PlaylistItem playlistItem, SistersPlayerLoader sistersPlayerLoader, long j7, Continuation<? super SistersPlayerLoader$m4sFetchAsStream$1$1> continuation) {
        super(2, continuation);
        this.$item = playlistItem;
        this.this$0 = sistersPlayerLoader;
        this.$startTime = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SistersPlayerLoader$m4sFetchAsStream$1$1(this.$item, this.this$0, this.$startTime, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String uri = this.$item.getUri();
            int iA = StringsKt.A(uri, "?", 0, false, 6);
            int length = iA;
            if (iA < 0) {
                length = uri.length();
            }
            String strSubstring = uri.substring(StringsKt.D(uri, "/", 0, 6) + 1, length);
            boolean z6 = this.this$0.canStartP2PTask.get();
            if (strSubstring.length() == 0) {
                this.this$0.hls7Player.onM4sFetched(this.$item, this.$startTime, new FetchResult<>(false, "frag name is null", -1, null, null, false, null, 120, null), "fetch fail frag name is null");
            } else if (z6) {
                this.this$0.p2pM4sFetch(this.$item, this.$startTime, uri, strSubstring);
            } else {
                SistersPlayerLoader sistersPlayerLoader = this.this$0;
                PlaylistItem playlistItem = this.$item;
                long j7 = this.$startTime;
                this.label = 1;
                if (sistersPlayerLoader.cdnM4sFetch(playlistItem, j7, uri, strSubstring, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
