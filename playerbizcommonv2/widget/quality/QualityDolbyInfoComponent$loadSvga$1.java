package com.bilibili.playerbizcommonv2.widget.quality;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/QualityDolbyInfoComponent$loadSvga$1.class */
public final class QualityDolbyInfoComponent$loadSvga$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final QualityDolbyInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityDolbyInfoComponent$loadSvga$1(QualityDolbyInfoComponent qualityDolbyInfoComponent, Continuation<? super QualityDolbyInfoComponent$loadSvga$1> continuation) {
        super(continuation);
        this.this$0 = qualityDolbyInfoComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        QualityDolbyInfoComponent qualityDolbyInfoComponent = this.this$0;
        int i7 = QualityDolbyInfoComponent.f82710d;
        return qualityDolbyInfoComponent.d(null, this);
    }
}
