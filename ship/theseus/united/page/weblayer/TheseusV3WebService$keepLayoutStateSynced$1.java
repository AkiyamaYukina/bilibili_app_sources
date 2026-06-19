package com.bilibili.ship.theseus.united.page.weblayer;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$keepLayoutStateSynced$1.class */
final class TheseusV3WebService$keepLayoutStateSynced$1 extends ContinuationImpl {
    int label;
    Object result;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$keepLayoutStateSynced$1(l lVar, Continuation<? super TheseusV3WebService$keepLayoutStateSynced$1> continuation) {
        super(continuation);
        this.this$0 = lVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return l.a(this.this$0, null, null, this);
    }
}
