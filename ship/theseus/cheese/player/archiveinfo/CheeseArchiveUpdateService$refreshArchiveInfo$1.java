package com.bilibili.ship.theseus.cheese.player.archiveinfo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/archiveinfo/CheeseArchiveUpdateService$refreshArchiveInfo$1.class */
final class CheeseArchiveUpdateService$refreshArchiveInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final CheeseArchiveUpdateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseArchiveUpdateService$refreshArchiveInfo$1(CheeseArchiveUpdateService cheeseArchiveUpdateService, Continuation<? super CheeseArchiveUpdateService$refreshArchiveInfo$1> continuation) {
        super(continuation);
        this.this$0 = cheeseArchiveUpdateService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CheeseArchiveUpdateService.a(this.this$0, 0L, this);
    }
}
