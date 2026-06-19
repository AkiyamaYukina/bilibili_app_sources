package com.bilibili.ship.theseus.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ad.adview.videodetail.merchandise.y;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accountinfo.model.VipUserInfo;
import com.bilibili.lib.accounts.BiliAccountInfoKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.pvtracker.PageViewTracker;
import com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService.class */
@StabilityInferred(parameters = 0)
public final class PageReportParamsProviderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f90854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BusinessScopeDriverImpl f90855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f90856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f90857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f90858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f90859g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$1$1.class */
        public static final class C06701 extends SuspendLambda implements Function2<AccountInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06701(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super C06701> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06701 c06701 = new C06701(this.this$0, continuation);
                c06701.L$0 = obj;
                return c06701;
            }

            public final Object invoke(AccountInfo accountInfo, Continuation<? super Unit> continuation) {
                return create(accountInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountInfo accountInfo = (AccountInfo) this.L$0;
                    VipUserInfo vipInfo = accountInfo != null ? accountInfo.getVipInfo() : null;
                    if (vipInfo != null) {
                        PageReportService pageReportService = this.this$0.f90854b;
                        Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("vip_status", String.valueOf(vipInfo.getVipStatus())), TuplesKt.to("vip_type", String.valueOf(vipInfo.getVipType())), TuplesKt.to("vip_due_date", String.valueOf(vipInfo.getEndTime()))});
                        this.label = 1;
                        if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
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
                Flow flowA = BiliAccountInfoKt.a(this.this$0.f90858f);
                C06701 c06701 = new C06701(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, c06701, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C8044b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C8044b c8044b, Continuation<? super Unit> continuation) {
                return create(c8044b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C8044b c8044b = (C8044b) this.L$0;
                    PageReportService pageReportService = this.this$0.f90854b;
                    Map<String, String> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("from_spmid", c8044b.f123881c), TuplesKt.to("from_out_spmid", c8044b.f123883e)});
                    this.label = 1;
                    if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
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
        public AnonymousClass2(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
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
                PageReportParamsProviderService pageReportParamsProviderService = this.this$0;
                MutableStateFlow mutableStateFlow = pageReportParamsProviderService.f90859g.f123877b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(pageReportParamsProviderService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.ship.theseus.keel.player.j, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invokeSuspend$lambda$0(com.bilibili.ship.theseus.keel.player.j jVar) {
                return String.valueOf(Duration.getInWholeSeconds-impl(jVar.F()));
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(com.bilibili.ship.theseus.keel.player.j jVar, Continuation<? super Unit> continuation) {
                return create(jVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r11 = r0
                    r0 = r7
                    int r0 = r0.label
                    r9 = r0
                    r0 = r9
                    if (r0 == 0) goto L3a
                    r0 = r9
                    r1 = 1
                    if (r0 == r1) goto L29
                    r0 = r9
                    r1 = 2
                    if (r0 != r1) goto L1f
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    goto Lbd
                L1f:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                L29:
                    r0 = r7
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
                    r10 = r0
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r10
                    r8 = r0
                    goto L7e
                L3a:
                    r0 = r8
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r7
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.ship.theseus.keel.player.j r0 = (com.bilibili.ship.theseus.keel.player.j) r0
                    r8 = r0
                    r0 = r8
                    if (r0 == 0) goto Lbd
                    r0 = r7
                    com.bilibili.ship.theseus.detail.PageReportParamsProviderService r0 = r0.this$0
                    com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f90854b
                    r10 = r0
                    kotlin.Pair r0 = new kotlin.Pair
                    r1 = r0
                    java.lang.String r2 = "pgc_ep_progress"
                    com.bilibili.ship.theseus.detail.e r3 = new com.bilibili.ship.theseus.detail.e
                    r4 = r3
                    r5 = r8
                    r4.<init>(r5)
                    r1.<init>(r2, r3)
                    r12 = r0
                    r0 = r7
                    r1 = r8
                    r0.L$0 = r1
                    r0 = r7
                    r1 = 1
                    r0.label = r1
                    r0 = r10
                    r1 = r12
                    r2 = r7
                    java.lang.Object r0 = r0.b(r1, r2)
                    r1 = r11
                    if (r0 != r1) goto L7e
                    r0 = r11
                    return r0
                L7e:
                    r0 = r8
                    kotlinx.coroutines.flow.StateFlow r0 = r0.l()
                    java.lang.Object r0 = r0.getValue()
                    com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r0 = (com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams) r0
                    r10 = r0
                    r0 = r7
                    com.bilibili.ship.theseus.detail.PageReportParamsProviderService r0 = r0.this$0
                    com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f90854b
                    r8 = r0
                    java.lang.String r0 = "cid"
                    r1 = r10
                    long r1 = r1.getCid()
                    java.lang.String r1 = java.lang.String.valueOf(r1)
                    kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
                    java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
                    r10 = r0
                    r0 = r7
                    r1 = 0
                    r0.L$0 = r1
                    r0 = r7
                    r1 = 2
                    r0.label = r1
                    r0 = r8
                    r1 = r10
                    r2 = r7
                    java.lang.Object r0 = r0.e(r1, r2)
                    r1 = r11
                    if (r0 != r1) goto Lbd
                    r0 = r11
                    return r0
                Lbd:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.PageReportParamsProviderService.AnonymousClass3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
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
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f90856d.f91111e);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAsStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    c.a aVar = (c.a) this.L$0;
                    PageReportService pageReportService = this.this$0.f90854b;
                    Map<String, String> mapMapOf = MapsKt.mapOf(TuplesKt.to("player_status", aVar.f102988b ? "2" : "1"));
                    this.label = 1;
                    if (pageReportService.e(mapMapOf, this) == coroutine_suspended) {
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
        public AnonymousClass4(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowC = this.this$0.f90857e.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$5$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$5$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function3<com.bilibili.ship.theseus.keel.player.j, Boolean, Continuation<? super Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object invoke(com.bilibili.ship.theseus.keel.player.j jVar, boolean z6, Continuation<? super Pair<? extends com.bilibili.ship.theseus.keel.player.j, Boolean>> continuation) {
                return AnonymousClass5.invokeSuspend$lambda$0(jVar, z6, continuation);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((com.bilibili.ship.theseus.keel.player.j) obj, ((Boolean) obj2).booleanValue(), (Continuation<? super Pair<? extends com.bilibili.ship.theseus.keel.player.j, Boolean>>) obj3);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$5$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$5$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<Pair<? extends com.bilibili.ship.theseus.keel.player.j, ? extends Boolean>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(Pair<? extends com.bilibili.ship.theseus.keel.player.j, Boolean> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) this.L$0;
                    com.bilibili.ship.theseus.keel.player.j jVar = (com.bilibili.ship.theseus.keel.player.j) pair.component1();
                    boolean zBooleanValue = ((Boolean) pair.component2()).booleanValue();
                    if (jVar != null && !zBooleanValue) {
                        GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) jVar.l().getValue();
                        String str = (String) geminiCommonPlayableParams.getExtraContentForResolve().get("ep_id");
                        String str2 = (String) geminiCommonPlayableParams.getExtraContentForResolve().get("season_id");
                        Integer epStatus = geminiCommonPlayableParams.getEpStatus();
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        mapCreateMapBuilder.put("cid", String.valueOf(geminiCommonPlayableParams.getCid()));
                        mapCreateMapBuilder.put(GameCardButton.extraAvid, String.valueOf(geminiCommonPlayableParams.getAvid()));
                        if (str != null) {
                            mapCreateMapBuilder.put("ep_id", str);
                        }
                        if (str2 != null) {
                            mapCreateMapBuilder.put("season_id", str2);
                        }
                        if (epStatus != null) {
                            mapCreateMapBuilder.put("ep_status", String.valueOf(epStatus.intValue()));
                        }
                        Map<String, String> mapBuild = MapsKt.build(mapCreateMapBuilder);
                        PageReportService pageReportService = this.this$0.f90854b;
                        this.label = 1;
                        if (pageReportService.e(mapBuild, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass5(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(com.bilibili.ship.theseus.keel.player.j jVar, boolean z6, Continuation continuation) {
            return new Pair(jVar, Boxing.boxBoolean(z6));
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowAsStateFlow = FlowKt.asStateFlow(this.this$0.f90856d.f91111e);
                final MutableStateFlow<BusinessScopeDriverImpl.b> mutableStateFlow = this.this$0.f90855c.f90826t;
                Flow flowCombine = FlowKt.combine(stateFlowAsStateFlow, new Flow<Boolean>(mutableStateFlow) { // from class: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final Flow f90847a;

                    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1$2, reason: invalid class name */
                    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$special$$inlined$map$1$2.class */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final FlowCollector f90848a;

                        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$special$$inlined$map$1$2$1.class */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            Object result;
                            final AnonymousClass2 this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                                super(continuation);
                                this.this$0 = anonymousClass2;
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return this.this$0.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.f90848a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                            /*
                                r5 = this;
                                r0 = r7
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L29
                                r0 = r7
                                com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                                r9 = r0
                                r0 = r9
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L29
                                r0 = r9
                                r1 = r8
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                int r1 = r1 + r2
                                r0.label = r1
                                r0 = r9
                                r7 = r0
                                goto L33
                            L29:
                                com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1$2$1
                                r1 = r0
                                r2 = r5
                                r3 = r7
                                r1.<init>(r2, r3)
                                r7 = r0
                            L33:
                                r0 = r7
                                java.lang.Object r0 = r0.result
                                r10 = r0
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                r9 = r0
                                r0 = r7
                                int r0 = r0.label
                                r8 = r0
                                r0 = r8
                                if (r0 == 0) goto L5e
                                r0 = r8
                                r1 = 1
                                if (r0 != r1) goto L54
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                goto L86
                            L54:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                r1 = r0
                                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r2)
                                throw r0
                            L5e:
                                r0 = r10
                                kotlin.ResultKt.throwOnFailure(r0)
                                r0 = r6
                                com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$b r0 = (com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.b) r0
                                boolean r0 = r0 instanceof com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.b.c
                                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                                r6 = r0
                                r0 = r7
                                r1 = 1
                                r0.label = r1
                                r0 = r5
                                kotlinx.coroutines.flow.FlowCollector r0 = r0.f90848a
                                r1 = r6
                                r2 = r7
                                java.lang.Object r0 = r0.emit(r1, r2)
                                r1 = r9
                                if (r0 != r1) goto L86
                                r0 = r9
                                return r0
                            L86:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    {
                        this.f90847a = mutableStateFlow;
                    }

                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = this.f90847a.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, AnonymousClass3.INSTANCE);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.player.tangram.basic.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = (com.bilibili.player.tangram.basic.a) obj;
                return anonymousClass1;
            }

            /* JADX INFO: renamed from: invoke-Ivnldq8, reason: not valid java name and merged with bridge method [inline-methods] */
            public final Object invoke(com.bilibili.player.tangram.basic.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
                    if (aVar != null) {
                        PageReportService pageReportService = this.this$0.f90854b;
                        Map mapA = y.a(aVar.f79320a, "play_qn");
                        this.label = 1;
                        if (pageReportService.d(mapA, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass6(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageReportParamsProviderService pageReportParamsProviderService = this.this$0;
                MutableStateFlow<com.bilibili.player.tangram.basic.a> mutableStateFlow = pageReportParamsProviderService.f90856d.f91109c.f79295b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(pageReportParamsProviderService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$7$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$7$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AccountInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PageReportParamsProviderService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = pageReportParamsProviderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(AccountInfo accountInfo, Continuation<? super Unit> continuation) {
                return create(accountInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AccountInfo accountInfo = (AccountInfo) this.L$0;
                    VipUserInfo vipInfo = accountInfo != null ? accountInfo.getVipInfo() : null;
                    if (vipInfo != null) {
                        PageReportService pageReportService = this.this$0.f90854b;
                        Map mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("vip_status", String.valueOf(vipInfo.getVipStatus())), TuplesKt.to("vip_type", String.valueOf(vipInfo.getVipType())), TuplesKt.to("vip_due_date", String.valueOf(vipInfo.getEndTime()))});
                        this.label = 1;
                        if (pageReportService.d(mapMapOf, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass7(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowA = BiliAccountInfoKt.a(this.this$0.f90858f);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.PageReportParamsProviderService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/PageReportParamsProviderService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PageReportParamsProviderService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(PageReportParamsProviderService pageReportParamsProviderService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = pageReportParamsProviderService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            String strCurrentPolarisActionId = PageViewTracker.getInstance().currentPolarisActionId();
            String str = strCurrentPolarisActionId;
            if (strCurrentPolarisActionId == null) {
                str = "";
            }
            return str;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PageReportService pageReportService = this.this$0.f90854b;
                Pair pair = new Pair("action_id", new Object());
                this.label = 1;
                if (pageReportService.b(pair, this) == coroutine_suspended) {
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
    public PageReportParamsProviderService(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull BusinessScopeDriverImpl businessScopeDriverImpl, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull BiliAccounts biliAccounts, @NotNull C8043a c8043a) {
        this.f90853a = coroutineScope;
        this.f90854b = pageReportService;
        this.f90855c = businessScopeDriverImpl;
        this.f90856d = hVar;
        this.f90857e = cVar;
        this.f90858f = biliAccounts;
        this.f90859g = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
    }
}
