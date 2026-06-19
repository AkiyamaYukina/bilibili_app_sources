package com.bilibili.ship.theseus.cheese.player.play;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.lifecycle.Lifecycle;
import au0.C4911a;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.bangumi.logic.page.detail.service.f;
import com.bilibili.lib.projection.ProjectionClient;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.ship.theseus.cheese.di.h;
import com.bilibili.ship.theseus.cheese.player.play.CheeseSupplementService;
import com.bilibili.ship.theseus.keel.player.e;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.d;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.mediaplay.f;
import com.bilibili.ship.theseus.united.player.mediaplay.l;
import com.tencent.connect.common.Constants;
import eu0.C6985d;
import ev0.C7013f;
import ev0.InterfaceC7008a;
import ev0.i;
import ev0.j;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import mv0.C8043a;
import mv0.C8044b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository.class */
@StabilityInferred(parameters = 0)
public final class CheesePlayRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Flow<l> f90674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final j f90675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f90676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C4911a f90677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f90678g;

    @NotNull
    public final t h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f90679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.di.d f90680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageNestedScrollFusionRepository f90681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f90682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C7893a f90683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PreloadRepository f90684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f90685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f90686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Lifecycle f90687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final wv0.a f90688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final PageReportService f90689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final C8043a f90690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final List<C6985d> f90691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<C6985d> f90692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final SharedFlow<C6985d> f90693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<b> f90694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository$special$$inlined$map$1 f90695y;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePlayRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$1$1.class */
        public static final class C06631 extends SuspendLambda implements Function2<l, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheesePlayRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06631(CheesePlayRepository cheesePlayRepository, Continuation<? super C06631> continuation) {
                super(2, continuation);
                this.this$0 = cheesePlayRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06631 c06631 = new C06631(this.this$0, continuation);
                c06631.L$0 = obj;
                return c06631;
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
                b.C0664b c0664b = b.C0664b.f90699a;
                if (lVar == null) {
                    this.this$0.f90694x.setValue(c0664b);
                    return Unit.INSTANCE;
                }
                Iterator<C6985d> it = this.this$0.f90691u.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (it.next().f117511f == lVar.f104528b) {
                        break;
                    }
                    i7++;
                }
                if (i7 < 0) {
                    BLog.e("CheesePlayRepository$1$1-invokeSuspend", "[theseus-cheese-CheesePlayRepository$1$1-invokeSuspend] pugv episode not found!", (Throwable) null);
                    this.this$0.k(c0664b);
                    return Unit.INSTANCE;
                }
                this.this$0.k(new b.c(lVar.f104529c, new a(this.this$0.f90691u.get(i7), i7)));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheesePlayRepository cheesePlayRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheesePlayRepository;
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
                CheesePlayRepository cheesePlayRepository = this.this$0;
                Flow<l> flow = cheesePlayRepository.f90674c;
                C06631 c06631 = new C06631(cheesePlayRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c06631, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePlayRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final CheesePlayRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheesePlayRepository cheesePlayRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cheesePlayRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                    if (bVar instanceof b.C0664b) {
                        BLog.i("CheesePlayRepository$2$1-invokeSuspend", "[theseus-cheese-CheesePlayRepository$2$1-invokeSuspend] ep state is idle");
                    } else if (bVar instanceof b.c) {
                        CheesePlayRepository cheesePlayRepository = this.this$0;
                        this.label = 1;
                        cheesePlayRepository.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CheesePlayRepository$driveMediaPlayingEpScope$2(cheesePlayRepository, (b.c) bVar, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (!(bVar instanceof b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CheesePlayRepository cheesePlayRepository2 = this.this$0;
                        this.label = 2;
                        cheesePlayRepository2.getClass();
                        Object objCoroutineScope2 = CoroutineScopeKt.coroutineScope(new CheesePlayRepository$driveCastScreenEpScope$2(cheesePlayRepository2, (b.a) bVar, null), this);
                        if (objCoroutineScope2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope2 = Unit.INSTANCE;
                        }
                        if (objCoroutineScope2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass2(CheesePlayRepository cheesePlayRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = cheesePlayRepository;
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
                CheesePlayRepository cheesePlayRepository = this.this$0;
                MutableStateFlow<b> mutableStateFlow = cheesePlayRepository.f90694x;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheesePlayRepository, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheesePlayRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(CheesePlayRepository cheesePlayRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = cheesePlayRepository;
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
                CheesePlayRepository cheesePlayRepository = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(cheesePlayRepository.f90676e.f99128e, new CheesePlayRepository$collectCastScreenAction$2(cheesePlayRepository, null), this);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C6985d f90696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90697b;

        public a(@NotNull C6985d c6985d, int i7) {
            this.f90696a = c6985d;
            this.f90697b = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f90696a, aVar.f90696a) && this.f90697b == aVar.f90697b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f90697b) + (this.f90696a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "EpRunningData(episode=" + this.f90696a + ", index=" + this.f90697b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$b$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final a f90698a;

            public a(@NotNull a aVar) {
                this.f90698a = aVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Intrinsics.areEqual(this.f90698a, ((a) obj).f90698a);
            }

            public final int hashCode() {
                return this.f90698a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "CastPlaying(runningData=" + this.f90698a + ")";
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$b$b.class */
        @StabilityInferred(parameters = 1)
        public static final class C0664b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0664b f90699a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/play/CheesePlayRepository$b$c.class */
        @StabilityInferred(parameters = 0)
        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.keel.player.j f90700a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final a f90701b;

            public c(@NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull a aVar) {
                this.f90700a = jVar;
                this.f90701b = aVar;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.areEqual(this.f90700a, cVar.f90700a) && Intrinsics.areEqual(this.f90701b, cVar.f90701b);
            }

            public final int hashCode() {
                return this.f90701b.hashCode() + (this.f90700a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "MediaPlaying(playable=" + this.f90700a + ", runningData=" + this.f90701b + ")";
            }
        }
    }

    @Inject
    public CheesePlayRepository(@NotNull CoroutineScope coroutineScope, boolean z6, @NotNull Flow<l> flow, @NotNull j jVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull C4911a c4911a, @NotNull d dVar, @NotNull t tVar, @NotNull h hVar, @NotNull com.bilibili.ship.theseus.cheese.di.d dVar2, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.keel.player.h hVar2, @NotNull C7893a c7893a, @NotNull PreloadRepository preloadRepository, @NotNull InterfaceC7008a interfaceC7008a, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull Lifecycle lifecycle, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService, @NotNull C8043a c8043a, @NotNull List<C6985d> list) {
        this.f90672a = coroutineScope;
        this.f90673b = z6;
        this.f90674c = flow;
        this.f90675d = jVar;
        this.f90676e = theseusCastScreenRepository;
        this.f90677f = c4911a;
        this.f90678g = dVar;
        this.h = tVar;
        this.f90679i = hVar;
        this.f90680j = dVar2;
        this.f90681k = pageNestedScrollFusionRepository;
        this.f90682l = hVar2;
        this.f90683m = c7893a;
        this.f90684n = preloadRepository;
        this.f90685o = interfaceC7008a;
        this.f90686p = pageBackgroundPlayRepository;
        this.f90687q = lifecycle;
        this.f90688r = aVar;
        this.f90689s = pageReportService;
        this.f90690t = c8043a;
        this.f90691u = list;
        MutableSharedFlow<C6985d> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 5, BufferOverflow.DROP_OLDEST, 1, (Object) null);
        this.f90692v = mutableSharedFlowMutableSharedFlow$default;
        this.f90693w = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<b> MutableStateFlow = StateFlowKt.MutableStateFlow(b.C0664b.f90699a);
        this.f90694x = MutableStateFlow;
        this.f90695y = new CheesePlayRepository$special$$inlined$map$1(MutableStateFlow, this);
        new Pair(0L, Boolean.TRUE);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static C6985d b(b bVar) throws NoWhenBranchMatchedException {
        C6985d c6985d;
        if (bVar instanceof b.c) {
            c6985d = ((b.c) bVar).f90701b.f90696a;
        } else if (bVar instanceof b.a) {
            c6985d = ((b.a) bVar).f90698a.f90696a;
        } else {
            if (!(bVar instanceof b.C0664b)) {
                throw new NoWhenBranchMatchedException();
            }
            c6985d = null;
        }
        return c6985d;
    }

    public static void e(CheesePlayRepository cheesePlayRepository, long j7, long j8, int i7, int i8) {
        Object next;
        if ((i8 & 16) != 0) {
            i7 = 0;
        }
        Iterator<T> it = cheesePlayRepository.f90691u.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C6985d c6985d = (C6985d) next;
            if (c6985d.f117510e == j7 && c6985d.f117511f == j8) {
                break;
            }
        }
        C6985d c6985d2 = (C6985d) next;
        if (c6985d2 == null) {
            StringBuilder sbA = z.a(j7, "can not switch to ep with avid:", ", cid:");
            sbA.append(j8);
            f.a("[theseus-cheese-CheesePlayRepository-loadNewEpisode-Zm-eImI] ", sbA.toString(), "CheesePlayRepository-loadNewEpisode-Zm-eImI", (Throwable) null);
        } else if (!cheesePlayRepository.f90676e.c()) {
            cheesePlayRepository.h(c6985d2, null, null, i7);
        } else if (c6985d2.f117516l) {
            cheesePlayRepository.g(c6985d2.f117510e, c6985d2.f117511f);
        } else {
            BuildersKt.launch$default(cheesePlayRepository.f90672a, (CoroutineContext) null, (CoroutineStart) null, new CheesePlayRepository$loadNewEpisode$1(cheesePlayRepository, c6985d2, null, null, i7, null), 3, (Object) null);
        }
    }

    public static /* synthetic */ void i(CheesePlayRepository cheesePlayRepository, C6985d c6985d, i iVar, ev0.l lVar, int i7, int i8) {
        if ((i8 & 2) != 0) {
            iVar = null;
        }
        if ((i8 & 4) != 0) {
            lVar = null;
        }
        if ((i8 & 8) != 0) {
            i7 = 0;
        }
        cheesePlayRepository.h(c6985d, iVar, lVar, i7);
    }

    public static final void j(C6985d c6985d, GeminiCommonPlayableParams geminiCommonPlayableParams, i iVar, CheesePlayRepository cheesePlayRepository, e eVar) {
        long j7 = c6985d.f117510e;
        f.d dVar = new f.d(geminiCommonPlayableParams, eVar != null);
        BusinessType businessType = BusinessType.CHEESE;
        C4911a c4911a = cheesePlayRepository.f90677f;
        cheesePlayRepository.f90675d.g(new j.a(j7, c6985d.f117511f, dVar, businessType, iVar, c4911a.f54247l, c4911a.f54245j, c4911a.f54248m, null, null, false, eVar, null, 4608));
    }

    @Nullable
    public final C6985d a() {
        return b((b) this.f90694x.getValue());
    }

    @Nullable
    public final C6985d c(long j7) {
        Object next;
        Iterator<T> it = this.f90691u.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C6985d) next).f117511f == j7) {
                break;
            }
        }
        return (C6985d) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(@org.jetbrains.annotations.NotNull eu0.C6985d r4) {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.f90673b
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L14
            r0 = r6
            r5 = r0
            r0 = r4
            boolean r0 = r0.f117517m
            if (r0 != 0) goto L2a
        L14:
            r0 = r4
            boolean r0 = r0.f117517m
            if (r0 == 0) goto L28
            r0 = r4
            int r0 = r0.f117509d
            r1 = 1
            if (r0 != r1) goto L28
            r0 = r6
            r5 = r0
            goto L2a
        L28:
            r0 = 0
            r5 = r0
        L2a:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository.d(eu0.d):boolean");
    }

    public final void f() {
        long duration;
        WithVideoProgress withVideoProgressP;
        ProjectionClient.a clientState;
        TheseusCastScreenRepository theseusCastScreenRepository = this.f90676e;
        boolean zC = theseusCastScreenRepository.c();
        com.bilibili.ship.theseus.keel.player.h hVar = this.f90682l;
        if (zC) {
            ProjectionClient projectionClientA = theseusCastScreenRepository.a();
            if (projectionClientA == null || (clientState = projectionClientA.getClientState()) == null) {
                return;
            }
            long currentProgress = clientState.getCurrentProgress();
            Duration.Companion companion = Duration.Companion;
            duration = DurationKt.toDuration(currentProgress, DurationUnit.MILLISECONDS);
        } else {
            com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
            if (jVarJ == null) {
                return;
            }
            long jL = jVarJ.L();
            Duration.Companion companion2 = Duration.Companion;
            duration = DurationKt.toDuration(jL, DurationUnit.MILLISECONDS);
        }
        C6985d c6985dA = a();
        if (c6985dA == null || Duration.getInWholeSeconds-impl(c6985dA.f117529y) == -1) {
            return;
        }
        if (Duration.compareTo-LRDsOJo(duration, c6985dA.f117529y) <= 0) {
            BLog.i("CheesePlayRepository-notifyLastPlayedTime", "[theseus-cheese-CheesePlayRepository-notifyLastPlayedTime] current position is less than last played time, ignore");
            return;
        }
        com.bilibili.ship.theseus.keel.player.j jVarJ2 = hVar.j();
        Duration durationQ = (jVarJ2 == null || (withVideoProgressP = jVarJ2.p()) == null) ? null : withVideoProgressP.q();
        if (durationQ != null) {
            long j7 = Duration.minus-LRDsOJo(durationQ.unbox-impl(), duration);
            DurationUnit durationUnit = DurationUnit.SECONDS;
            if (Duration.compareTo-LRDsOJo(j7, DurationKt.toDuration(5, durationUnit)) <= 0) {
                duration = DurationKt.toDuration(-1, durationUnit);
            }
        }
        C6985d c6985d = new C6985d(c6985dA.f117506a, c6985dA.f117507b, c6985dA.f117508c, c6985dA.f117509d, c6985dA.f117510e, c6985dA.f117511f, c6985dA.f117512g, c6985dA.h, c6985dA.f117513i, c6985dA.f117514j, c6985dA.f117515k, c6985dA.f117516l, c6985dA.f117517m, c6985dA.f117518n, c6985dA.f117519o, c6985dA.f117520p, c6985dA.f117521q, c6985dA.f117522r, c6985dA.f117523s, c6985dA.f117524t, c6985dA.f117525u, c6985dA.f117526v, c6985dA.f117527w, c6985dA.f117528x, duration, c6985dA.f117530z);
        c6985dA.f117529y = duration;
        this.f90692v.tryEmit(c6985d);
    }

    public final void g(long j7, long j8) {
        if (!this.f90676e.c()) {
            BLog.w("CheesePlayRepository-switchToNewCastScreen", "[theseus-cheese-CheesePlayRepository-switchToNewCastScreen] can not switch to cast screen when not in cast screen mode", (Throwable) null);
            return;
        }
        Iterator<C6985d> it = this.f90691u.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            C6985d next = it.next();
            if (next.f117510e == j7 && next.f117511f == j8) {
                break;
            } else {
                i7++;
            }
        }
        f();
        if (i7 != -1) {
            k(new b.a(new a(this.f90691u.get(i7), i7)));
            return;
        }
        StringBuilder sbA = z.a(j7, "can not switch to ep with avid:", ", cid:");
        sbA.append(j8);
        com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-cheese-CheesePlayRepository-switchToNewCastScreen] ", sbA.toString(), "CheesePlayRepository-switchToNewCastScreen", (Throwable) null);
    }

    public final void h(@NotNull C6985d c6985d, @Nullable i iVar, @Nullable ev0.l lVar, int i7) {
        C8043a c8043a;
        MutableStateFlow<C8044b> mutableStateFlow;
        Object value;
        com.bilibili.ship.theseus.united.report.b bVarB;
        if (this.f90676e.c()) {
            g(c6985d.f117510e, c6985d.f117511f);
            return;
        }
        f();
        do {
            c8043a = this.f90690t;
            mutableStateFlow = c8043a.f123876a;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C8044b.a((C8044b) value, null, null, null, null, (lVar == null || (bVarB = C7013f.b(lVar)) == null) ? i7 : bVarB.f104838a, 63)));
        if (lVar != null) {
            long j7 = c6985d.f117510e;
            f.e eVar = new f.e(lVar);
            BusinessType businessType = BusinessType.CHEESE;
            C4911a c4911a = this.f90677f;
            this.f90675d.g(new j.a(j7, c6985d.f117511f, eVar, businessType, null, c4911a.f54247l, c4911a.f54245j, c4911a.f54248m, null, null, false, null, null, Constants.CODE_REQUEST_MAX));
            return;
        }
        Iterator<C6985d> it = this.f90691u.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            } else if (it.next().f117511f == c6985d.f117511f) {
                break;
            } else {
                i8++;
            }
        }
        GeminiCommonPlayableParams geminiCommonPlayableParamsA = CheeseSupplementService.a.a(c6985d.f117510e, c6985d.f117511f, i8, c6985d.f117512g, c6985d.f117524t, c8043a.a().f123885g, this.f90686p.g(), this.h.f104126b.f104087b, null, this.f90678g, this.f90677f, c6985d.f117521q, c6985d.f117523s, this.f90688r.f129026b, this.f90689s.f102492e, false, null);
        if (this.f90684n.b(c6985d.f117510e, c6985d.f117511f) != null) {
            BuildersKt.launch$default(this.f90672a, (CoroutineContext) null, (CoroutineStart) null, new CheesePlayRepository$switchToNewEpisode$2(this, c6985d, geminiCommonPlayableParamsA, iVar, null), 3, (Object) null);
        } else {
            j(c6985d, geminiCommonPlayableParamsA, iVar, this, null);
        }
    }

    public final void k(b bVar) {
        MutableStateFlow<b> mutableStateFlow = this.f90694x;
        b bVar2 = (b) mutableStateFlow.getValue();
        mutableStateFlow.setValue(bVar);
        defpackage.a.b("[theseus-cheese-CheesePlayRepository-updateEpisodeRunningState] ", "updateEpisodeRunningState: " + bVar2 + " -> " + bVar, "CheesePlayRepository-updateEpisodeRunningState");
    }
}
