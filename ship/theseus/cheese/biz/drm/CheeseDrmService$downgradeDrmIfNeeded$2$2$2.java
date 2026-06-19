package com.bilibili.ship.theseus.cheese.biz.drm;

import com.alipay.sdk.app.PayTask;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/drm/CheeseDrmService$downgradeDrmIfNeeded$2$2$2.class */
public final class CheeseDrmService$downgradeDrmIfNeeded$2$2$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final CheeseDrmService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseDrmService$downgradeDrmIfNeeded$2$2$2(CheeseDrmService cheeseDrmService, Continuation<? super CheeseDrmService$downgradeDrmIfNeeded$2$2$2> continuation) {
        super(1, continuation);
        this.this$0 = cheeseDrmService;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseDrmService$downgradeDrmIfNeeded$2$2$2(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, tv.danmaku.biliplayerv2.widget.toast.PlayerToast$MessageClickListener] */
    public final Object invokeSuspend(Object obj) {
        long duration;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            duration = DurationKt.toDuration(8000L, DurationUnit.MILLISECONDS);
            this.J$0 = duration;
            this.label = 1;
            if (DelayKt.delay-VtjQ1oo(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            duration = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        CheeseDrmService cheeseDrmService = this.this$0;
        PlayerToast playerToastBuild = new PlayerToast.Builder().level(2).toastItemType(18).location(32).duration(PayTask.f60018j).setExtraString("extra_title", cheeseDrmService.f89257a.getString(2131848851)).messageClickListener((PlayerToast.MessageClickListener) new Object()).build();
        PageReportService.i(cheeseDrmService.f89262f, "player.player.fail.all.player", null, 6);
        cheeseDrmService.f89258b.showToast(playerToastBuild);
        defpackage.a.b("[theseus-cheese-CheeseDrmService$downgradeDrmIfNeeded$2$2$2-invokeSuspend] ", android.support.v4.media.a.a("after delaying ", Duration.toString-impl(duration), ", show drm toast..."), "CheeseDrmService$downgradeDrmIfNeeded$2$2$2-invokeSuspend");
        return Unit.INSTANCE;
    }
}
