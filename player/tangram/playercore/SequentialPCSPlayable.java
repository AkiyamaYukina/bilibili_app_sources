package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
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
import tv.danmaku.biliplayerv2.service.L;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable.class */
public final class SequentialPCSPlayable implements v, com.bilibili.player.tangram.basic.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Flow<Boolean> f79430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<v> f79431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Channel<a> f79432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f79433d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Job f79434a;
    }

    public SequentialPCSPlayable() {
        this(FlowKt.flowOf(Boolean.FALSE));
    }

    public SequentialPCSPlayable(@NotNull Flow<Boolean> flow) {
        this.f79430a = flow;
        this.f79431b = StateFlowKt.MutableStateFlow((Object) null);
        this.f79432c = ChannelKt.Channel$default(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);
        this.f79433d = new ArrayList<>();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object M(com.bilibili.player.tangram.playercore.SequentialPCSPlayable r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$1 r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L34
        L2a:
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$1 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L34:
            r0 = r6
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L5e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L56
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L56:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L7d
        L5e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$2 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$2
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r5 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.SupervisorKt.supervisorScope(r0, r1)
            r1 = r8
            if (r0 != r1) goto L7d
            r0 = r8
            return r0
        L7d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.M(com.bilibili.player.tangram.playercore.SequentialPCSPlayable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.i
    @Nullable
    public final Object A(@NotNull String str, int i7, @NotNull Continuation<? super Unit> continuation) {
        Object objA;
        if ((Q() instanceof com.bilibili.player.tangram.basic.i) && (objA = ((com.bilibili.player.tangram.basic.i) Q()).A(str, i7, continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objA;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> B() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$9(null));
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<ResolveAndPlayPlayable.c<InterfaceC5778f>> C() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$2(null));
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
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$1 r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$1) r0
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
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$1 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$1
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
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$2 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$run$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.D(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // com.bilibili.player.tangram.playercore.v
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.SequentialPCSPlayable$triggerResolving$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$triggerResolving$1 r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable$triggerResolving$1) r0
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
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$triggerResolving$1 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$triggerResolving$1
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
            if (r0 == 0) goto L6e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L66
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L5c
            r0 = r6
            java.lang.Object r0 = r0.L$0
            java.util.Iterator r0 = (java.util.Iterator) r0
            r8 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L99
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L91
        L6e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L91
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r6
            java.lang.Object r0 = r0.E(r1)
            r1 = r8
            if (r0 != r1) goto L91
            r0 = r8
            return r0
        L91:
            r0 = r5
            java.util.ArrayList<com.bilibili.player.tangram.playercore.SequentialPCSPlayable$a> r0 = r0.f79433d
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L99:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto La6
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La6:
            r0 = r8
            java.lang.Object r0 = r0.next()
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$a r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable.a) r0
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            r1 = r8
            r0.L$0 = r1
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.E(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        v vVarQ = Q();
        return vVarQ != null ? vVarQ.F() : Duration.Companion.getZERO-UwyO8pc();
    }

    public final void G(@NotNull Function1<? super sb0.c, sb0.c> function1) {
        v vVarQ = Q();
        if (vVarQ != null) {
            vVarQ.G(function1);
        }
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<com.bilibili.player.tangram.basic.a> H() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$6(null));
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Duration> J() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$10(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @Override // com.bilibili.player.tangram.basic.l
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(@org.jetbrains.annotations.NotNull com.bilibili.player.tangram.basic.c r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.SequentialPCSPlayable$switchQuality$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$switchQuality$1 r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable$switchQuality$1) r0
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
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$switchQuality$1 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$switchQuality$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = 1
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L64
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L5a
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r6 = r0
            goto L8e
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L64:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L97
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.K(r1, r2)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r11
            if (r0 != r1) goto L8e
            r0 = r11
            return r0
        L8e:
            r0 = r6
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = r0
        L97:
            r0 = r9
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.K(com.bilibili.player.tangram.basic.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void N() {
        Iterator<a> it = this.f79433d.iterator();
        while (it.hasNext()) {
            Job job = it.next().f79434a;
            if (job != null) {
                job.cancel(new CancellationException("Dropped."));
            }
            it.remove();
        }
    }

    public final v Q() {
        return (v) this.f79431b.getValue();
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
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.R():sb0.c");
    }

    @NotNull
    public final Flow<L> T() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$8(null));
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
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
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
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.Z():tv.danmaku.biliplayerv2.service.L");
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<u> b() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$1(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r7, boolean r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r10) {
        /*
            r6 = this;
            r0 = r10
            boolean r0 = r0 instanceof com.bilibili.player.tangram.playercore.SequentialPCSPlayable$seekTo$1
            if (r0 == 0) goto L2f
            r0 = r10
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$seekTo$1 r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable$seekTo$1) r0
            r12 = r0
            r0 = r12
            int r0 = r0.label
            r11 = r0
            r0 = r11
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2f
            r0 = r12
            r1 = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r12
            r10 = r0
            goto L3b
        L2f:
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$seekTo$1 r0 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$seekTo$1
            r1 = r0
            r2 = r6
            r3 = r10
            r1.<init>(r2, r3)
            r10 = r0
        L3b:
            r0 = r10
            java.lang.Object r0 = r0.result
            r12 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r13 = r0
            r0 = r10
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6f
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L65
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r12
            r10 = r0
            goto La0
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6f:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Lac
            r0 = r10
            r1 = 1
            r0.label = r1
            r0 = r12
            r1 = r7
            r2 = r9
            r3 = r10
            java.lang.Object r0 = r0.c(r1, r2, r3)
            r12 = r0
            r0 = r12
            r10 = r0
            r0 = r12
            r1 = r13
            if (r0 != r1) goto La0
            r0 = r13
            return r0
        La0:
            r0 = r10
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r9 = r0
            goto Lae
        Lac:
            r0 = 0
            r9 = r0
        Lae:
            r0 = r9
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.c(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$3(null, this));
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object d0(@NotNull Function2 function2, @NotNull SuspendLambda suspendLambda) {
        Object objD0;
        v vVarQ = Q();
        if (vVarQ != null && (objD0 = vVarQ.d0(function2, suspendLambda)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objD0;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.bilibili.player.tangram.basic.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.flow.Flow<com.bilibili.player.tangram.basic.PlayNetworkEnv> e() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            kotlinx.coroutines.flow.Flow r0 = r0.e()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1d
        L16:
            com.bilibili.player.tangram.basic.PlayNetworkEnv$b r0 = com.bilibili.player.tangram.basic.PlayNetworkEnv.b.f79289a
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
            r3 = r0
        L1d:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.e():kotlinx.coroutines.flow.Flow");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.bilibili.player.tangram.playercore.v
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.c<com.bilibili.player.tangram.playercore.InterfaceC5778f> h0() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c r0 = r0.h0()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L16:
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c$b r0 = com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.c.b.f79313a
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.h0():com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c");
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a i() {
        v vVarQ = Q();
        return vVarQ != null ? vVarQ.i() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // com.bilibili.player.tangram.basic.j
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.player.tangram.basic.PlayerAvailability k() {
        /*
            r2 = this;
            r0 = r2
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto L16
            r0 = r3
            com.bilibili.player.tangram.basic.PlayerAvailability r0 = r0.k()
            r4 = r0
            r0 = r4
            r3 = r0
            r0 = r4
            if (r0 != 0) goto L1a
        L16:
            com.bilibili.player.tangram.basic.PlayerAvailability r0 = com.bilibili.player.tangram.basic.PlayerAvailability.IDLE
            r3 = r0
        L1a:
            r0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable.k():com.bilibili.player.tangram.basic.PlayerAvailability");
    }

    @Override // com.bilibili.player.tangram.playercore.v
    public final void n() {
        v vVarQ = Q();
        if (vVarQ != null) {
            vVarQ.n();
        }
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final u o() {
        v vVar = (v) this.f79431b.getValue();
        return vVar != null ? vVar.o() : null;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Duration q() {
        v vVarQ = Q();
        return vVarQ != null ? vVarQ.q() : null;
    }

    @NotNull
    public final Flow<sb0.c> s() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$7(null));
    }

    @Override // com.bilibili.player.tangram.basic.l
    @NotNull
    public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$5(null));
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @Nullable
    public final Object u(@NotNull Continuation<? super Long> continuation) {
        return FlowKt.first(FlowKt.mapLatest(this.f79431b, new SequentialPCSPlayable$awaitFirstFrame$2(null)), continuation);
    }

    @Override // com.bilibili.player.tangram.playercore.v
    @NotNull
    public final Flow<A> v() {
        return FlowKt.transformLatest(this.f79431b, new SequentialPCSPlayable$special$$inlined$flatMapLatest$4(null));
    }

    @Override // com.bilibili.player.tangram.basic.l
    @Nullable
    public final com.bilibili.player.tangram.basic.a x() {
        v vVarQ = Q();
        return vVarQ != null ? vVarQ.x() : null;
    }
}
