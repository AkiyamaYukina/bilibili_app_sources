package com.bilibili.ogv.operation3.filmlisthub.api;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/api/PgcFilmListHubChannelApi$requestFilmListData$1.class */
final class PgcFilmListHubChannelApi$requestFilmListData$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PgcFilmListHubChannelApi$requestFilmListData$1(d dVar, Continuation<? super PgcFilmListHubChannelApi$requestFilmListData$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, 0L, null, this);
    }
}
