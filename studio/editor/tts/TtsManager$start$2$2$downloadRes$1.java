package com.bilibili.studio.editor.tts;

import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2$2$downloadRes$1.class */
public final class TtsManager$start$2$2$downloadRes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends TtsInputBean, ? extends String>>>, Object> {
    final g $request;
    final Pair<TtsInputBean, String> $urlPair;
    int label;
    final TtsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$start$2$2$downloadRes$1(TtsManager ttsManager, g gVar, Pair<TtsInputBean, String> pair, Continuation<? super TtsManager$start$2$2$downloadRes$1> continuation) {
        super(2, continuation);
        this.this$0 = ttsManager;
        this.$request = gVar;
        this.$urlPair = pair;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TtsManager$start$2$2$downloadRes$1(this.this$0, this.$request, this.$urlPair, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<Pair<TtsInputBean, String>>> continuation) {
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
            String path = ((TtsInputBean) this.$urlPair.getFirst()).getPath();
            Pair<TtsInputBean, String> pair = this.$urlPair;
            this.label = 1;
            Object objA = TtsManager.a(ttsManager, gVar, path, pair, this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
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
