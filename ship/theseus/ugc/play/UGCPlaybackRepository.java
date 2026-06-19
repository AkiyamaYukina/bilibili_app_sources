package com.bilibili.ship.theseus.ugc.play;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.ship.theseus.ugc.e;
import com.bilibili.ship.theseus.ugc.m;
import com.bilibili.ship.theseus.ugc.play.UGCSupplementService;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.h;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import com.tencent.connect.common.Constants;
import ev0.C7013f;
import ev0.i;
import ev0.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository.class */
@StabilityInferred(parameters = 0)
public final class UGCPlaybackRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Flow<l> f98058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f98059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f98060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f98061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f98062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f98063g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f98064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final t f98065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final m f98066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final e f98067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f98068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C7893a f98069n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final Deferred<Unit> f98070o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final Lifecycle f98071p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final wv0.a f98072q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final PageReportService f98073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final PreloadRepository f98074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f98075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository$special$$inlined$map$1 f98076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Job f98077v;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCPlaybackRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$1$1.class */
        public static final class C09021 extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCPlaybackRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09021(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super C09021> continuation) {
                super(2, continuation);
                this.this$0 = uGCPlaybackRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09021 c09021 = new C09021(this.this$0, continuation);
                c09021.L$0 = obj;
                return c09021;
            }

            public final Object invoke(l lVar, Continuation<? super Unit> continuation) {
                return create(lVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                l lVar = (l) this.L$0;
                a.b bVar = a.b.f98079a;
                if (lVar == null) {
                    this.this$0.i(bVar);
                } else {
                    Iterator<Av0.a> it = this.this$0.f98063g.iterator();
                    int i7 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i7 = -1;
                            break;
                        }
                        if (it.next().f591b == lVar.f104528b) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 < 0) {
                        BLog.e("UGCPlaybackRepository$1$1-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$1$1-invokeSuspend] ugc episode not found!", (Throwable) null);
                        this.this$0.i(bVar);
                        return Unit.INSTANCE;
                    }
                    Av0.a aVar = this.this$0.f98063g.get(i7);
                    b bVar2 = new b(aVar, i7);
                    if (this.this$0.f98060d.c()) {
                        defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$1$1-invokeSuspend] ", "update to CastPlaying cause of media change(" + aVar + ")", "UGCPlaybackRepository$1$1-invokeSuspend");
                        this.this$0.i(new a.C0903a(bVar2));
                    } else {
                        defpackage.a.b("[theseus-ugc-UGCPlaybackRepository$1$1-invokeSuspend] ", "update to MediaPlaying cause of media change(" + aVar + ")", "UGCPlaybackRepository$1$1-invokeSuspend");
                        this.this$0.i(new a.c(lVar.f104529c, bVar2));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCPlaybackRepository;
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
                UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
                Flow<l> flow = uGCPlaybackRepository.f98058b;
                C09021 c09021 = new C09021(uGCPlaybackRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c09021, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCPlaybackRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UGCPlaybackRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uGCPlaybackRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException, KotlinNothingValueException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ResultKt.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                a aVar = (a) this.L$0;
                if (aVar instanceof a.b) {
                    BLog.i("UGCPlaybackRepository$2$1-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$2$1-invokeSuspend] ep state is idle");
                } else {
                    if (aVar instanceof a.c) {
                        this.label = 1;
                        if (UGCPlaybackRepository.a(this.this$0, (a.c) aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw new KotlinNothingValueException();
                    }
                    if (!(aVar instanceof a.C0903a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
                    this.label = 2;
                    uGCPlaybackRepository.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new UGCPlaybackRepository$driveCastScreenEpScope$2(uGCPlaybackRepository, (a.C0903a) aVar, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = uGCPlaybackRepository;
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
                UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
                MutableStateFlow<a> mutableStateFlow = uGCPlaybackRepository.f98075t;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(uGCPlaybackRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCPlaybackRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = uGCPlaybackRepository;
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
                Deferred<Unit> deferred = this.this$0.f98070o;
                this.label = 1;
                if (deferred.await(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BLog.i("UGCPlaybackRepository$3-invokeSuspend", "[theseus-ugc-UGCPlaybackRepository$3-invokeSuspend] about to leave ugc video cancel media collect");
            Job job = this.this$0.f98077v;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
            uGCPlaybackRepository.f98077v = null;
            uGCPlaybackRepository.i(a.b.f98079a);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCPlaybackRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UGCPlaybackRepository uGCPlaybackRepository, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = uGCPlaybackRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UGCPlaybackRepository uGCPlaybackRepository = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(uGCPlaybackRepository.f98060d.f99128e, new UGCPlaybackRepository$collectCastScreenAction$2(uGCPlaybackRepository, null), this);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$a$a.class */
        @StabilityInferred(parameters = 0)
        public static final class C0903a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final b f98078a;

            public C0903a(@NotNull b bVar) {
                this.f98078a = bVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0903a) && Intrinsics.areEqual(this.f98078a, ((C0903a) obj).f98078a);
            }

            public final int hashCode() {
                return this.f98078a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "CastPlaying(runningData=" + this.f98078a + ")";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f98079a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$a$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.keel.player.j f98080a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final b f98081b;

            public c(@NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull b bVar) {
                this.f98080a = jVar;
                this.f98081b = bVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f98080a, cVar.f98080a) && Intrinsics.areEqual(this.f98081b, cVar.f98081b);
            }

            public final int hashCode() {
                return this.f98081b.hashCode() + (this.f98080a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "MediaPlaying(playable=" + this.f98080a + ", runningData=" + this.f98081b + ")";
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/UGCPlaybackRepository$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Av0.a f98082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f98083b;

        public b(@NotNull Av0.a aVar, int i7) {
            this.f98082a = aVar;
            this.f98083b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f98082a, bVar.f98082a) && this.f98083b == bVar.f98083b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f98083b) + (this.f98082a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "UGCEpRunningData(unitedEpisode=" + this.f98082a + ", index=" + this.f98083b + ")";
        }
    }

    @Inject
    public UGCPlaybackRepository(@NotNull CoroutineScope coroutineScope, @NotNull Flow<l> flow, @NotNull j jVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull C8043a c8043a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull List<Av0.a> list, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull t tVar, @NotNull m mVar, @NotNull e eVar, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull C7893a c7893a, @NotNull Deferred<Unit> deferred, @NotNull Lifecycle lifecycle, @NotNull wv0.a aVar2, @NotNull PageReportService pageReportService, @NotNull PreloadRepository preloadRepository) {
        this.f98057a = coroutineScope;
        this.f98058b = flow;
        this.f98059c = jVar;
        this.f98060d = theseusCastScreenRepository;
        this.f98061e = c8043a;
        this.f98062f = pageBackgroundPlayRepository;
        this.f98063g = list;
        this.h = aVar;
        this.f98064i = dVar;
        this.f98065j = tVar;
        this.f98066k = mVar;
        this.f98067l = eVar;
        this.f98068m = pageNestedScrollFusionRepository;
        this.f98069n = c7893a;
        this.f98070o = deferred;
        this.f98071p = lifecycle;
        this.f98072q = aVar2;
        this.f98073r = pageReportService;
        this.f98074s = preloadRepository;
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.b.f98079a);
        this.f98075t = MutableStateFlow;
        this.f98076u = new UGCPlaybackRepository$special$$inlined$map$1(MutableStateFlow, this);
        this.f98077v = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository r6, com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository.a.c r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r0 = r8
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$1
            if (r0 == 0) goto L2e
            r0 = r8
            com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$1 r0 = (com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$1) r0
            r10 = r0
            r0 = r10
            int r0 = r0.label
            r9 = r0
            r0 = r9
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2e
            r0 = r10
            r1 = r9
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r10
            r8 = r0
            goto L38
        L2e:
            com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$1 r0 = new com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            r8 = r0
        L38:
            r0 = r8
            java.lang.Object r0 = r0.result
            r11 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r8
            int r0 = r0.label
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L63
            r0 = r9
            r1 = 1
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            goto L85
        L63:
            r0 = r11
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$2 r0 = new com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$driveMediaPlayingEpScope$2
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = 0
            r1.<init>(r2, r3, r4)
            r6 = r0
            r0 = r8
            r1 = 1
            r0.label = r1
            r0 = r6
            r1 = r8
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r10
            if (r0 != r1) goto L85
            r0 = r10
            return r0
        L85:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository.a(com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository, com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository$a$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static Av0.a d(a aVar) throws NoWhenBranchMatchedException {
        Av0.a aVar2;
        if (aVar instanceof a.c) {
            aVar2 = ((a.c) aVar).f98081b.f98082a;
        } else if (aVar instanceof a.C0903a) {
            aVar2 = ((a.C0903a) aVar).f98078a.f98082a;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2 = null;
        }
        return aVar2;
    }

    public static void g(UGCPlaybackRepository uGCPlaybackRepository, long j7, long j8, i iVar, ev0.l lVar, int i7, int i8) {
        Object next;
        if ((i8 & 4) != 0) {
            iVar = null;
        }
        if ((i8 & 8) != 0) {
            lVar = null;
        }
        if ((i8 & 16) != 0) {
            i7 = 0;
        }
        Iterator<T> it = uGCPlaybackRepository.f98063g.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Av0.a aVar = (Av0.a) next;
            if (aVar.f590a == j7 && aVar.f591b == j8) {
                break;
            }
        }
        Av0.a aVar2 = (Av0.a) next;
        if (aVar2 != null) {
            uGCPlaybackRepository.f(aVar2, iVar, lVar, i7);
            return;
        }
        StringBuilder sbA = z.a(j7, "can not switch to ep with avid:", ", cid:");
        sbA.append(j8);
        f.a("[theseus-ugc-UGCPlaybackRepository-switchToNewEpisode-Zm-eImI] ", sbA.toString(), "UGCPlaybackRepository-switchToNewEpisode-Zm-eImI", (Throwable) null);
    }

    public static final void h(Av0.a aVar, UGCPlaybackRepository uGCPlaybackRepository, int i7, i iVar, com.bilibili.ship.theseus.keel.player.e eVar) {
        long j7 = aVar.f590a;
        String str = uGCPlaybackRepository.f98063g.size() > 1 ? aVar.f593d : aVar.f598j;
        String str2 = uGCPlaybackRepository.h.f104046l;
        C8043a c8043a = uGCPlaybackRepository.f98061e;
        int i8 = c8043a.a().f123885g;
        String strG = uGCPlaybackRepository.f98062f.g();
        h hVar = uGCPlaybackRepository.f98065j.f104126b;
        uGCPlaybackRepository.f98059c.g(new j.a(aVar.f590a, aVar.f591b, new f.d(UGCSupplementService.a.a(j7, aVar.f591b, i7, str, str2, i8, strG, aVar.f596g, hVar.f104087b, null, uGCPlaybackRepository.f98072q.f129026b, uGCPlaybackRepository.f98064i, uGCPlaybackRepository.f98061e, uGCPlaybackRepository.f98073r.f102492e, false, null), eVar != null), BusinessType.UGC, iVar, c8043a.a().f123881c, c8043a.a().f123879a, c8043a.a().f123882d, c8043a.a().f123884f, null, false, eVar, null, 4608));
    }

    public final int b() {
        Iterator<Av0.a> it = this.f98063g.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            Av0.a next = it.next();
            Av0.a aVarC = c();
            if (aVarC != null && next.f591b == aVarC.f591b) {
                break;
            }
            i7++;
        }
        return i7;
    }

    @Nullable
    public final Av0.a c() {
        return d((a) this.f98075t.getValue());
    }

    public final void e(long j7, long j8) {
        Iterator<Av0.a> it = this.f98063g.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            Av0.a next = it.next();
            if (next.f590a == j7 && next.f591b == j8) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            StringBuilder sbA = z.a(j7, "can not switch to ep with avid:", ", cid:");
            sbA.append(j8);
            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-ugc-UGCPlaybackRepository-switchToNewCastScreen] ", sbA.toString(), "UGCPlaybackRepository-switchToNewCastScreen", (Throwable) null);
            return;
        }
        b bVar = new b(this.f98063g.get(i7), i7);
        BLog.i("UGCPlaybackRepository-switchToNewCastScreen", "[theseus-ugc-UGCPlaybackRepository-switchToNewCastScreen] " + ("update to CastPlaying cause of switchToNewCastScreen(" + bVar + ")"));
        i(new a.C0903a(bVar));
    }

    public final void f(@NotNull Av0.a aVar, @Nullable i iVar, @Nullable ev0.l lVar, int i7) {
        C8043a c8043a;
        MutableStateFlow<C8044b> mutableStateFlow;
        Object value;
        com.bilibili.ship.theseus.united.report.b bVarB;
        boolean zC = this.f98060d.c();
        long j7 = aVar.f590a;
        long j8 = aVar.f591b;
        if (zC) {
            e(j7, j8);
            return;
        }
        do {
            c8043a = this.f98061e;
            mutableStateFlow = c8043a.f123876a;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C8044b.a((C8044b) value, null, null, null, null, (lVar == null || (bVarB = C7013f.b(lVar)) == null) ? i7 : bVarB.f104838a, 63)));
        if (lVar != null) {
            this.f98059c.g(new j.a(aVar.f590a, aVar.f591b, new f.e(lVar), BusinessType.UGC, null, c8043a.a().f123881c, c8043a.a().f123879a, c8043a.a().f123882d, c8043a.a().f123884f, null, false, null, null, Constants.CODE_REQUEST_MAX));
            return;
        }
        Iterator<Av0.a> it = this.f98063g.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            } else if (it.next().f591b == j8) {
                break;
            } else {
                i8++;
            }
        }
        if (this.f98074s.b(j7, j8) != null) {
            BuildersKt.launch$default(this.f98057a, (CoroutineContext) null, (CoroutineStart) null, new UGCPlaybackRepository$switchToNewEpisode$2(this, aVar, i8, iVar, null), 3, (Object) null);
        } else {
            h(aVar, this, i8, iVar, null);
        }
    }

    public final void i(a aVar) {
        MutableStateFlow<a> mutableStateFlow = this.f98075t;
        a aVar2 = (a) mutableStateFlow.getValue();
        mutableStateFlow.setValue(aVar);
        defpackage.a.b("[theseus-ugc-UGCPlaybackRepository-updateEpisodeRunningState] ", "updateEpisodeRunningState to " + aVar + ", from " + aVar2, "UGCPlaybackRepository-updateEpisodeRunningState");
    }
}
