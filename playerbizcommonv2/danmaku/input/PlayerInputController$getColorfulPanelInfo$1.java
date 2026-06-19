package com.bilibili.playerbizcommonv2.danmaku.input;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/PlayerInputController$getColorfulPanelInfo$1.class */
final class PlayerInputController$getColorfulPanelInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerInputController$getColorfulPanelInfo$1(g gVar, Continuation<? super PlayerInputController$getColorfulPanelInfo$1> continuation) {
        super(continuation);
        this.this$0 = gVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(this);
    }
}
