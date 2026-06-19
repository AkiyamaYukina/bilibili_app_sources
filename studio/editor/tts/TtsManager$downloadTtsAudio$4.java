package com.bilibili.studio.editor.tts;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/TtsManager$downloadTtsAudio$4.class */
final class TtsManager$downloadTtsAudio$4 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    Object result;
    final TtsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsManager$downloadTtsAudio$4(TtsManager ttsManager, Continuation<? super TtsManager$downloadTtsAudio$4> continuation) {
        super(continuation);
        this.this$0 = ttsManager;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objA = TtsManager.a(this.this$0, null, null, null, this);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Result.box-impl(objA);
    }
}
