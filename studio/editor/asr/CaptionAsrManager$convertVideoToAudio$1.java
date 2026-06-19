package com.bilibili.studio.editor.asr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/CaptionAsrManager$convertVideoToAudio$1.class */
final class CaptionAsrManager$convertVideoToAudio$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final CaptionAsrManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionAsrManager$convertVideoToAudio$1(CaptionAsrManager captionAsrManager, Continuation<? super CaptionAsrManager$convertVideoToAudio$1> continuation) {
        super(2, continuation);
        this.this$0 = captionAsrManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CaptionAsrManager$convertVideoToAudio$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c5, code lost:
    
        r16 = "";
        r15 = r0;
        r13 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0220  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x014c -> B:44:0x015a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.asr.CaptionAsrManager$convertVideoToAudio$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
