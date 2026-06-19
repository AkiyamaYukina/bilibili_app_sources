package com.bilibili.sistersplayer.hls;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$fetchInitM4s$1$1$1.class */
public final class Hls7Player$fetchInitM4s$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $fetchBegin;
    final FetchResult<byte[]> $initResult;
    final PlaylistItem $item;
    int label;
    final Hls7Player this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hls7Player$fetchInitM4s$1$1$1(Hls7Player hls7Player, PlaylistItem playlistItem, long j7, FetchResult<byte[]> fetchResult, Continuation<? super Hls7Player$fetchInitM4s$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = hls7Player;
        this.$item = playlistItem;
        this.$fetchBegin = j7;
        this.$initResult = fetchResult;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Hls7Player$fetchInitM4s$1$1$1(this.this$0, this.$item, this.$fetchBegin, this.$initResult, continuation);
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
        this.this$0.onInitM4sFetched(this.$item.getUri(), this.$item, this.$fetchBegin, this.$initResult);
        return Unit.INSTANCE;
    }
}
