package com.bilibili.ship.theseus.united.page.playingarea;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$collectScrollingByTouch$1.class */
final class PageNestedScrollFusionRepository$collectScrollingByTouch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final PageNestedScrollFusionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$collectScrollingByTouch$1(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, Continuation<? super PageNestedScrollFusionRepository$collectScrollingByTouch$1> continuation) {
        super(continuation);
        this.this$0 = pageNestedScrollFusionRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PageNestedScrollFusionRepository.b(this.this$0, null, this);
    }
}
