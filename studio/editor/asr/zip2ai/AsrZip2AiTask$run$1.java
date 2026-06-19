package com.bilibili.studio.editor.asr.zip2ai;

import com.bilibili.studio.videoeditor.editor.editdata.EditVideoInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/zip2ai/AsrZip2AiTask$run$1.class */
public final class AsrZip2AiTask$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final EditVideoInfo $editVideoInfo;
    final AsrFrom $from;
    final Ref.IntRef $recordCount;
    final Ref.LongRef $stepTime;
    final Ref.IntRef $videoCount;
    long J$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrZip2AiTask$run$1(Ref.LongRef longRef, AsrFrom asrFrom, Ref.IntRef intRef, Ref.IntRef intRef2, EditVideoInfo editVideoInfo, Continuation<? super AsrZip2AiTask$run$1> continuation) {
        super(2, continuation);
        this.$stepTime = longRef;
        this.$from = asrFrom;
        this.$videoCount = intRef;
        this.$recordCount = intRef2;
        this.$editVideoInfo = editVideoInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsrZip2AiTask$run$1(this.$stepTime, this.$from, this.$videoCount, this.$recordCount, this.$editVideoInfo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0689  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.zip2ai.AsrZip2AiTask$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
