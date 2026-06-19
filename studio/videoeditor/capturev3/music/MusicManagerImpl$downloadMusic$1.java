package com.bilibili.studio.videoeditor.capturev3.music;

import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/music/MusicManagerImpl$downloadMusic$1.class */
final class MusicManagerImpl$downloadMusic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MusicInfo $musicInfo;
    Object L$0;
    int label;
    final n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicManagerImpl$downloadMusic$1(MusicInfo musicInfo, n nVar, Continuation<? super MusicManagerImpl$downloadMusic$1> continuation) {
        super(2, continuation);
        this.$musicInfo = musicInfo;
        this.this$0 = nVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicManagerImpl$downloadMusic$1(this.$musicInfo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.capturev3.music.MusicManagerImpl$downloadMusic$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
