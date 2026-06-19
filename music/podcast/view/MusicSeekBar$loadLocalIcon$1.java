package com.bilibili.music.podcast.view;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicSeekBar$loadLocalIcon$1.class */
final class MusicSeekBar$loadLocalIcon$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final MusicSeekBar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicSeekBar$loadLocalIcon$1(MusicSeekBar musicSeekBar, Continuation<? super MusicSeekBar$loadLocalIcon$1> continuation) {
        super(2, continuation);
        this.this$0 = musicSeekBar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MusicSeekBar$loadLocalIcon$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.view.MusicSeekBar$loadLocalIcon$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
