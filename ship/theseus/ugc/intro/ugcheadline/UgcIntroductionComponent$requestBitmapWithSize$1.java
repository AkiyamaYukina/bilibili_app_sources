package com.bilibili.ship.theseus.ugc.intro.ugcheadline;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcheadline/UgcIntroductionComponent$requestBitmapWithSize$1.class */
final class UgcIntroductionComponent$requestBitmapWithSize$1 extends ContinuationImpl {
    int label;
    Object result;
    final UgcIntroductionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcIntroductionComponent$requestBitmapWithSize$1(UgcIntroductionComponent ugcIntroductionComponent, Continuation<? super UgcIntroductionComponent$requestBitmapWithSize$1> continuation) {
        super(continuation);
        this.this$0 = ugcIntroductionComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UgcIntroductionComponent.b(this.this$0, null, null, 0, this);
    }
}
