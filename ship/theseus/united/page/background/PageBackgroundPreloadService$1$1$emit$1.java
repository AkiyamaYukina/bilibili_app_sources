package com.bilibili.ship.theseus.united.page.background;

import com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$1$1$emit$1.class */
public final class PageBackgroundPreloadService$1$1$emit$1 extends ContinuationImpl {
    int label;
    Object result;
    final PageBackgroundPreloadService.AnonymousClass1.C09471<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageBackgroundPreloadService$1$1$emit$1(PageBackgroundPreloadService.AnonymousClass1.C09471<? super T> c09471, Continuation<? super PageBackgroundPreloadService$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c09471;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(false, (Continuation<? super Unit>) this);
    }
}
