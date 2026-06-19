package com.bilibili.playset.widget.favorite;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/FavoriteApiHelperKt$suspendRunCatching$1.class */
final class FavoriteApiHelperKt$suspendRunCatching$1<T> extends ContinuationImpl {
    int label;
    Object result;

    public FavoriteApiHelperKt$suspendRunCatching$1(Continuation<? super FavoriteApiHelperKt$suspendRunCatching$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = g.a(null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.box-impl(objA);
    }
}
