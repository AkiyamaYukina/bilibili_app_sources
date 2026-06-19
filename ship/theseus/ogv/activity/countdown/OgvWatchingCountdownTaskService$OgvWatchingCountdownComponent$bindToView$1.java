package com.bilibili.ship.theseus.ogv.activity.countdown;

import com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/countdown/OgvWatchingCountdownTaskService$OgvWatchingCountdownComponent$bindToView$1.class */
public final class OgvWatchingCountdownTaskService$OgvWatchingCountdownComponent$bindToView$1 extends ContinuationImpl {
    int label;
    Object result;
    final OgvWatchingCountdownTaskService.OgvWatchingCountdownComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvWatchingCountdownTaskService$OgvWatchingCountdownComponent$bindToView$1(OgvWatchingCountdownTaskService.OgvWatchingCountdownComponent ogvWatchingCountdownComponent, Continuation<? super OgvWatchingCountdownTaskService$OgvWatchingCountdownComponent$bindToView$1> continuation) {
        super(continuation);
        this.this$0 = ogvWatchingCountdownComponent;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.bindToView(null, this);
    }
}
