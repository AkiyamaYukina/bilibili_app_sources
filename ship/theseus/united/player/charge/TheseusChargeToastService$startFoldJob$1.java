package com.bilibili.ship.theseus.united.player.charge;

import com.bilibili.ship.theseus.united.page.playviewextra.FullPromptBarVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/charge/TheseusChargeToastService$startFoldJob$1.class */
final class TheseusChargeToastService$startFoldJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $duration;
    final FullPromptBarVo $fullPromptBarVo;
    final Job $refreshJob;
    long J$0;
    long J$1;
    private Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final TheseusChargeToastService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusChargeToastService$startFoldJob$1(FullPromptBarVo fullPromptBarVo, Job job, long j7, TheseusChargeToastService theseusChargeToastService, Continuation<? super TheseusChargeToastService$startFoldJob$1> continuation) {
        super(2, continuation);
        this.$fullPromptBarVo = fullPromptBarVo;
        this.$refreshJob = job;
        this.$duration = j7;
        this.this$0 = theseusChargeToastService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusChargeToastService$startFoldJob$1 theseusChargeToastService$startFoldJob$1 = new TheseusChargeToastService$startFoldJob$1(this.$fullPromptBarVo, this.$refreshJob, this.$duration, this.this$0, continuation);
        theseusChargeToastService$startFoldJob$1.L$0 = obj;
        return theseusChargeToastService$startFoldJob$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x021c, code lost:
    
        if (r16.f102383e == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0214  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01ca -> B:38:0x01ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0206 -> B:43:0x020c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.charge.TheseusChargeToastService$startFoldJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
