package com.bilibili.ogv.kmm.operation.listcontent;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/listcontent/PerLoadUiService$loadMore$1.class */
final class PerLoadUiService$loadMore$1 extends ContinuationImpl {
    int label;
    Object result;
    final PerLoadUiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerLoadUiService$loadMore$1(PerLoadUiService perLoadUiService, Continuation<? super PerLoadUiService$loadMore$1> continuation) {
        super(continuation);
        this.this$0 = perLoadUiService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PerLoadUiService.b(this.this$0, this);
    }
}
