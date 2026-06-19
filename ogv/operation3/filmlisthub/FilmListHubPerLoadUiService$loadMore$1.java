package com.bilibili.ogv.operation3.filmlisthub;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/FilmListHubPerLoadUiService$loadMore$1.class */
final class FilmListHubPerLoadUiService$loadMore$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final FilmListHubPerLoadUiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilmListHubPerLoadUiService$loadMore$1(FilmListHubPerLoadUiService filmListHubPerLoadUiService, Continuation<? super FilmListHubPerLoadUiService$loadMore$1> continuation) {
        super(continuation);
        this.this$0 = filmListHubPerLoadUiService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FilmListHubPerLoadUiService.b(this.this$0, 0L, this);
    }
}
