package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade.class */
public final class FlattenedPCSFacade implements InterfaceC5778f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f79352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f79353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final E f79354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<u> f79355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.d f79356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f79357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function1<A, Unit> f79358g;

    @Nullable
    public final Function3<Integer, InterfaceC5778f, Continuation<? super Unit>, Object> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Deferred<Unit> f79359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Deferred<Unit> f79360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<Duration> f79361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Channel<a> f79362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c> f79363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Flow<c> f79364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final ArrayList<b> f79365o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final FlattenedPCSFacade$masterPieceProgress$1 f79366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlayerAvailability> f79367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f79368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Job f79369s;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.FlattenedPCSFacade$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$a$a.class */
        public static final class C0511a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f79374a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f79375b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f79376c;

            public C0511a(int i7, long j7, boolean z6) {
                this.f79374a = i7;
                this.f79375b = j7;
                this.f79376c = z6;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Job f79378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final PCSFacadeImpl f79379c;

        public b(int i7, @NotNull Job job, @NotNull PCSFacadeImpl pCSFacadeImpl) {
            this.f79377a = i7;
            this.f79378b = job;
            this.f79379c = pCSFacadeImpl;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/FlattenedPCSFacade$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final PCSFacadeImpl f79381b;

        public c(int i7, @NotNull PCSFacadeImpl pCSFacadeImpl) {
            this.f79380a = i7;
            this.f79381b = pCSFacadeImpl;
        }
    }

    public FlattenedPCSFacade(@NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull E e7, @NotNull List list, @NotNull com.bilibili.player.tangram.basic.d dVar, int i7, @NotNull Function1 function1, @Nullable Function3 function3, @NotNull Deferred deferred, @NotNull Deferred deferred2) {
        this.f79352a = iPlayerCoreService;
        this.f79353b = hVar;
        this.f79354c = e7;
        this.f79355d = list;
        this.f79356e = dVar;
        this.f79357f = i7;
        this.f79358g = function1;
        this.h = function3;
        this.f79359i = deferred;
        this.f79360j = deferred2;
        ArrayList arrayList = new ArrayList();
        long j7 = Duration.Companion.getZERO-UwyO8pc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            arrayList.add(Duration.box-impl(j7));
            Duration duration = uVar.b().a;
            j7 = Duration.plus-LRDsOJo(j7, duration != null ? duration.unbox-impl() : Duration.Companion.getZERO-UwyO8pc());
        }
        this.f79361k = arrayList;
        this.f79362l = ChannelKt.Channel$default(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        MutableStateFlow<c> MutableStateFlow = StateFlowKt.MutableStateFlow((Object) null);
        this.f79363m = MutableStateFlow;
        this.f79364n = FlowKt.filterNotNull(MutableStateFlow);
        this.f79365o = new ArrayList<>();
        this.f79366p = new FlattenedPCSFacade$masterPieceProgress$1(this);
        this.f79367q = StateFlowKt.MutableStateFlow(PlayerAvailability.LOADING);
        List<u> list2 = this.f79355d;
        long j8 = Duration.Companion.getZERO-UwyO8pc();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Duration duration2 = ((u) it2.next()).b().a;
            j8 = Duration.plus-LRDsOJo(j8, Duration.box-impl(duration2 != null ? duration2.unbox-impl() : Duration.Companion.getZERO-UwyO8pc()).unbox-impl());
        }
        this.f79368r = j8;
    }

    public static final PCSFacadeImpl e(FlattenedPCSFacade flattenedPCSFacade, CoroutineScope coroutineScope, int i7) {
        u uVar = (u) ((ArrayList) flattenedPCSFacade.f79355d).get(i7);
        com.bilibili.player.tangram.basic.c cVarG = uVar.f79459b.g();
        Deferred deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FlattenedPCSFacade$newFacade$1(flattenedPCSFacade, i7, null), 3, (Object) null);
        return new PCSFacadeImpl(flattenedPCSFacade.f79352a, cVarG, flattenedPCSFacade.f79353b, flattenedPCSFacade.f79354c, uVar, flattenedPCSFacade.f79356e, flattenedPCSFacade.f79358g, flattenedPCSFacade.f79359i, deferredAsync$default, null);
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> B() {
        return FlowKt.transformLatest(this.f79364n, new FlattenedPCSFacade$special$$inlined$flatMapLatest$3(null));
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        c cVar = (c) this.f79363m.getValue();
        return cVar == null ? Duration.Companion.getZERO-UwyO8pc() : Duration.plus-LRDsOJo(((Duration) ((ArrayList) this.f79361k).get(cVar.f79380a)).unbox-impl(), cVar.f79381b.F());
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> H() {
        return FlowKt.transformLatest(this.f79364n, new FlattenedPCSFacade$special$$inlined$flatMapLatest$1(null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @Override // com.bilibili.player.tangram.basic.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(long r10, boolean r12, @org.jetbrains.annotations.Nullable java.lang.Object r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws kotlin.KotlinNothingValueException {
        /*
            r9 = this;
            r0 = r14
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$1
            if (r0 == 0) goto L31
            r0 = r14
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$1 r0 = (com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$1) r0
            r16 = r0
            r0 = r16
            int r0 = r0.label
            r15 = r0
            r0 = r15
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L31
            r0 = r16
            r1 = r15
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r16
            r14 = r0
            goto L3d
        L31:
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$1 r0 = new com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$1
            r1 = r0
            r2 = r9
            r3 = r14
            r1.<init>(r2, r3)
            r14 = r0
        L3d:
            r0 = r14
            java.lang.Object r0 = r0.result
            r17 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r16 = r0
            r0 = r14
            int r0 = r0.label
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L6e
            r0 = r15
            r1 = 1
            if (r0 == r1) goto L66
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            goto L97
        L6e:
            r0 = r17
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2 r0 = new com.bilibili.player.tangram.playercore.FlattenedPCSFacade$run$2
            r1 = r0
            r2 = r9
            r3 = r13
            r4 = r10
            r5 = r12
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r13 = r0
            r0 = r14
            r1 = 1
            r0.label = r1
            r0 = r13
            r1 = r14
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r16
            if (r0 != r1) goto L97
            r0 = r16
            return r0
        L97:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.FlattenedPCSFacade.I(long, boolean, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Duration> J() {
        return FlowKt.transformLatest(this.f79364n, new FlattenedPCSFacade$special$$inlined$flatMapLatest$4(null, this));
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final Object K(@NotNull com.bilibili.player.tangram.basic.c cVar, @NotNull ContinuationImpl continuationImpl) {
        Iterator<b> it = this.f79365o.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default(it.next().f79378b, (CancellationException) null, 1, (Object) null);
        }
        this.f79365o.clear();
        return FlowKt.first(FlowKt.mapLatest(this.f79364n, new FlattenedPCSFacade$switchQuality$3(cVar, null)), continuationImpl);
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    @NotNull
    public final Flow<u> b() {
        return FlowKt.transformLatest(this.f79364n, new FlattenedPCSFacade$special$$inlined$flatMapLatest$5(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r8, boolean r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.FlattenedPCSFacade.c(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return this.f79367q;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a i() {
        PCSFacadeImpl pCSFacadeImpl;
        c cVar = (c) this.f79363m.getValue();
        return (cVar == null || (pCSFacadeImpl = cVar.f79381b) == null) ? null : pCSFacadeImpl.i();
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final PlayerAvailability k() {
        return (PlayerAvailability) this.f79367q.getValue();
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    public final void n() {
        PCSFacadeImpl pCSFacadeImpl;
        c cVar = (c) this.f79363m.getValue();
        if (cVar == null || (pCSFacadeImpl = cVar.f79381b) == null) {
            return;
        }
        pCSFacadeImpl.n();
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    @Nullable
    public final u o() {
        PCSFacadeImpl pCSFacadeImpl;
        c cVar = (c) this.f79363m.getValue();
        return (cVar == null || (pCSFacadeImpl = cVar.f79381b) == null) ? null : pCSFacadeImpl.o();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final Duration q() {
        return Duration.box-impl(this.f79368r);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(long r8, boolean r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.FlattenedPCSFacade.s(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
        return FlowKt.transformLatest(this.f79364n, new FlattenedPCSFacade$special$$inlined$flatMapLatest$2(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.player.tangram.basic.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w() {
        /*
            r3 = this;
            r0 = r3
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.player.tangram.playercore.FlattenedPCSFacade$c> r0 = r0.f79363m
            java.lang.Object r0 = r0.getValue()
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade$c r0 = (com.bilibili.player.tangram.playercore.FlattenedPCSFacade.c) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L29
            r0 = r3
            int r0 = r0.f79357f
            r4 = r0
            r0 = r5
            int r0 = r0.f79380a
            r1 = r4
            if (r0 != r1) goto L29
            r0 = r5
            com.bilibili.player.tangram.playercore.PCSFacadeImpl r0 = r0.f79381b
            java.lang.Object r0 = r0.w()
            r5 = r0
            goto L2b
        L29:
            r0 = 0
            r5 = r0
        L2b:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.FlattenedPCSFacade.w():java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a x() {
        PCSFacadeImpl pCSFacadeImpl;
        c cVar = (c) this.f79363m.getValue();
        return (cVar == null || (pCSFacadeImpl = cVar.f79381b) == null) ? null : pCSFacadeImpl.x();
    }
}
