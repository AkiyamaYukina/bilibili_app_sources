package com.bilibili.studio.editor.tts;

import com.bapis.bilibili.app.home.v1.l;
import com.bilibili.studio.editor.tts.bean.TtsInputBean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$start$2$1$1.class */
public final class TtsManager$start$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Result<? extends Pair<? extends TtsInputBean, ? extends String>>>, Object> {
    final int $index;
    final g $request;
    final TtsInputBean $ttsInputBean;
    int label;
    final TtsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$start$2$1$1(int i7, TtsManager ttsManager, g gVar, TtsInputBean ttsInputBean, Continuation<? super TtsManager$start$2$1$1> continuation) {
        super(1, continuation);
        this.$index = i7;
        this.this$0 = ttsManager;
        this.$request = gVar;
        this.$ttsInputBean = ttsInputBean;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TtsManager$start$2$1$1(this.$index, this.this$0, this.$request, this.$ttsInputBean, continuation);
    }

    public final Object invoke(Continuation<? super Result<Pair<TtsInputBean, String>>> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String strA = l.a(this.$index, System.currentTimeMillis(), "task_", "_");
            TtsManager ttsManager = this.this$0;
            g gVar = this.$request;
            TtsInputBean ttsInputBean = this.$ttsInputBean;
            this.label = 1;
            Object objD = TtsManager.d(ttsManager, gVar, strA, ttsInputBean, this);
            obj2 = objD;
            if (objD == coroutine_suspended) {
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
