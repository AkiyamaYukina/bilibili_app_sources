package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/SubtitleAndAiWidget$showOverflowGuideInternal$1.class */
final class SubtitleAndAiWidget$showOverflowGuideInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final SubtitleAndAiWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubtitleAndAiWidget$showOverflowGuideInternal$1(SubtitleAndAiWidget subtitleAndAiWidget, Continuation<? super SubtitleAndAiWidget$showOverflowGuideInternal$1> continuation) {
        super(continuation);
        this.this$0 = subtitleAndAiWidget;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SubtitleAndAiWidget subtitleAndAiWidget = this.this$0;
        int i7 = SubtitleAndAiWidget.f83581u;
        return subtitleAndAiWidget.m0(this);
    }
}
