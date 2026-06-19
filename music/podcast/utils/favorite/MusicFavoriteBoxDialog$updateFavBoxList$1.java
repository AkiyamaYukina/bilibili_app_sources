package com.bilibili.music.podcast.utils.favorite;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteBoxDialog$updateFavBoxList$1.class */
public final class MusicFavoriteBoxDialog$updateFavBoxList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MusicFavoriteBoxDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicFavoriteBoxDialog$updateFavBoxList$1(MusicFavoriteBoxDialog musicFavoriteBoxDialog, Continuation<? super MusicFavoriteBoxDialog$updateFavBoxList$1> continuation) {
        super(2, continuation);
        this.this$0 = musicFavoriteBoxDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicFavoriteBoxDialog$updateFavBoxList$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.favorite.MusicFavoriteBoxDialog$updateFavBoxList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
