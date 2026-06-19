package com.bilibili.playset.widget.favorite;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelper$sortPlaylistCatching$1.class */
final class FavoriteApiHelper$sortPlaylistCatching$1 extends ContinuationImpl {
    int label;
    Object result;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteApiHelper$sortPlaylistCatching$1(f fVar, Continuation<? super FavoriteApiHelper$sortPlaylistCatching$1> continuation) {
        super(continuation);
        this.this$0 = fVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objG = this.this$0.g(0L, null, this);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : Result.box-impl(objG);
    }
}
