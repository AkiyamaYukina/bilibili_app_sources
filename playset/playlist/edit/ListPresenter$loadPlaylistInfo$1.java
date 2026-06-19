package com.bilibili.playset.playlist.edit;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/ListPresenter$loadPlaylistInfo$1.class */
final class ListPresenter$loadPlaylistInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final ListPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPresenter$loadPlaylistInfo$1(ListPresenter listPresenter, Continuation<? super ListPresenter$loadPlaylistInfo$1> continuation) {
        super(continuation);
        this.this$0 = listPresenter;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ListPresenter.b(this.this$0, this);
    }
}
