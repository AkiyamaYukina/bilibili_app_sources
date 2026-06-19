package com.bilibili.ship.theseus.ugc.intro.upguardian;

import HG0.C2081f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianComponent;
import com.bilibili.ship.theseus.ugc.intro.upguardian.j;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.upguardian.UpGuardianSectionView;
import com.bilibili.upguardian.sign.UpGuardianSignView;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService.class */
@StabilityInferred(parameters = 0)
public final class UpGuardianService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RelationRepository f97581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f97582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f97584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f97585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f97586g;

    @NotNull
    public final TheseusFloatLayerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f97587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f97588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lifecycle f97589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f97590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f97592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f97593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public RunningUIComponent f97594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f97595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97596r;

    @Inject
    public UpGuardianService(@NotNull CoroutineScope coroutineScope, @NotNull RelationRepository relationRepository, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C8043a c8043a, @NotNull rW0.a<IntroRecycleViewService> aVar2, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull Lifecycle lifecycle, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar3) {
        this.f97580a = coroutineScope;
        this.f97581b = relationRepository;
        this.f97582c = dVar;
        this.f97583d = aVar;
        this.f97584e = c8043a;
        this.f97585f = aVar2;
        this.f97586g = gVar;
        this.h = theseusFloatLayerService;
        this.f97587i = pageReportService;
        this.f97588j = hVar;
        this.f97589k = lifecycle;
        this.f97590l = cVar;
        this.f97591m = introContentSizeRepository;
        this.f97592n = aVar3;
        final StateFlow<WindowSizeClass> stateFlow = aVar3.f102939c;
        this.f97596r = FlowKt.stateIn(new Flow<Boolean>(stateFlow, this) { // from class: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f97606a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UpGuardianService f97607b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f97608a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final UpGuardianService f97609b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upguardian/UpGuardianService$special$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, UpGuardianService upGuardianService) {
                    this.f97608a = flowCollector;
                    this.f97609b = upGuardianService;
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
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r10 = r0
                        r0 = r10
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r10
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r10
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r11 = r0
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
                        r0 = r11
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto Lab
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r11
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        androidx.window.core.layout.WindowSizeClass r0 = (androidx.window.core.layout.WindowSizeClass) r0
                        r6 = r0
                        r0 = r5
                        com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService r0 = r0.f97609b
                        r6 = r0
                        r0 = r6
                        com.bilibili.ship.theseus.united.page.screensize.a r0 = r0.f97592n
                        boolean r0 = r0.h()
                        if (r0 != 0) goto L8a
                        r0 = r6
                        com.bilibili.ship.theseus.united.page.screensize.a r0 = r0.f97592n
                        boolean r0 = r0.g()
                        if (r0 == 0) goto L84
                        goto L8a
                    L84:
                        r0 = 0
                        r9 = r0
                        goto L8d
                    L8a:
                        r0 = 1
                        r9 = r0
                    L8d:
                        r0 = r9
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f97608a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r10
                        if (r0 != r1) goto Lab
                        r0 = r10
                        return r0
                    Lab:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f97606a = stateFlow;
                this.f97607b = this;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f97606a.collect(new AnonymousClass2(flowCollector, this.f97607b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, coroutineScope, SharingStarted.Companion.getEagerly(), Boolean.valueOf(aVar3.h() || aVar3.g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService r9, boolean r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService.a(com.bilibili.ship.theseus.ugc.intro.upguardian.UpGuardianService, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(UpGuardianService upGuardianService, boolean z6, boolean z7, e eVar, int i7, UIComponent uIComponent) {
        if (upGuardianService.f97593o) {
            return;
        }
        if ((eVar.f97615a && z7) || (eVar.f97616b && z6)) {
            upGuardianService.f97593o = true;
            IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) upGuardianService.f97585f.get();
            long jF = upGuardianService.f97582c.f();
            com.bilibili.ship.theseus.united.page.view.a aVar = upGuardianService.f97583d;
            UpGuardianSectionView.a aVar2 = new UpGuardianSectionView.a(Long.valueOf(jF), 0L, i7, aVar.a(), aVar.c(), upGuardianService.f97584e.a().f123880b);
            RunningUIComponent runningUIComponent = new RunningUIComponent(new UpGuardianComponent(new UpGuardianComponent.a(eVar.f97617c, eVar.f97618d, aVar2), upGuardianService.f97591m.f100020a, upGuardianService.f97596r, new g(upGuardianService, i7), new h(upGuardianService, i7), new i(upGuardianService, i7), new C2081f(upGuardianService, 1)), 0, (Function1) null, 6);
            upGuardianService.f97594p = runningUIComponent;
            introRecycleViewService.e(runningUIComponent, uIComponent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.app.gemini.ui.UIComponent, com.bilibili.ship.theseus.ugc.intro.b, java.lang.Object] */
    @NotNull
    public final RunningUIComponent c(@NotNull e eVar) {
        ?? obj = new Object();
        return new RunningUIComponent((UIComponent) obj, 0, new UpGuardianService$create$1(this, eVar, obj, null), 2);
    }

    public final void d(int i7, String str) {
        HashMap map = new HashMap();
        map.put("up_mid", String.valueOf(this.f97582c.f()));
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f97583d;
        map.put(GameCardButton.extraAvid, aVar.b());
        map.put("cid", aVar.d());
        map.put("scene", String.valueOf(i7));
        map.put("position", str);
        Neurons.reportClick(false, "united.player-video-detail.up-guard.0.click", map);
    }

    public final Object e(int i7, ContinuationImpl continuationImpl) {
        long jF = this.f97582c.f();
        Integer numBoxInt = Boxing.boxInt(1);
        com.bilibili.ship.theseus.united.page.view.a aVar = this.f97583d;
        j.a aVar2 = new j.a(new UpGuardianSignView.b(jF, 0L, i7, numBoxInt, Boxing.boxLong(aVar.a()), Boxing.boxLong(aVar.c()), this.f97584e.a().f123880b));
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UpGuardianService$showUpGuardianSignLayer$2(this, new j(aVar2, new com.bilibili.lib.bilipay.ui.recharge.v2.i(this, 1), new f(booleanRef, this), new com.bilibili.lib.fasthybrid.uimodule.widget.coverview.internal.widget.component.d(1, booleanRef, this)), null), continuationImpl);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
