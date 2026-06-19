package com.bilibili.studio.editor.asr.multi.step;

import com.bilibili.studio.editor.asr.multi.step.a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepAsr$startFastAsr$2.class */
final class StepAsr$startFastAsr$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super a.C1187a>, Object> {
    private Object L$0;
    int label;
    final a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepAsr$startFastAsr$2(a aVar, Continuation<? super StepAsr$startFastAsr$2> continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StepAsr$startFastAsr$2 stepAsr$startFastAsr$2 = new StepAsr$startFastAsr$2(this.this$0, continuation);
        stepAsr$startFastAsr$2.L$0 = obj;
        return stepAsr$startFastAsr$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super a.C1187a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Deferred<a.C1187a> deferredAsync$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            a aVar = this.this$0;
            synchronized (aVar) {
                deferredAsync$default = aVar.f105665c;
                if (deferredAsync$default == null || deferredAsync$default.isCompleted()) {
                    deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new StepAsr$newAsrJob$newJob$1(aVar, null), 3, (Object) null);
                    aVar.f105665c = deferredAsync$default;
                }
            }
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            obj = objAwait;
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
