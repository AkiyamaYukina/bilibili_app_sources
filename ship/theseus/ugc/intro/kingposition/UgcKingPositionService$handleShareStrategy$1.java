package com.bilibili.ship.theseus.ugc.intro.kingposition;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$handleShareStrategy$1.class */
final class UgcKingPositionService$handleShareStrategy$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    Object result;
    final UgcKingPositionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcKingPositionService$handleShareStrategy$1(UgcKingPositionService ugcKingPositionService, Continuation<? super UgcKingPositionService$handleShareStrategy$1> continuation) {
        super(continuation);
        this.this$0 = ugcKingPositionService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UgcKingPositionService.b(this.this$0, null, this);
    }
}
