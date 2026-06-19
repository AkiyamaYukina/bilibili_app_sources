package com.bilibili.ship.theseus.ogv;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ArchiveUpdateService$refreshArchiveInfo$1.class */
final class ArchiveUpdateService$refreshArchiveInfo$1 extends ContinuationImpl {
    int label;
    Object result;
    final ArchiveUpdateService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveUpdateService$refreshArchiveInfo$1(ArchiveUpdateService archiveUpdateService, Continuation<? super ArchiveUpdateService$refreshArchiveInfo$1> continuation) {
        super(continuation);
        this.this$0 = archiveUpdateService;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ArchiveUpdateService.a(this.this$0, 0L, null, this);
    }
}
