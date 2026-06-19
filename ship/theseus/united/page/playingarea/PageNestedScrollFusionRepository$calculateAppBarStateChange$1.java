package com.bilibili.ship.theseus.united.page.playingarea;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PageNestedScrollFusionRepository$calculateAppBarStateChange$1.class */
final class PageNestedScrollFusionRepository$calculateAppBarStateChange$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final PageNestedScrollFusionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageNestedScrollFusionRepository$calculateAppBarStateChange$1(PageNestedScrollFusionRepository pageNestedScrollFusionRepository, Continuation<? super PageNestedScrollFusionRepository$calculateAppBarStateChange$1> continuation) {
        super(continuation);
        this.this$0 = pageNestedScrollFusionRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PageNestedScrollFusionRepository.a(this.this$0, null, null, 0, this);
    }
}
