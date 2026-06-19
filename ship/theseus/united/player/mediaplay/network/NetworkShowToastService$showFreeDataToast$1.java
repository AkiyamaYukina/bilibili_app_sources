package com.bilibili.ship.theseus.united.player.mediaplay.network;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/network/NetworkShowToastService$showFreeDataToast$1.class */
final class NetworkShowToastService$showFreeDataToast$1 extends ContinuationImpl {
    int label;
    Object result;
    final m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkShowToastService$showFreeDataToast$1(m mVar, Continuation<? super NetworkShowToastService$showFreeDataToast$1> continuation) {
        super(continuation);
        this.this$0 = mVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(false, this);
    }
}
