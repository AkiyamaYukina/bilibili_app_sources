package com.bilibili.sistersplayer.hls;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/Hls7Player$competitionM3U8$1$fetchBack$2.class */
public final class Hls7Player$competitionM3U8$1$fetchBack$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FetchResult<String>>, Object> {
    final String $backM3U8;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final Hls7Player this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hls7Player$competitionM3U8$1$fetchBack$2(Hls7Player hls7Player, String str, Continuation<? super Hls7Player$competitionM3U8$1$fetchBack$2> continuation) {
        super(2, continuation);
        this.this$0 = hls7Player;
        this.$backM3U8 = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Hls7Player$competitionM3U8$1$fetchBack$2(this.this$0, this.$backM3U8, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FetchResult<String>> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177 A[Catch: all -> 0x013e, Exception -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x013e, blocks: (B:20:0x010e, B:22:0x0114, B:24:0x011e, B:26:0x0128, B:43:0x0177, B:47:0x0211, B:44:0x01b6, B:32:0x0146, B:34:0x0150, B:36:0x015d, B:37:0x0165, B:38:0x0170, B:45:0x01d1, B:46:0x01ed), top: B:130:0x010e, outer: #0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b6 A[Catch: all -> 0x013e, Exception -> 0x0142, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x013e, blocks: (B:20:0x010e, B:22:0x0114, B:24:0x011e, B:26:0x0128, B:43:0x0177, B:47:0x0211, B:44:0x01b6, B:32:0x0146, B:34:0x0150, B:36:0x015d, B:37:0x0165, B:38:0x0170, B:45:0x01d1, B:46:0x01ed), top: B:130:0x010e, outer: #0, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.sistersplayer.hls.Hls7Player$competitionM3U8$1$fetchBack$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
