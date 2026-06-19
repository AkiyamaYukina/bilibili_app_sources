package com.bilibili.playerbizcommonv2.web;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1.class */
final class PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1 extends ContinuationImpl {
    int label;
    Object result;
    final PlayerV3WebGeneralUIComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1(PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, Continuation<? super PlayerV3WebGeneralUIComponent$collectTopSpaceHeight$1> continuation) {
        super(continuation);
        this.this$0 = playerV3WebGeneralUIComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlayerV3WebGeneralUIComponent.c(this.this$0, null, this);
    }
}
