package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.player.tangram.basic.c;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.player.oldway.playercontainer.BadNetworkTipService;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPlayerQualityService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f103776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f103777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IToastService f103778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final IReporterService f103779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusQualityResources f103780g;

    @NotNull
    public final TheseusPlayerVipQualityTrialService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final InterfaceC6436j f103781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f103782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f103783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f103784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f103785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f103786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final BadNetworkTipService f103787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PageReportService f103788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f103789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f103790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i f103791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.restrictionlayer.G f103792t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final C6435i f103793u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public com.bilibili.player.tangram.basic.c f103794v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f103795w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f103796x;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityService;
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
                TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(theseusPlayerQualityService.f103789q.H(), new TheseusPlayerQualityService$reportDolbyQuality$2(theseusPlayerQualityService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$5$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$5$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPlayerQualityService f103797a;

            public a(TheseusPlayerQualityService theseusPlayerQualityService) {
                this.f103797a = theseusPlayerQualityService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                com.bilibili.player.tangram.playercore.A a7 = (com.bilibili.player.tangram.playercore.A) obj;
                if (a7 instanceof A.g) {
                    TheseusPlayerQualityService theseusPlayerQualityService = this.f103797a;
                    if (theseusPlayerQualityService.f103796x) {
                        unit = Unit.INSTANCE;
                    } else {
                        TheseusPlayerQualityService.c(theseusPlayerQualityService, ((A.g) a7).f79332a);
                        unit = Unit.INSTANCE;
                    }
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityService;
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
                Flow<com.bilibili.player.tangram.playercore.A> flowV = this.this$0.f103789q.v();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowV.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$6$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPlayerQualityService f103798a;

            public a(TheseusPlayerQualityService theseusPlayerQualityService) {
                this.f103798a = theseusPlayerQualityService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f103798a.e(c.a.f79321a);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityService;
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
                TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
                MutableSharedFlow<Unit> mutableSharedFlow = theseusPlayerQualityService.f103787o.f104740k;
                a aVar = new a(theseusPlayerQualityService);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<com.bilibili.player.tangram.basic.a, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.this$0, continuation);
            anonymousClass7.L$0 = (com.bilibili.player.tangram.basic.a) obj;
            return anonymousClass7;
        }

        /* JADX INFO: renamed from: invoke-Ivnldq8, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Object invoke(com.bilibili.player.tangram.basic.a aVar, Continuation<? super Unit> continuation) {
            return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.player.tangram.basic.a aVar = (com.bilibili.player.tangram.basic.a) this.L$0;
            if (!this.this$0.h.d() && aVar != null) {
                this.this$0.f103795w = aVar.f79320a;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityService;
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
                TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
                this.label = 1;
                if (TheseusPlayerQualityService.b(theseusPlayerQualityService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = theseusPlayerQualityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (com.bilibili.ship.theseus.keel.player.p.o() && this.this$0.f103793u.a()) {
                    Flow<com.bilibili.player.tangram.playercore.u> flowB = this.this$0.f103789q.b();
                    this.label = 1;
                    Object objA = com.bilibili.ogv.infra.coroutine.b.a(flowB, this);
                    obj = objA;
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.player.tangram.playercore.u uVar = (com.bilibili.player.tangram.playercore.u) obj;
            com.bilibili.playerbizcommon.utils.e eVar = com.bilibili.playerbizcommon.utils.e.f80284a;
            List list = (List) com.bilibili.playerbizcommon.utils.e.f80286c.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                BLog.i("TheseusPlayerQualityService$9-invokeSuspend", "[theseus-united-TheseusPlayerQualityService$9-invokeSuspend] Current episode does not support HDR/Dolby, forget page memory.");
                this.this$0.f103793u.f103879a = null;
                BLog.i("PageDolbyHdrMemoryRepository-forget", "[theseus-united-PageDolbyHdrMemoryRepository-forget] forget quality for this page");
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (com.bilibili.player.tangram.playercore.y.b(((com.bilibili.player.tangram.basic.a) it.next()).f79320a, uVar.f79460c)) {
                        break;
                    }
                }
                BLog.i("TheseusPlayerQualityService$9-invokeSuspend", "[theseus-united-TheseusPlayerQualityService$9-invokeSuspend] Current episode does not support HDR/Dolby, forget page memory.");
                this.this$0.f103793u.f103879a = null;
                BLog.i("PageDolbyHdrMemoryRepository-forget", "[theseus-united-PageDolbyHdrMemoryRepository-forget] forget quality for this page");
            }
            return Unit.INSTANCE;
        }
    }

    @Inject
    public TheseusPlayerQualityService(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IToastService iToastService, @NotNull IReporterService iReporterService, @NotNull TheseusQualityResources theseusQualityResources, @NotNull TheseusPlayerVipQualityTrialService theseusPlayerVipQualityTrialService, @NotNull InterfaceC6436j interfaceC6436j, @NotNull BiliAccounts biliAccounts, @NotNull BiliAccountInfo biliAccountInfo, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull BadNetworkTipService badNetworkTipService, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar, @NotNull com.bilibili.ship.theseus.united.page.restrictionlayer.G g7, @NotNull C6435i c6435i) {
        this.f103774a = hVar;
        this.f103775b = coroutineScope;
        this.f103776c = iPlayerCoreService;
        this.f103777d = iPlayerSettingService;
        this.f103778e = iToastService;
        this.f103779f = iReporterService;
        this.f103780g = theseusQualityResources;
        this.h = theseusPlayerVipQualityTrialService;
        this.f103781i = interfaceC6436j;
        this.f103782j = biliAccounts;
        this.f103783k = biliAccountInfo;
        this.f103784l = cVar;
        this.f103785m = theseusFloatLayerService;
        this.f103786n = backActionRepository;
        this.f103787o = badNetworkTipService;
        this.f103788p = pageReportService;
        this.f103789q = jVar;
        this.f103790r = episodeExtraInfoRepository;
        this.f103791s = iVar;
        this.f103792t = g7;
        this.f103793u = c6435i;
        com.bilibili.player.tangram.basic.c cVarA = com.bilibili.ship.theseus.united.player.mediaplay.j.a();
        defpackage.a.b("[theseus-united-TheseusPlayerQualityService-<init>] ", "Last non-trial preference initialized: " + cVarA, "TheseusPlayerQualityService-<init>");
        this.f103794v = cVarA;
        this.f103795w = Integer.MAX_VALUE;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        theseusPlayerVipQualityTrialService.f103826m = new X(this);
        theseusPlayerVipQualityTrialService.f103827n = new Y(this, 0);
        theseusPlayerVipQualityTrialService.f103828o = new Mn.z(this, 1);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        FlowKt.launchIn(FlowKt.onEach(jVar.B(), new AnonymousClass7(this, null)), coroutineScope);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r5, com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService.a(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService, com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService.b(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.BitSet c(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r9, int r10) {
        /*
            Method dump skipped, instruction units count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService.c(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService, int):java.util.BitSet");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.united.page.videoquality.C6427a0 d(final int r9, Ex0.g r10) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService.d(int, Ex0.g):com.bilibili.ship.theseus.united.page.videoquality.a0");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.c r13) {
        /*
            Method dump skipped, instruction units count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService.e(com.bilibili.player.tangram.basic.c):void");
    }
}
