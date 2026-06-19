package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import I3.C2286y1;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.lifecycle.Lifecycle;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideService.class */
@StabilityInferred(parameters = 0)
public final class CheesePurchaseGuideService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f90530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f90531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f90532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f90533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CheesePurchaseGuideRepository f90534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Lazy f90535g = LazyKt.lazy(new C2286y1(11));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePurchaseGuideService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/CheesePurchaseGuideService$1$1.class */
        public static final class C06571 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheesePurchaseGuideService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06571(CheesePurchaseGuideService cheesePurchaseGuideService, Continuation<? super C06571> continuation) {
                super(2, continuation);
                this.this$0 = cheesePurchaseGuideService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06571 c06571 = new C06571(this.this$0, continuation);
                c06571.L$0 = obj;
                return c06571;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 296
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideService.AnonymousClass1.C06571.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePurchaseGuideService cheesePurchaseGuideService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheesePurchaseGuideService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheesePurchaseGuideService cheesePurchaseGuideService = this.this$0;
                SharedFlow<String> sharedFlow = cheesePurchaseGuideService.f90534f.f90525d;
                C06571 c06571 = new C06571(cheesePurchaseGuideService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c06571, this) == coroutine_suspended) {
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

    @Inject
    public CheesePurchaseGuideService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull PageReportService pageReportService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull CheesePurchaseGuideRepository cheesePurchaseGuideRepository) {
        this.f90529a = coroutineScope;
        this.f90530b = lifecycle;
        this.f90531c = pageReportService;
        this.f90532d = theseusFloatLayerService;
        this.f90533e = gVar;
        this.f90534f = cheesePurchaseGuideRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideService r5, java.lang.String r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideService.a(com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideService, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object b(String str, Continuation<? super Unit> continuation) {
        defpackage.a.b("[theseus-cheese-CheesePurchaseGuideService-showPurchaseGuidePanel] ", C4496a.a("showPurchaseGuidePanel, url = ", str), "CheesePurchaseGuideService-showPurchaseGuidePanel");
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        PageReportService.i(this.f90531c, "pugv.detail.myclassguide-pop.0.show", null, 6);
        ArrayList arrayList = new ArrayList();
        SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
        selectKt$selectCancellingUnselected$scope$1.b(new CheesePurchaseGuideService$showPurchaseGuidePanel$2$1(this, str, mutableSharedFlowMutableSharedFlow$default, null));
        selectKt$selectCancellingUnselected$scope$1.a(mutableSharedFlowMutableSharedFlow$default);
        Unit unit = Unit.INSTANCE;
        Object objFirst = FlowKt.first(FlowKt.merge(arrayList), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }
}
