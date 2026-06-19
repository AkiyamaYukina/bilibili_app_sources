package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/ChronosBusinessService$addUpdatePlayerLockStateHandler$1.class */
final class ChronosBusinessService$addUpdatePlayerLockStateHandler$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final ChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChronosBusinessService$addUpdatePlayerLockStateHandler$1(ChronosBusinessService chronosBusinessService, Continuation<? super ChronosBusinessService$addUpdatePlayerLockStateHandler$1> continuation) {
        super(continuation);
        this.this$0 = chronosBusinessService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChronosBusinessService.a(this.this$0, this);
    }
}
