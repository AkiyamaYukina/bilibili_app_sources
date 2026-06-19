package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import android.content.Context;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideService$showPurchaseGuidePanel$2$1.class */
public final class CheesePurchaseGuideService$showPurchaseGuidePanel$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final MutableSharedFlow<Unit> $closeActionFlow;
    final String $url;
    int label;
    final CheesePurchaseGuideService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePurchaseGuideService$showPurchaseGuidePanel$2$1(CheesePurchaseGuideService cheesePurchaseGuideService, String str, MutableSharedFlow<Unit> mutableSharedFlow, Continuation<? super CheesePurchaseGuideService$showPurchaseGuidePanel$2$1> continuation) {
        super(1, continuation);
        this.this$0 = cheesePurchaseGuideService;
        this.$url = str;
        this.$closeActionFlow = mutableSharedFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableSharedFlow mutableSharedFlow, CheesePurchaseGuideService cheesePurchaseGuideService) {
        BLog.i("CheesePurchaseGuideService$showPurchaseGuidePanel$2$1-invokeSuspend$lambda$0", "[theseus-cheese-CheesePurchaseGuideService$showPurchaseGuidePanel$2$1-invokeSuspend$lambda$0] onCloseClick");
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        PageReportService.g(cheesePurchaseGuideService.f90531c, "pugv.detail.myclassguide-pop.colse.click", null, 6);
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(MutableSharedFlow mutableSharedFlow, CheesePurchaseGuideService cheesePurchaseGuideService) {
        BLog.i("CheesePurchaseGuideService$showPurchaseGuidePanel$2$1-invokeSuspend$lambda$1", "[theseus-cheese-CheesePurchaseGuideService$showPurchaseGuidePanel$2$1-invokeSuspend$lambda$1] onJumpClick");
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        BLRouter.routeTo$default(RouteRequestKt.toRouteRequest("https://m.bilibili.com/cheese/mine?spm_id_from=united.player-video-detail.0.0.pv&navhide=1"), (Context) null, 2, (Object) null);
        PageReportService.g(cheesePurchaseGuideService.f90531c, "pugv.detail.myclassguide-pop.continue.click", null, 6);
        return unit;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheesePurchaseGuideService$showPurchaseGuidePanel$2$1(this.this$0, this.$url, this.$closeActionFlow, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.bilibili.ship.theseus.cheese.pay.purchase.guide.d] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            TheseusFloatLayerService theseusFloatLayerService = this.this$0.f90532d;
            String str = this.$url;
            final MutableSharedFlow<Unit> mutableSharedFlow = this.$closeActionFlow;
            final CheesePurchaseGuideService cheesePurchaseGuideService = this.this$0;
            b bVar = new b(str, new c(mutableSharedFlow, cheesePurchaseGuideService), new Function0(mutableSharedFlow, cheesePurchaseGuideService) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.guide.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MutableSharedFlow f90543a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final CheesePurchaseGuideService f90544b;

                {
                    this.f90543a = mutableSharedFlow;
                    this.f90544b = cheesePurchaseGuideService;
                }

                public final Object invoke() {
                    return CheesePurchaseGuideService$showPurchaseGuidePanel$2$1.invokeSuspend$lambda$1(this.f90543a, this.f90544b);
                }
            });
            this.label = 1;
            if (theseusFloatLayerService.h(bVar, theseusFloatLayerService.f99664n, this) == coroutine_suspended) {
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
