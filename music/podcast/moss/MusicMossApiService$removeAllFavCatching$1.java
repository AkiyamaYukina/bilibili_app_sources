package com.bilibili.music.podcast.moss;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/MusicMossApiService$removeAllFavCatching$1.class */
final class MusicMossApiService$removeAllFavCatching$1 extends ContinuationImpl {
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMossApiService$removeAllFavCatching$1(f fVar, Continuation<? super MusicMossApiService$removeAllFavCatching$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objE = this.this$0.e(0, 0L, 0L, this);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Result.box-impl(objE);
    }
}
