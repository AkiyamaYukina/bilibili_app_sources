package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistMediaActionService$translation$1.class */
final class PlaylistMediaActionService$translation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MultiTypeMedia $media;
    int label;
    final y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistMediaActionService$translation$1(MultiTypeMedia multiTypeMedia, y yVar, Continuation<? super PlaylistMediaActionService$translation$1> continuation) {
        super(2, continuation);
        this.$media = multiTypeMedia;
        this.this$0 = yVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistMediaActionService$translation$1(this.$media, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistMediaActionService$translation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
