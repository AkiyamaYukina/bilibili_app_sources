package com.bilibili.pegasus.components.graduation;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$1.class */
final class GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$1(Continuation<? super GraduationSeasonAnalysisBackgroundPreloaderKt$preloadGraduationSeasonAnalysisBackground$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C5608i.a(null, this);
    }
}
