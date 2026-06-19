package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheeseRelatedCoursesService$requestRelatedCoursesDetails$1.class */
final class CheeseRelatedCoursesService$requestRelatedCoursesDetails$1 extends ContinuationImpl {
    int label;
    Object result;
    final M this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseRelatedCoursesService$requestRelatedCoursesDetails$1(M m7, Continuation<? super CheeseRelatedCoursesService$requestRelatedCoursesDetails$1> continuation) {
        super(continuation);
        this.this$0 = m7;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
