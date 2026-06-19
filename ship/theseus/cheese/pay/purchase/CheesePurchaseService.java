package com.bilibili.ship.theseus.cheese.pay.purchase;

import android.content.Intent;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.ui.text.font.C4496a;
import androidx.fragment.app.FragmentActivity;
import au0.C4911a;
import com.bilibili.cheese.pay.purchase.o;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.CheeseBottomContainerService;
import com.bilibili.ship.theseus.cheese.biz.bottomcontainer.i;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6101w;
import com.bilibili.ship.theseus.cheese.biz.intro.publisher.p;
import com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService;
import com.bilibili.ship.theseus.cheese.pay.purchase.guide.CheesePurchaseGuideRepository;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.activityresult.ActivityResultRepository;
import com.tencent.connect.common.Constants;
import eu0.C6982a;
import eu0.C6987f;
import eu0.C7003v;
import eu0.C7007z;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService.class */
@StabilityInferred(parameters = 0)
public final class CheesePurchaseService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f90499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePurchaseRepository f90500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C4911a f90502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CheesePurchaseGuideRepository f90503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6101w f90504g;

    @NotNull
    public final i h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CheeseBottomContainerService f90505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C7007z f90506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.bean.b f90507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f90508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ActivityResultRepository f90509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f90510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C6987f f90511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C7003v f90512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C6982a f90513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f90514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final p f90515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.cheese.pay.purchase.e f90516t = new com.bilibili.cheese.pay.purchase.e();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePurchaseService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$1$1.class */
        public static final class C06531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private Object L$0;
            int label;
            final CheesePurchaseService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$1$1$1.class */
            public static final class C06541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final CheesePurchaseService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$1$1$1$1.class */
                public static final class C06551 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
                    int I$0;
                    int label;
                    final CheesePurchaseService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C06551(CheesePurchaseService cheesePurchaseService, Continuation<? super C06551> continuation) {
                        super(2, continuation);
                        this.this$0 = cheesePurchaseService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C06551 c06551 = new C06551(this.this$0, continuation);
                        c06551.I$0 = ((Number) obj).intValue();
                        return c06551;
                    }

                    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
                        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        int i7 = this.I$0;
                        boolean z6 = true;
                        if (this.this$0.f90511o.f117533c != 1) {
                            z6 = false;
                        }
                        defpackage.a.b("[theseus-cheese-CheesePurchaseService$1$1$1$1-invokeSuspend] ", "payService enterPay collect location: " + i7 + ", stopSellState: " + z6, "CheesePurchaseService$1$1$1$1-invokeSuspend");
                        if (z6) {
                            ToastHelper.showToastShort(this.this$0.f90499b, 2131846460);
                            return Unit.INSTANCE;
                        }
                        if (!this.this$0.f90510n.h().f102987a) {
                            this.this$0.f90510n.d();
                        }
                        CheesePurchaseGuideRepository cheesePurchaseGuideRepository = this.this$0.f90503f;
                        defpackage.a.b("[theseus-cheese-CheesePurchaseGuideRepository-onPurchasePayPanelShow] ", C3751q.a(cheesePurchaseGuideRepository.f90528g, "onPurchasePayPanelShow: "), "CheesePurchaseGuideRepository-onPurchasePayPanelShow");
                        cheesePurchaseGuideRepository.f90528g++;
                        CheesePurchaseService cheesePurchaseService = this.this$0;
                        cheesePurchaseService.f90516t.b(i7, new gu0.b(cheesePurchaseService.f90502e, cheesePurchaseService.f90501d, cheesePurchaseService.f90504g, cheesePurchaseService.f90507k, cheesePurchaseService.f90511o, cheesePurchaseService.f90506j, cheesePurchaseService.f90514r, cheesePurchaseService.f90515s));
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06541(CheesePurchaseService cheesePurchaseService, Continuation<? super C06541> continuation) {
                    super(2, continuation);
                    this.this$0 = cheesePurchaseService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06541(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CheesePurchaseService cheesePurchaseService = this.this$0;
                        SharedFlow<Integer> sharedFlow = cheesePurchaseService.f90500c.f90497c;
                        C06551 c06551 = new C06551(cheesePurchaseService, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(sharedFlow, c06551, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$1$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$1$1$2.class */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final CheesePurchaseService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$1$1$2$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$1$1$2$1.class */
                public static final class C06561 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.united.page.activityresult.a, Continuation<? super Unit>, Object> {
                    Object L$0;
                    int label;
                    final CheesePurchaseService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C06561(CheesePurchaseService cheesePurchaseService, Continuation<? super C06561> continuation) {
                        super(2, continuation);
                        this.this$0 = cheesePurchaseService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C06561 c06561 = new C06561(this.this$0, continuation);
                        c06561.L$0 = obj;
                        return c06561;
                    }

                    public final Object invoke(com.bilibili.ship.theseus.united.page.activityresult.a aVar, Continuation<? super Unit> continuation) {
                        return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        com.bilibili.ship.theseus.united.page.activityresult.a aVar = (com.bilibili.ship.theseus.united.page.activityresult.a) this.L$0;
                        defpackage.a.b("[theseus-cheese-CheesePurchaseService$1$1$2$1-invokeSuspend] ", C3259x.a(aVar.f98830a, "payService activityResult requestCode = "), "CheesePurchaseService$1$1$2$1-invokeSuspend");
                        CheesePurchaseService cheesePurchaseService = this.this$0;
                        cheesePurchaseService.getClass();
                        StringBuilder sb = new StringBuilder("purchaseService handleActivityResult requestCode: ");
                        int i7 = aVar.f98830a;
                        sb.append(i7);
                        sb.append(", resultCode: ");
                        int i8 = aVar.f98831b;
                        sb.append(i8);
                        defpackage.a.b("[theseus-cheese-CheesePurchaseService-handleActivityResult] ", sb.toString(), "CheesePurchaseService-handleActivityResult");
                        Boolean boolValueOf = null;
                        if (i7 == 1000) {
                            BuildersKt.launch$default(cheesePurchaseService.f90498a, (CoroutineContext) null, (CoroutineStart) null, new CheesePurchaseService$handleActivityResult$1(null), 3, (Object) null);
                        } else if (i8 == -1) {
                            InterfaceC7008a interfaceC7008a = cheesePurchaseService.f90508l;
                            if (i7 == 1001) {
                                Intent intent = aVar.f98832c;
                                if (intent != null) {
                                    boolValueOf = Boolean.valueOf(intent.getBooleanExtra("paid", false));
                                }
                                defpackage.a.b("[theseus-cheese-CheesePurchaseService-handleActivityResult] ", "purchaseService handleActivityResult paidResult: " + boolValueOf, "CheesePurchaseService-handleActivityResult");
                                if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                                    interfaceC7008a.a();
                                }
                            } else if (i7 == 1002 || i7 == 1010) {
                                interfaceC7008a.a();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(CheesePurchaseService cheesePurchaseService, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = cheesePurchaseService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass2(this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CheesePurchaseService cheesePurchaseService = this.this$0;
                        SharedFlow<com.bilibili.ship.theseus.united.page.activityresult.a> sharedFlow = cheesePurchaseService.f90509m.f98829c;
                        C06561 c06561 = new C06561(cheesePurchaseService, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(sharedFlow, c06561, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06531(CheesePurchaseService cheesePurchaseService, Continuation<? super C06531> continuation) {
                super(2, continuation);
                this.this$0 = cheesePurchaseService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06531 c06531 = new C06531(this.this$0, continuation);
                c06531.L$0 = obj;
                return c06531;
            }

            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C06541(this.this$0, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.this$0, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePurchaseService cheesePurchaseService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheesePurchaseService;
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
                C06531 c06531 = new C06531(this.this$0, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c06531, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePurchaseService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheesePurchaseService cheesePurchaseService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheesePurchaseService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CheesePurchaseService cheesePurchaseService) {
            cheesePurchaseService.f90508l.a();
            MainCommonService mainCommonService = (MainCommonService) w8.d.a(BLRouter.INSTANCE, MainCommonService.class, "default");
            if (mainCommonService != null) {
                mainCommonService.showNotificationSettingDialog(cheesePurchaseService.f90499b, Constants.VIA_REPORT_TYPE_WPA_STATE, "");
            }
            String str = cheesePurchaseService.f90512p.f117587a;
            if (!StringsKt.isBlank(str)) {
                if (StringsKt.n(cheesePurchaseService.f90502e.f54247l, "333.873.selfDef")) {
                    defpackage.a.b("[theseus-cheese-CheesePurchaseService-showPurchaseGuidePanel] ", android.support.v4.media.a.a("showPurchaseGuidePanel, url = ", str, ", contains spmid black key"), "CheesePurchaseService-showPurchaseGuidePanel");
                } else {
                    defpackage.a.b("[theseus-cheese-CheesePurchaseService-showPurchaseGuidePanel] ", C4496a.a("showPurchaseGuidePanel, url = ", str), "CheesePurchaseService-showPurchaseGuidePanel");
                    cheesePurchaseService.f90503f.f90524c.tryEmit(str);
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CheesePurchaseService cheesePurchaseService, int i7) {
            cheesePurchaseService.f90504g.b(i7);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$2(CheesePurchaseService cheesePurchaseService) {
            boolean z6;
            Integer num;
            if (((Boolean) cheesePurchaseService.h.f89089b.getValue()).booleanValue() || (num = cheesePurchaseService.f90513q.f117502a.get("pugv_post_purchase_pop_up")) == null || num.intValue() != 2 || cheesePurchaseService.f90512p.f117588b <= 0) {
                z6 = false;
            } else {
                CheesePurchaseGuideRepository cheesePurchaseGuideRepository = cheesePurchaseService.f90503f;
                if (cheesePurchaseGuideRepository.f90526e && !cheesePurchaseGuideRepository.f90527f) {
                    long j7 = cheesePurchaseGuideRepository.h;
                    if (j7 > 0 && cheesePurchaseGuideRepository.f90528g == j7) {
                        BLog.i("CheesePurchaseGuideRepository-isPurchaseFavoriteGuideEnable", "[theseus-cheese-CheesePurchaseGuideRepository-isPurchaseFavoriteGuideEnable] isPurchaseFavoriteGuideEnable: showLimit true");
                        z6 = true;
                    }
                }
                BLog.i("CheesePurchaseGuideRepository-isPurchaseFavoriteGuideEnable", "[theseus-cheese-CheesePurchaseGuideRepository-isPurchaseFavoriteGuideEnable] isPurchaseFavoriteGuideEnable: showLimit false");
                z6 = false;
            }
            return z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(CheesePurchaseService cheesePurchaseService) {
            cheesePurchaseService.f90503f.b(String.valueOf(cheesePurchaseService.f90511o.f117531a));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(CheesePurchaseService cheesePurchaseService) {
            cheesePurchaseService.f90505i.d();
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final CheesePurchaseService cheesePurchaseService = this.this$0;
                com.bilibili.cheese.pay.purchase.e eVar = cheesePurchaseService.f90516t;
                o oVar = new o(new Function0(cheesePurchaseService) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.a

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePurchaseService f90517a;

                    {
                        this.f90517a = cheesePurchaseService;
                    }

                    public final Object invoke() {
                        return CheesePurchaseService.AnonymousClass2.invokeSuspend$lambda$0(this.f90517a);
                    }
                }, new Function1(cheesePurchaseService) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePurchaseService f90518a;

                    {
                        this.f90518a = cheesePurchaseService;
                    }

                    public final Object invoke(Object obj2) {
                        return CheesePurchaseService.AnonymousClass2.invokeSuspend$lambda$1(this.f90518a, ((Integer) obj2).intValue());
                    }
                }, new Function0(cheesePurchaseService) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.c

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePurchaseService f90519a;

                    {
                        this.f90519a = cheesePurchaseService;
                    }

                    public final Object invoke() {
                        return Boolean.valueOf(CheesePurchaseService.AnonymousClass2.invokeSuspend$lambda$2(this.f90519a));
                    }
                }, new Function0(cheesePurchaseService) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePurchaseService f90520a;

                    {
                        this.f90520a = cheesePurchaseService;
                    }

                    public final Object invoke() {
                        return CheesePurchaseService.AnonymousClass2.invokeSuspend$lambda$3(this.f90520a);
                    }
                }, new Function0(cheesePurchaseService) { // from class: com.bilibili.ship.theseus.cheese.pay.purchase.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final CheesePurchaseService f90521a;

                    {
                        this.f90521a = cheesePurchaseService;
                    }

                    public final Object invoke() {
                        return CheesePurchaseService.AnonymousClass2.invokeSuspend$lambda$4(this.f90521a);
                    }
                });
                this.label = 1;
                if (eVar.a(cheesePurchaseService.f90499b, oVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/CheesePurchaseService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePurchaseService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheesePurchaseService cheesePurchaseService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheesePurchaseService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CheesePurchaseService cheesePurchaseService = this.this$0;
            CheesePurchaseGuideRepository cheesePurchaseGuideRepository = cheesePurchaseService.f90503f;
            long j7 = cheesePurchaseService.f90512p.f117588b;
            long j8 = cheesePurchaseGuideRepository.h;
            if (j8 > 0) {
                StringBuilder sbA = z.a(j7, "setPurchaseFavoriteGuideShowTime: ", ", already set: ");
                sbA.append(j8);
                defpackage.a.b("[theseus-cheese-CheesePurchaseGuideRepository-setPurchaseFavoriteGuideShowTime] ", sbA.toString(), "CheesePurchaseGuideRepository-setPurchaseFavoriteGuideShowTime");
            } else {
                cheesePurchaseGuideRepository.h = j7;
            }
            CheesePurchaseService cheesePurchaseService2 = this.this$0;
            cheesePurchaseService2.f90503f.a(String.valueOf(cheesePurchaseService2.f90502e.f54237a));
            return Unit.INSTANCE;
        }
    }

    @Inject
    public CheesePurchaseService(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull CheesePurchaseRepository cheesePurchaseRepository, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull C4911a c4911a, @NotNull CheesePurchaseGuideRepository cheesePurchaseGuideRepository, @NotNull C6101w c6101w, @NotNull i iVar, @NotNull CheeseBottomContainerService cheeseBottomContainerService, @NotNull C7007z c7007z, @NotNull com.bilibili.ship.theseus.united.bean.b bVar, @NotNull InterfaceC7008a interfaceC7008a, @NotNull ActivityResultRepository activityResultRepository, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull C6987f c6987f, @NotNull C7003v c7003v, @NotNull C6982a c6982a, boolean z6, @NotNull p pVar) {
        this.f90498a = coroutineScope;
        this.f90499b = fragmentActivity;
        this.f90500c = cheesePurchaseRepository;
        this.f90501d = cheesePlayRepository;
        this.f90502e = c4911a;
        this.f90503f = cheesePurchaseGuideRepository;
        this.f90504g = c6101w;
        this.h = iVar;
        this.f90505i = cheeseBottomContainerService;
        this.f90506j = c7007z;
        this.f90507k = bVar;
        this.f90508l = interfaceC7008a;
        this.f90509m = activityResultRepository;
        this.f90510n = cVar;
        this.f90511o = c6987f;
        this.f90512p = c7003v;
        this.f90513q = c6982a;
        this.f90514r = z6;
        this.f90515s = pVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
