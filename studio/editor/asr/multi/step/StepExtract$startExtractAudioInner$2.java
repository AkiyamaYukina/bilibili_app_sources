package com.bilibili.studio.editor.asr.multi.step;

import com.bilibili.studio.editor.asr.bean.AudioInfo;
import com.bilibili.studio.editor.asr.multi.step.b;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/multi/step/StepExtract$startExtractAudioInner$2.class */
final class StepExtract$startExtractAudioInner$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super b.a>, Object> {
    final AudioInfo $audioInfo;
    private Object L$0;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepExtract$startExtractAudioInner$2(b bVar, AudioInfo audioInfo, Continuation<? super StepExtract$startExtractAudioInner$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$audioInfo = audioInfo;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StepExtract$startExtractAudioInner$2 stepExtract$startExtractAudioInner$2 = new StepExtract$startExtractAudioInner$2(this.this$0, this.$audioInfo, continuation);
        stepExtract$startExtractAudioInner$2.L$0 = obj;
        return stepExtract$startExtractAudioInner$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super b.a> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Deferred<b.a> deferredAsync$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            b bVar = this.this$0;
            AudioInfo audioInfo = this.$audioInfo;
            synchronized (bVar) {
                deferredAsync$default = bVar.f105672c;
                if (deferredAsync$default == null || deferredAsync$default.isCompleted()) {
                    deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new StepExtract$newExtractAudioJob$newJob$1(bVar, audioInfo, null), 3, (Object) null);
                    bVar.f105672c = deferredAsync$default;
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
