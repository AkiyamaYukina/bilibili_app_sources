package com.bilibili.playerbizcommonv2.danmaku.input;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/input/PlayerInputControllerKtxKt$keepShowing$1.class */
final class PlayerInputControllerKtxKt$keepShowing$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;

    public PlayerInputControllerKtxKt$keepShowing$1(Continuation<? super PlayerInputControllerKtxKt$keepShowing$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.a(null, this);
    }
}
