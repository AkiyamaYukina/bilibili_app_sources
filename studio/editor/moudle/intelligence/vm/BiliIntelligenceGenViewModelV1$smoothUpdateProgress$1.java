package com.bilibili.studio.editor.moudle.intelligence.vm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/vm/BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1.class */
final class BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $interval;
    final float $processGap;
    final Ref.FloatRef $start;
    float F$0;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final BiliIntelligenceGenViewModelV1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1(long j7, Ref.FloatRef floatRef, float f7, BiliIntelligenceGenViewModelV1 biliIntelligenceGenViewModelV1, Continuation<? super BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1> continuation) {
        super(2, continuation);
        this.$interval = j7;
        this.$start = floatRef;
        this.$processGap = f7;
        this.this$0 = biliIntelligenceGenViewModelV1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1(this.$interval, this.$start, this.$processGap, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00ae -> B:16:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.intelligence.vm.BiliIntelligenceGenViewModelV1$smoothUpdateProgress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
