package com.bilibili.ship.theseus.ogv.media;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/media/AIEnhancedQualityReminderToastService$run$1.class */
final class AIEnhancedQualityReminderToastService$run$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final AIEnhancedQualityReminderToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIEnhancedQualityReminderToastService$run$1(AIEnhancedQualityReminderToastService aIEnhancedQualityReminderToastService, Continuation<AIEnhancedQualityReminderToastService$run$1> continuation) {
        super(continuation);
        this.this$0 = aIEnhancedQualityReminderToastService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AIEnhancedQualityReminderToastService.a(this.this$0, this);
    }
}
