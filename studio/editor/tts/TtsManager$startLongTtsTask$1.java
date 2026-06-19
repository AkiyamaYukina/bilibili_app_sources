package com.bilibili.studio.editor.tts;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$startLongTtsTask$1.class */
final class TtsManager$startLongTtsTask$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    Object result;
    final TtsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$startLongTtsTask$1(TtsManager ttsManager, Continuation<? super TtsManager$startLongTtsTask$1> continuation) {
        super(continuation);
        this.this$0 = ttsManager;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objC = TtsManager.c(this.this$0, null, null, null, this);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Result.box-impl(objC);
    }
}
