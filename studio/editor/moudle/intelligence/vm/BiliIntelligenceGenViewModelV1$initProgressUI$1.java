package com.bilibili.studio.editor.moudle.intelligence.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenViewModelV1$initProgressUI$1.class */
public final class BiliIntelligenceGenViewModelV1$initProgressUI$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final BiliIntelligenceGenViewModelV1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliIntelligenceGenViewModelV1$initProgressUI$1(BiliIntelligenceGenViewModelV1 biliIntelligenceGenViewModelV1, Continuation<? super BiliIntelligenceGenViewModelV1$initProgressUI$1> continuation) {
        super(2, continuation);
        this.this$0 = biliIntelligenceGenViewModelV1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliIntelligenceGenViewModelV1$initProgressUI$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:33:0x005d, B:16:0x006f], limit reached: 37 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00eb -> B:30:0x00f1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.BiliIntelligenceGenViewModelV1$initProgressUI$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
