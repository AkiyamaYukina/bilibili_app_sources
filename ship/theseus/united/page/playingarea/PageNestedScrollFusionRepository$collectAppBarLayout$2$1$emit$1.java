package com.bilibili.ship.theseus.united.page.playingarea;

import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository$collectAppBarLayout$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectAppBarLayout$2$1$emit$1.class */
public final class PageNestedScrollFusionRepository$collectAppBarLayout$2$1$emit$1 extends ContinuationImpl {
    int I$0;
    int label;
    Object result;
    final PageNestedScrollFusionRepository$collectAppBarLayout$2.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PageNestedScrollFusionRepository$collectAppBarLayout$2$1$emit$1(PageNestedScrollFusionRepository$collectAppBarLayout$2.AnonymousClass1<? super T> anonymousClass1, Continuation<? super PageNestedScrollFusionRepository$collectAppBarLayout$2$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, (Continuation<? super Unit>) this);
    }
}
