package com.bilibili.playerbizcommon.widget.control.seekbar;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/control/seekbar/PlayerSeekbarThumbWrapper$loadThumb$1.class */
public final class PlayerSeekbarThumbWrapper$loadThumb$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final e $info;
    Object L$0;
    Object L$1;
    int label;
    final PlayerSeekbarThumbWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerSeekbarThumbWrapper$loadThumb$1(PlayerSeekbarThumbWrapper playerSeekbarThumbWrapper, e eVar, Continuation<? super PlayerSeekbarThumbWrapper$loadThumb$1> continuation) {
        super(2, continuation);
        this.this$0 = playerSeekbarThumbWrapper;
        this.$info = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlayerSeekbarThumbWrapper$loadThumb$1(this.this$0, this.$info, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0025, B:30:0x00c9, B:32:0x00d3, B:33:0x00df, B:23:0x0079, B:25:0x0081, B:13:0x003f, B:15:0x004b, B:17:0x0053, B:19:0x005e, B:21:0x0065), top: B:40:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0025, B:30:0x00c9, B:32:0x00d3, B:33:0x00df, B:23:0x0079, B:25:0x0081, B:13:0x003f, B:15:0x004b, B:17:0x0053, B:19:0x005e, B:21:0x0065), top: B:40:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df A[Catch: Exception -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:7:0x0025, B:30:0x00c9, B:32:0x00d3, B:33:0x00df, B:23:0x0079, B:25:0x0081, B:13:0x003f, B:15:0x004b, B:17:0x0053, B:19:0x005e, B:21:0x0065), top: B:40:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c3 -> B:30:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.widget.control.seekbar.PlayerSeekbarThumbWrapper$loadThumb$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
