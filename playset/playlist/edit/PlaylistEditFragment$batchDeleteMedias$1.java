package com.bilibili.playset.playlist.edit;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/PlaylistEditFragment$batchDeleteMedias$1.class */
final class PlaylistEditFragment$batchDeleteMedias$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final PlaylistEditFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistEditFragment$batchDeleteMedias$1(PlaylistEditFragment playlistEditFragment, Continuation<? super PlaylistEditFragment$batchDeleteMedias$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistEditFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistEditFragment$batchDeleteMedias$1 playlistEditFragment$batchDeleteMedias$1 = new PlaylistEditFragment$batchDeleteMedias$1(this.this$0, continuation);
        playlistEditFragment$batchDeleteMedias$1.L$0 = obj;
        return playlistEditFragment$batchDeleteMedias$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.edit.PlaylistEditFragment$batchDeleteMedias$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
