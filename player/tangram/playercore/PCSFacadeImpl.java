package com.bilibili.player.tangram.playercore;

import androidx.compose.foundation.lazy.grid.m0;
import androidx.compose.ui.text.font.C4496a;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.c;
import com.bilibili.player.tangram.playercore.A;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.U;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl.class */
public final class PCSFacadeImpl implements com.bilibili.player.tangram.basic.e, InterfaceC5778f, G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f79384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.c f79385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.f f79386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final E f79387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.d f79388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<A, Unit> f79389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Deferred<Unit> f79390g;

    @NotNull
    public final Deferred<Unit> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final U f79391i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<u> f79393k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f79398p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f79400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f79401s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f79403u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f79392j = LazyKt.lazy(new EK0.a(9));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlayerAvailability> f79394l = StateFlowKt.MutableStateFlow(PlayerAvailability.IDLE);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.player.tangram.basic.a> f79395m = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<com.bilibili.player.tangram.basic.a> f79396n = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Duration> f79397o = StateFlowKt.MutableStateFlow(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Mutex f79399q = MutexKt.Mutex$default(false, 1, (Object) null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Channel<a> f79402t = ChannelKt.Channel$default(-1, (BufferOverflow) null, new m0(1), 2, (Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$a.class */
    public static final class a implements CompletableDeferred<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CompletableDeferred<Boolean> f79404a = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final com.bilibili.player.tangram.basic.c f79405b;

        public a(@NotNull com.bilibili.player.tangram.basic.c cVar) {
            this.f79405b = cVar;
        }

        public final boolean a(boolean z6) {
            return this.f79404a.complete(Boolean.valueOf(z6));
        }

        @NotNull
        public final kotlinx.coroutines.l attachChild(@NotNull kotlinx.coroutines.n nVar) {
            return this.f79404a.attachChild(nVar);
        }

        @Nullable
        public final Object await(@NotNull Continuation<? super Boolean> continuation) {
            return this.f79404a.await(continuation);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public final /* synthetic */ void cancel() {
            this.f79404a.cancel();
        }

        public final void cancel(@Nullable CancellationException cancellationException) {
            this.f79404a.cancel(cancellationException);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public final /* synthetic */ boolean cancel(Throwable th) {
            return this.f79404a.cancel(th);
        }

        public final boolean complete(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return this.f79404a.complete(bool);
        }

        public final boolean completeExceptionally(@NotNull Throwable th) {
            return this.f79404a.completeExceptionally(th);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f79405b, ((a) obj).f79405b);
        }

        public final <R> R fold(R r7, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) this.f79404a.fold(r7, function2);
        }

        @Nullable
        public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) this.f79404a.get(key);
        }

        @NotNull
        public final CancellationException getCancellationException() {
            return this.f79404a.getCancellationException();
        }

        @NotNull
        public final Sequence<Job> getChildren() {
            return this.f79404a.getChildren();
        }

        public final Object getCompleted() {
            return (Boolean) this.f79404a.getCompleted();
        }

        @Nullable
        public final Throwable getCompletionExceptionOrNull() {
            return this.f79404a.getCompletionExceptionOrNull();
        }

        @NotNull
        public final CoroutineContext.Key<?> getKey() {
            return this.f79404a.getKey();
        }

        @NotNull
        public final SelectClause1<Boolean> getOnAwait() {
            return this.f79404a.getOnAwait();
        }

        @NotNull
        public final kotlinx.coroutines.selects.c getOnJoin() {
            return this.f79404a.getOnJoin();
        }

        @Nullable
        public final Job getParent() {
            return this.f79404a.getParent();
        }

        public final int hashCode() {
            return this.f79405b.hashCode();
        }

        @NotNull
        public final DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> function1) {
            return this.f79404a.invokeOnCompletion(function1);
        }

        @NotNull
        public final DisposableHandle invokeOnCompletion(boolean z6, boolean z7, @NotNull Function1<? super Throwable, Unit> function1) {
            return this.f79404a.invokeOnCompletion(z6, z7, function1);
        }

        public final boolean isActive() {
            return this.f79404a.isActive();
        }

        public final boolean isCancelled() {
            return this.f79404a.isCancelled();
        }

        public final boolean isCompleted() {
            return this.f79404a.isCompleted();
        }

        @Nullable
        public final Object join(@NotNull Continuation<? super Unit> continuation) {
            return this.f79404a.join(continuation);
        }

        @NotNull
        public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return this.f79404a.minusKey(key);
        }

        @NotNull
        public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return this.f79404a.plus(coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public final Job plus(@NotNull Job job) {
            return this.f79404a.plus(job);
        }

        public final boolean start() {
            return this.f79404a.start();
        }

        @NotNull
        public final String toString() {
            return "SwitchQualityAction(preference=" + this.f79405b + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PCSFacadeImpl(@NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.player.tangram.basic.c cVar, @NotNull com.bilibili.player.tangram.basic.f fVar, @NotNull E e7, @NotNull u uVar, @NotNull com.bilibili.player.tangram.basic.d dVar, @NotNull Function1<? super A, Unit> function1, @NotNull Deferred<Unit> deferred, @NotNull Deferred<Unit> deferred2, @Nullable U u7) {
        this.f79384a = iPlayerCoreService;
        this.f79385b = cVar;
        this.f79386c = fVar;
        this.f79387d = e7;
        this.f79388e = dVar;
        this.f79389f = function1;
        this.f79390g = deferred;
        this.h = deferred2;
        this.f79391i = u7;
        this.f79393k = StateFlowKt.MutableStateFlow(uVar);
    }

    public static final boolean A(PCSFacadeImpl pCSFacadeImpl, u uVar) {
        boolean z6;
        PlayIndex playIndex = uVar.f79460c.getPlayIndex();
        E e7 = pCSFacadeImpl.f79387d;
        int i7 = ((com.bilibili.player.tangram.basic.a) e7.f79348d.invoke(uVar, new com.bilibili.player.tangram.basic.a(((com.bilibili.player.tangram.basic.a) ((ClosedRange) e7.f79347c.getValue()).getEndInclusive()).f79320a))).f79320a;
        if (com.bilibili.player.tangram.basic.a.c(i7)) {
            if (playIndex != null && playIndex.mQuality > i7 && (playIndex.attribute != 0 || !pCSFacadeImpl.f79384a.supportQuality(i7))) {
                pCSFacadeImpl.R(uVar, i7);
            }
            z6 = true;
        } else {
            z6 = false;
        }
        return z6;
    }

    public static final Object G(PCSFacadeImpl pCSFacadeImpl, u uVar, int i7, SuspendLambda suspendLambda) {
        Object objBoxBoolean;
        defpackage.a.b("[tangram-player-core-PCSFacadeImpl-switchToSpecificQuality-tiFl0wA] ", C4496a.a("Quality: ", String.valueOf(i7)), "PCSFacadeImpl-switchToSpecificQuality-tiFl0wA");
        com.bilibili.player.tangram.basic.a aVarA = y.a(uVar.f79460c, Integer.MAX_VALUE, i7);
        if (aVarA == null) {
            BLog.i("PCSFacadeImpl-switchToSpecificQuality-tiFl0wA", "[tangram-player-core-PCSFacadeImpl-switchToSpecificQuality-tiFl0wA] No quality to apply.");
            objBoxBoolean = Boxing.boxBoolean(false);
        } else {
            IPlayerCoreService.setDashAuto$default(pCSFacadeImpl.f79384a, false, 0, 0, 6, (Object) null);
            pCSFacadeImpl.R(uVar, aVarA.f79320a);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(suspendLambda), 1);
            cancellableContinuationImpl.initCancellability();
            IPlayerCoreService iPlayerCoreService = pCSFacadeImpl.f79384a;
            if (iPlayerCoreService.getCurrentQuality() == aVarA.f79320a) {
                Result.Companion companion = Result.Companion;
                androidx.core.content.c.c(cancellableContinuationImpl, true);
                pCSFacadeImpl.f79396n.setValue(aVarA);
            } else {
                q qVar = new q(aVarA, pCSFacadeImpl, cancellableContinuationImpl);
                iPlayerCoreService.addPlayerSourceObserver(qVar);
                cancellableContinuationImpl.invokeOnCancellation(new p(pCSFacadeImpl, qVar));
            }
            Object result = cancellableContinuationImpl.getResult();
            objBoxBoolean = result;
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(suspendLambda);
                objBoxBoolean = result;
            }
        }
        return objBoxBoolean;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.bilibili.player.tangram.playercore.PCSFacadeImpl r5, tv.danmaku.videoplayer.coreV2.MediaItem r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl.e(com.bilibili.player.tangram.playercore.PCSFacadeImpl, tv.danmaku.videoplayer.coreV2.MediaItem, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(com.bilibili.player.tangram.playercore.PCSFacadeImpl r8, long r9, boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r8
            java.lang.Class r0 = r0.getClass()
            r0 = r12
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$1
            if (r0 == 0) goto L36
            r0 = r12
            com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$1 r0 = (com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$1) r0
            r14 = r0
            r0 = r14
            int r0 = r0.label
            r13 = r0
            r0 = r13
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L36
            r0 = r14
            r1 = r13
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r14
            r12 = r0
            goto L42
        L36:
            com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$1 r0 = new com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$1
            r1 = r0
            r2 = r8
            r3 = r12
            r1.<init>(r2, r3)
            r12 = r0
        L42:
            r0 = r12
            java.lang.Object r0 = r0.result
            r15 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r14 = r0
            r0 = r12
            int r0 = r0.label
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L73
            r0 = r13
            r1 = 1
            if (r0 == r1) goto L6b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            goto L98
        L73:
            r0 = r15
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2 r0 = new com.bilibili.player.tangram.playercore.PCSFacadeImpl$stateMachine$2
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r11
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r8 = r0
            r0 = r12
            r1 = 1
            r0.label = r1
            r0 = r8
            r1 = r12
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r14
            if (r0 != r1) goto L98
            r0 = r14
            return r0
        L98:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl.s(com.bilibili.player.tangram.playercore.PCSFacadeImpl, long, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> B() {
        return this.f79396n;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        S();
        return ((Duration) this.f79397o.getValue()).unbox-impl();
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> H() {
        return this.f79395m;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.bilibili.player.tangram.basic.e
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object I(long r9, boolean r11, @org.jetbrains.annotations.Nullable java.lang.Object r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r13) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl.I(long, boolean, java.lang.Object, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Duration> J() {
        return FlowKt.flow(new PCSFacadeImpl$currentPositionFlow$1$1(this.f79397o, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @Override // com.bilibili.player.tangram.basic.l
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.c r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl.K(com.bilibili.player.tangram.basic.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final ClosedRange<com.bilibili.player.tangram.basic.a> M() {
        ClosedRange<com.bilibili.player.tangram.basic.a> closedRangeRangeTo;
        ClosedRange<com.bilibili.player.tangram.basic.a> closedRange = null;
        if (this.f79403u) {
            return null;
        }
        this.f79403u = true;
        boolean zBooleanValue = ((Boolean) this.f79392j.getValue()).booleanValue();
        E e7 = this.f79387d;
        if (zBooleanValue) {
            StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> stateFlow = e7.f79345a;
            if (stateFlow != null) {
                closedRange = (ClosedRange) stateFlow.getValue();
            }
            return closedRange;
        }
        com.bilibili.player.tangram.basic.c cVar = this.f79385b;
        if (cVar instanceof c.a) {
            StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> stateFlow2 = e7.f79345a;
            closedRangeRangeTo = null;
            if (stateFlow2 != null) {
                closedRangeRangeTo = (ClosedRange) stateFlow2.getValue();
            }
        } else {
            closedRangeRangeTo = null;
            if (cVar instanceof c.b) {
                closedRangeRangeTo = null;
                if (com.bilibili.player.tangram.basic.a.c(((com.bilibili.player.tangram.basic.a) ((ClosedRange) e7.f79346b.getValue()).getEndInclusive()).f79320a)) {
                    StateFlow<ClosedRange<com.bilibili.player.tangram.basic.a>> stateFlow3 = e7.f79345a;
                    closedRangeRangeTo = null;
                    if (stateFlow3 != null) {
                        ClosedRange closedRange2 = (ClosedRange) stateFlow3.getValue();
                        closedRangeRangeTo = null;
                        if (closedRange2 != null) {
                            Comparable start = closedRange2.getStart();
                            c.b bVar = (c.b) cVar;
                            closedRangeRangeTo = RangesKt.rangeTo(ComparisonsKt.minOf(start, new com.bilibili.player.tangram.basic.a(bVar.f79322a)), ComparisonsKt.minOf(closedRange2.getEndInclusive(), new com.bilibili.player.tangram.basic.a(bVar.f79322a)));
                        }
                    }
                }
            }
        }
        return closedRangeRangeTo;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sb0.c N() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.U r0 = r0.f79391i
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            sb0.c r0 = r0.R()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1e
        L16:
            r0 = r2
            com.bilibili.player.tangram.playercore.u r0 = r0.o()
            sb0.c r0 = r0.b()
            r3 = r0
        L1e:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl.N():sb0.c");
    }

    public final void Q(int i7) {
        int i8;
        if (i7 < 0) {
            i8 = 0;
        } else {
            i8 = i7;
            if (i7 == 15) {
                i8 = 16;
            }
        }
        defpackage.a.b("[tangram-player-core-PCSFacadeImpl-onActualQualityChange] ", C4496a.a("Notified with actual quality: ", String.valueOf(i8)), "PCSFacadeImpl-onActualQualityChange");
        MediaResource mediaResource = this.f79384a.getMediaResource();
        if (mediaResource != null) {
            y.c(i8, mediaResource);
        }
        this.f79395m.setValue(new com.bilibili.player.tangram.basic.a(i8));
    }

    public final void R(u uVar, int i7) {
        PlayIndex playIndex;
        Object next;
        MediaResource mediaResource = uVar.f79460c;
        PlayIndex playIndex2 = mediaResource.getPlayIndex();
        ArrayList arrayList = mediaResource.mVodIndex.mVodList;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                com.bilibili.player.tangram.basic.a aVarA = C5774b.a((PlayIndex) next);
                if (aVarA == null ? false : com.bilibili.player.tangram.basic.a.b(aVarA.f79320a, i7)) {
                    break;
                }
            }
            playIndex = (PlayIndex) next;
        } else {
            playIndex = null;
        }
        if (playIndex == null) {
            defpackage.a.b("[tangram-player-core-PCSFacadeImpl-switchCoreQuality-odkAKWg] ", C4496a.a("no quality ", String.valueOf(i7)), "PCSFacadeImpl-switchCoreQuality-odkAKWg");
            return;
        }
        IPlayerCoreService iPlayerCoreService = this.f79384a;
        boolean dashAuto = iPlayerCoreService.getDashAuto();
        BLog.i("PCSFacadeImpl-switchCoreQuality-odkAKWg", "[tangram-player-core-PCSFacadeImpl-switchCoreQuality-odkAKWg] " + ("targetPlayIndex: " + playIndex.mQuality + " runningPlayIndex" + (playIndex2 != null ? C5774b.a(playIndex2) : null) + " dashAuto:" + dashAuto));
        if (!Intrinsics.areEqual(playIndex2, playIndex) || dashAuto) {
            boolean zSupportQuality = iPlayerCoreService.supportQuality(playIndex.mQuality);
            if (!zSupportQuality && !playIndex.isPlayable()) {
                defpackage.a.b("[tangram-player-core-PCSFacadeImpl-switchCoreQuality-odkAKWg] ", C4496a.a("no dash，no quality ", String.valueOf(i7)), "PCSFacadeImpl-switchCoreQuality-odkAKWg");
                return;
            }
            this.f79389f.invoke(new A.g(i7));
            boolean z6 = (playIndex2 == null || playIndex2.attribute == playIndex.attribute) ? false : true;
            boolean z7 = Intrinsics.areEqual(playIndex2 != null ? playIndex2.mFrom : null, "downloaded") || Intrinsics.areEqual(playIndex.mFrom, "downloaded");
            if (!z6 && !z7 && zSupportQuality) {
                BLog.i("PCSFacadeImpl-switchCoreQuality-odkAKWg", "[tangram-player-core-PCSFacadeImpl-switchCoreQuality-odkAKWg] Switching quality with core...");
                iPlayerCoreService.switchQuality(i7);
            } else {
                defpackage.a.b("[tangram-player-core-PCSFacadeImpl-switchCoreQuality-odkAKWg] ", O4.b.b("Attribute changed: ", " or switch between cached resource and online resource: ", ", enforcing MediaResource...", z6, z7), "PCSFacadeImpl-switchCoreQuality-odkAKWg");
                mediaResource.setResolvedIndex(mediaResource.mVodIndex.mVodList.indexOf(playIndex));
                iPlayerCoreService.setMediaResource(mediaResource, this.f79401s, uVar.a(F(), true, M(), null, 0L));
                Q(i7);
            }
        }
    }

    public final void S() {
        IPlayerCoreService iPlayerCoreService;
        int state;
        if (this.f79398p && 3 <= (state = (iPlayerCoreService = this.f79384a).getState()) && state < 7) {
            int realDuration = iPlayerCoreService.getRealDuration();
            if (realDuration > 0 && k() != PlayerAvailability.FORBIDDEN) {
                if (state != 6 || this.f79400r) {
                    realDuration = RangesKt.coerceAtMost(iPlayerCoreService.getRealCurrentPosition(), realDuration);
                }
                Duration.Companion companion = Duration.Companion;
                this.f79397o.setValue(Duration.box-impl(Duration.plus-LRDsOJo(DurationKt.toDuration(realDuration, DurationUnit.MILLISECONDS), N().b)));
            }
        }
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    @NotNull
    public final Flow<u> b() {
        return this.f79393k;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0267 A[Catch: all -> 0x028f, TRY_LEAVE, TryCatch #1 {all -> 0x028f, blocks: (B:54:0x024a, B:56:0x0267, B:59:0x027d, B:62:0x0294, B:64:0x029e, B:66:0x02a9, B:67:0x02fb, B:67:0x02fb, B:68:0x02fe, B:70:0x030c, B:72:0x0315), top: B:88:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030c A[Catch: all -> 0x028f, TryCatch #1 {all -> 0x028f, blocks: (B:54:0x024a, B:56:0x0267, B:59:0x027d, B:62:0x0294, B:64:0x029e, B:66:0x02a9, B:67:0x02fb, B:67:0x02fb, B:68:0x02fe, B:70:0x030c, B:72:0x0315), top: B:88:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r6, boolean r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl.c(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return this.f79394l;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a i() {
        return (com.bilibili.player.tangram.basic.a) this.f79395m.getValue();
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final PlayerAvailability k() {
        return (PlayerAvailability) this.f79394l.getValue();
    }

    @Override // com.bilibili.player.tangram.playercore.G
    public final boolean m(@NotNull u uVar) {
        com.bilibili.player.tangram.basic.a aVarA;
        IPlayerCoreService iPlayerCoreService = this.f79384a;
        MediaResource mediaResource = iPlayerCoreService.getMediaResource();
        boolean zB = false;
        if (mediaResource == null) {
            return false;
        }
        PlayIndex playIndex = mediaResource.getPlayIndex();
        com.bilibili.player.tangram.basic.a aVarA2 = playIndex != null ? C5774b.a(playIndex) : null;
        if (aVarA2 != null) {
            if (y.b(aVarA2.f79320a, uVar.f79460c)) {
                MediaResource mediaResource2 = uVar.f79460c;
                ExtraInfo extraInfo = mediaResource2.getExtraInfo();
                UUID uuid = extraInfo != null ? (UUID) y.f79468a.a(extraInfo) : null;
                ExtraInfo extraInfo2 = mediaResource.getExtraInfo();
                if (Intrinsics.areEqual(uuid, extraInfo2 != null ? (UUID) y.f79468a.a(extraInfo2) : null)) {
                    BLog.i("PCSFacadeImpl-supplementQuality", "[tangram-player-core-PCSFacadeImpl-supplementQuality] supplement quality");
                    y.c(aVarA2.f79320a, mediaResource2);
                    iPlayerCoreService.updateMediaResource(mediaResource2);
                    this.f79393k.setValue(new u(o().f79458a, o().f79459b, uVar.f79460c, uVar.f79461d, uVar.f79462e, uVar.f79463f, uVar.h, uVar.f79465i, 64));
                    com.bilibili.player.tangram.basic.c cVarG = uVar.f79459b.g();
                    if (!(cVarG instanceof c.b) || (aVarA = y.a(o().f79460c, Integer.MAX_VALUE, ((c.b) cVarG).f79322a)) == null) {
                        return true;
                    }
                    int i7 = aVarA.f79320a;
                    boolean zC = com.bilibili.player.tangram.basic.a.c(((com.bilibili.player.tangram.basic.a) ((ClosedRange) this.f79387d.f79346b.getValue()).getEndInclusive()).f79320a);
                    MutableStateFlow<com.bilibili.player.tangram.basic.a> mutableStateFlow = this.f79396n;
                    if (zC) {
                        mutableStateFlow.setValue(new com.bilibili.player.tangram.basic.a(i7));
                        return true;
                    }
                    PlayIndex playIndex2 = o().f79460c.getPlayIndex();
                    com.bilibili.player.tangram.basic.a aVarA3 = null;
                    if (playIndex2 != null) {
                        aVarA3 = C5774b.a(playIndex2);
                    }
                    if (aVarA3 != null) {
                        zB = com.bilibili.player.tangram.basic.a.b(aVarA3.f79320a, i7);
                    }
                    if (zB) {
                        return true;
                    }
                    mutableStateFlow.setValue(new com.bilibili.player.tangram.basic.a(i7));
                    R(o(), i7);
                    return true;
                }
            }
        }
        BLog.w("PCSFacadeImpl-supplementQuality", "[tangram-player-core-PCSFacadeImpl-supplementQuality] Media resource miss!", (Throwable) null);
        return false;
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    public final void n() {
        if (this.f79398p) {
            BLog.i("PCSFacadeImpl-enforcePlayState", "[tangram-player-core-PCSFacadeImpl-enforcePlayState] Enforcing play state externally.");
            boolean z6 = this.f79401s;
            this.f79401s = z6;
            IPlayerCoreService iPlayerCoreService = this.f79384a;
            if (z6) {
                iPlayerCoreService.resume();
            } else {
                iPlayerCoreService.pause();
            }
        }
    }

    @Override // com.bilibili.player.tangram.playercore.InterfaceC5778f
    @NotNull
    public final u o() {
        return (u) this.f79393k.getValue();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Duration q() {
        Duration duration = N().a;
        if (duration != null) {
            return duration;
        }
        IPlayerCoreService iPlayerCoreService = this.f79384a;
        Duration duration2 = null;
        if (iPlayerCoreService.getState() >= 3) {
            Integer numValueOf = Integer.valueOf(iPlayerCoreService.getRealDuration());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            duration2 = null;
            if (numValueOf != null) {
                Duration.Companion companion = Duration.Companion;
                duration2 = Duration.box-impl(DurationKt.toDuration(numValueOf.intValue(), DurationUnit.MILLISECONDS));
            }
        }
        return duration2;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
        final MutableStateFlow<u> mutableStateFlow = this.f79393k;
        return new Flow<List<? extends com.bilibili.player.tangram.basic.a>>(mutableStateFlow) { // from class: com.bilibili.player.tangram.playercore.PCSFacadeImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f79409a;

            /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f79410a;

                /* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.PCSFacadeImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$special$$inlined$map$1$2$1.class */
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
                    this.f79410a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        Method dump skipped, instruction units count: 256
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSFacadeImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f79409a = mutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f79409a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.bilibili.player.tangram.basic.e
    @NotNull
    public final Object w() {
        return Duration.box-impl(F());
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a x() {
        return (com.bilibili.player.tangram.basic.a) this.f79396n.getValue();
    }
}
