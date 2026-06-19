package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequestKt;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$createPrimaryComponent$1.class */
public final class CheesePrimaryService$createPrimaryComponent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final C6081b $component;
    final V $primaryInfo;
    int label;
    final CheesePrimaryService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$createPrimaryComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheesePrimaryService f89611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final V f89612b;

        public a(CheesePrimaryService cheesePrimaryService, V v7) {
            this.f89611a = cheesePrimaryService;
            this.f89612b = v7;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            Object objCoroutineScope;
            Object next;
            C6081b.a aVar = (C6081b.a) obj;
            BLog.d("createPrimaryComponent effect: " + aVar);
            boolean zAreEqual = Intrinsics.areEqual(aVar, C6081b.a.C0617a.f89715a);
            CheesePrimaryService cheesePrimaryService = this.f89611a;
            if (!zAreEqual) {
                if (!Intrinsics.areEqual(aVar, C6081b.a.d.f89718a)) {
                    boolean zAreEqual2 = Intrinsics.areEqual(aVar, C6081b.a.c.f89717a);
                    V v7 = this.f89612b;
                    if (zAreEqual2) {
                        V v8 = (V) cheesePrimaryService.f89590b.f89787j.getValue();
                        String str = "";
                        if (v8 != null) {
                            str = v8.f89693d.f89698a.f89688a;
                            if (str == null) {
                                str = "";
                            }
                        }
                        PageReportService.g(cheesePrimaryService.f89596i, "pugv.detail.rank-list.0.click", MapsKt.mapOf(TuplesKt.to("list_name", str)), 4);
                        BLRouter.routeTo(RouteRequestKt.toRouteRequest(v7.f89693d.f89698a.f89689b), cheesePrimaryService.f89592d);
                    } else if (Intrinsics.areEqual(aVar, C6081b.a.f.f89720a)) {
                        if (!cheesePrimaryService.f89605r) {
                            V v9 = (V) cheesePrimaryService.f89590b.f89787j.getValue();
                            String str2 = "";
                            if (v9 != null) {
                                str2 = v9.f89693d.f89698a.f89688a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                            }
                            PageReportService.i(cheesePrimaryService.f89596i, "pugv.detail.rank-list.0.show", MapsKt.mapOf(TuplesKt.to("list_name", str2)), 4);
                            cheesePrimaryService.f89605r = true;
                        }
                    } else if (Intrinsics.areEqual(aVar, C6081b.a.C0618b.f89716a)) {
                        PageReportService.g(cheesePrimaryService.f89596i, "pugv.detail.class-tag.0.click", null, 6);
                    } else if (Intrinsics.areEqual(aVar, C6081b.a.e.f89719a)) {
                        List<S> list = v7.h;
                        if (!cheesePrimaryService.f89607t) {
                            PageReportService pageReportService = cheesePrimaryService.f89596i;
                            PageReportService.i(pageReportService, "pugv.detail.class-tag.0.show", null, 6);
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                if (((S) next).f89684d == PugvBadgeType.PUGV_BADGE_TYPE_AI) {
                                    break;
                                }
                            }
                            if (next != null) {
                                PageReportService.i(pageReportService, "pugv.detail.class-tag.ai-repeat.show", null, 6);
                            }
                            cheesePrimaryService.f89607t = true;
                        }
                    } else if (Intrinsics.areEqual(aVar, C6081b.a.j.f89725a)) {
                        cheesePrimaryService.f89601n.a();
                    } else if (aVar instanceof C6081b.a.h) {
                        C6081b.a.h hVar = (C6081b.a.h) aVar;
                        long j7 = hVar.f89722a;
                        PageReportService.g(cheesePrimaryService.f89596i, "pugv.detail.set.season.click", hVar.f89723b, 4);
                        if (cheesePrimaryService.f89597j.f117531a != j7) {
                            cheesePrimaryService.f89598k.b(j7);
                        }
                    } else if (aVar instanceof C6081b.a.i) {
                        PageReportService.i(cheesePrimaryService.f89596i, "pugv.detail.set.season.show", ((C6081b.a.i) aVar).f89724a, 4);
                    } else {
                        if (!(aVar instanceof C6081b.a.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheesePrimaryService$createPrimaryComponent$1$1$1(cheesePrimaryService, new L(cheesePrimaryService.f89599l.f89646b, new T9.j(cheesePrimaryService, 1), new C6102x(cheesePrimaryService)), null), continuation);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                    }
                } else if (!cheesePrimaryService.f89606s) {
                    PageReportService.i(cheesePrimaryService.f89596i, "pugv.detail.sale-activity.0.show", null, 6);
                    cheesePrimaryService.f89606s = true;
                }
                objCoroutineScope = Unit.INSTANCE;
            } else if (BiliAccounts.get(cheesePrimaryService.f89592d).isLogin()) {
                C6101w c6101w = cheesePrimaryService.f89590b;
                if (c6101w.a().f117607g == 1) {
                    CheesePrimaryService.b(cheesePrimaryService, true);
                    objCoroutineScope = cheesePrimaryService.c(continuation);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                } else if (c6101w.a().f117607g == 2) {
                    CheesePrimaryService.b(cheesePrimaryService, false);
                    objCoroutineScope = CheesePrimaryService.a(cheesePrimaryService, c6101w.a().f117601a, continuation);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                } else {
                    objCoroutineScope = Unit.INSTANCE;
                }
            } else {
                com.bapis.bilibili.account.interfaces.v1.g.a(null, "activity://main/login/", 2, null);
                objCoroutineScope = Unit.INSTANCE;
            }
            return objCoroutineScope;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryService$createPrimaryComponent$1(C6081b c6081b, CheesePrimaryService cheesePrimaryService, V v7, Continuation<? super CheesePrimaryService$createPrimaryComponent$1> continuation) {
        super(1, continuation);
        this.$component = c6081b;
        this.this$0 = cheesePrimaryService;
        this.$primaryInfo = v7;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheesePrimaryService$createPrimaryComponent$1(this.$component, this.this$0, this.$primaryInfo, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<C6081b.a> sharedFlow = this.$component.f89714c;
            a aVar = new a(this.this$0, this.$primaryInfo);
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
