package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ActorScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/MaterialDispatcher$dispatch$progressChannel$1.class */
final class MaterialDispatcher$dispatch$progressChannel$1 extends SuspendLambda implements Function2<ActorScope<h>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialDispatcher$dispatch$progressChannel$1(c cVar, Continuation<? super MaterialDispatcher$dispatch$progressChannel$1> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MaterialDispatcher$dispatch$progressChannel$1 materialDispatcher$dispatch$progressChannel$1 = new MaterialDispatcher$dispatch$progressChannel$1(this.this$0, continuation);
        materialDispatcher$dispatch$progressChannel$1.L$0 = obj;
        return materialDispatcher$dispatch$progressChannel$1;
    }

    public final Object invoke(ActorScope<h> actorScope, Continuation<? super Unit> continuation) {
        return create(actorScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a1 -> B:29:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.MaterialDispatcher$dispatch$progressChannel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
