package com.bilibili.studio.comm.material.task;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/comm/material/task/MaterialCollectTask$runTaskImpl$1.class */
final class MaterialCollectTask$runTaskImpl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialCollectTask$runTaskImpl$1(a aVar, Continuation<? super MaterialCollectTask$runTaskImpl$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MaterialCollectTask$runTaskImpl$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019e  */
    /* JADX WARN: Type inference failed for: r0v116, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.comm.material.task.MaterialCollectTask$runTaskImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
