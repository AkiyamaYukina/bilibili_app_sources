package com.bilibili.ship.theseus.united.page.videoquality;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$reportSwitchClarity$1.class */
final class TheseusPlayerQualityService$reportSwitchClarity$1 extends ContinuationImpl {
    int label;
    Object result;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$reportSwitchClarity$1(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super TheseusPlayerQualityService$reportSwitchClarity$1> continuation) {
        super(continuation);
        this.this$0 = theseusPlayerQualityService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TheseusPlayerQualityService.b(this.this$0, this);
    }
}
