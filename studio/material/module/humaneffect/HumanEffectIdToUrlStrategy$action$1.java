package com.bilibili.studio.material.module.humaneffect;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/module/humaneffect/HumanEffectIdToUrlStrategy$action$1.class */
public final class HumanEffectIdToUrlStrategy$action$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final HumanEffectIdToUrlStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HumanEffectIdToUrlStrategy$action$1(HumanEffectIdToUrlStrategy humanEffectIdToUrlStrategy, Continuation<? super HumanEffectIdToUrlStrategy$action$1> continuation) {
        super(continuation);
        this.this$0 = humanEffectIdToUrlStrategy;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
