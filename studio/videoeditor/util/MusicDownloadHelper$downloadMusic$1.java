package com.bilibili.studio.videoeditor.util;

import com.bilibili.studio.videoeditor.capturev3.music.bean.MusicInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/MusicDownloadHelper$downloadMusic$1.class */
public final class MusicDownloadHelper$downloadMusic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MusicInfo $musicInfo;
    Object L$0;
    int label;
    final MusicDownloadHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicDownloadHelper$downloadMusic$1(MusicInfo musicInfo, MusicDownloadHelper musicDownloadHelper, Continuation<? super MusicDownloadHelper$downloadMusic$1> continuation) {
        super(2, continuation);
        this.$musicInfo = musicInfo;
        this.this$0 = musicDownloadHelper;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicDownloadHelper$downloadMusic$1(this.$musicInfo, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f A[Catch: Exception -> 0x0023, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0023, blocks: (B:8:0x001c, B:33:0x00d7, B:35:0x011f, B:14:0x003a, B:23:0x0083, B:27:0x0094, B:29:0x009b, B:16:0x0045, B:18:0x0052), top: B:44:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.videoeditor.util.MusicDownloadHelper$downloadMusic$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
