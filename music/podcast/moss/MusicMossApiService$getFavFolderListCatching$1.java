package com.bilibili.music.podcast.moss;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/moss/MusicMossApiService$getFavFolderListCatching$1.class */
final class MusicMossApiService$getFavFolderListCatching$1 extends ContinuationImpl {
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMossApiService$getFavFolderListCatching$1(f fVar, Continuation<? super MusicMossApiService$getFavFolderListCatching$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objC = this.this$0.c(null, null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Result.box-impl(objC);
    }
}
