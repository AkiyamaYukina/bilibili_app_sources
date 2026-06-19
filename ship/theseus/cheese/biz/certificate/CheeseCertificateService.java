package com.bilibili.ship.theseus.cheese.biz.certificate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.widget.TheseusAncestorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.JsonObject;
import eu0.C6985d;
import eu0.C6993l;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService.class */
@StabilityInferred(parameters = 0)
public final class CheeseCertificateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<a> f89230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f89231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final c f89232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f89233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f89234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C6993l f89235g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CheeseCatalogService f89236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f89237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f89238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f89239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f89240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f89241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public JsonObject f89242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public JsonObject f89243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public JsonObject f89244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public String f89245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public JsonObject f89246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f89247t;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCertificateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$1$1.class */
        public static final class C06021 extends SuspendLambda implements Function2<C6985d, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseCertificateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06021(CheeseCertificateService cheeseCertificateService, Continuation<? super C06021> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCertificateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06021 c06021 = new C06021(this.this$0, continuation);
                c06021.L$0 = obj;
                return c06021;
            }

            public final Object invoke(C6985d c6985d, Continuation<? super Unit> continuation) {
                return create(c6985d, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C6985d c6985d = (C6985d) this.L$0;
                    CheeseCertificateService cheeseCertificateService = this.this$0;
                    cheeseCertificateService.f89241n = false;
                    cheeseCertificateService.f89247t = false;
                    if (c6985d.f117521q == cheeseCertificateService.f89235g.f117553e) {
                        this.label = 1;
                        if (CheeseCertificateService.a(cheeseCertificateService, this) == coroutine_suspended) {
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
        public AnonymousClass1(CheeseCertificateService cheeseCertificateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCertificateService;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f89234f.f90695y);
                C06021 c06021 = new C06021(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, c06021, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseCertificateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheeseCertificateService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$2$1$a.class */
            public static final class a implements AppBarLayout.OnOffsetChangedListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseCertificateService f89248a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final TheseusAncestorLayout f89249b;

                public a(CheeseCertificateService cheeseCertificateService, TheseusAncestorLayout theseusAncestorLayout) {
                    this.f89248a = cheeseCertificateService;
                    this.f89249b = theseusAncestorLayout;
                }

                public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
                    CheeseCertificateService cheeseCertificateService = this.f89248a;
                    cheeseCertificateService.getClass();
                    cheeseCertificateService.f89239l.setValue(Integer.valueOf((this.f89249b.getHeight() - appBarLayout.getBottom()) - NewPlayerUtilsKt.toPx(60.0f)));
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$2$1$b */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$2$1$b.class */
            public static final class b implements j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final a f89250a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a f89251b;

                public b(a aVar, a aVar2) {
                    this.f89250a = aVar;
                    this.f89251b = aVar2;
                }

                public final void invoke() {
                    this.f89250a.f89253b.removeOnOffsetChangedListener(this.f89251b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheeseCertificateService cheeseCertificateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheeseCertificateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                j bVar;
                j jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (aVar == null) {
                        return Unit.INSTANCE;
                    }
                    a aVar2 = new a(this.this$0, aVar.f89252a);
                    aVar.f89253b.addOnOffsetChangedListener(aVar2);
                    bVar = new b(aVar, aVar2);
                    try {
                        this.L$0 = bVar;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        jVar = bVar;
                        jVar.invoke();
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j jVar2 = (j) this.L$0;
                    jVar = jVar2;
                    try {
                        ResultKt.throwOnFailure(obj);
                        bVar = jVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        jVar.invoke();
                        throw th;
                    }
                }
                j jVar3 = bVar;
                jVar = bVar;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheeseCertificateService cheeseCertificateService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheeseCertificateService;
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
                CheeseCertificateService cheeseCertificateService = this.this$0;
                Flow<a> flow = cheeseCertificateService.f89230b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheeseCertificateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$CredentialAPi.class */
    @BaseUrl("https://api.bilibili.com")
    public interface CredentialAPi {
        @GET("/pugv/view/html5/credential/detail")
        @Nullable
        Object canUnlockOrNot(@Query("season_id") long j7, @NotNull Continuation<? super BiliApiResponse<JsonObject>> continuation);

        @POST("/pugv/view/html5/credential/unlock")
        @Nullable
        Object unlock(@Query("season_id") long j7, @NotNull Continuation<? super BiliApiResponse<JsonObject>> continuation);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/certificate/CheeseCertificateService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final TheseusAncestorLayout f89252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final AppBarLayout f89253b;

        public a(@NotNull TheseusAncestorLayout theseusAncestorLayout, @NotNull AppBarLayout appBarLayout) {
            this.f89252a = theseusAncestorLayout;
            this.f89253b = appBarLayout;
        }
    }

    @Inject
    public CheeseCertificateService(@NotNull CoroutineScope coroutineScope, @NotNull Flow<a> flow, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull c cVar, @NotNull h hVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull C6993l c6993l, @NotNull PageReportService pageReportService, @NotNull CheeseCatalogService cheeseCatalogService, @NotNull CheesePlayRepository cheesePlayRepository2, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository) {
        this.f89229a = coroutineScope;
        this.f89230b = flow;
        this.f89231c = theseusFloatLayerService;
        this.f89232d = cVar;
        this.f89233e = hVar;
        this.f89234f = cheesePlayRepository;
        this.f89235g = c6993l;
        this.h = pageReportService;
        this.f89236i = cheeseCatalogService;
        this.f89237j = cheesePlayRepository2;
        this.f89238k = unitedSeasonDetailRepository;
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.f89239l = MutableStateFlow;
        this.f89240m = FlowKt.asStateFlow(MutableStateFlow);
        this.f89245r = "";
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService.a(com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.bilibili.ship.theseus.cheese.biz.certificate.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService.b(com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$1 r0 = (com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$1 r0 = new com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5d
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L53
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Exception -> L4f
            goto L99
        L4f:
            r6 = move-exception
            goto L88
        L53:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5d:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.CoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L4f
            r9 = r0
            com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$2 r0 = new com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService$checkUnlockCertificateCapability$2     // Catch: java.lang.Exception -> L4f
            r10 = r0
            r0 = r10
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L4f
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Exception -> L4f
            r0 = r9
            r1 = r10
            r2 = r6
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)     // Catch: java.lang.Exception -> L4f
            r6 = r0
            r0 = r6
            r1 = r8
            if (r0 != r1) goto L99
            r0 = r8
            return r0
        L88:
            java.lang.String r0 = "[theseus-cheese-CheeseCertificateService-checkUnlockCertificateCapability] "
            java.lang.String r1 = "onServiceUnavailable, "
            r2 = r6
            java.lang.String r1 = N4.a.a(r1, r2)
            java.lang.String r2 = "CheeseCertificateService-checkUnlockCertificateCapability"
            r3 = 0
            com.bilibili.bangumi.logic.page.detail.service.e.a(r0, r1, r2, r3)
        L99:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.certificate.CheeseCertificateService.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Nullable
    public final Object d(@NotNull Continuation<? super Unit> continuation) {
        if (!this.f89241n || this.f89238k.d()) {
            return Unit.INSTANCE;
        }
        this.f89233e.pause();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheeseCertificateService$tryToIntercept$2(this, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
