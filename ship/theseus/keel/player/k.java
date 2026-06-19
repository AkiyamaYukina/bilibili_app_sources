package com.bilibili.ship.theseus.keel.player;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.basic.WithVideoProgress;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.PCSPlayableImpl;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.player.tangram.playercore.v;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/k.class */
public final class k implements j, com.bilibili.player.tangram.basic.i, v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final KProperty<Object>[] f91112i = {new MutablePropertyReference1Impl(k.class, "usesTrialQuality", "getUsesTrialQuality()Z", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<GeminiCommonPlayableParams> f91113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PCSPlayableImpl f91114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow f91115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final ii1.a f91116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CB.g f91117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<Continuation<? super Unit>, Object> f91118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final m f91119g;

    @NotNull
    public final TheseusPlayableImpl$masterPieceProgress$1 h = new TheseusPlayableImpl$masterPieceProgress$1(this);

    public k(@NotNull MutableStateFlow mutableStateFlow, @NotNull PCSPlayableImpl pCSPlayableImpl, @NotNull MutableSharedFlow mutableSharedFlow, @Nullable ii1.a aVar, @NotNull CB.g gVar, @NotNull m mVar, @NotNull Function1 function1) {
        this.f91113a = mutableStateFlow;
        this.f91114b = pCSPlayableImpl;
        this.f91115c = mutableSharedFlow;
        this.f91116d = aVar;
        this.f91117e = gVar;
        this.f91118f = function1;
        this.f91119g = mVar;
    }

    @Override // com.bilibili.player.tangram.basic.i
    @Nullable
    public final Object A(@NotNull String str, int i7, @NotNull Continuation<? super Unit> continuation) {
        Object objA = this.f91114b.A(str, i7, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> B() {
        return this.f91114b.B();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<ResolveAndPlayPlayable.c<InterfaceC5778f>> C() {
        return this.f91114b.f79417e.f79303b;
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
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$1 r0 = (com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$1) r0
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
            com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$1 r0 = new com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$1
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
            if (r0 == 0) goto L59
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L51
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7a
        L59:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$2 r0 = new com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$run$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r8
            if (r0 != r1) goto L7a
            r0 = r8
            return r0
        L7a:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.k.D(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object E(@NotNull Continuation<? super Unit> continuation) {
        return this.f91114b.E(continuation);
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        return this.f91114b.f79417e.F();
    }

    public final void G(@NotNull Function1<? super sb0.c, sb0.c> function1) {
        this.f91114b.G(function1);
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> H() {
        return this.f91114b.H();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Duration> J() {
        return this.f91114b.f79417e.J();
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final Object K(@NotNull com.bilibili.player.tangram.basic.c cVar, @NotNull ContinuationImpl continuationImpl) {
        return this.f91114b.K(cVar, continuationImpl);
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long L() {
        return this.f91114b.f79417e.L();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    @Nullable
    public final Fragment O() {
        return (Fragment) this.f91117e.invoke();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    public final void P(boolean z6) {
        this.f91119g.setValue(this, f91112i[0], Boolean.valueOf(z6));
    }

    @NotNull
    public final sb0.c R() {
        return this.f91114b.R();
    }

    @NotNull
    public final Flow<L> T() {
        return this.f91114b.T();
    }

    @NotNull
    public final L Z() {
        return this.f91114b.Z();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    @Nullable
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        PCSPlayableImpl pCSPlayableImpl = this.f91114b;
        Object objC = pCSPlayableImpl.c(pCSPlayableImpl.R().b, false, continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<u> b() {
        return this.f91114b.b();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Object c(long j7, boolean z6, @NotNull Continuation<? super Boolean> continuation) {
        return this.f91114b.f79417e.c(j7, z6, continuation);
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return this.f91114b.f79417e.d();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object d0(@NotNull Function2 function2, @NotNull SuspendLambda suspendLambda) {
        return this.f91114b.d0(function2, suspendLambda);
    }

    @Override // com.bilibili.player.tangram.basic.k
    @NotNull
    public final Flow<PlayNetworkEnv> e() {
        return this.f91114b.f79419g.e();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    @NotNull
    public final GeminiCommonPlayableParams f() {
        return (GeminiCommonPlayableParams) this.f91113a.getValue();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    @NotNull
    public final Flow<PlayViewUniteReply> g() {
        return this.f91115c;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Long h() {
        return this.f91114b.f79417e.h();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final ResolveAndPlayPlayable.c<InterfaceC5778f> h0() {
        return this.f91114b.f79417e.h0();
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a i() {
        return this.f91114b.i();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    public final void j(@NotNull GeminiCommonPlayableParams geminiCommonPlayableParams) {
        this.f91113a.setValue(geminiCommonPlayableParams);
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final PlayerAvailability k() {
        return this.f91114b.f79417e.k();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    @NotNull
    public final StateFlow<GeminiCommonPlayableParams> l() {
        return this.f91113a;
    }

    @Override // com.bilibili.player.tangram.playercore.G
    public final boolean m(@NotNull u uVar) {
        return this.f91114b.m(uVar);
    }

    @Override // com.bilibili.player.tangram.playercore.v
    public final void n() {
        this.f91114b.n();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final u o() {
        return this.f91114b.o();
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    @NotNull
    public final WithVideoProgress p() {
        return this.h;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Duration q() {
        return this.f91114b.f79417e.q();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Long> r() {
        return this.f91114b.f79417e.r();
    }

    @NotNull
    public final Flow<sb0.c> s() {
        return this.f91114b.s();
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
        return this.f91114b.t();
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object u(@NotNull Continuation<? super Long> continuation) {
        return this.f91114b.f79424m.await(continuation);
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<A> v() {
        return this.f91114b.f79422k;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a x() {
        return this.f91114b.x();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Object y(long j7, boolean z6, @NotNull Continuation<? super Boolean> continuation) {
        return this.f91114b.f79417e.y(j7, z6, continuation);
    }

    @Override // com.bilibili.ship.theseus.keel.player.j
    public final boolean z() {
        return ((Boolean) this.f91119g.getValue(this, f91112i[0])).booleanValue();
    }
}
