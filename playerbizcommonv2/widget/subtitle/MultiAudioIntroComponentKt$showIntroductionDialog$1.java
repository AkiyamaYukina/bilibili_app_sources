package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/MultiAudioIntroComponentKt$showIntroductionDialog$1.class */
final class MultiAudioIntroComponentKt$showIntroductionDialog$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public MultiAudioIntroComponentKt$showIntroductionDialog$1(Continuation<? super MultiAudioIntroComponentKt$showIntroductionDialog$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C5892y.c(null, null, this);
    }
}
