package com.bilibili.ship.theseus.united.page.background;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$tryPreloadNextVideo$1.class */
final class PageBackgroundPreloadService$tryPreloadNextVideo$1 extends ContinuationImpl {
    int label;
    Object result;
    final PageBackgroundPreloadService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageBackgroundPreloadService$tryPreloadNextVideo$1(PageBackgroundPreloadService pageBackgroundPreloadService, Continuation<? super PageBackgroundPreloadService$tryPreloadNextVideo$1> continuation) {
        super(continuation);
        this.this$0 = pageBackgroundPreloadService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        PageBackgroundPreloadService pageBackgroundPreloadService = this.this$0;
        Lazy<Long> lazy = PageBackgroundPreloadService.f99015l;
        return pageBackgroundPreloadService.c(this);
    }
}
