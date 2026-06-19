package com.bilibili.ship.theseus.united.player.ai;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/ai/MultilangAudioBubbleGuide$showBubbleGuide$1.class */
final class MultilangAudioBubbleGuide$showBubbleGuide$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultilangAudioBubbleGuide$showBubbleGuide$1(d dVar, Continuation<? super MultilangAudioBubbleGuide$showBubbleGuide$1> continuation) {
        super(continuation);
        this.this$0 = dVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this.this$0, null, this);
    }
}
