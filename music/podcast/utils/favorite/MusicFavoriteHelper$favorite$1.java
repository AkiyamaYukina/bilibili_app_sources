package com.bilibili.music.podcast.utils.favorite;

import com.bilibili.music.podcast.data.MusicPlayVideo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/favorite/MusicFavoriteHelper$favorite$1.class */
public final class MusicFavoriteHelper$favorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Boolean, Unit> $onSuccess;
    final MusicPlayVideo $playVideo;
    final long $subId;
    int label;
    final MusicFavoriteHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MusicFavoriteHelper$favorite$1(MusicPlayVideo musicPlayVideo, long j7, MusicFavoriteHelper musicFavoriteHelper, Function1<? super Boolean, Unit> function1, Continuation<? super MusicFavoriteHelper$favorite$1> continuation) {
        super(2, continuation);
        this.$playVideo = musicPlayVideo;
        this.$subId = j7;
        this.this$0 = musicFavoriteHelper;
        this.$onSuccess = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicFavoriteHelper$favorite$1(this.$playVideo, this.$subId, this.this$0, this.$onSuccess, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.favorite.MusicFavoriteHelper$favorite$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
