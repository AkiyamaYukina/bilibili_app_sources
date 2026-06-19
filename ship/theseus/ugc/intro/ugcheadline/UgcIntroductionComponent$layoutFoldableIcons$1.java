package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$layoutFoldableIcons$1.class */
final class UgcIntroductionComponent$layoutFoldableIcons$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final UgcIntroductionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroductionComponent$layoutFoldableIcons$1(UgcIntroductionComponent ugcIntroductionComponent, Continuation<? super UgcIntroductionComponent$layoutFoldableIcons$1> continuation) {
        super(continuation);
        this.this$0 = ugcIntroductionComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UgcIntroductionComponent.a(this.this$0, null, null, 0, 0, false, null, null, null, this);
    }
}
