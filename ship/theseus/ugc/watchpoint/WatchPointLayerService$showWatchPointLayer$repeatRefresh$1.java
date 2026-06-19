package com.bilibili.ship.theseus.ugc.watchpoint;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/watchpoint/WatchPointLayerService$showWatchPointLayer$repeatRefresh$1.class */
final class WatchPointLayerService$showWatchPointLayer$repeatRefresh$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    Object result;

    public WatchPointLayerService$showWatchPointLayer$repeatRefresh$1(Continuation<? super WatchPointLayerService$showWatchPointLayer$repeatRefresh$1> continuation) {
        super(continuation);
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WatchPointLayerService.b(null, null, null, null, null, this);
    }
}
