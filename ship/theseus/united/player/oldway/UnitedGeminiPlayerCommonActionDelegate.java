package com.bilibili.ship.theseus.united.player.oldway;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.material.T1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comment3.ui.widget.compose.C;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.app.gemini.player.widget.like.z;
import com.bilibili.ogv.infra.coroutine.StateFlowTransformKt;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.playerbizcommonv2.guideBubble.BiliGuideBubble;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.deepblue.DeepBlueTripleGuidePosition;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.C6287a;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.C6289c;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionType;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.p;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import ev0.InterfaceC7008a;
import iv0.C7620a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.model.viewprogress.uniteviewprogress.PageType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate.class */
@StabilityInferred(parameters = 0)
public final class UnitedGeminiPlayerCommonActionDelegate implements yk.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f104706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RelationRepository f104707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final KingPositionRepository f104708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f104709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final t f104710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final BusinessType f104711g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f104712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.online.a f104713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f104714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f104715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C8043a f104716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Flow<l> f104718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C7620a f104719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lazy f104720q = LazyKt.lazy(new com.bilibili.mediastreaming.audio.croutine.c(this, 2));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<yk.e> f104721r = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<wk.a> f104722s;

    @Inject
    public UnitedGeminiPlayerCommonActionDelegate(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull RelationRepository relationRepository, @NotNull KingPositionRepository kingPositionRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull t tVar, @NotNull BusinessType businessType, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull ZoomContainerService zoomContainerService, @NotNull com.bilibili.ship.theseus.united.page.online.a aVar2, @NotNull rW0.a<InterfaceC7008a> aVar3, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar4, @NotNull Flow<l> flow, @NotNull C7620a c7620a) {
        this.f104705a = coroutineScope;
        this.f104706b = context;
        this.f104707c = relationRepository;
        this.f104708d = kingPositionRepository;
        this.f104709e = aVar;
        this.f104710f = tVar;
        this.f104711g = businessType;
        this.h = dVar;
        this.f104712i = zoomContainerService;
        this.f104713j = aVar2;
        this.f104714k = aVar3;
        this.f104715l = danmakuCompoundRepository;
        this.f104716m = c8043a;
        this.f104717n = aVar4;
        this.f104718o = flow;
        this.f104719p = c7620a;
        this.f104722s = StateFlowTransformKt.a(dVar.f104057d, coroutineScope, new T1(this, 2));
    }

    public final boolean A() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @NotNull
    public final StateFlow<Long> E() {
        return StateFlowTransformKt.a(this.f104707c.f104004m, this.f104705a, new Object());
    }

    @NotNull
    public final StateFlow<Boolean> H() {
        return this.f104707c.f103998f;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @NotNull
    public final StateFlow<Long> I() {
        return StateFlowTransformKt.a(this.f104707c.f104004m, this.f104705a, new Object());
    }

    @NotNull
    public final Deferred<Boolean> J() {
        return this.f104708d.f100330g;
    }

    public final boolean K() {
        return this.f104713j.b();
    }

    public final void L() {
        RelationRepository relationRepository = this.f104707c;
        relationRepository.z(relationRepository.q() + 1);
    }

    @NotNull
    public final StateFlow<Long> O() {
        return StateFlowTransformKt.a(this.f104707c.f104004m, this.f104705a, new com.bilibili.mall.kmm.virtumart.api.a(1));
    }

    public final boolean Q() {
        com.bilibili.ship.theseus.united.page.screensize.a aVar = this.f104717n;
        return aVar.e() || aVar.h();
    }

    @NotNull
    public final StateFlow<Boolean> X() {
        return this.f104707c.f103999g;
    }

    @NotNull
    public final String Y() {
        return ((com.bilibili.ship.theseus.united.page.online.b) this.f104713j.f102112e.getValue()).f102115c;
    }

    @NotNull
    public final z a() {
        return (z) this.f104720q.getValue();
    }

    public final boolean a0() {
        return this.f104710f.f104125a.f104104a.f104092a;
    }

    @Nullable
    public final Drawable b() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f104708d.f100329f;
        return (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
    }

    @NotNull
    public final StateFlow<PlayNetworkEnv> e() {
        return FlowKt.stateIn(FlowKt.flattenMerge$default(FlowKt.mapLatest(this.f104718o, new UnitedGeminiPlayerCommonActionDelegate$getNetworkEnvFlow$1(null)), 0, 1, (Object) null), this.f104705a, SharingStarted.Companion.getEagerly(), PlayNetworkEnv.b.f79289a);
    }

    @NotNull
    public final Flow<com.bilibili.app.gemini.player.widget.online.a> f() {
        final StateFlow<com.bilibili.ship.theseus.united.page.online.b> stateFlow = this.f104713j.f102112e;
        return new Flow<com.bilibili.app.gemini.player.widget.online.a>(stateFlow) { // from class: com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f104723a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f104724a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/oldway/UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2$1.class */
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
                    this.f104724a = flowCollector;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1$2$1
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
                        goto L8a
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        com.bilibili.app.gemini.player.widget.online.a r0 = new com.bilibili.app.gemini.player.widget.online.a
                        r1 = r0
                        r2 = r6
                        com.bilibili.ship.theseus.united.page.online.b r2 = (com.bilibili.ship.theseus.united.page.online.b) r2
                        java.lang.String r2 = r2.f102114b
                        r1.<init>(r2)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f104724a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L8a
                        r0 = r9
                        return r0
                    L8a:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.player.oldway.UnitedGeminiPlayerCommonActionDelegate$getOnlineInfoFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f104723a = stateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f104723a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public final StateFlow<Boolean> f0() {
        return this.f104707c.f104002k;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @NotNull
    public final StateFlow<Long> g0() {
        return StateFlowTransformKt.a(this.f104707c.f104004m, this.f104705a, new Object());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.app.gemini.player.widget.coin.a, java.lang.Object] */
    @Nullable
    public final com.bilibili.app.gemini.player.widget.coin.a getCoinStyle() {
        Map<KingPositionType, C6289c> map;
        C6289c c6289c;
        p pVar = this.f104708d.f100326c;
        C6287a c6287a = (pVar == null || (map = pVar.f100470a) == null || (c6289c = map.get(KingPositionType.COIN)) == null) ? null : c6289c.f100464g;
        if (c6287a == null) {
            return null;
        }
        ?? obj = new Object();
        ((com.bilibili.app.gemini.player.widget.coin.a) obj).a = c6287a.f100452b;
        ((com.bilibili.app.gemini.player.widget.coin.a) obj).b = c6287a.f100453c;
        ((com.bilibili.app.gemini.player.widget.coin.a) obj).c = c6287a.f100454d;
        ((com.bilibili.app.gemini.player.widget.coin.a) obj).d = c6287a.f100455e;
        return obj;
    }

    @Nullable
    public final Drawable getLikeIcon() {
        Drawable.ConstantState constantState;
        Drawable drawable = this.f104708d.f100328e;
        return (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
    }

    @Nullable
    public final Drawable getLikedIcon() {
        return this.f104708d.a();
    }

    @NotNull
    public final StateFlow<Boolean> i() {
        return StateFlowTransformKt.a(this.h.f104057d, this.f104705a, new C(1));
    }

    @NotNull
    public final CoroutineScope j0() {
        return this.f104705a;
    }

    public final void l(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        Long longOrNull = StringsKt.toLongOrNull(str);
        if (longOrNull != null) {
            long jLongValue = longOrNull.longValue();
            InterfaceC7008a interfaceC7008a = (InterfaceC7008a) this.f104714k.get();
            String str4 = str3;
            if (str3 == null) {
                str4 = this.f104716m.a().f123880b;
            }
            InterfaceC7008a.e(interfaceC7008a, jLongValue, 0L, str2, str4, null, 0, null, false, 418);
        }
    }

    @NotNull
    public final MutableSharedFlow<yk.e> n() {
        return this.f104721r;
    }

    @NotNull
    public final Pair<Boolean, String> o0() {
        DanmakuCompoundRepository danmakuCompoundRepository = this.f104715l;
        return new Pair<>(Boolean.valueOf(danmakuCompoundRepository.b() || danmakuCompoundRepository.f99367c.isDanmakuForbidden()), danmakuCompoundRepository.f99373j.f99536a.d());
    }

    public final int q() {
        return ((Number) this.f104709e.f104044j.getValue()).intValue();
    }

    @NotNull
    public final Integer s() {
        return Integer.valueOf(this.f104711g.ordinal());
    }

    public final void v(@Nullable String str, @NotNull PageType pageType) {
        BuildersKt.launch$default(this.f104705a, (CoroutineContext) null, (CoroutineStart) null, new UnitedGeminiPlayerCommonActionDelegate$handleRightZoomAction$1(this, str, pageType, null), 3, (Object) null);
    }

    @Nullable
    public final BiliGuideBubble w(@NotNull View view) {
        if (this.f104707c.j() || this.f104709e.g() <= 60) {
            return null;
        }
        DeepBlueTripleGuidePosition deepBlueTripleGuidePosition = DeepBlueTripleGuidePosition.EndPage;
        C7620a c7620a = this.f104719p;
        if (!c7620a.a(deepBlueTripleGuidePosition)) {
            return null;
        }
        c7620a.b(deepBlueTripleGuidePosition);
        return c7620a.c(view, deepBlueTripleGuidePosition);
    }

    @NotNull
    public final StateFlow<wk.a> x() {
        return this.f104722s;
    }

    public final boolean z(@Nullable String str, @NotNull PageType pageType) {
        BuildersKt.launch$default(this.f104705a, (CoroutineContext) null, (CoroutineStart) null, new UnitedGeminiPlayerCommonActionDelegate$handleInnerAction$1(this, str, pageType, null), 3, (Object) null);
        return true;
    }
}
