package com.bilibili.studio.editor.tts;

import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTts$2$2$audioDeferred$1.class */
public final class TtsManager$startLongTts$2$2$audioDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Triple<? extends TtsInputBean, ? extends String, ? extends String>>>, Object> {
    final Triple<TtsInputBean, String, String> $audioTriple;
    final g $request;
    final TtsInputBean $ttsInputBean;
    int label;
    final TtsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$startLongTts$2$2$audioDeferred$1(TtsManager ttsManager, g gVar, TtsInputBean ttsInputBean, Triple<TtsInputBean, String, String> triple, Continuation<? super TtsManager$startLongTts$2$2$audioDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = ttsManager;
        this.$request = gVar;
        this.$ttsInputBean = ttsInputBean;
        this.$audioTriple = triple;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TtsManager$startLongTts$2$2$audioDeferred$1(this.this$0, this.$request, this.$ttsInputBean, this.$audioTriple, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Triple<TtsInputBean, String, String>>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TtsManager ttsManager = this.this$0;
            g gVar = this.$request;
            String path = this.$ttsInputBean.getPath();
            Triple<TtsInputBean, String, String> triple = this.$audioTriple;
            this.label = 1;
            Object objB = TtsManager.b(ttsManager, gVar, path, triple, this);
            obj2 = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        return Result.box-impl(obj2);
    }
}
