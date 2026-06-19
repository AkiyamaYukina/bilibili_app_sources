package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.multi.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$start$1$result$1.class */
public final class AsrCombineTask$start$1$result$1 extends SuspendLambda implements Function3<FlowCollector<? super a.C1186a>, Throwable, Continuation<? super Unit>, Object> {
    final Ref.LongRef $extractSpend;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$start$1$result$1(Ref.LongRef longRef, a aVar, Continuation<? super AsrCombineTask$start$1$result$1> continuation) {
        super(3, continuation);
        this.$extractSpend = longRef;
        this.this$0 = aVar;
    }

    public final Object invoke(FlowCollector<? super a.C1186a> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new AsrCombineTask$start$1$result$1(this.$extractSpend, this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$extractSpend.element = System.currentTimeMillis() - this.this$0.f105617d;
        return Unit.INSTANCE;
    }
}
