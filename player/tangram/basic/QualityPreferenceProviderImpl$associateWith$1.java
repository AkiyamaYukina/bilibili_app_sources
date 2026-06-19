package com.bilibili.player.tangram.basic;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/QualityPreferenceProviderImpl$associateWith$1.class */
public final class QualityPreferenceProviderImpl$associateWith$1 extends ContinuationImpl {
    int label;
    Object result;
    final QualityPreferenceProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualityPreferenceProviderImpl$associateWith$1(QualityPreferenceProviderImpl qualityPreferenceProviderImpl, Continuation<? super QualityPreferenceProviderImpl$associateWith$1> continuation) {
        super(continuation);
        this.this$0 = qualityPreferenceProviderImpl;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
