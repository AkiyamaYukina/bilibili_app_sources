package com.bilibili.ship.theseus.united.player.ai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/UnitedAiService$showGuideDialog$1.class */
final class UnitedAiService$showGuideDialog$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final UnitedAiService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitedAiService$showGuideDialog$1(UnitedAiService unitedAiService, Continuation<? super UnitedAiService$showGuideDialog$1> continuation) {
        super(continuation);
        this.this$0 = unitedAiService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UnitedAiService.a(this.this$0, this);
    }
}
