package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.U;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl.class */
public final class PCSPlayableImpl implements v, WithVideoProgress, com.bilibili.player.tangram.basic.j, com.bilibili.player.tangram.basic.k, com.bilibili.player.tangram.basic.i, com.bilibili.player.tangram.basic.l, G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.d f79413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.player.tangram.basic.g f79414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SuspendLambda f79415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f79416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ResolveAndPlayPlayable<InterfaceC5778f> f79417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final E f79418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C5776d f79419g;

    @Nullable
    public final U h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79421j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CoroutineScope f79423l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f79420i = PlayerSettingHelper.enablePlayUrlHTTPS();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<A> f79422k = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final CompletableDeferred<Long> f79424m = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

    public PCSPlayableImpl(@NotNull com.bilibili.player.tangram.basic.d dVar, @NotNull com.bilibili.player.tangram.basic.g gVar, @NotNull Function2 function2, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull ResolveAndPlayPlayable resolveAndPlayPlayable, @NotNull E e7, @NotNull C5776d c5776d, @Nullable U u7) {
        this.f79413a = dVar;
        this.f79414b = gVar;
        this.f79415c = (SuspendLambda) function2;
        this.f79416d = iPlayerCoreService;
        this.f79417e = resolveAndPlayPlayable;
        this.f79418f = e7;
        this.f79419g = c5776d;
        this.h = u7;
        this.f79421j = ((com.bilibili.player.tangram.basic.a) e7.f79348d.invoke((Object) null, new com.bilibili.player.tangram.basic.a(0))).f79320a;
    }

    public static /* synthetic */ Object Q(PCSPlayableImpl pCSPlayableImpl, com.bilibili.player.tangram.basic.c cVar, SuspendLambda suspendLambda, int i7) {
        if ((i7 & 1) != 0) {
            cVar = pCSPlayableImpl.f79414b.g();
        }
        return pCSPlayableImpl.N(cVar, pCSPlayableImpl.f79421j, suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    @Override // com.bilibili.player.tangram.basic.i
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(@org.jetbrains.annotations.NotNull java.lang.String r10, int r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            r0 = r9
            com.bilibili.player.tangram.basic.g r0 = r0.f79414b
            com.bilibili.player.tangram.basic.c r0 = r0.c()
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L16
            r0 = 0
            r14 = r0
            goto L41
        L16:
            r0 = r14
            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.c.b
            if (r0 == 0) goto L3e
            r0 = r14
            com.bilibili.player.tangram.basic.c$b r0 = (com.bilibili.player.tangram.basic.c.b) r0
            int r0 = r0.f79322a
            r13 = r0
            r0 = r13
            boolean r0 = com.bilibili.player.tangram.basic.a.c(r0)
            if (r0 == 0) goto L3e
            com.bilibili.player.tangram.basic.a r0 = new com.bilibili.player.tangram.basic.a
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r14 = r0
            goto L41
        L3e:
            r0 = 0
            r14 = r0
        L41:
            r0 = r9
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<com.bilibili.player.tangram.playercore.f> r0 = r0.f79417e
            r15 = r0
            r0 = r14
            if (r0 == 0) goto L70
            r0 = r15
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$switchLanguage$2 r1 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$switchLanguage$2
            r2 = r1
            r3 = r9
            r4 = r14
            r5 = r10
            r6 = r11
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r2 = r12
            kotlin.coroutines.jvm.internal.ContinuationImpl r2 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r2
            java.lang.Object r0 = r0.i(r1, r2)
            r10 = r0
            r0 = r10
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L6c
            r0 = r10
            return r0
        L6c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L70:
            r0 = r15
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$switchLanguage$3 r1 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$switchLanguage$3
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = 0
            r2.<init>(r3, r4, r5, r6)
            r2 = r12
            kotlin.coroutines.jvm.internal.ContinuationImpl r2 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r2
            java.lang.Object r0 = r0.i(r1, r2)
            r10 = r0
            r0 = r10
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L8e
            r0 = r10
            return r0
        L8e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.A(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> B() {
        return FlowKt.transformLatest(this.f79417e.f79303b, new PCSPlayableImpl$special$$inlined$flatMapLatest$3(null));
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<ResolveAndPlayPlayable.c<InterfaceC5778f>> C() {
        return this.f79417e.f79303b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.bilibili.player.tangram.playercore.v
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$1 r0 = (com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$1 r0 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5e
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L97
        L5e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7b
        L66:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r6
            java.lang.Object r0 = r0.M(r1)
            r1 = r8
            if (r0 != r1) goto L7b
            r0 = r8
            return r0
        L7b:
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2 r0 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$run$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = r9
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r8
            if (r0 != r1) goto L97
            r0 = r8
            return r0
        L97:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.D(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object E(@NotNull Continuation<? super Unit> continuation) {
        Object objE = this.f79417e.e(new PCSPlayableImpl$triggerResolving$2(this, null), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        return this.f79417e.F();
    }

    public final void G(@NotNull Function1<? super sb0.c, sb0.c> function1) {
        U u7 = this.h;
        if (u7 != null) {
            u7.G(function1);
        }
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> H() {
        return FlowKt.transformLatest(this.f79417e.f79303b, new PCSPlayableImpl$special$$inlined$flatMapLatest$4(null));
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Duration> J() {
        return this.f79417e.J();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.player.tangram.basic.l
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.c r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.K(com.bilibili.player.tangram.basic.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long L() {
        return this.f79417e.L();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.PCSPlayableImpl$initializeQualityConfig$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$initializeQualityConfig$1 r0 = (com.bilibili.player.tangram.playercore.PCSPlayableImpl$initializeQualityConfig$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L2f
        L25:
            com.bilibili.player.tangram.playercore.PCSPlayableImpl$initializeQualityConfig$1 r0 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$initializeQualityConfig$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L2f:
            r0 = r6
            java.lang.Object r0 = r0.result
            r8 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5a
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L50
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            r6 = r0
            goto L7f
        L50:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L5a:
            r0 = r8
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.player.tangram.basic.g r0 = r0.f79414b
            com.bilibili.player.tangram.basic.c r0 = r0.g()
            r8 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r8
            r2 = r6
            java.lang.Object r0 = r0.S(r1, r2)
            r8 = r0
            r0 = r8
            r6 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L7f
            r0 = r9
            return r0
        L7f:
            r0 = r5
            r1 = r6
            com.bilibili.player.tangram.basic.a r1 = (com.bilibili.player.tangram.basic.a) r1
            int r1 = r1.f79320a
            r0.f79421j = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.M(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object N(com.bilibili.player.tangram.basic.c r15, int r16, kotlin.coroutines.jvm.internal.ContinuationImpl r17) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.N(com.bilibili.player.tangram.basic.c, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sb0.c R() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.U r0 = r0.h
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            sb0.c r0 = r0.R()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L16:
            sb0.c r0 = sb0.c.d
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.R():sb0.c");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S(com.bilibili.player.tangram.basic.c r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.S(com.bilibili.player.tangram.basic.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.flow.Flow<tv.danmaku.biliplayerv2.service.L> T() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.U r0 = r0.h
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            kotlinx.coroutines.flow.Flow r0 = r0.T()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1d
        L16:
            tv.danmaku.biliplayerv2.service.L$a r0 = tv.danmaku.biliplayerv2.service.L.a.a
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
            r3 = r0
        L1d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.T():kotlinx.coroutines.flow.Flow");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tv.danmaku.biliplayerv2.service.L Z() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.U r0 = r0.h
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            tv.danmaku.biliplayerv2.service.L r0 = r0.Z()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L16:
            tv.danmaku.biliplayerv2.service.L$a r0 = tv.danmaku.biliplayerv2.service.L.a.a
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.Z():tv.danmaku.biliplayerv2.service.L");
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<u> b() {
        return FlowKt.transformLatest(this.f79417e.f79303b, new PCSPlayableImpl$special$$inlined$flatMapLatest$1(null));
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Object c(long j7, boolean z6, @NotNull Continuation<? super Boolean> continuation) {
        return this.f79417e.c(j7, z6, continuation);
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return this.f79417e.d();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object d0(@NotNull Function2 function2, @NotNull SuspendLambda suspendLambda) {
        Object objE = this.f79417e.e(new PCSPlayableImpl$resolve$2(function2, this, null), suspendLambda);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
    }

    @Override // com.bilibili.player.tangram.basic.k
    @NotNull
    public final Flow<PlayNetworkEnv> e() {
        return FlowKt.asStateFlow(this.f79419g.f79444b);
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Long h() {
        return this.f79417e.h();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final ResolveAndPlayPlayable.c<InterfaceC5778f> h0() {
        return this.f79417e.h0();
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a i() {
        Object objH0 = this.f79417e.h0();
        return objH0 instanceof ResolveAndPlayPlayable.c.C0510c ? ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) objH0).f79314a).i() : null;
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final PlayerAvailability k() {
        return this.f79417e.k();
    }

    @Override // com.bilibili.player.tangram.playercore.G
    public final boolean m(@NotNull u uVar) {
        Object objH0 = this.f79417e.h0();
        return objH0 instanceof ResolveAndPlayPlayable.c.C0510c ? ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) objH0).f79314a).m(uVar) : false;
    }

    @Override // com.bilibili.player.tangram.playercore.v
    public final void n() {
        Object objH0 = this.f79417e.h0();
        if (objH0 instanceof ResolveAndPlayPlayable.c.C0510c) {
            ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) objH0).f79314a).n();
        }
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final u o() {
        Object objH0 = this.f79417e.h0();
        return objH0 instanceof ResolveAndPlayPlayable.c.C0510c ? ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) objH0).f79314a).o() : null;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Duration q() {
        return this.f79417e.q();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Long> r() {
        return this.f79417e.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.flow.Flow<sb0.c> s() {
        /*
            r2 = this;
            r0 = r2
            tv.danmaku.biliplayerv2.service.U r0 = r0.h
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            kotlinx.coroutines.flow.Flow r0 = r0.s()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1d
        L16:
            sb0.c r0 = sb0.c.d
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
            r3 = r0
        L1d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl.s():kotlinx.coroutines.flow.Flow");
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
        return FlowKt.transformLatest(this.f79417e.f79303b, new PCSPlayableImpl$special$$inlined$flatMapLatest$2(null));
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object u(@NotNull Continuation<? super Long> continuation) {
        return this.f79424m.await(continuation);
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<A> v() {
        return this.f79422k;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a x() {
        Object objH0 = this.f79417e.h0();
        return objH0 instanceof ResolveAndPlayPlayable.c.C0510c ? ((InterfaceC5778f) ((ResolveAndPlayPlayable.c.C0510c) objH0).f79314a).x() : null;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Object y(long j7, boolean z6, @NotNull Continuation<? super Boolean> continuation) {
        return this.f79417e.y(j7, z6, continuation);
    }
}
