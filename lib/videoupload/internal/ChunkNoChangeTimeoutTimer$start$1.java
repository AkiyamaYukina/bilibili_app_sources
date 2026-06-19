package com.bilibili.lib.videoupload.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/ChunkNoChangeTimeoutTimer$start$1.class */
final class ChunkNoChangeTimeoutTimer$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChunkNoChangeTimeoutTimer$start$1(c cVar, Continuation<? super ChunkNoChangeTimeoutTimer$start$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChunkNoChangeTimeoutTimer$start$1 chunkNoChangeTimeoutTimer$start$1 = new ChunkNoChangeTimeoutTimer$start$1(this.this$0, continuation);
        chunkNoChangeTimeoutTimer$start$1.L$0 = obj;
        return chunkNoChangeTimeoutTimer$start$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:16:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.videoupload.internal.ChunkNoChangeTimeoutTimer$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
