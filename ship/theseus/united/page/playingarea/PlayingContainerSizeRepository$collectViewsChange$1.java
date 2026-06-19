package com.bilibili.ship.theseus.united.page.playingarea;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$collectViewsChange$1.class */
final class PlayingContainerSizeRepository$collectViewsChange$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final PlayingContainerSizeRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingContainerSizeRepository$collectViewsChange$1(PlayingContainerSizeRepository playingContainerSizeRepository, Continuation<? super PlayingContainerSizeRepository$collectViewsChange$1> continuation) {
        super(continuation);
        this.this$0 = playingContainerSizeRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlayingContainerSizeRepository.j(this.this$0, null, this);
    }
}
