package com.bilibili.ship.theseus.united.page.videolist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videolist/VideoSelectListViewKt$combineSelectListView$1.class */
final class VideoSelectListViewKt$combineSelectListView$1 extends ContinuationImpl {
    int label;
    Object result;

    public VideoSelectListViewKt$combineSelectListView$1(Continuation<? super VideoSelectListViewKt$combineSelectListView$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return w.a(null, null, null, false, false, 0, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}
