package com.bilibili.music.podcast.utils;

import com.bilibili.music.podcast.data.MusicPlayVideo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/MusicInsertHandler$performDataChange$1.class */
final class MusicInsertHandler$performDataChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ki0.j $currentDataProvider;
    final MusicPlayVideo $insertItem;
    int I$0;
    int label;
    final C5431k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicInsertHandler$performDataChange$1(Ki0.j jVar, MusicPlayVideo musicPlayVideo, C5431k c5431k, Continuation<? super MusicInsertHandler$performDataChange$1> continuation) {
        super(2, continuation);
        this.$currentDataProvider = jVar;
        this.$insertItem = musicPlayVideo;
        this.this$0 = c5431k;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicInsertHandler$performDataChange$1(this.$currentDataProvider, this.$insertItem, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.utils.MusicInsertHandler$performDataChange$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
