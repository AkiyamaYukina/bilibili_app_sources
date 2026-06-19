package com.bilibili.ship.theseus.ogv.ep;

import android.content.Context;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.ship.theseus.ogv.C6152d;
import com.bilibili.ship.theseus.ogv.InterfaceC6206j;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvSupplementService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.intro.section.bean.SectionType;
import com.bilibili.ship.theseus.ogv.s;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import com.bilibili.studio.material.util.UtilsKt;
import dagger.internal.Provider;
import ev0.C7013f;
import ev0.i;
import ev0.j;
import ev0.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import vg.E;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository.class */
@StabilityInferred(parameters = 0)
public final class OgvCurrentEpisodeRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f92100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gu0.a f92101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final s f92103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final InterfaceC6206j f92104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f92105g;

    @NotNull
    public final PageBackgroundPlayRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f92106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f92107j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final j f92108k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92109l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final t f92110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f92111n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C7893a f92112o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PreloadRepository f92113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final wv0.a f92114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final PageReportService f92115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final Provider f92116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final String f92117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f92118u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository$special$$inlined$map$1 f92119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C6152d> f92120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public ContinuingType f92121x;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvCurrentEpisodeRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$1$1.class */
        public static final class C06821 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvCurrentEpisodeRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06821(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, Continuation<? super C06821> continuation) {
                super(2, continuation);
                this.this$0 = ogvCurrentEpisodeRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06821 c06821 = new C06821(this.this$0, continuation);
                c06821.L$0 = obj;
                return c06821;
            }

            public final Object invoke(b bVar, Continuation<? super Unit> continuation) {
                return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    b bVar = (b) this.L$0;
                    if (bVar instanceof b.c) {
                        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.this$0;
                        this.label = 1;
                        ogvCurrentEpisodeRepository.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new OgvCurrentEpisodeRepository$driveMediaEpComponent$2(ogvCurrentEpisodeRepository, (b.c) bVar, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (bVar instanceof b.a) {
                        OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository2 = this.this$0;
                        this.label = 2;
                        ogvCurrentEpisodeRepository2.getClass();
                        Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new OgvCurrentEpisodeRepository$driveCastScreenEpComponent$2(ogvCurrentEpisodeRepository2, (b.a) bVar, null), this);
                        if (objCoroutineScope2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope2 = Unit.INSTANCE;
                        }
                        if (objCoroutineScope2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (!Intrinsics.areEqual(bVar, b.C0683b.f92126a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BLog.i("OgvCurrentEpisodeRepository$1$1-invokeSuspend", "[theseus-ogv-OgvCurrentEpisodeRepository$1$1-invokeSuspend] epStateFlow EpRunningState.Idle");
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvCurrentEpisodeRepository;
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
                OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository = this.this$0;
                MutableStateFlow<b> mutableStateFlow = ogvCurrentEpisodeRepository.f92118u;
                C06821 c06821 = new C06821(ogvCurrentEpisodeRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c06821, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final OgvEpisode f92122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<OgvEpisode> f92123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final EpisodeSection f92124c;

        public a(@NotNull OgvEpisode ogvEpisode, @NotNull List<OgvEpisode> list, @Nullable EpisodeSection episodeSection) {
            this.f92122a = ogvEpisode;
            this.f92123b = list;
            this.f92124c = episodeSection;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f92122a, aVar.f92122a) && Intrinsics.areEqual(this.f92123b, aVar.f92123b) && Intrinsics.areEqual(this.f92124c, aVar.f92124c);
        }

        public final int hashCode() {
            int iA = e0.a(this.f92122a.hashCode() * 31, 31, this.f92123b);
            EpisodeSection episodeSection = this.f92124c;
            return iA + (episodeSection == null ? 0 : episodeSection.hashCode());
        }

        @NotNull
        public final String toString() {
            return "EpRunningData(episode=" + this.f92122a + ", epsInPlayingSection=" + this.f92123b + ", playingSection=" + this.f92124c + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$b$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final a f92125a;

            public a(@NotNull a aVar) {
                this.f92125a = aVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f92125a, ((a) obj).f92125a);
            }

            public final int hashCode() {
                return this.f92125a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "CastPlaying(runningData=" + this.f92125a + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0683b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0683b f92126a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$b$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final l f92127a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final a f92128b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public final com.bilibili.ship.theseus.united.bean.d f92129c;

            public c(@NotNull l lVar, @NotNull a aVar, @Nullable com.bilibili.ship.theseus.united.bean.d dVar) {
                this.f92127a = lVar;
                this.f92128b = aVar;
                this.f92129c = dVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f92127a, cVar.f92127a) && Intrinsics.areEqual(this.f92128b, cVar.f92128b) && Intrinsics.areEqual(this.f92129c, cVar.f92129c);
            }

            public final int hashCode() {
                int iHashCode = this.f92127a.hashCode();
                int iHashCode2 = this.f92128b.hashCode();
                com.bilibili.ship.theseus.united.bean.d dVar = this.f92129c;
                return ((iHashCode2 + (iHashCode * 31)) * 31) + (dVar == null ? 0 : dVar.hashCode());
            }

            @NotNull
            public final String toString() {
                return "MediaPlaying(mediaRunningState=" + this.f92127a + ", runningData=" + this.f92128b + ", epExtra=" + this.f92129c + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/OgvCurrentEpisodeRepository$c.class */
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f92130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f92131b;

        static {
            int[] iArr = new int[SectionType.values().length];
            try {
                iArr[SectionType.FEATURE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SectionType.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SectionType.CUTTING.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[SectionType.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[SectionType.PUGV.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[SectionType.RELATED.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            f92130a = iArr;
            int[] iArr2 = new int[ContinuingType.values().length];
            try {
                iArr2[ContinuingType.RemoteStrategy.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr2[ContinuingType.LocalStrategy.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            f92131b = iArr2;
        }
    }

    @Inject
    public OgvCurrentEpisodeRepository(@NotNull Context context, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull Gu0.a aVar, @NotNull CoroutineScope coroutineScope, @NotNull s sVar, @NotNull InterfaceC6206j interfaceC6206j, @NotNull C8043a c8043a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull PageAdRepository pageAdRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull j jVar, @NotNull OgvSeason ogvSeason, @NotNull t tVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull C7893a c7893a, @NotNull PreloadRepository preloadRepository, @NotNull wv0.a aVar2, @NotNull PageReportService pageReportService, @NotNull Provider provider, @Nullable String str) {
        this.f92099a = context;
        this.f92100b = theseusCastScreenRepository;
        this.f92101c = aVar;
        this.f92102d = coroutineScope;
        this.f92103e = sVar;
        this.f92104f = interfaceC6206j;
        this.f92105g = c8043a;
        this.h = pageBackgroundPlayRepository;
        this.f92106i = pageAdRepository;
        this.f92107j = pageNestedScrollFusionRepository;
        this.f92108k = jVar;
        this.f92109l = ogvSeason;
        this.f92110m = tVar;
        this.f92111n = dVar;
        this.f92112o = c7893a;
        this.f92113p = preloadRepository;
        this.f92114q = aVar2;
        this.f92115r = pageReportService;
        this.f92116s = provider;
        this.f92117t = str;
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.C0683b.f92126a);
        this.f92118u = MutableStateFlow;
        this.f92119v = new OgvCurrentEpisodeRepository$special$$inlined$map$1(MutableStateFlow, this);
        this.f92120w = StateFlowKt.MutableStateFlow((Object) null);
        this.f92121x = ContinuingType.NotContinuing;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    public static OgvEpisode d(b bVar) {
        OgvEpisode ogvEpisode;
        if (bVar instanceof b.c) {
            ogvEpisode = ((b.c) bVar).f92128b.f92122a;
        } else if (bVar instanceof b.a) {
            ogvEpisode = ((b.a) bVar).f92125a.f92122a;
        } else {
            if (!(bVar instanceof b.C0683b)) {
                throw new NoWhenBranchMatchedException();
            }
            ogvEpisode = null;
        }
        return ogvEpisode;
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [com.bilibili.ship.theseus.ogv.ep.a] */
    public static boolean h(final OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, final OgvEpisode ogvEpisode, i iVar, ContinuingType continuingType, ev0.l lVar, int i7, int i8) {
        C8043a c8043a;
        MutableStateFlow<C8044b> mutableStateFlow;
        Object value;
        MutableStateFlow<C8044b> mutableStateFlow2;
        Object value2;
        com.bilibili.ship.theseus.united.report.b bVarB;
        if ((i8 & 2) != 0) {
            iVar = null;
        }
        if ((i8 & 4) != 0) {
            continuingType = ContinuingType.NotContinuing;
        }
        if ((i8 & 8) != 0) {
            lVar = null;
        }
        boolean z6 = false;
        if ((i8 & 16) != 0) {
            i7 = 0;
        }
        ogvCurrentEpisodeRepository.getClass();
        BLog.i("OgvCurrentEpisodeRepository-switchEpisode-Zm-eImI", "[theseus-ogv-OgvCurrentEpisodeRepository-switchEpisode-Zm-eImI] " + ("episode: " + ogvEpisode + ", continuingType: " + continuingType));
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        if (ogvEpisodeC == null || ogvEpisode.f93555a != ogvEpisodeC.f93555a) {
            final ContinuingType continuingType2 = continuingType;
            ?? r02 = new Function1(ogvCurrentEpisodeRepository, continuingType2, ogvEpisode) { // from class: com.bilibili.ship.theseus.ogv.ep.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvCurrentEpisodeRepository f92154a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ContinuingType f92155b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final OgvEpisode f92156c;

                {
                    this.f92154a = ogvCurrentEpisodeRepository;
                    this.f92155b = continuingType2;
                    this.f92156c = ogvEpisode;
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
                    String strA;
                    String str;
                    C8044b c8044b = (C8044b) obj;
                    this.f92154a.getClass();
                    int i9 = OgvCurrentEpisodeRepository.c.f92131b[this.f92155b.ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        strA = "united.player-video-detail.player.continue";
                    } else {
                        OgvEpisode ogvEpisode2 = this.f92156c;
                        String strA2 = E.a(ogvEpisode2.f93553I + 1, ogvEpisode2.f93554J, UtilsKt.DOT);
                        switch (OgvCurrentEpisodeRepository.c.f92130a[ogvEpisode2.f93572s.ordinal()]) {
                            case 1:
                                strA = C3259x.a(ogvEpisode2.f93553I + 1, "united.player-video-detail.episode.");
                                break;
                            case 2:
                                str = "united.player-video-detail.trailer-";
                                strA = C4496a.a(str, strA2);
                                break;
                            case 3:
                                str = "united.player-video-detail.video-strip-";
                                strA = C4496a.a(str, strA2);
                                break;
                            case 4:
                                str = "united.player-video-detail.others-";
                                strA = C4496a.a(str, strA2);
                                break;
                            case 5:
                                str = "united.player-video-detail.pugv-";
                                strA = C4496a.a(str, strA2);
                                break;
                            case 6:
                                str = "united.player-video-detail.section-";
                                strA = C4496a.a(str, strA2);
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                    return C8044b.a(c8044b, null, strA, null, null, 0, SearchBangumiItem.TYPE_FULLNET_TV);
                }
            };
            do {
                c8043a = ogvCurrentEpisodeRepository.f92105g;
                mutableStateFlow = c8043a.f123876a;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, r02.invoke(value)));
            ogvCurrentEpisodeRepository.f92121x = continuingType;
            if (ogvCurrentEpisodeRepository.f92100b.c()) {
                ogvCurrentEpisodeRepository.a(ogvEpisode);
            } else {
                do {
                    mutableStateFlow2 = c8043a.f123876a;
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, C8044b.a((C8044b) value2, null, null, null, null, (lVar == null || (bVarB = C7013f.b(lVar)) == null) ? i7 : bVarB.f104838a, 63)));
                ogvCurrentEpisodeRepository.j(ogvEpisode, iVar, lVar);
            }
            z6 = true;
        } else {
            BLog.i("OgvCurrentEpisodeRepository-switchEpisode-Zm-eImI", "[theseus-ogv-OgvCurrentEpisodeRepository-switchEpisode-Zm-eImI] Same episode, do nothing.");
        }
        return z6;
    }

    public static final void k(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, OgvEpisode ogvEpisode, GeminiCommonPlayableParams geminiCommonPlayableParams, i iVar, com.bilibili.ship.theseus.keel.player.e eVar) {
        j jVar = ogvCurrentEpisodeRepository.f92108k;
        long jA = ogvEpisode.a();
        f.d dVar = new f.d(geminiCommonPlayableParams, eVar != null);
        BusinessType businessType = BusinessType.OGV;
        C8043a c8043a = ogvCurrentEpisodeRepository.f92105g;
        j.a aVar = new j.a(jA, ogvEpisode.f93561g, dVar, businessType, iVar, c8043a.a().f123881c, c8043a.a().f123879a, c8043a.a().f123882d, null, null, false, eVar, ogvCurrentEpisodeRepository.f92117t, 512);
        aVar.m10995setTagpIAwiHE(k.f117670a.a, CompletableDeferredKt.CompletableDeferred(ogvCurrentEpisodeRepository.f92116s.get()));
        jVar.g(aVar);
    }

    public static void l(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, int i7) {
        ContinuingType continuingType = ContinuingType.NotContinuing;
        ogvCurrentEpisodeRepository.getClass();
        BLog.i("OgvCurrentEpisodeRepository-switchSectionFirstEpisode-Zi2ab04", "[theseus-ogv-OgvCurrentEpisodeRepository-switchSectionFirstEpisode-Zi2ab04] " + ("continuingType: " + continuingType));
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        OgvEpisode ogvEpisodeB = ogvCurrentEpisodeRepository.f92101c.b(ogvEpisodeC != null ? ogvEpisodeC.f93555a : 0L);
        if (ogvEpisodeB != null) {
            h(ogvCurrentEpisodeRepository, ogvEpisodeB, null, continuingType, null, i7, 10);
        }
    }

    public static void m(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, int i7) {
        ContinuingType continuingType = ContinuingType.NotContinuing;
        ogvCurrentEpisodeRepository.getClass();
        BLog.i("OgvCurrentEpisodeRepository-switchSectionLastEpisode-Zi2ab04", "[theseus-ogv-OgvCurrentEpisodeRepository-switchSectionLastEpisode-Zi2ab04] " + ("continuingType: " + continuingType));
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        OgvEpisode ogvEpisodeC2 = ogvCurrentEpisodeRepository.f92101c.c(ogvEpisodeC != null ? ogvEpisodeC.f93555a : 0L);
        if (ogvEpisodeC2 != null) {
            h(ogvCurrentEpisodeRepository, ogvEpisodeC2, null, continuingType, null, i7, 10);
        }
    }

    public static void n(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, int i7) {
        OgvEpisode ogvEpisodeD;
        ContinuingType continuingType = ContinuingType.NotContinuing;
        ogvCurrentEpisodeRepository.getClass();
        BLog.i("OgvCurrentEpisodeRepository-switchSectionNextEpisode-Zi2ab04", "[theseus-ogv-OgvCurrentEpisodeRepository-switchSectionNextEpisode-Zi2ab04] " + ("continuingType: " + continuingType));
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        if (ogvEpisodeC == null || (ogvEpisodeD = ogvCurrentEpisodeRepository.f92101c.d(ogvEpisodeC.f93555a)) == null) {
            return;
        }
        h(ogvCurrentEpisodeRepository, ogvEpisodeD, null, continuingType, null, i7, 10);
    }

    public static void o(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, int i7) {
        OgvEpisode ogvEpisodeF;
        ContinuingType continuingType = ContinuingType.NotContinuing;
        ogvCurrentEpisodeRepository.getClass();
        BLog.i("OgvCurrentEpisodeRepository-switchSectionPreviousEpisode-Zi2ab04", "[theseus-ogv-OgvCurrentEpisodeRepository-switchSectionPreviousEpisode-Zi2ab04] " + ("continuingType: " + continuingType));
        OgvEpisode ogvEpisodeC = ogvCurrentEpisodeRepository.c();
        if (ogvEpisodeC == null || (ogvEpisodeF = ogvCurrentEpisodeRepository.f92101c.f(ogvEpisodeC.f93555a)) == null) {
            return;
        }
        h(ogvCurrentEpisodeRepository, ogvEpisodeF, null, continuingType, null, i7, 10);
    }

    public final void a(@NotNull OgvEpisode ogvEpisode) {
        p(new b.a(b(ogvEpisode)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository.a b(com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r7) {
        /*
            r6 = this;
            r0 = r7
            long r0 = r0.f93555a
            r8 = r0
            r0 = r6
            Gu0.a r0 = r0.f92101c
            r10 = r0
            r0 = r10
            r1 = r8
            boolean r0 = r0.n(r1)
            if (r0 == 0) goto L26
            r0 = r10
            java.util.List<com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode> r0 = r0.f7437d
            r1 = r10
            com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection r1 = r1.f7436c
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r10 = r0
            goto L54
        L26:
            r0 = r10
            r1 = r7
            long r1 = r1.f93555a
            com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection r0 = r0.g(r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L46
            r0 = r12
            java.util.List<com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode> r0 = r0.h
            r11 = r0
            r0 = r11
            r10 = r0
            r0 = r11
            if (r0 != 0) goto L4b
        L46:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r10 = r0
        L4b:
            r0 = r10
            r1 = r12
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r10 = r0
        L54:
            com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$a r0 = new com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$a
            r1 = r0
            r2 = r7
            r3 = r10
            java.lang.Object r3 = r3.component1()
            java.util.List r3 = (java.util.List) r3
            r4 = r10
            java.lang.Object r4 = r4.component2()
            com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection r4 = (com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeSection) r4
            r1.<init>(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository.b(com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode):com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$a");
    }

    @Nullable
    public final OgvEpisode c() {
        return d((b) this.f92118u.getValue());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final List<OgvEpisode> e() throws NoWhenBranchMatchedException {
        List<OgvEpisode> listEmptyList;
        b bVar = (b) this.f92118u.getValue();
        if (bVar instanceof b.c) {
            listEmptyList = ((b.c) bVar).f92128b.f92123b;
        } else if (bVar instanceof b.a) {
            listEmptyList = ((b.a) bVar).f92125a.f92123b;
        } else {
            if (!(bVar instanceof b.C0683b)) {
                throw new NoWhenBranchMatchedException();
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    public final boolean f() {
        OgvEpisode ogvEpisodeC = c();
        boolean z6 = false;
        if (ogvEpisodeC != null) {
            z6 = false;
            if (this.f92101c.d(ogvEpisodeC.f93555a) != null) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean g() {
        OgvEpisode ogvEpisodeC = c();
        boolean z6 = false;
        if (ogvEpisodeC != null) {
            z6 = false;
            if (this.f92101c.f(ogvEpisodeC.f93555a) != null) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean i(long j7, @NotNull ContinuingType continuingType, int i7) {
        defpackage.a.b("[theseus-ogv-OgvCurrentEpisodeRepository-switchEpisodeByEpId-vhgDark] ", "epId: " + j7 + ", continuingType: " + continuingType, "OgvCurrentEpisodeRepository-switchEpisodeByEpId-vhgDark");
        OgvEpisode ogvEpisodeI = this.f92101c.i(j7);
        if (ogvEpisodeI == null) {
            return false;
        }
        return h(this, ogvEpisodeI, null, continuingType, null, i7, 10);
    }

    public final void j(@NotNull OgvEpisode ogvEpisode, @Nullable i iVar, @Nullable ev0.l lVar) {
        C8043a c8043a = this.f92105g;
        if (lVar != null) {
            j.a aVar = new j.a(ogvEpisode.a(), ogvEpisode.f93561g, new f.e(lVar), BusinessType.OGV, null, c8043a.a().f123881c, c8043a.a().f123879a, c8043a.a().f123882d, null, null, false, null, this.f92117t, 2560);
            aVar.m10995setTagpIAwiHE(k.f117670a.a, CompletableDeferredKt.CompletableDeferred(this.f92116s.get()));
            this.f92108k.g(aVar);
            return;
        }
        GeminiCommonPlayableParams geminiCommonPlayableParamsA = OgvSupplementService.a.a(this.f92099a, this.f92109l, ogvEpisode, this.f92110m, null, this.h.g(), c8043a.a().f123885g, this.f92105g, this.f92111n, this.f92106i, false, this.f92114q.f129026b, this.f92115r.f102492e, false, this.f92117t, 9216);
        if (this.f92113p.b(ogvEpisode.a(), ogvEpisode.f93561g) == null) {
            k(this, ogvEpisode, geminiCommonPlayableParamsA, iVar, null);
        } else {
            BuildersKt.launch$default(this.f92102d, (CoroutineContext) null, (CoroutineStart) null, new OgvCurrentEpisodeRepository$switchMediaPlayEpisode$1(this, ogvEpisode, geminiCommonPlayableParamsA, iVar, null), 3, (Object) null);
        }
    }

    public final void p(b bVar) {
        MutableStateFlow<b> mutableStateFlow = this.f92118u;
        b bVar2 = (b) mutableStateFlow.getValue();
        mutableStateFlow.setValue(bVar);
        defpackage.a.b("[theseus-ogv-OgvCurrentEpisodeRepository-updateEpisodeRunningState] ", "updateEpisodeRunningState to " + bVar + " from " + bVar2, "OgvCurrentEpisodeRepository-updateEpisodeRunningState");
    }
}
