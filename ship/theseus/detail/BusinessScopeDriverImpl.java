package com.bilibili.ship.theseus.detail;

import Pb.F;
import Pb.G;
import android.app.Activity;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccountInfoKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService;
import com.bilibili.ship.theseus.united.page.loading.TheseusPageLoadingStateService;
import dagger.internal.Provider;
import ev0.InterfaceC7008a;
import ev0.l;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl.class */
@StabilityInferred(parameters = 0)
public final class BusinessScopeDriverImpl implements InterfaceC7008a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f90808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.sail.f f90810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f90811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a.o0 f90812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a.G1 f90813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a.T1.a f90814g;

    @NotNull
    public final ActivityColorRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f90815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C8043a f90816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.report.d f90817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f90818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TheseusPageErrorStateService f90819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a f90820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f90821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Ku0.a f90822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final wv0.a f90823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ReloadOnAccountInfoChangeService f90824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final TheseusPageLoadingStateService f90825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f90826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Job f90827u;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $initial;
        int label;
        final BusinessScopeDriverImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BusinessScopeDriverImpl businessScopeDriverImpl, a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = businessScopeDriverImpl;
            this.$initial = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$initial, continuation);
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
            BusinessScopeDriverImpl businessScopeDriverImpl = this.this$0;
            a aVar = this.$initial;
            InterfaceC7008a.c(businessScopeDriverImpl, aVar.f90831c, aVar.f90829a, aVar.f90830b, null, false, 0, 56);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BusinessScopeDriverImpl f90828a;

            public a(BusinessScopeDriverImpl businessScopeDriverImpl) {
                this.f90828a = businessScopeDriverImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                BusinessScopeDriverImpl businessScopeDriverImpl = this.f90828a;
                Job job = businessScopeDriverImpl.f90827u;
                if (job == null || !job.isActive()) {
                    businessScopeDriverImpl.a();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = businessScopeDriverImpl;
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
                BusinessScopeDriverImpl businessScopeDriverImpl = this.this$0;
                Flow<Unit> flow = businessScopeDriverImpl.f90824r.f98798b;
                a aVar = new a(businessScopeDriverImpl);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final BusinessScopeDriverImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = businessScopeDriverImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    b bVar = (b) this.L$0;
                    BusinessScopeDriverImpl businessScopeDriverImpl = this.this$0;
                    this.label = 1;
                    if (BusinessScopeDriverImpl.g(businessScopeDriverImpl, bVar, this) == coroutine_suspended) {
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
        public AnonymousClass3(BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = businessScopeDriverImpl;
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
                BusinessScopeDriverImpl businessScopeDriverImpl = this.this$0;
                MutableStateFlow<b> mutableStateFlow = businessScopeDriverImpl.f90826t;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(businessScopeDriverImpl, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$4.class */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final BusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<AccountInfo, AccountInfo, Continuation<? super AccountInfo>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final BusinessScopeDriverImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = businessScopeDriverImpl;
            }

            public final Object invoke(AccountInfo accountInfo, AccountInfo accountInfo2, Continuation<? super AccountInfo> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = accountInfo;
                anonymousClass1.L$1 = accountInfo2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AccountInfo accountInfo = (AccountInfo) this.L$0;
                AccountInfo accountInfo2 = (AccountInfo) this.L$1;
                if (accountInfo != null && !accountInfo.isFormalAccount() && accountInfo2 != null && accountInfo2.isFormalAccount()) {
                    b bVar = (b) this.this$0.f90826t.getValue();
                    if (bVar instanceof b.a) {
                        InterfaceC7008a.c(this.this$0, ((b.a) bVar).f90833a, null, null, null, false, 0, 62);
                    }
                }
                return accountInfo2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BusinessScopeDriverImpl businessScopeDriverImpl, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = businessScopeDriverImpl;
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
                Flow flowA = BiliAccountInfoKt.a(this.this$0.f90818l);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.reduce(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final ev0.h f90829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final l f90830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final InterfaceC7008a.C1258a f90831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Fj1.b f90832d;

        public a(@Nullable ev0.h hVar, @Nullable l lVar, @NotNull InterfaceC7008a.C1258a c1258a, @Nullable Fj1.b bVar) {
            this.f90829a = hVar;
            this.f90830b = lVar;
            this.f90831c = c1258a;
            this.f90832d = bVar;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f90833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Throwable f90834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.united.page.error.a f90835c;

            public a(@NotNull InterfaceC7008a.C1258a c1258a, @NotNull Throwable th, @NotNull com.bilibili.ship.theseus.united.page.error.a aVar) {
                this.f90833a = c1258a;
                this.f90834b = th;
                this.f90835c = aVar;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0669b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0669b f90836a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.sail.e f90837a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f90838b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f90839c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final CompletableDeferred<Unit> f90840d = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public Provider f90841e;

            public c(@NotNull com.bilibili.ship.theseus.sail.e eVar, @NotNull String str, @NotNull InterfaceC7008a.C1258a c1258a, boolean z6) {
                this.f90837a = eVar;
                this.f90838b = str;
                this.f90839c = c1258a;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f90842a;

            public d(@NotNull InterfaceC7008a.C1258a c1258a) {
                this.f90842a = c1258a;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final String f90843a;

            public e(@Nullable String str) {
                this.f90843a = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$f.class */
        @StabilityInferred(parameters = 0)
        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final String f90844a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f90845b;

            public f(@Nullable String str, @NotNull InterfaceC7008a.C1258a c1258a) {
                this.f90844a = str;
                this.f90845b = c1258a;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/BusinessScopeDriverImpl$b$g.class */
        @StabilityInferred(parameters = 1)
        public static final class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f90846a = new Object();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x04e1  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BusinessScopeDriverImpl(@org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.a r14, @org.jetbrains.annotations.NotNull android.app.Activity r15, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r16, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.sail.f r17, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.detail.c r18, @org.jetbrains.annotations.NotNull tv.danmaku.bili.a.o0 r19, @org.jetbrains.annotations.NotNull tv.danmaku.bili.a.G1 r20, @org.jetbrains.annotations.NotNull tv.danmaku.bili.a.T1.a r21, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.color.ActivityColorRepository r22, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.ad.PageAdRepository r23, @org.jetbrains.annotations.NotNull mv0.C8043a r24, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.ogv.report.d r25, @org.jetbrains.annotations.NotNull com.bilibili.lib.accounts.BiliAccounts r26, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService r27, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.performance.a r28, @org.jetbrains.annotations.NotNull com.bilibili.lib.accountinfo.BiliAccountInfo r29, @org.jetbrains.annotations.NotNull Ku0.a r30, @org.jetbrains.annotations.NotNull wv0.a r31, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService r32, @org.jetbrains.annotations.NotNull com.bilibili.ship.theseus.united.page.loading.TheseusPageLoadingStateService r33) {
        /*
            Method dump skipped, instruction units count: 1472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.<init>(com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$a, android.app.Activity, kotlinx.coroutines.CoroutineScope, com.bilibili.ship.theseus.sail.f, com.bilibili.ship.theseus.detail.c, tv.danmaku.bili.a$o0, tv.danmaku.bili.a$G1, tv.danmaku.bili.a$T1$a, com.bilibili.ship.theseus.united.page.color.ActivityColorRepository, com.bilibili.ship.theseus.united.page.ad.PageAdRepository, mv0.a, com.bilibili.ship.theseus.ogv.report.d, com.bilibili.lib.accounts.BiliAccounts, com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService, com.bilibili.ship.theseus.united.page.performance.a, com.bilibili.lib.accountinfo.BiliAccountInfo, Ku0.a, wv0.a, com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService, com.bilibili.ship.theseus.united.page.loading.TheseusPageLoadingStateService):void");
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    public static void f(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl r7, com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.b r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.g(com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl, com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl$b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    @Override // ev0.InterfaceC7008a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018d  */
    @Override // ev0.InterfaceC7008a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(@org.jetbrains.annotations.NotNull ev0.InterfaceC7008a.C1258a r11, @org.jetbrains.annotations.Nullable ev0.h r12, @org.jetbrains.annotations.Nullable ev0.l r13, @org.jetbrains.annotations.Nullable ev0.g r14, boolean r15, int r16) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.detail.BusinessScopeDriverImpl.d(ev0.a$a, ev0.h, ev0.l, ev0.g, boolean, int):void");
    }
}
