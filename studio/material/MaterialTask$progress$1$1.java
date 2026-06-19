package com.bilibili.studio.material;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialTask$progress$1$1.class */
final class MaterialTask$progress$1$1 extends SuspendLambda implements Function2<ProducerScope<? super i>, Continuation<? super Unit>, Object> {
    final boolean $ensureLast;
    final Ref.BooleanRef $hasSend;
    final long $interval;
    private Object L$0;
    Object L$1;
    int label;
    final MaterialTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTask$progress$1$1(MaterialTask materialTask, Ref.BooleanRef booleanRef, boolean z6, long j7, Continuation<? super MaterialTask$progress$1$1> continuation) {
        super(2, continuation);
        this.this$0 = materialTask;
        this.$hasSend = booleanRef;
        this.$ensureLast = z6;
        this.$interval = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MaterialTask$progress$1$1 materialTask$progress$1$1 = new MaterialTask$progress$1$1(this.this$0, this.$hasSend, this.$ensureLast, this.$interval, continuation);
        materialTask$progress$1$1.L$0 = obj;
        return materialTask$progress$1$1;
    }

    public final Object invoke(ProducerScope<? super i> producerScope, Continuation<? super Unit> continuation) {
        return create(producerScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013a -> B:16:0x0072). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.MaterialTask$progress$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
