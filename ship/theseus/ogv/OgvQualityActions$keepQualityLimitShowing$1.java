package com.bilibili.ship.theseus.ogv;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvQualityActions$keepQualityLimitShowing$1.class */
final class OgvQualityActions$keepQualityLimitShowing$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final OgvQualityActions this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvQualityActions$keepQualityLimitShowing$1(OgvQualityActions ogvQualityActions, Continuation<? super OgvQualityActions$keepQualityLimitShowing$1> continuation) {
        super(continuation);
        this.this$0 = ogvQualityActions;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OgvQualityActions.h(this.this$0, null, this);
    }
}
