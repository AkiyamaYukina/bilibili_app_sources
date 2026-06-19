package com.bilibili.ship.theseus.cheese.miniplayer;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.play.CheeseSupplementService;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6354p;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import com.bilibili.ship.theseus.united.page.miniplayer.f;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.page.view.t;
import eu0.C6985d;
import ev0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import uu0.InterfaceC8767a;
import wv0.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/miniplayer/CheeseMiniPlayerService.class */
@StabilityInferred(parameters = 0)
public final class CheeseMiniPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f90472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f90473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f90474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f90475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final t f90476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f90477g;

    @NotNull
    public final j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C4911a f90478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final f f90480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final a f90481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PageReportService f90482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C8043a f90483n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C7893a f90484o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final List<C6985d> f90485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f90486q;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.miniplayer.CheeseMiniPlayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/miniplayer/CheeseMiniPlayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.miniplayer.CheeseMiniPlayerService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/miniplayer/CheeseMiniPlayerService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseMiniPlayerService f90487a;

            public a(CheeseMiniPlayerService cheeseMiniPlayerService) {
                this.f90487a = cheeseMiniPlayerService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Unit unit;
                GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                b.InterfaceC1071b interfaceC1071b;
                b.InterfaceC1071b interfaceC1071b2;
                int i7 = 1;
                b.InterfaceC1071b interfaceC1071b3 = (b.InterfaceC1071b) obj;
                CheeseMiniPlayerService cheeseMiniPlayerService = this.f90487a;
                C6985d c6985dA = cheeseMiniPlayerService.f90479j.a();
                if (c6985dA == null) {
                    unit = Unit.INSTANCE;
                } else {
                    CheesePlayRepository cheesePlayRepository = cheeseMiniPlayerService.f90479j;
                    if (cheesePlayRepository.d(c6985dA)) {
                        BLog.d("tryStartMiniPlayerPlay trigger: " + interfaceC1071b3);
                        com.bilibili.ship.theseus.keel.player.j jVarJ = cheeseMiniPlayerService.f90473c.j();
                        if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                            ArrayList arrayList = new ArrayList();
                            UnitedSeasonDetailRepository unitedSeasonDetailRepository = cheeseMiniPlayerService.f90486q;
                            boolean zD = unitedSeasonDetailRepository.d();
                            PageReportService pageReportService = cheeseMiniPlayerService.f90482m;
                            C8043a c8043a = cheeseMiniPlayerService.f90483n;
                            if (!zD) {
                                List<C6985d> list = cheeseMiniPlayerService.f90485p;
                                ArrayList arrayList2 = new ArrayList();
                                for (T t7 : list) {
                                    if (cheesePlayRepository.d((C6985d) t7)) {
                                        arrayList2.add(t7);
                                    }
                                }
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    interfaceC1071b = interfaceC1071b3;
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C6985d c6985d = (C6985d) it.next();
                                    arrayList.add(CheeseSupplementService.a.a(c6985d.f117510e, c6985d.f117511f, (int) c6985d.f117508c, c6985d.f117512g, c6985d.f117524t, c8043a.a().f123885g, "1", cheeseMiniPlayerService.f90476f.f104126b.f104087b, null, cheeseMiniPlayerService.f90477g, cheeseMiniPlayerService.f90478i, c6985d.f117521q, c6985d.f117523s, cheeseMiniPlayerService.f90481l.f129026b, pageReportService.f102492e, false, null));
                                }
                            } else {
                                Iterator<T> it2 = unitedSeasonDetailRepository.b().iterator();
                                while (it2.hasNext()) {
                                    Iterator<T> it3 = ((C6353o) it2.next()).h.iterator();
                                    b.InterfaceC1071b interfaceC1071b4 = interfaceC1071b3;
                                    int i8 = i7;
                                    while (true) {
                                        i7 = i8;
                                        interfaceC1071b3 = interfaceC1071b4;
                                        if (it3.hasNext()) {
                                            Iterator<T> it4 = ((Z) it3.next()).f101648d.iterator();
                                            b.InterfaceC1071b interfaceC1071b5 = interfaceC1071b4;
                                            int i9 = i8;
                                            while (true) {
                                                int i10 = i9;
                                                i8 = i10;
                                                interfaceC1071b4 = interfaceC1071b5;
                                                if (it4.hasNext()) {
                                                    C6355q c6355q = (C6355q) it4.next();
                                                    if (((ArrayList) c6355q.f101689j).size() != i10) {
                                                        Iterator<T> it5 = c6355q.f101689j.iterator();
                                                        while (true) {
                                                            interfaceC1071b2 = interfaceC1071b5;
                                                            if (it5.hasNext()) {
                                                                Av0.a aVar = (Av0.a) it5.next();
                                                                if (geminiCommonPlayableParamsF.getCid() == aVar.f591b) {
                                                                    arrayList.add(geminiCommonPlayableParamsF);
                                                                } else {
                                                                    int i11 = c8043a.a().f123885g;
                                                                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                                                                    mapCreateMapBuilder.putAll(pageReportService.f102492e);
                                                                    Unit unit2 = Unit.INSTANCE;
                                                                    arrayList.add(Av0.b.a(aVar, geminiCommonPlayableParamsF, i11, MapsKt.build(mapCreateMapBuilder)));
                                                                }
                                                            }
                                                        }
                                                    } else if (geminiCommonPlayableParamsF.getCid() == c6355q.f101683c) {
                                                        arrayList.add(geminiCommonPlayableParamsF);
                                                        interfaceC1071b2 = interfaceC1071b5;
                                                    } else {
                                                        int i12 = c8043a.a().f123885g;
                                                        Map mapCreateMapBuilder2 = MapsKt.createMapBuilder();
                                                        mapCreateMapBuilder2.putAll(pageReportService.f102492e);
                                                        Unit unit3 = Unit.INSTANCE;
                                                        arrayList.add(C6354p.b(c6355q, geminiCommonPlayableParamsF, i12, MapsKt.build(mapCreateMapBuilder2)));
                                                        interfaceC1071b2 = interfaceC1071b5;
                                                    }
                                                    interfaceC1071b5 = interfaceC1071b2;
                                                    i9 = 1;
                                                }
                                            }
                                        }
                                    }
                                }
                                interfaceC1071b = interfaceC1071b3;
                            }
                            if (arrayList.isEmpty()) {
                                BLog.d("enter mini player failed, play list is empty");
                            } else {
                                int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(cheeseMiniPlayerService.f90472b);
                                Iterator it6 = arrayList.iterator();
                                int i13 = 0;
                                while (true) {
                                    if (!it6.hasNext()) {
                                        i13 = -1;
                                        break;
                                    }
                                    if (Intrinsics.areEqual(((GeminiCommonPlayableParams) it6.next()).id(), geminiCommonPlayableParamsF.id())) {
                                        break;
                                    }
                                    i13++;
                                }
                                int iCoerceAtLeast = RangesKt.coerceAtLeast(i13, 0);
                                GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) CollectionsKt.getOrNull(arrayList, iCoerceAtLeast);
                                if (geminiCommonPlayableParams != null) {
                                    geminiCommonPlayableParams.setFromSpmid(geminiCommonPlayableParamsF.getFromSpmid());
                                }
                                int i14 = interfaceC1071b.isPlaying() ? 4 : 5;
                                boolean zA = interfaceC1071b.a();
                                InterfaceC8767a interfaceC8767a = (InterfaceC8767a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC8767a.class, (String) null, 2, (Object) null);
                                if (interfaceC8767a != null) {
                                    interfaceC8767a.a(true, false, zA, i14, iPrepareForShare, iCoerceAtLeast, arrayList, null, null, null);
                                }
                                boolean z6 = interfaceC1071b instanceof b.InterfaceC1071b.C1072b;
                                ComponentActivity componentActivity = cheeseMiniPlayerService.f90474d;
                                if (z6) {
                                    BLRouter.routeTo(new RouteRequest.Builder("bilibili://home").build(), componentActivity);
                                }
                                cheeseMiniPlayerService.h.f();
                                if (interfaceC1071b.b()) {
                                    componentActivity.finish();
                                } else if (!componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
                                    C7893a.C1318a c1318aC = cheeseMiniPlayerService.f90484o.c();
                                    f fVar = cheeseMiniPlayerService.f90480k;
                                    fVar.c(c1318aC);
                                    fVar.a();
                                }
                            }
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = Unit.INSTANCE;
                    }
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseMiniPlayerService cheeseMiniPlayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseMiniPlayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                CheeseMiniPlayerService cheeseMiniPlayerService = this.this$0;
                SharedFlow<b.InterfaceC1071b> sharedFlow = cheeseMiniPlayerService.f90475e.f102064u;
                a aVar = new a(cheeseMiniPlayerService);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public CheeseMiniPlayerService(@NotNull CoroutineScope coroutineScope, @NotNull PlayerContainer playerContainer, @NotNull h hVar, @NotNull ComponentActivity componentActivity, @NotNull b bVar, @NotNull t tVar, @NotNull d dVar, @NotNull j jVar, @NotNull C4911a c4911a, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull f fVar, @NotNull a aVar, @NotNull PageReportService pageReportService, @NotNull C8043a c8043a, @NotNull C7893a c7893a, @NotNull List<C6985d> list, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository) {
        this.f90471a = coroutineScope;
        this.f90472b = playerContainer;
        this.f90473c = hVar;
        this.f90474d = componentActivity;
        this.f90475e = bVar;
        this.f90476f = tVar;
        this.f90477g = dVar;
        this.h = jVar;
        this.f90478i = c4911a;
        this.f90479j = cheesePlayRepository;
        this.f90480k = fVar;
        this.f90481l = aVar;
        this.f90482m = pageReportService;
        this.f90483n = c8043a;
        this.f90484o = c7893a;
        this.f90485p = list;
        this.f90486q = unitedSeasonDetailRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
