package com.bilibili.ship.theseus.ugc.play;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$driveMediaPlayingEpScope$1.class */
final class UGCPlaybackRepository$driveMediaPlayingEpScope$1 extends ContinuationImpl {
    int label;
    Object result;
    final UGCPlaybackRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGCPlaybackRepository$driveMediaPlayingEpScope$1(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super UGCPlaybackRepository$driveMediaPlayingEpScope$1> continuation) {
        super(continuation);
        this.this$0 = uGCPlaybackRepository;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UGCPlaybackRepository.a(this.this$0, null, this);
    }
}
