package com.bilibili.music.podcast.utils.favorite;

import com.bapis.bilibili.app.listener.v1.FavFolderAction;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteBoxDialog$commitChange$3.class */
final class MusicFavoriteBoxDialog$commitChange$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<FavFolderAction> $actionList;
    int label;
    final MusicFavoriteBoxDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicFavoriteBoxDialog$commitChange$3(List<FavFolderAction> list, MusicFavoriteBoxDialog musicFavoriteBoxDialog, Continuation<? super MusicFavoriteBoxDialog$commitChange$3> continuation) {
        super(2, continuation);
        this.$actionList = list;
        this.this$0 = musicFavoriteBoxDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicFavoriteBoxDialog$commitChange$3(this.$actionList, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.favorite.MusicFavoriteBoxDialog$commitChange$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
