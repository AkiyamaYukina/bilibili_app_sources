package com.bilibili.ship.theseus.united.page.playingarea;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaOccupationRepository$keepOccupation$1.class */
final class PlayingAreaOccupationRepository$keepOccupation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingAreaOccupationRepository$keepOccupation$1(i iVar, Continuation<? super PlayingAreaOccupationRepository$keepOccupation$1> continuation) {
        super(continuation);
        this.this$0 = iVar;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
