package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$collectToolbarActionPlay$2.class */
final class PausedPageService$collectToolbarActionPlay$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final PausedPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$collectToolbarActionPlay$2(PausedPageService pausedPageService, Continuation<? super PausedPageService$collectToolbarActionPlay$2> continuation) {
        super(2, continuation);
        this.this$0 = pausedPageService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PausedPageService$collectToolbarActionPlay$2(this.this$0, continuation);
    }

    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PausedPageService pausedPageService = this.this$0;
        if (pausedPageService.f102171z == PausedPageService.FlowState.IDLE) {
            return Unit.INSTANCE;
        }
        pausedPageService.r(AdPausedPageTriggerReason.RESUME_PLAY);
        return Unit.INSTANCE;
    }
}
