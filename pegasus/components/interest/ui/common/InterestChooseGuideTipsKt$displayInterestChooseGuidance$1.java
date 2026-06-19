package com.bilibili.pegasus.components.interest.ui.common;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/common/InterestChooseGuideTipsKt$displayInterestChooseGuidance$1.class */
final class InterestChooseGuideTipsKt$displayInterestChooseGuidance$1 extends ContinuationImpl {
    int label;
    Object result;

    public InterestChooseGuideTipsKt$displayInterestChooseGuidance$1(Continuation<? super InterestChooseGuideTipsKt$displayInterestChooseGuidance$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.a(null, null, this);
    }
}
