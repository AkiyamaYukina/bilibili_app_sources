package com.bilibili.ship.theseus.united.page.playingarea;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import androidx.core.view.ViewCompat;
import com.bilibili.ogv.infra.widget.RatioLayout;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import java.util.HashSet;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl.class */
@StabilityInferred(parameters = 0)
public final class PlayingAreaCompoundServiceImpl implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f102306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f102307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f102308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final i f102309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C7893a f102310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f102311g;

    @NotNull
    public final IPanelContainer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IGestureService f102312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f102313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f102314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Flow<a.c> f102315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f102316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Job f102317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a.b> f102318o = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f102319p = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final HashSet<Object> f102320q = new HashSet<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f102321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f102322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f102323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f102324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f102325v;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingAreaCompoundServiceImpl$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayingAreaCompoundServiceImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingAreaCompoundServiceImpl;
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
                PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl = this.this$0;
                this.label = 1;
                playingAreaCompoundServiceImpl.getClass();
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlayingAreaCompoundServiceImpl$collectMaxScrollDistance$2(playingAreaCompoundServiceImpl, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
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
    public PlayingAreaCompoundServiceImpl(@NotNull CoroutineScope coroutineScope, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull a aVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull i iVar, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull IPanelContainer iPanelContainer, @NotNull IGestureService iGestureService, @NotNull IInteractLayerService iInteractLayerService, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull Flow<a.c> flow, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2) {
        this.f102305a = coroutineScope;
        this.f102306b = pageNestedScrollFusionRepository;
        this.f102307c = aVar;
        this.f102308d = cVar;
        this.f102309e = iVar;
        this.f102310f = c7893a;
        this.f102311g = hVar;
        this.h = iPanelContainer;
        this.f102312i = iGestureService;
        this.f102313j = iInteractLayerService;
        this.f102314k = theseusPageUIStyleRepository;
        this.f102315l = flow;
        this.f102316m = aVar2;
        this.f102322s = theseusPageUIStyleRepository.f103504n;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayingAreaCompoundServiceImpl$collectViews$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayingAreaCompoundServiceImpl$collectScrollEnable$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayingAreaCompoundServiceImpl$collectPlayingAreaOccupied$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new PlayingAreaCompoundServiceImpl$collect16x9Lock$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        b();
    }

    public static final boolean k(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, PlayingAreaDescription playingAreaDescription) {
        Float f7;
        Pair<Long, Float> pair = playingAreaCompoundServiceImpl.f102310f.f123390c;
        return MathKt.roundToInt(((pair == null || (f7 = (Float) pair.getSecond()) == null) ? playingAreaDescription.f102326a : f7.floatValue()) * ((float) 10000000)) < MathKt.roundToInt(1.7777778E7f);
    }

    public static final void l(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl, a.c cVar) {
        boolean zF = playingAreaCompoundServiceImpl.f102316m.f();
        IInteractLayerService iInteractLayerService = playingAreaCompoundServiceImpl.f102313j;
        C7893a c7893a = playingAreaCompoundServiceImpl.f102310f;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = playingAreaCompoundServiceImpl.f102308d;
        if (zF) {
            FrameLayout frameLayout = cVar.f102355b;
            c.a aVarH = cVar2.h();
            PlayingAreaDescription playingAreaDescriptionA = c7893a.a();
            PlayingAreaDescription playingAreaDescription = playingAreaDescriptionA;
            if (playingAreaDescriptionA == null) {
                playingAreaDescription = new PlayingAreaDescription(1.7777778f);
            }
            o(frameLayout, playingAreaDescription.a());
            if (aVarH.f102988b) {
                BLog.i("PlayingAreaCompoundServiceImpl-updateLargeContainerSize", "[theseus-united-PlayingAreaCompoundServiceImpl-updateLargeContainerSize] to full screen, change container");
                ViewCompat.setElevation(frameLayout, 100.0f);
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -1;
                frameLayout.setLayoutParams(layoutParams);
            } else {
                defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl-updateLargeContainerSize] ", "to half screen, change container ratio direction:" + playingAreaDescription + ", screen state:" + aVarH, "PlayingAreaCompoundServiceImpl-updateLargeContainerSize");
                if (!playingAreaCompoundServiceImpl.f102325v) {
                    ViewCompat.setElevation(frameLayout, 0.0f);
                }
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = 0;
                frameLayout.setLayoutParams(layoutParams2);
            }
            FrameLayout frameLayout2 = iInteractLayerService.getChronosInteractContainer().h;
            ViewGroup.LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            frameLayout2.setLayoutParams(layoutParams3);
            return;
        }
        FrameLayout frameLayout3 = cVar.f102355b;
        c.a aVarH2 = cVar2.h();
        PlayingAreaDescription playingAreaDescriptionA2 = c7893a.a();
        PlayingAreaDescription playingAreaDescription2 = playingAreaDescriptionA2;
        if (playingAreaDescriptionA2 == null) {
            playingAreaDescription2 = new PlayingAreaDescription(1.7777778f);
        }
        int i7 = playingAreaCompoundServiceImpl.f102314k.f103507q;
        boolean z6 = playingAreaCompoundServiceImpl.f102324u;
        RatioLayout ratioLayout = cVar.f102357d;
        if (z6) {
            if (aVarH2.f102988b) {
                return;
            }
            float fE = playingAreaCompoundServiceImpl.e(playingAreaDescription2);
            BLog.i("PlayingAreaCompoundServiceImpl-updateNormalContainerSize", "[theseus-united-PlayingAreaCompoundServiceImpl-updateNormalContainerSize] " + G0.g.a(fE, "half screen change container ratio to "));
            ratioLayout.setAspectRatio(fE);
            return;
        }
        if (((Boolean) h.f102364a.getValue()).booleanValue()) {
            o(frameLayout3, playingAreaDescription2.a());
        }
        boolean z7 = aVarH2.f102988b;
        RatioLayout ratioLayout2 = cVar.f102356c;
        if (z7) {
            BLog.i("PlayingAreaCompoundServiceImpl-updateNormalContainerSize", "[theseus-united-PlayingAreaCompoundServiceImpl-updateNormalContainerSize] to full screen, change container");
            ratioLayout2.setAspectRatio(Float.NaN);
            ViewGroup.LayoutParams layoutParams4 = ratioLayout2.getLayoutParams();
            if (layoutParams4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams4.width = -1;
            layoutParams4.height = -1;
            ratioLayout2.setLayoutParams(layoutParams4);
            FrameLayout frameLayout4 = iInteractLayerService.getChronosInteractContainer().h;
            ViewGroup.LayoutParams layoutParams5 = frameLayout4.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams5.width = -1;
            layoutParams5.height = -1;
            frameLayout4.setLayoutParams(layoutParams5);
            ViewCompat.setElevation(frameLayout3, 100.0f);
            return;
        }
        BLog.i("PlayingAreaCompoundServiceImpl-updateNormalContainerSize", "[theseus-united-PlayingAreaCompoundServiceImpl-updateNormalContainerSize] " + ("change container ratio direction:" + playingAreaDescription2 + ", screen state:" + aVarH2 + ", specified:" + ((a.b) playingAreaCompoundServiceImpl.f102318o.getValue())));
        float fE2 = playingAreaCompoundServiceImpl.e(playingAreaDescription2);
        int iRoundToInt = MathKt.roundToInt(((Number) playingAreaCompoundServiceImpl.f102307c.d().getFirst()).floatValue() / fE2);
        BLog.i("PlayingAreaCompoundServiceImpl-updateNormalContainerSize", "[theseus-united-PlayingAreaCompoundServiceImpl-updateNormalContainerSize] " + ("to half screen, change container ratio to " + fE2 + " chronosHeight:" + iRoundToInt));
        ViewGroup.LayoutParams layoutParams6 = ratioLayout2.getLayoutParams();
        if (layoutParams6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams6.width = -1;
        layoutParams6.height = -2;
        ratioLayout2.setLayoutParams(layoutParams6);
        FrameLayout frameLayout5 = iInteractLayerService.getChronosInteractContainer().h;
        ViewGroup.LayoutParams layoutParams7 = frameLayout5.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams7.width = -1;
        layoutParams7.height = iRoundToInt;
        frameLayout5.setLayoutParams(layoutParams7);
        ratioLayout2.setAspectRatio(fE2);
        ratioLayout.setAspectRatio(fE2);
        if (playingAreaCompoundServiceImpl.f102322s) {
            ratioLayout2.setExtendBottom(i7);
            ratioLayout.setExtendBottom(i7);
        }
        if (playingAreaCompoundServiceImpl.f102325v) {
            return;
        }
        ViewCompat.setElevation(frameLayout3, 0.0f);
    }

    public static final void m(PlayingAreaCompoundServiceImpl playingAreaCompoundServiceImpl) {
        int iAbs;
        boolean zF = playingAreaCompoundServiceImpl.f102316m.f();
        PageNestedScrollFusionRepository pageNestedScrollFusionRepository = playingAreaCompoundServiceImpl.f102306b;
        if (zF) {
            pageNestedScrollFusionRepository.f(0);
            BLog.i("PlayingAreaCompoundServiceImpl-updateMaxScrollDistance", "[theseus-united-PlayingAreaCompoundServiceImpl-updateMaxScrollDistance] update large max scroll distance");
            return;
        }
        boolean z6 = playingAreaCompoundServiceImpl.f102321r;
        a aVar = playingAreaCompoundServiceImpl.f102307c;
        if (z6) {
            iAbs = aVar.i() - aVar.h();
        } else {
            iAbs = CompoundPlayStateProviderKt.a(playingAreaCompoundServiceImpl.f102311g) ? Math.abs(aVar.a() - aVar.h()) : -1;
        }
        BLog.i("PlayingAreaCompoundServiceImpl-updateMaxScrollDistance", "[theseus-united-PlayingAreaCompoundServiceImpl-updateMaxScrollDistance] " + C3259x.a(iAbs, "update max scroll distance = "));
        pageNestedScrollFusionRepository.f(iAbs);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl r8) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl.n(com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaCompoundServiceImpl):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static void o(ViewGroup viewGroup, boolean z6) {
        while (viewGroup != 0 && viewGroup.getId() != 16908290) {
            if (viewGroup instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup;
                viewGroup2.setClipToPadding(z6);
                viewGroup2.setClipChildren(z6);
            }
            Object parent = viewGroup.getParent();
            viewGroup = parent instanceof View ? (View) parent : 0;
        }
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void a(boolean z6) {
        this.f102323t = z6;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void b() {
        BLog.i("PlayingAreaCompoundServiceImpl-startCollectingContainerSizeChange", "[theseus-united-PlayingAreaCompoundServiceImpl-startCollectingContainerSizeChange] start collecting container size change");
        Job job = this.f102317n;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f102317n = BuildersKt.launch$default(this.f102305a, (CoroutineContext) null, (CoroutineStart) null, new PlayingAreaCompoundServiceImpl$startCollectingContainerSizeChange$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void c(boolean z6) {
        this.f102325v = z6;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void d() {
        int iH = this.f102307c.h();
        int i7 = this.f102314k.f103507q;
        BLog.i("PlayingAreaCompoundServiceImpl-scrollToMinHeight", "[theseus-united-PlayingAreaCompoundServiceImpl-scrollToMinHeight] " + G.f.a(iH, i7, "scroll to min height ", " "));
        int i8 = iH + i7;
        PageNestedScrollFusionRepository pageNestedScrollFusionRepository = this.f102306b;
        pageNestedScrollFusionRepository.getClass();
        BLog.i("PageNestedScrollFusionRepository-scrollToSpecifiedHeight", "[theseus-united-PageNestedScrollFusionRepository-scrollToSpecifiedHeight] " + ("scroll to specified height: " + i8));
        pageNestedScrollFusionRepository.f102257i.tryEmit(Integer.valueOf(i8));
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final float e(@Nullable PlayingAreaDescription playingAreaDescription) {
        PlayingAreaDescription playingAreaDescription2 = playingAreaDescription;
        if (playingAreaDescription == null) {
            PlayingAreaDescription playingAreaDescriptionA = this.f102310f.a();
            playingAreaDescription2 = playingAreaDescriptionA;
            if (playingAreaDescriptionA == null) {
                playingAreaDescription2 = new PlayingAreaDescription(1.7777778f);
            }
        }
        a.b bVar = (a.b) this.f102318o.getValue();
        return bVar != null ? bVar.f102353a : this.f102307c.e(playingAreaDescription2);
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void f(@NotNull Object obj) {
        defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl-lock16x9With] ", Fp.c.b(obj, "lock 16x9 with: "), "PlayingAreaCompoundServiceImpl-lock16x9With");
        this.f102320q.add(obj);
        this.f102319p.setValue(Boolean.valueOf(!this.f102320q.isEmpty()));
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void g() {
        BLog.i("PlayingAreaCompoundServiceImpl-unlockSpecifiedPlayingArea", "[theseus-united-PlayingAreaCompoundServiceImpl-unlockSpecifiedPlayingArea] unlock specified playing area");
        this.f102318o.setValue((Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void h(boolean z6) {
        this.f102324u = z6;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void i() {
        BLog.i("PlayingAreaCompoundServiceImpl-stopCollectingContainerSizeChange", "[theseus-united-PlayingAreaCompoundServiceImpl-stopCollectingContainerSizeChange] stop collecting container size change");
        BuildersKt.launch$default(this.f102305a, (CoroutineContext) null, (CoroutineStart) null, new PlayingAreaCompoundServiceImpl$stopCollectingContainerSizeChange$1(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.g
    public final void j(@NotNull Object obj) {
        defpackage.a.b("[theseus-united-PlayingAreaCompoundServiceImpl-unLock16x9With] ", Fp.c.b(obj, "unlock 16x9 with: "), "PlayingAreaCompoundServiceImpl-unLock16x9With");
        if (this.f102320q.isEmpty()) {
            BLog.i("PlayingAreaCompoundServiceImpl-unLock16x9With", "[theseus-united-PlayingAreaCompoundServiceImpl-unLock16x9With] lock16x9Suppressors is already empty, ignore unlock");
            return;
        }
        this.f102320q.remove(obj);
        this.f102319p.setValue(Boolean.valueOf(!this.f102320q.isEmpty()));
    }

    public final void p(float f7) {
        String strA = C4496a.a("lock specified playing area: ", "SpecifiedRatio(ratio=" + f7 + ")");
        StringBuilder sb = new StringBuilder("[theseus-united-PlayingAreaCompoundServiceImpl-lockSpecifiedPlayingArea-kQMDbo0] ");
        sb.append(strA);
        BLog.i("PlayingAreaCompoundServiceImpl-lockSpecifiedPlayingArea-kQMDbo0", sb.toString());
        this.f102318o.setValue(new a.b(f7));
    }
}
