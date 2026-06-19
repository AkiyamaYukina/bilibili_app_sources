package com.bilibili.playset.playlist.viewmodels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/viewmodels/PlaylistViewModelV2$clearInvalidVideo$1.class */
final class PlaylistViewModelV2$clearInvalidVideo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    Object result;
    final PlaylistViewModelV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModelV2$clearInvalidVideo$1(PlaylistViewModelV2 playlistViewModelV2, Continuation<? super PlaylistViewModelV2$clearInvalidVideo$1> continuation) {
        super(continuation);
        this.this$0 = playlistViewModelV2;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PlaylistViewModelV2.I0(this.this$0, null, null, this);
    }
}
