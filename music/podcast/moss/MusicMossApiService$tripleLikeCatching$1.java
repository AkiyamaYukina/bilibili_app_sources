package com.bilibili.music.podcast.moss;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/MusicMossApiService$tripleLikeCatching$1.class */
final class MusicMossApiService$tripleLikeCatching$1 extends ContinuationImpl {
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMossApiService$tripleLikeCatching$1(f fVar, Continuation<? super MusicMossApiService$tripleLikeCatching$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objF = this.this$0.f(0, 0L, 0L, this);
        return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : Result.box-impl(objF);
    }
}
