package com.bilibili.ship.theseus.ugc.ad;

import H41.B;
import android.animation.Animator;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.window.core.layout.WindowSizeClass;
import bo.C5126e;
import com.bapis.bilibili.app.viewunite.ugcanymodel.AiExtra;
import com.bapis.bilibili.app.viewunite.ugcanymodel.ViewUgcAny;
import com.bapis.bilibili.app.viewunite.v1.CM;
import com.bilibili.adcommon.data.model.FeedExtra;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.gripper.api.ad.biz.videodetail.IAdPanelListener;
import com.bilibili.gripper.api.ad.biz.videodetail.IPanelData;
import com.bilibili.gripper.api.ad.biz.videodetail.IWrapperPanelHelper;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.AdUpperBridge;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.IAdUnderPlayerCallback;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.UpperCollapseKt;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.UpperScrollBehavior;
import com.bilibili.gripper.api.ad.biz.videodetail.underplayer.UpperScrollState;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.ad.AdRepository;
import com.bilibili.ship.theseus.united.page.charge.ChargeRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ControlContainerType;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.ControlContainerObserver;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;
import zv0.C9268a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService.class */
@StabilityInferred(parameters = 0)
public final class DetailAdService implements AdUpperBridge {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final b f96246A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final d f96247B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f96248C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f96249D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final StateFlow<UpperScrollState> f96250E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final StateFlow<Float> f96251F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f96253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AdRepository f96254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f96255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f96256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Lifecycle f96257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f96258g;

    @NotNull
    public final h h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Flow<Configuration> f96259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f96260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageReportService f96261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f96262l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f96263m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f96264n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C7893a f96265o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96266p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f96267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Lazy f96269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public IAdUnderPlayerCallback f96270t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96271u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final StateFlow f96272v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96273w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Animator f96274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Lazy f96275y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final c f96276z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ChargeRepository $chargeRepository;
        final Flow<C9268a.C1396a> $viewsFlow;
        int label;
        final DetailAdService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$1$1.class */
        public static final class C08071 extends SuspendLambda implements Function6<Integer, Integer, PlayerAvailability, C9268a.C1396a, CM, Continuation<? super Triple<? extends Boolean, ? extends C9268a.C1396a, ? extends CM>>, Object> {
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;

            public C08071(Continuation<? super C08071> continuation) {
                super(6, continuation);
            }

            public final Object invoke(int i7, int i8, PlayerAvailability playerAvailability, C9268a.C1396a c1396a, CM cm2, Continuation<? super Triple<Boolean, C9268a.C1396a, CM>> continuation) {
                C08071 c08071 = new C08071(continuation);
                c08071.I$0 = i7;
                c08071.I$1 = i8;
                c08071.L$0 = playerAvailability;
                c08071.L$1 = c1396a;
                c08071.L$2 = cm2;
                return c08071.invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), (PlayerAvailability) obj3, (C9268a.C1396a) obj4, (CM) obj5, (Continuation<? super Triple<Boolean, C9268a.C1396a, CM>>) obj6);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    r0 = r6
                    int r0 = r0.label
                    if (r0 != 0) goto L91
                    r0 = r7
                    kotlin.ResultKt.throwOnFailure(r0)
                    r0 = r6
                    int r0 = r0.I$0
                    r8 = r0
                    r0 = r6
                    int r0 = r0.I$1
                    r9 = r0
                    r0 = r6
                    java.lang.Object r0 = r0.L$0
                    com.bilibili.player.tangram.basic.PlayerAvailability r0 = (com.bilibili.player.tangram.basic.PlayerAvailability) r0
                    r14 = r0
                    r0 = r6
                    java.lang.Object r0 = r0.L$1
                    zv0.a$a r0 = (zv0.C9268a.C1396a) r0
                    r13 = r0
                    r0 = r6
                    java.lang.Object r0 = r0.L$2
                    com.bapis.bilibili.app.viewunite.v1.CM r0 = (com.bapis.bilibili.app.viewunite.v1.CM) r0
                    r12 = r0
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r1 = r0
                    java.lang.String r2 = "chargeBar: "
                    r1.<init>(r2)
                    r7 = r0
                    r0 = r7
                    r1 = r8
                    java.lang.StringBuilder r0 = r0.append(r1)
                    r0 = r7
                    java.lang.String r1 = ", playerAvailability: "
                    java.lang.StringBuilder r0 = r0.append(r1)
                    r0 = r7
                    r1 = r14
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = "[theseus-ugc-DetailAdService$1$1-invokeSuspend] "
                    r1 = r7
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "DetailAdService$1$1-invokeSuspend"
                    defpackage.a.b(r0, r1, r2)
                    r0 = 1
                    r11 = r0
                    r0 = r8
                    r1 = 1
                    if (r0 != r1) goto L71
                    r0 = r11
                    r10 = r0
                    r0 = r14
                    com.bilibili.player.tangram.basic.PlayerAvailability r1 = com.bilibili.player.tangram.basic.PlayerAvailability.FORBIDDEN
                    if (r0 != r1) goto L80
                L71:
                    r0 = r9
                    r1 = 1
                    if (r0 != r1) goto L7d
                    r0 = r11
                    r10 = r0
                    goto L80
                L7d:
                    r0 = 0
                    r10 = r0
                L80:
                    kotlin.Triple r0 = new kotlin.Triple
                    r1 = r0
                    r2 = r10
                    java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                    r3 = r13
                    r4 = r12
                    r1.<init>(r2, r3, r4)
                    return r0
                L91:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.ad.DetailAdService.AnonymousClass1.C08071.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$1$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$1$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Triple<? extends Boolean, ? extends C9268a.C1396a, ? extends CM>, Continuation<? super Unit>, Object> {
            final Ref.ObjectRef<CM> $renderedCm;
            Object L$0;
            int label;
            final DetailAdService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DetailAdService detailAdService, Ref.ObjectRef<CM> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = detailAdService;
                this.$renderedCm = objectRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$renderedCm, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(Triple<Boolean, C9268a.C1396a, CM> triple, Continuation<? super Unit> continuation) {
                return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:71:0x044e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r29) {
                /*
                    Method dump skipped, instruction units count: 1490
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.ad.DetailAdService.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeRepository chargeRepository, DetailAdService detailAdService, Flow<C9268a.C1396a> flow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$chargeRepository = chargeRepository;
            this.this$0 = detailAdService;
            this.$viewsFlow = flow;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$chargeRepository, this.this$0, this.$viewsFlow, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.ObjectRef objectRefB = G0.g.b(obj);
                ChargeRepository chargeRepository = this.$chargeRepository;
                StateFlow<Integer> stateFlow = chargeRepository.f99161o;
                StateFlow<Integer> stateFlow2 = chargeRepository.f99163q;
                DetailAdService detailAdService = this.this$0;
                Flow flowCombine = FlowKt.combine(stateFlow, stateFlow2, detailAdService.h.f91107a.f79286c, this.$viewsFlow, detailAdService.f96254c.f98936l, new C08071(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, objectRefB, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f96277a;

        static {
            int[] iArr = new int[UpperScrollBehavior.values().length];
            try {
                iArr[UpperScrollBehavior.Expand.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[UpperScrollBehavior.Collapse.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[UpperScrollBehavior.Hide.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f96277a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$b.class */
    public static final class b implements ControlContainerObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailAdService f96278a;

        public b(DetailAdService detailAdService) {
            this.f96278a = detailAdService;
        }

        public final void onControlContainerChanged(ControlContainerType controlContainerType, ScreenModeType screenModeType) {
            DetailAdService detailAdService = this.f96278a;
            IAdUnderPlayerCallback iAdUnderPlayerCallback = detailAdService.f96270t;
            if (iAdUnderPlayerCallback != null) {
                iAdUnderPlayerCallback.onScreenChanged(screenModeType);
            }
            ControlContainerObserver controlContainerObserver = detailAdService.f96254c.f98927b.f98917q;
            if (controlContainerObserver != null) {
                controlContainerObserver.onControlContainerChanged(controlContainerType, screenModeType);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$c.class */
    public static final class c implements PlayerStateObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DetailAdService f96279a;

        public c(DetailAdService detailAdService) {
            this.f96279a = detailAdService;
        }

        public final void onPlayerStateChanged(int i7) {
            DetailAdService detailAdService = this.f96279a;
            IAdUnderPlayerCallback iAdUnderPlayerCallback = detailAdService.f96270t;
            if (iAdUnderPlayerCallback != null) {
                iAdUnderPlayerCallback.onPlayerStateChanged(i7);
            }
            PlayerStateObserver playerStateObserver = detailAdService.f96254c.f98927b.f98916p;
            if (playerStateObserver != null) {
                playerStateObserver.onPlayerStateChanged(i7);
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$getCurrentLocationY$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$getCurrentLocationY$1.class */
    final /* synthetic */ class C62631 extends FunctionReferenceImpl implements Function0<Integer> {
        public C62631(Object obj) {
            super(0, obj, DetailAdService.class, "underViewCurrentLocationY", "underViewCurrentLocationY()I", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
        public final Integer m9263invoke() {
            int[] iArr = new int[2];
            ((DetailAdService) ((CallableReference) this).receiver).a().getLocationOnScreen(iArr);
            return Integer.valueOf(iArr[1]);
        }
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [com.bilibili.ship.theseus.ugc.ad.d] */
    @Inject
    public DetailAdService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull Flow<C9268a.C1396a> flow, @NotNull AdRepository adRepository, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IControlContainerService iControlContainerService, @NotNull Lifecycle lifecycle, @NotNull Flow<Boolean> flow2, @NotNull ChargeRepository chargeRepository, @NotNull h hVar, @NotNull Flow<Configuration> flow3, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull PageReportService pageReportService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull List<Av0.a> list, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @Nullable ViewUgcAny viewUgcAny) {
        AiExtra aiExtra;
        this.f96252a = coroutineScope;
        this.f96253b = componentActivity;
        this.f96254c = adRepository;
        this.f96255d = iPlayerCoreService;
        this.f96256e = iControlContainerService;
        this.f96257f = lifecycle;
        this.f96258g = flow2;
        this.h = hVar;
        this.f96259i = flow3;
        this.f96260j = cVar;
        this.f96261k = pageReportService;
        this.f96262l = theseusFloatLayerService;
        this.f96263m = list;
        this.f96264n = uGCPlaybackRepository;
        this.f96265o = c7893a;
        this.f96266p = aVar;
        this.f96267q = theseusPageUIStyleRepository;
        this.f96268r = aVar2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f96269s = LazyKt.lazy(lazyThreadSafetyMode, new C5126e(this, 4));
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f96271u = MutableStateFlow;
        this.f96272v = FlowKt.asStateFlow(MutableStateFlow);
        this.f96273w = StateFlowKt.MutableStateFlow(bool);
        this.f96275y = LazyKt.lazy(lazyThreadSafetyMode, new B(5));
        this.f96276z = new c(this);
        this.f96246A = new b(this);
        this.f96247B = new View.OnLayoutChangeListener(this) { // from class: com.bilibili.ship.theseus.ugc.ad.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailAdService f96292a;

            {
                this.f96292a = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                IWrapperPanelHelper.OnPlayerSizeChangeListener onPlayerSizeChangeListener;
                DetailAdService detailAdService = this.f96292a;
                if (!detailAdService.f96260j.h().f102987a || (onPlayerSizeChangeListener = detailAdService.f96254c.f98927b.f98913m) == null) {
                    return;
                }
                onPlayerSizeChangeListener.onChanged();
            }
        };
        adRepository.f98934j = (viewUgcAny == null || (aiExtra = viewUgcAny.getAiExtra()) == null) ? null : aiExtra.getTrackId();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(chargeRepository, this, flow, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$listenViewDestroyByScope$1(this, flow, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$listenViewDestroyByScope$2(flow, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$listenViewDestroyByScope$3(this, null), 3, (Object) null);
        final StateFlow<Float> stateFlowB = theseusPageUIStyleRepository.b();
        this.f96250E = FlowKt.stateIn(FlowKt.onEach(new Flow<UpperScrollState>(stateFlowB, this) { // from class: com.bilibili.ship.theseus.ugc.ad.DetailAdService$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f96284a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final DetailAdService f96285b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f96286a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DetailAdService f96287b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.ad.DetailAdService$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/ad/DetailAdService$special$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, DetailAdService detailAdService) {
                    this.f96286a = flowCollector;
                    this.f96287b = detailAdService;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) throws kotlin.NoWhenBranchMatchedException {
                    /*
                        Method dump skipped, instruction units count: 279
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.ad.DetailAdService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f96284a = stateFlowB;
                this.f96285b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f96284a.collect(new AnonymousClass2(flowCollector, this.f96285b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new DetailAdService$upperScrollStateFlow$2(null)), coroutineScope, SharingStarted.Companion.getEagerly(), UpperScrollState.EXPANDED);
        this.f96251F = theseusPageUIStyleRepository.b();
    }

    public static void b(Map map, Map map2) {
        String str;
        if (map2 == null || (str = (String) map2.get("position")) == null) {
            return;
        }
    }

    public final df.a a() {
        return (df.a) this.f96269s.getValue();
    }

    public final void c() {
        Animator animator = this.f96274x;
        if (animator != null) {
            animator.cancel();
        }
        this.f96274x = null;
        this.f96255d.unregisterState(this.f96276z);
        this.f96256e.unregisterState(this.f96246A);
        IAdUnderPlayerCallback iAdUnderPlayerCallback = this.f96270t;
        if (iAdUnderPlayerCallback != null) {
            iAdUnderPlayerCallback.onDestroy();
        }
        this.f96270t = null;
        BLog.d("BannerFlipperLogger", "resetAdBindStatus ==> unregisterState");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void d() throws NoWhenBranchMatchedException {
        IAdUnderPlayerCallback iAdUnderPlayerCallback = this.f96270t;
        if (iAdUnderPlayerCallback == null || !iAdUnderPlayerCallback.isBlankView()) {
            df.a aVarA = a();
            ViewGroup.LayoutParams layoutParams = aVarA.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            IAdUnderPlayerCallback iAdUnderPlayerCallback2 = this.f96270t;
            layoutParams.height = iAdUnderPlayerCallback2 != null ? iAdUnderPlayerCallback2.getViewHeight() : NewPlayerUtilsKt.toPx(70);
            aVarA.setLayoutParams(layoutParams);
        }
        int viewHeight = 0;
        a().setVisibility(0);
        a().setChildViewsCanTouch(true);
        IAdUnderPlayerCallback iAdUnderPlayerCallback3 = this.f96270t;
        if (iAdUnderPlayerCallback3 != null) {
            iAdUnderPlayerCallback3.onExposed(this.f96256e.getScreenModeType());
        }
        IAdUnderPlayerCallback iAdUnderPlayerCallback4 = this.f96270t;
        if (iAdUnderPlayerCallback4 != null && com.bilibili.playerbizcommonv2.utils.f.f81929r) {
            int i7 = a.f96277a[iAdUnderPlayerCallback4.getScrollBehavior().ordinal()];
            if (i7 == 1) {
                viewHeight = iAdUnderPlayerCallback4.getViewHeight();
            } else if (i7 == 2) {
                viewHeight = UpperCollapseKt.getCOLLAPSE_AD_HEIGHT();
            } else if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            final int i8 = viewHeight;
            a().post(new Runnable(i8, this) { // from class: com.bilibili.ship.theseus.ugc.ad.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f96288a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final DetailAdService f96289b;

                {
                    this.f96288a = i8;
                    this.f96289b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i9 = this.f96288a;
                    DetailAdService detailAdService = this.f96289b;
                    defpackage.a.a(i9, "views.container.post setMinVisibleHeight :", "DetailAdService");
                    detailAdService.f96267q.f103501k.setValue(Integer.valueOf(i9));
                }
            });
            if (iAdUnderPlayerCallback4.getScrollBehavior() == UpperScrollBehavior.Collapse) {
                BuildersKt.launch$default(this.f96252a, (CoroutineContext) null, (CoroutineStart) null, new DetailAdService$configScrollBehavior$2(this, iAdUnderPlayerCallback4, null), 3, (Object) null);
            }
        }
    }

    public final void dismissPanel() {
        this.f96254c.b().dismissPanel();
    }

    public final long getAdUnderPlayerCurrentPosition() {
        j jVarJ = this.h.j();
        return jVarJ != null ? jVarJ.L() : 0L;
    }

    public final long getAdUnderPlayerDuration() {
        return this.f96266p.g() * ((long) 1000);
    }

    @NotNull
    public final StateFlow<Float> getCollapseRatioFlow() {
        return this.f96251F;
    }

    public final Function0 getCurrentLocationY() {
        return new C62631(this);
    }

    @NotNull
    public final ScreenModeType getCurrentScreenModeType() {
        return this.f96256e.getScreenModeType();
    }

    @NotNull
    public final CoroutineScope getScope() {
        return this.f96252a;
    }

    @NotNull
    public final StateFlow<UpperScrollState> getUpperScrollStateFlow() {
        return this.f96250E;
    }

    @Nullable
    public final WindowSizeClass getWindowSize() {
        return this.f96268r.b();
    }

    @NotNull
    public final Flow<WindowSizeClass> getWindowSizeFlow() {
        return this.f96268r.f102939c;
    }

    public final void hideAdContainer() {
        a().setVisibility(8);
    }

    public final boolean isPanelShowing() {
        return this.f96254c.b().isPanelShowing();
    }

    public final void onAdViewRemove() {
        BLog.i("DetailAdService-onAdViewRemove", "[theseus-ugc-DetailAdService-onAdViewRemove] onAdViewRemove");
        this.f96249D = true;
        HandlerThreads.post(0, new Runnable(this) { // from class: com.bilibili.ship.theseus.ugc.ad.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DetailAdService f96291a;

            {
                this.f96291a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DetailAdService detailAdService = this.f96291a;
                detailAdService.f96271u.setValue(Boolean.TRUE);
                df.a aVarA = detailAdService.a();
                aVarA.setBackground(null);
                aVarA.removeAllViewsInLayout();
                ViewGroup.LayoutParams layoutParams = aVarA.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = -2;
                aVarA.setLayoutParams(layoutParams);
            }
        });
        this.f96267q.h.b("DetailAdService");
    }

    public final void onButtonClick(@Nullable SourceContent sourceContent, long j7, long j8, @Nullable Map<String, String> map) {
        SourceContent.AdContent adContent;
        FeedExtra extra;
        super.onButtonClick(sourceContent, j7, j8, map);
        long salesType = (sourceContent == null || (adContent = sourceContent.getAdContent()) == null || (extra = adContent.getExtra()) == null) ? 0L : extra.getSalesType();
        Long lValueOf = Long.valueOf(salesType);
        if (salesType == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            j8 = lValueOf.longValue();
        }
        long creativeId = sourceContent != null ? sourceContent.getCreativeId() : 0L;
        Long lValueOf2 = null;
        if (creativeId != 0) {
            lValueOf2 = Long.valueOf(creativeId);
        }
        if (lValueOf2 != null) {
            j7 = lValueOf2.longValue();
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str = this.f96254c.f98934j;
        if (str != null) {
        }
        if (j8 != 0) {
            mapCreateMapBuilder.put("sale_type", String.valueOf(j8));
        }
        if (j7 != 0) {
            mapCreateMapBuilder.put("creative_id", String.valueOf(j7));
        }
        mapCreateMapBuilder.put("click_position", "1");
        if (map != null) {
            b(mapCreateMapBuilder, map);
        }
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f96261k, "united.player-video-detail.under-frame.card.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void onCardClick(@Nullable SourceContent sourceContent, long j7, long j8, @Nullable Map<String, String> map) {
        SourceContent.AdContent adContent;
        FeedExtra extra;
        super.onCardClick(sourceContent, j7, j8, map);
        long salesType = (sourceContent == null || (adContent = sourceContent.getAdContent()) == null || (extra = adContent.getExtra()) == null) ? 0L : extra.getSalesType();
        Long lValueOf = Long.valueOf(salesType);
        if (salesType == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            j8 = lValueOf.longValue();
        }
        long creativeId = sourceContent != null ? sourceContent.getCreativeId() : 0L;
        Long lValueOf2 = null;
        if (creativeId != 0) {
            lValueOf2 = Long.valueOf(creativeId);
        }
        if (lValueOf2 != null) {
            j7 = lValueOf2.longValue();
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str = this.f96254c.f98934j;
        if (str != null) {
        }
        if (j8 != 0) {
            mapCreateMapBuilder.put("sale_type", String.valueOf(j8));
        }
        if (j7 != 0) {
            mapCreateMapBuilder.put("creative_id", String.valueOf(j7));
        }
        mapCreateMapBuilder.put("click_position", "0");
        if (map != null) {
            b(mapCreateMapBuilder, map);
        }
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f96261k, "united.player-video-detail.under-frame.card.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void onCardShow(@Nullable SourceContent sourceContent, long j7, long j8, @Nullable Map<String, String> map) {
        SourceContent.AdContent adContent;
        FeedExtra extra;
        super.onCardShow(sourceContent, j7, j8, map);
        long salesType = (sourceContent == null || (adContent = sourceContent.getAdContent()) == null || (extra = adContent.getExtra()) == null) ? 0L : extra.getSalesType();
        Long lValueOf = Long.valueOf(salesType);
        if (salesType == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            j8 = lValueOf.longValue();
        }
        long creativeId = sourceContent != null ? sourceContent.getCreativeId() : 0L;
        Long lValueOf2 = null;
        if (creativeId != 0) {
            lValueOf2 = Long.valueOf(creativeId);
        }
        if (lValueOf2 != null) {
            j7 = lValueOf2.longValue();
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str = this.f96254c.f98934j;
        if (str != null) {
        }
        if (j8 != 0) {
            mapCreateMapBuilder.put("sale_type", String.valueOf(j8));
        }
        if (j7 != 0) {
            mapCreateMapBuilder.put("creative_id", String.valueOf(j7));
        }
        if (map != null) {
            b(mapCreateMapBuilder, map);
        }
        Unit unit = Unit.INSTANCE;
        PageReportService.i(this.f96261k, "united.player-video-detail.under-frame.card.show", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void onThreePointClick(@Nullable SourceContent sourceContent, long j7, long j8, @Nullable Map<String, String> map) {
        SourceContent.AdContent adContent;
        FeedExtra extra;
        super.onThreePointClick(sourceContent, j7, j8, map);
        long salesType = (sourceContent == null || (adContent = sourceContent.getAdContent()) == null || (extra = adContent.getExtra()) == null) ? 0L : extra.getSalesType();
        Long lValueOf = Long.valueOf(salesType);
        if (salesType == 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            j8 = lValueOf.longValue();
        }
        long creativeId = sourceContent != null ? sourceContent.getCreativeId() : 0L;
        Long lValueOf2 = null;
        if (creativeId != 0) {
            lValueOf2 = Long.valueOf(creativeId);
        }
        if (lValueOf2 != null) {
            j7 = lValueOf2.longValue();
        }
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        String str = this.f96254c.f98934j;
        if (str != null) {
        }
        if (j8 != 0) {
            mapCreateMapBuilder.put("sale_type", String.valueOf(j8));
        }
        if (j7 != 0) {
            mapCreateMapBuilder.put("creative_id", String.valueOf(j7));
        }
        if (map != null) {
            b(mapCreateMapBuilder, map);
        }
        Unit unit = Unit.INSTANCE;
        PageReportService.g(this.f96261k, "united.player-video-detail.under-frame.card-three.click", MapsKt.build(mapCreateMapBuilder), 4);
    }

    public final void showAdContainer() {
        a().setVisibility(0);
    }

    public final <T extends IPanelData> void showPanel(int i7, @Nullable T t7, @Nullable IAdPanelListener iAdPanelListener) {
        if (isPanelShowing()) {
            return;
        }
        this.f96254c.b().showPanel(i7, t7, iAdPanelListener);
    }
}
