package com.bilibili.ship.theseus.ogv;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvSupplementService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.miniplayer.ToolbarMiniPlayerRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import uu0.InterfaceC8767a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService.class */
@StabilityInferred(parameters = 0)
public final class OgvMiniPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f91282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f91284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f91286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.b f91287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f91288g;

    @NotNull
    public final PageAdRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.t f91291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f91292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final ToolbarMiniPlayerRepository f91293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final EpisodeExtraInfoRepository f91294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ev0.j f91295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final OgvRestoreFromMiniPlayService f91296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final wv0.a f91297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final PageReportService f91298r;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvMiniPlayerService f91299a;

            public a(OgvMiniPlayerService ogvMiniPlayerService) {
                this.f91299a = ogvMiniPlayerService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                b.InterfaceC1071b interfaceC1071b = (b.InterfaceC1071b) obj;
                OgvMiniPlayerService ogvMiniPlayerService = this.f91299a;
                com.bilibili.ship.theseus.keel.player.j jVarJ = ogvMiniPlayerService.f91285d.j();
                if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                    int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(ogvMiniPlayerService.f91284c);
                    OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = ogvMiniPlayerService.f91290j;
                    List<OgvEpisode> listE = ogvCurrentEpisodeRepository.e();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listE, 10));
                    Iterator<T> it = listE.iterator();
                    while (it.hasNext()) {
                        arrayList.add(OgvSupplementService.a.a(ogvMiniPlayerService.f91282a, ogvMiniPlayerService.f91289i, (OgvEpisode) it.next(), ogvMiniPlayerService.f91291k, null, "1", ogvMiniPlayerService.f91288g.a().f123885g, ogvMiniPlayerService.f91288g, ogvMiniPlayerService.f91292l, ogvMiniPlayerService.h, true, ogvMiniPlayerService.f91297q.f129026b, ogvMiniPlayerService.f91298r.f102492e, false, null, 24576));
                    }
                    if (arrayList.isEmpty()) {
                        BLog.i("OgvMiniPlayerService-tryStartMiniPlayerPlay", "[theseus-ogv-OgvMiniPlayerService-tryStartMiniPlayerPlay] ogv enter mini player failed, play list is empty");
                    } else {
                        Iterator it2 = arrayList.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (Intrinsics.areEqual(((GeminiCommonPlayableParams) it2.next()).id(), geminiCommonPlayableParamsF.id())) {
                                break;
                            }
                            i7++;
                        }
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(i7, 0);
                        GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) CollectionsKt.getOrNull(arrayList, iCoerceAtLeast);
                        if (geminiCommonPlayableParams != null) {
                            geminiCommonPlayableParams.setFromSpmid(geminiCommonPlayableParamsF.getFromSpmid());
                        }
                        int i8 = interfaceC1071b.isPlaying() ? 4 : 5;
                        boolean zA = interfaceC1071b.a();
                        InterfaceC8767a interfaceC8767a = (InterfaceC8767a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC8767a.class, (String) null, 2, (Object) null);
                        if (interfaceC8767a != null) {
                            interfaceC8767a.a(true, false, zA, i8, iPrepareForShare, iCoerceAtLeast, arrayList, null, null, null);
                        }
                        boolean z6 = interfaceC1071b instanceof b.InterfaceC1071b.C1072b;
                        ComponentActivity componentActivity = ogvMiniPlayerService.f91286e;
                        if (z6) {
                            BLRouter.routeTo(new RouteRequest.Builder("bilibili://home").build(), componentActivity);
                        }
                        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
                        ogvMiniPlayerService.f91295o.f();
                        if (interfaceC1071b.b()) {
                            componentActivity.finish();
                        } else if (!componentActivity.isFinishing() && !componentActivity.isDestroyed() && ogvEpisodeC != null) {
                            ogvMiniPlayerService.f91296p.f91321g.setValue(ogvEpisodeC);
                            StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(ogvEpisodeC.a(), "leave page and save last ogv ep, avid:", ", cid:");
                            sbA.append(ogvEpisodeC.f93561g);
                            defpackage.a.b("[theseus-ogv-OgvRestoreFromMiniPlayService-leavePageAndSaveLast] ", sbA.toString(), "OgvRestoreFromMiniPlayService-leavePageAndSaveLast");
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvMiniPlayerService ogvMiniPlayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvMiniPlayerService;
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
                OgvMiniPlayerService ogvMiniPlayerService = this.this$0;
                SharedFlow<b.InterfaceC1071b> sharedFlow = ogvMiniPlayerService.f91287f.f102064u;
                a aVar = new a(ogvMiniPlayerService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvMiniPlayerService f91300a;

            public a(OgvMiniPlayerService ogvMiniPlayerService) {
                this.f91300a = ogvMiniPlayerService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                OgvMiniPlayerService ogvMiniPlayerService = this.f91300a;
                if (zBooleanValue) {
                    ogvMiniPlayerService.f91293m.a("miniPlayerDrmSuppressor");
                    ogvMiniPlayerService.f91287f.a("miniPlayerDrmSuppressor");
                } else {
                    ogvMiniPlayerService.f91293m.b("miniPlayerDrmSuppressor");
                    ogvMiniPlayerService.f91287f.b("miniPlayerDrmSuppressor");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OgvMiniPlayerService ogvMiniPlayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ogvMiniPlayerService;
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
                OgvMiniPlayerService ogvMiniPlayerService = this.this$0;
                StateFlow<ExtraInfo> stateFlow = ogvMiniPlayerService.f91294n.f99566b;
                a aVar = new a(ogvMiniPlayerService);
                this.label = 1;
                Object objCollect = stateFlow.collect(new OgvMiniPlayerService$2$invokeSuspend$$inlined$map$1$2(aVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvMiniPlayerService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvMiniPlayerService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvMiniPlayerService f91302a;

            public a(OgvMiniPlayerService ogvMiniPlayerService) {
                this.f91302a = ogvMiniPlayerService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                OgvMiniPlayerService ogvMiniPlayerService = this.f91302a;
                if (zBooleanValue) {
                    ogvMiniPlayerService.f91293m.a("miniPlayerAuthorizedSuppressor");
                    ogvMiniPlayerService.f91287f.a("miniPlayerAuthorizedSuppressor");
                } else {
                    ogvMiniPlayerService.f91293m.b("miniPlayerAuthorizedSuppressor");
                    ogvMiniPlayerService.f91287f.b("miniPlayerAuthorizedSuppressor");
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvMiniPlayerService ogvMiniPlayerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvMiniPlayerService;
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
                OgvMiniPlayerService ogvMiniPlayerService = this.this$0;
                StateFlow<ExtraInfo> stateFlow = ogvMiniPlayerService.f91294n.f99566b;
                a aVar = new a(ogvMiniPlayerService);
                this.label = 1;
                Object objCollect = stateFlow.collect(new OgvMiniPlayerService$3$invokeSuspend$$inlined$map$1$2(aVar), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
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
    public OgvMiniPlayerService(@NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull PlayerContainer playerContainer, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.b bVar, @NotNull C8043a c8043a, @NotNull PageAdRepository pageAdRepository, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull com.bilibili.ship.theseus.united.page.view.t tVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull ToolbarMiniPlayerRepository toolbarMiniPlayerRepository, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull ev0.j jVar, @NotNull OgvRestoreFromMiniPlayService ogvRestoreFromMiniPlayService, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f91282a = context;
        this.f91283b = coroutineScope;
        this.f91284c = playerContainer;
        this.f91285d = hVar;
        this.f91286e = componentActivity;
        this.f91287f = bVar;
        this.f91288g = c8043a;
        this.h = pageAdRepository;
        this.f91289i = ogvSeason;
        this.f91290j = ogvCurrentEpisodeRepository;
        this.f91291k = tVar;
        this.f91292l = dVar;
        this.f91293m = toolbarMiniPlayerRepository;
        this.f91294n = episodeExtraInfoRepository;
        this.f91295o = jVar;
        this.f91296p = ogvRestoreFromMiniPlayService;
        this.f91297q = aVar;
        this.f91298r = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
