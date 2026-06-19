package com.bilibili.ship.theseus.united.page.pausedpage;

import com.bilibili.gripper.api.ad.biz.videodetail.pausedpage.AdPausedPageTriggerReason;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.pausedpage.PausedPageService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/pausedpage/PausedPageService$showPauseBarCountdownToast$3$backActionJob$1.class */
public final class PausedPageService$showPauseBarCountdownToast$3$backActionJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PausedPageService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausedPageService$showPauseBarCountdownToast$3$backActionJob$1(PausedPageService pausedPageService, Continuation<? super PausedPageService$showPauseBarCountdownToast$3$backActionJob$1> continuation) {
        super(2, continuation);
        this.this$0 = pausedPageService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(PausedPageService pausedPageService, boolean z6) {
        if (pausedPageService.f102171z != PausedPageService.FlowState.COUNTDOWN || pausedPageService.f102169x == null) {
            return false;
        }
        BLog.i("PausedPageService", "countdownBackPressed -> cancel");
        pausedPageService.r(z6 ? AdPausedPageTriggerReason.CLICK_PLAYER_TOPBAR : AdPausedPageTriggerReason.BACK_PRESSED);
        return false;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PausedPageService$showPauseBarCountdownToast$3$backActionJob$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final PausedPageService pausedPageService = this.this$0;
            BackActionRepository backActionRepository = pausedPageService.f102155j;
            Function1<? super Boolean, Boolean> function1 = new Function1(pausedPageService) { // from class: com.bilibili.ship.theseus.united.page.pausedpage.t

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final PausedPageService f102227a;

                {
                    this.f102227a = pausedPageService;
                }

                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(PausedPageService$showPauseBarCountdownToast$3$backActionJob$1.invokeSuspend$lambda$0(this.f102227a, ((Boolean) obj2).booleanValue()));
                }
            };
            this.label = 1;
            if (backActionRepository.b(function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
