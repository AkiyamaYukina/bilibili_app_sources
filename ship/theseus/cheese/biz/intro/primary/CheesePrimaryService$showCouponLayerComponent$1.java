package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.cheese.pay.model.PayCouponVo;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$showCouponLayerComponent$1.class */
public final class CheesePrimaryService$showCouponLayerComponent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C6095p $component;
    int label;
    final CheesePrimaryService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$showCouponLayerComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePrimaryService f89613a;

        public a(CheesePrimaryService cheesePrimaryService) {
            this.f89613a = cheesePrimaryService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            PayCouponVo payCouponVo;
            C6095p.c cVar = (C6095p.c) obj;
            boolean zAreEqual = Intrinsics.areEqual(cVar, C6095p.c.d.f89765a);
            CheesePrimaryService cheesePrimaryService = this.f89613a;
            if (zAreEqual) {
                PageReportService.i(cheesePrimaryService.f89596i, "pugv.detail.coupon-page.0.show", null, 6);
            } else if (cVar instanceof C6095p.c.a) {
                com.bilibili.app.screen.adjust.widget.z.a(((C6095p.c.a) cVar).f89762a);
            } else if (Intrinsics.areEqual(cVar, C6095p.c.C0620c.f89764a)) {
                cheesePrimaryService.h.a(5);
            } else {
                if (!(cVar instanceof C6095p.c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i7 = ((C6095p.c.b) cVar).f89763a;
                BLog.d("primary handleCouponSelected old = " + cheesePrimaryService.f89604q + ", pos = " + i7);
                C6101w c6101w = cheesePrimaryService.f89590b;
                List list = (List) c6101w.h.getValue();
                if (list != null && !list.isEmpty() && (payCouponVo = (PayCouponVo) CollectionsKt.getOrNull(list, i7)) != null && !payCouponVo.getSelectState()) {
                    int i8 = cheesePrimaryService.f89604q;
                    if (i8 == -1) {
                        payCouponVo.setSelectState(true);
                        cheesePrimaryService.f89604q = i7;
                    } else if (i7 == i8) {
                        payCouponVo.setSelectState(false);
                        cheesePrimaryService.f89604q = -1;
                    } else {
                        payCouponVo.setSelectState(true);
                        PayCouponVo payCouponVo2 = (PayCouponVo) CollectionsKt.getOrNull(list, cheesePrimaryService.f89604q);
                        if (payCouponVo2 != null) {
                            payCouponVo2.setSelectState(false);
                        }
                        cheesePrimaryService.f89604q = i7;
                    }
                    BuildersKt.launch$default(c6101w.f89779a, (CoroutineContext) null, (CoroutineStart) null, new CheesePrimaryRepository$updateCouponLayerSelect$1(c6101w, null), 3, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryService$showCouponLayerComponent$1(C6095p c6095p, CheesePrimaryService cheesePrimaryService, Continuation<? super CheesePrimaryService$showCouponLayerComponent$1> continuation) {
        super(2, continuation);
        this.$component = c6095p;
        this.this$0 = cheesePrimaryService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheesePrimaryService$showCouponLayerComponent$1(this.$component, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<C6095p.c> sharedFlow = this.$component.f89757f;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
