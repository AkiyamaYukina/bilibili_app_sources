package com.bilibili.studio.editor.asr.multi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$start$1.class */
final class AsrCombineTask$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final CoroutineScope $scope;
    Object L$0;
    Object L$1;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$start$1(a aVar, CoroutineScope coroutineScope, Continuation<? super AsrCombineTask$start$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$scope = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsrCombineTask$start$1(this.this$0, this.$scope, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x02ea A[EDGE_INSN: B:194:0x02ea->B:62:0x02ea BREAK  A[LOOP:2: B:58:0x02c8->B:196:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.multi.AsrCombineTask$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
