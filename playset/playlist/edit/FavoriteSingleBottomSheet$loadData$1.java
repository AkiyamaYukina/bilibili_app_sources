package com.bilibili.playset.playlist.edit;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/FavoriteSingleBottomSheet$loadData$1.class */
final class FavoriteSingleBottomSheet$loadData$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    Object result;
    final FavoriteSingleBottomSheet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteSingleBottomSheet$loadData$1(FavoriteSingleBottomSheet favoriteSingleBottomSheet, Continuation<? super FavoriteSingleBottomSheet$loadData$1> continuation) {
        super(continuation);
        this.this$0 = favoriteSingleBottomSheet;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FavoriteSingleBottomSheet.jf(this.this$0, false, this);
    }
}
