package com.bilibili.ship.theseus.united.page.background;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/background/PageBackgroundPreloadService$waitPreloadNextVideo$2.class */
final class PageBackgroundPreloadService$waitPreloadNextVideo$2 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public PageBackgroundPreloadService$waitPreloadNextVideo$2(Continuation<? super PageBackgroundPreloadService$waitPreloadNextVideo$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PageBackgroundPreloadService$waitPreloadNextVideo$2 pageBackgroundPreloadService$waitPreloadNextVideo$2 = new PageBackgroundPreloadService$waitPreloadNextVideo$2(continuation);
        pageBackgroundPreloadService$waitPreloadNextVideo$2.L$0 = obj;
        return pageBackgroundPreloadService$waitPreloadNextVideo$2;
    }

    public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Boolean> continuation) {
        return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((PlayerAvailability) this.L$0) == PlayerAvailability.READY);
    }
}
