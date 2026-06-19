package com.bilibili.ship.theseus.united.player.charge;

import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$startRefreshJob$1.class */
final class TheseusChargeToastService$startRefreshJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $duration;
    final FullPromptBarVo $fullPromptBarVo;
    long J$0;
    private Object L$0;
    int label;
    final TheseusChargeToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusChargeToastService$startRefreshJob$1(FullPromptBarVo fullPromptBarVo, long j7, TheseusChargeToastService theseusChargeToastService, Continuation<? super TheseusChargeToastService$startRefreshJob$1> continuation) {
        super(2, continuation);
        this.$fullPromptBarVo = fullPromptBarVo;
        this.$duration = j7;
        this.this$0 = theseusChargeToastService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusChargeToastService$startRefreshJob$1 theseusChargeToastService$startRefreshJob$1 = new TheseusChargeToastService$startRefreshJob$1(this.$fullPromptBarVo, this.$duration, this.this$0, continuation);
        theseusChargeToastService$startRefreshJob$1.L$0 = obj;
        return theseusChargeToastService$startRefreshJob$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0076 -> B:18:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$startRefreshJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
