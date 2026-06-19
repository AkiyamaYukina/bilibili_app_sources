package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.multi.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$start$1$result$2.class */
public final class AsrCombineTask$start$1$result$2 extends SuspendLambda implements Function2<FlowCollector<? super a.C1186a>, Continuation<? super Unit>, Object> {
    final Ref.LongRef $asrStartTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$start$1$result$2(Ref.LongRef longRef, Continuation<? super AsrCombineTask$start$1$result$2> continuation) {
        super(2, continuation);
        this.$asrStartTime = longRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AsrCombineTask$start$1$result$2(this.$asrStartTime, continuation);
    }

    public final Object invoke(FlowCollector<? super a.C1186a> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$asrStartTime.element = System.currentTimeMillis();
        return Unit.INSTANCE;
    }
}
