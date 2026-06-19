package com.bilibili.playerbizcommon.widget.control.seekbar;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarPngThumb$load$1.class */
public final class PlayerSeekbarPngThumb$load$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final PlayerSeekbarPngThumb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarPngThumb$load$1(PlayerSeekbarPngThumb playerSeekbarPngThumb, Continuation<? super PlayerSeekbarPngThumb$load$1> continuation) {
        super(continuation);
        this.this$0 = playerSeekbarPngThumb;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, this);
    }
}
