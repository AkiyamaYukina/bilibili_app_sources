package com.bilibili.ship.theseus.ugc.endpage.relatedrecommand;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.viewunite.common.RelateCard;
import com.bapis.bilibili.app.viewunite.common.RelateCardType;
import com.bapis.bilibili.app.viewunite.v1.ViewEndPageCard;
import com.bilibili.app.gemini.ugc.feature.n;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.accounts.x;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.ogv.infra.util.g;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.cm.UGCEndPageCMRepository;
import com.bilibili.ship.theseus.united.page.intro.module.relate.C6320j;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.widget.AbsGroupWidget;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService.class */
@StabilityInferred(parameters = 0)
public final class UGCEndPageRelatedRecommendService {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f96802x = DeviceDecision.INSTANCE.getBoolean("dd_endpage_text_default_with_video", true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f96804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f96805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UGCEndPageCMRepository f96806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f96807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final f f96808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f96809g;

    @Nullable
    public final n h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.episode.b f96810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f96811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final j f96812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final yW0.b f96813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f96814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f96815n = LazyKt.lazy(new x(this, 3));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final List<RunningUIComponent> f96816o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Map<String, a> f96817p = new LinkedHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Map<String, Boolean> f96818q = new LinkedHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final Map<RelateCard, o> f96819r = new LinkedHashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public String f96820s = "";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f96821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Long> f96822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<ViewEndPageCard>> f96823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final StateFlow<List<RelateCard>> f96824w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Job f96825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a f96826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final Map<String, RunningUIComponent> f96827c;

        public a() {
            this(null);
        }

        public a(Object obj) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f96825a = null;
            this.f96826b = null;
            this.f96827c = linkedHashMap;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f96825a, aVar.f96825a) && Intrinsics.areEqual(this.f96826b, aVar.f96826b) && Intrinsics.areEqual(this.f96827c, aVar.f96827c);
        }

        public final int hashCode() {
            Job job = this.f96825a;
            int iHashCode = 0;
            int iHashCode2 = job == null ? 0 : job.hashCode();
            com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a aVar = this.f96826b;
            if (aVar != null) {
                iHashCode = aVar.hashCode();
            }
            return this.f96827c.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
        }

        @NotNull
        public final String toString() {
            Job job = this.f96825a;
            com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a aVar = this.f96826b;
            Map<String, RunningUIComponent> map = this.f96827c;
            StringBuilder sb = new StringBuilder("ContainerState(containerBindingJob=");
            sb.append(job);
            sb.append(", currentContainer=");
            sb.append(aVar);
            sb.append(", cardComponentMapping=");
            return C8711a.a(sb, map, ")");
        }
    }

    @Inject
    public UGCEndPageRelatedRecommendService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull DetailRelateRepository detailRelateRepository, @NotNull UGCEndPageCMRepository uGCEndPageCMRepository, @NotNull C7893a c7893a, @NotNull f fVar, @NotNull C8043a c8043a, @Nullable n nVar, @NotNull com.bilibili.ship.theseus.ugc.episode.b bVar, @NotNull IControlContainerService iControlContainerService, @NotNull j jVar, @NotNull yW0.b bVar2, @NotNull String str) {
        this.f96803a = coroutineScope;
        this.f96804b = iPlayerCoreService;
        this.f96805c = detailRelateRepository;
        this.f96806d = uGCEndPageCMRepository;
        this.f96807e = c7893a;
        this.f96808f = fVar;
        this.f96809g = c8043a;
        this.h = nVar;
        this.f96810i = bVar;
        this.f96811j = iControlContainerService;
        this.f96812k = jVar;
        this.f96813l = bVar2;
        this.f96814m = str;
        final MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.f96822u = MutableStateFlow;
        Flow flowTransformLatest = FlowKt.transformLatest(new Flow<Long>(MutableStateFlow) { // from class: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MutableStateFlow f96836a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f96837a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                    this.f96837a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r9 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r10 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r9
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L87
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r9
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        java.lang.Number r0 = (java.lang.Number) r0
                        long r0 = r0.longValue()
                        r1 = 0
                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                        if (r0 <= 0) goto L87
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f96837a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L87
                        r0 = r10
                        return r0
                    L87:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f96836a = MutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f96836a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UGCEndPageRelatedRecommendService$special$$inlined$flatMapLatest$1(null, this));
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<List<ViewEndPageCard>> stateFlowStateIn = FlowKt.stateIn(flowTransformLatest, coroutineScope, companion.getEagerly(), CollectionsKt.emptyList());
        this.f96823v = stateFlowStateIn;
        final UGCEndPageRelatedRecommendService$special$$inlined$map$1 uGCEndPageRelatedRecommendService$special$$inlined$map$1 = new UGCEndPageRelatedRecommendService$special$$inlined$map$1(stateFlowStateIn, this);
        this.f96824w = FlowKt.stateIn(new Flow<List<? extends RelateCard>>(uGCEndPageRelatedRecommendService$special$$inlined$map$1) { // from class: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UGCEndPageRelatedRecommendService$special$$inlined$map$1 f96838a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f96839a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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
                    this.f96839a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2$1 r0 = (com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2$1 r0 = new com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r9 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r10 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r9
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L8a
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r9
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        java.util.List r0 = (java.util.List) r0
                        java.util.Collection r0 = (java.util.Collection) r0
                        boolean r0 = r0.isEmpty()
                        if (r0 != 0) goto L8a
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f96839a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto L8a
                        r0 = r10
                        return r0
                    L8a:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f96838a = uGCEndPageRelatedRecommendService$special$$inlined$map$1;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f96838a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, companion.getLazily(), CollectionsKt.emptyList());
        this.f96821t = false;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new UGCEndPageRelatedRecommendService$waitForMediaReady$1(this, null), 3, (Object) null);
    }

    public static String e(RelateCard relateCard) {
        long id = relateCard.getBasicInfo().getId();
        String strName = relateCard.getRelateCardType().name();
        int iHashCode = relateCard.hashCode();
        StringBuilder sbA = com.bilibili.app.history.ui.viewmodel.e.a(id, "_", strName, "_");
        sbA.append(iHashCode);
        return sbA.toString();
    }

    public static boolean f(UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, int i7) {
        RelateCard relateCard;
        o oVarD;
        int iB = uGCEndPageRelatedRecommendService.b(i7);
        boolean z6 = false;
        if (iB != -1 && (relateCard = (RelateCard) CollectionsKt.getOrNull((List) uGCEndPageRelatedRecommendService.f96824w.getValue(), iB)) != null && (oVarD = uGCEndPageRelatedRecommendService.d(relateCard)) != null) {
            z6 = oVarD.p;
        }
        return z6;
    }

    public static void g(UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, int i7) {
        o oVarD;
        int i8;
        RelateCard relateCard;
        int iB = uGCEndPageRelatedRecommendService.b(i7);
        if (iB == -1) {
            return;
        }
        StateFlow<List<RelateCard>> stateFlow = uGCEndPageRelatedRecommendService.f96824w;
        RelateCard relateCard2 = (RelateCard) CollectionsKt.getOrNull((List) stateFlow.getValue(), iB);
        if (relateCard2 == null || (oVarD = uGCEndPageRelatedRecommendService.d(relateCard2)) == null) {
            return;
        }
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i8 = i10;
            if (i9 >= iB || (relateCard = (RelateCard) CollectionsKt.getOrNull((List) stateFlow.getValue(), i9)) == null) {
                break;
            }
            int i11 = i8;
            if (relateCard.getRelateCardType() == RelateCardType.AV) {
                Boolean bool = (Boolean) ((LinkedHashMap) uGCEndPageRelatedRecommendService.f96818q).get(e(relateCard));
                i11 = i8;
                if (bool != null ? bool.booleanValue() : false) {
                    i11 = i8 + 1;
                }
            }
            i9++;
            i10 = i11;
        }
        b.b(i8, oVarD, false, uGCEndPageRelatedRecommendService.f96807e, uGCEndPageRelatedRecommendService.f96809g);
    }

    public final void a(@NotNull final com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a aVar, @NotNull final String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f96817p;
        Object obj = linkedHashMap.get(str);
        Object aVar2 = obj;
        if (obj == null) {
            aVar2 = new a(null);
            linkedHashMap.put(str, aVar2);
        }
        a aVar3 = (a) aVar2;
        Job job = aVar3.f96825a;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        aVar3.f96826b = aVar;
        this.f96820s = str;
        final StateFlow<List<RelateCard>> stateFlow = this.f96824w;
        aVar3.f96825a = FlowKt.launchIn(FlowKt.onEach(new Flow<List<? extends RunningUIComponent>>(stateFlow, this, aVar, str) { // from class: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$bindContainer$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f96828a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UGCEndPageRelatedRecommendService f96829b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AbsGroupWidget f96830c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final String f96831d;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$bindContainer$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$bindContainer$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f96832a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UGCEndPageRelatedRecommendService f96833b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final AbsGroupWidget f96834c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final String f96835d;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$bindContainer$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/relatedrecommand/UGCEndPageRelatedRecommendService$bindContainer$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, UGCEndPageRelatedRecommendService uGCEndPageRelatedRecommendService, com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a aVar, String str) {
                    this.f96832a = flowCollector;
                    this.f96833b = uGCEndPageRelatedRecommendService;
                    this.f96834c = (AbsGroupWidget) aVar;
                    this.f96835d = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 471
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.endpage.relatedrecommand.UGCEndPageRelatedRecommendService$bindContainer$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f96828a = stateFlow;
                this.f96829b = this;
                this.f96830c = (AbsGroupWidget) aVar;
                this.f96831d = str;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f96828a.collect(new AnonymousClass2(flowCollector, this.f96829b, this.f96830c, this.f96831d), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new UGCEndPageRelatedRecommendService$bindContainer$2(aVar, null)), this.f96803a);
    }

    public final int b(int i7) {
        Iterator it = ((Iterable) this.f96824w.getValue()).iterator();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = i9;
            if (!it.hasNext()) {
                return -1;
            }
            Object next = it.next();
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Boolean bool = (Boolean) ((LinkedHashMap) this.f96818q).get(e((RelateCard) next));
            int i11 = i10;
            if (bool != null ? bool.booleanValue() : false) {
                if (i10 == i7) {
                    return i8;
                }
                i11 = i10 + 1;
            }
            i8++;
            i9 = i11;
        }
    }

    public final List<RunningUIComponent> c(String str) {
        Object next;
        Boolean bool;
        a aVar = (a) ((LinkedHashMap) this.f96817p).get(str);
        if (aVar == null) {
            return CollectionsKt.emptyList();
        }
        List<RunningUIComponent> list = this.f96816o;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            RunningUIComponent runningUIComponent = (RunningUIComponent) obj;
            Iterator<T> it = aVar.f96827c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Map.Entry) next).getValue(), runningUIComponent)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            String str2 = entry != null ? (String) entry.getKey() : null;
            if ((str2 == null || (bool = (Boolean) ((LinkedHashMap) this.f96818q).get(str2)) == null) ? true : bool.booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final o d(RelateCard relateCard) {
        o oVar = (o) ((LinkedHashMap) this.f96819r).get(relateCard);
        if (oVar != null) {
            return oVar;
        }
        o oVarA = C6320j.a(C6320j.c(relateCard, Long.MIN_VALUE, ""));
        if (oVarA == null) {
            return null;
        }
        this.f96819r.put(relateCard, oVarA);
        return oVarA;
    }

    public final void h(@NotNull String str) {
        a aVar = (a) ((LinkedHashMap) this.f96817p).get(str);
        if (aVar != null) {
            Job job = aVar.f96825a;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            aVar.f96825a = null;
            aVar.f96826b = null;
        }
        if (Intrinsics.areEqual(this.f96820s, str)) {
            this.f96820s = "";
        }
    }

    public final void i() {
        if (this.f96820s.length() == 0) {
            return;
        }
        a aVar = (a) ((LinkedHashMap) this.f96817p).get(this.f96820s);
        if (aVar == null) {
            return;
        }
        List<RunningUIComponent> listC = c(this.f96820s);
        BLog.i("EndPageRelatedRecommend", "current container update, activeTag: " + this.f96820s + ", container:" + aVar.f96826b);
        com.bilibili.app.gemini.ugc.feature.endpage.relatedreccommend.a aVar2 = aVar.f96826b;
        if (aVar2 != null) {
            aVar2.b(g.a(listC, new Fa.f(2)));
        }
    }
}
