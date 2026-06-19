package com.bilibili.studio.material;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$suspendStart$2.class */
public final class MaterialTask$suspendStart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final MaterialTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTask$suspendStart$2(MaterialTask materialTask, Continuation<? super MaterialTask$suspendStart$2> continuation) {
        super(2, continuation);
        this.this$0 = materialTask;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MaterialTask$suspendStart$2 materialTask$suspendStart$2 = new MaterialTask$suspendStart$2(this.this$0, continuation);
        materialTask$suspendStart$2.L$0 = obj;
        return materialTask$suspendStart$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[Catch: all -> 0x003a, Exception -> 0x003e, TRY_ENTER, TryCatch #2 {Exception -> 0x003e, blocks: (B:15:0x0033, B:20:0x0042, B:36:0x00b6, B:38:0x00c7, B:40:0x00d2, B:22:0x0051, B:31:0x0082, B:25:0x0066, B:27:0x0076), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask$suspendStart$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
