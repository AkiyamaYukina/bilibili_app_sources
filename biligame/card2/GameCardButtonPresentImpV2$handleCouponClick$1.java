package com.bilibili.biligame.card2;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/card2/GameCardButtonPresentImpV2$handleCouponClick$1.class */
public final class GameCardButtonPresentImpV2$handleCouponClick$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final GameCardButtonPresentImpV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardButtonPresentImpV2$handleCouponClick$1(GameCardButtonPresentImpV2 gameCardButtonPresentImpV2, Continuation<? super GameCardButtonPresentImpV2$handleCouponClick$1> continuation) {
        super(continuation);
        this.this$0 = gameCardButtonPresentImpV2;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
