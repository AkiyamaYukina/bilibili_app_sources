package com.bilibili.studio.editor.asr.multi;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.multi.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/AsrCombineTask$buildTaskFlow$1.class */
final class AsrCombineTask$buildTaskFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super a.C1186a>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrCombineTask$buildTaskFlow$1(a aVar, Continuation<? super AsrCombineTask$buildTaskFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsrCombineTask$buildTaskFlow$1 asrCombineTask$buildTaskFlow$1 = new AsrCombineTask$buildTaskFlow$1(this.this$0, continuation);
        asrCombineTask$buildTaskFlow$1.L$0 = obj;
        return asrCombineTask$buildTaskFlow$1;
    }

    public final Object invoke(FlowCollector<? super a.C1186a> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.L$0;
            it = ((LinkedHashMap) this.this$0.f105619f).entrySet().iterator();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            it = it2;
        }
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            AsrSingleTask asrSingleTask = value instanceof AsrSingleTask ? (AsrSingleTask) value : null;
            if (asrSingleTask != null) {
                a.C1186a c1186a = new a.C1186a((AudioInfo) entry.getKey(), asrSingleTask);
                this.L$0 = flowCollector;
                this.L$1 = it;
                this.label = 1;
                if (flowCollector.emit(c1186a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
