package com.bilibili.player.tangram.basic;

import com.bilibili.player.tangram.basic.e;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.n;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable.class */
public final class ResolveAndPlayPlayable<InnerPlayer extends e> implements WithVideoProgress, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d f79302a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f79305d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<c<InnerPlayer>> f79303b = StateFlowKt.MutableStateFlow(c.b.f79313a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Duration> f79304c = StateFlowKt.MutableStateFlow(Duration.box-impl(Duration.Companion.getZERO-UwyO8pc()));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Channel<b> f79306e = ChannelKt.Channel$default(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Channel<ResolveAndPlayPlayable<InnerPlayer>.a> f79307f = ChannelKt.Channel$default(0, (BufferOverflow) null, (Function1) null, 7, (Object) null);

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$a.class */
    public final class a implements CompletableDeferred<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CompletableDeferred<Boolean> f79308a = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final SuspendLambda f79309b;

        public a(@NotNull Function1 function1) {
            this.f79309b = (SuspendLambda) function1;
        }

        public final boolean a(boolean z6) {
            return this.f79308a.complete(Boolean.valueOf(z6));
        }

        @NotNull
        public final kotlinx.coroutines.l attachChild(@NotNull n nVar) {
            return this.f79308a.attachChild(nVar);
        }

        @Nullable
        public final Object await(@NotNull Continuation<? super Boolean> continuation) {
            return this.f79308a.await(continuation);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public final /* synthetic */ void cancel() {
            this.f79308a.cancel();
        }

        public final void cancel(@Nullable CancellationException cancellationException) {
            this.f79308a.cancel(cancellationException);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public final /* synthetic */ boolean cancel(Throwable th) {
            return this.f79308a.cancel(th);
        }

        public final boolean complete(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return this.f79308a.complete(bool);
        }

        public final boolean completeExceptionally(@NotNull Throwable th) {
            return this.f79308a.completeExceptionally(th);
        }

        public final <R> R fold(R r7, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) this.f79308a.fold(r7, function2);
        }

        @Nullable
        public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) this.f79308a.get(key);
        }

        @NotNull
        public final CancellationException getCancellationException() {
            return this.f79308a.getCancellationException();
        }

        @NotNull
        public final Sequence<Job> getChildren() {
            return this.f79308a.getChildren();
        }

        public final Object getCompleted() {
            return (Boolean) this.f79308a.getCompleted();
        }

        @Nullable
        public final Throwable getCompletionExceptionOrNull() {
            return this.f79308a.getCompletionExceptionOrNull();
        }

        @NotNull
        public final CoroutineContext.Key<?> getKey() {
            return this.f79308a.getKey();
        }

        @NotNull
        public final SelectClause1<Boolean> getOnAwait() {
            return this.f79308a.getOnAwait();
        }

        @NotNull
        public final kotlinx.coroutines.selects.c getOnJoin() {
            return this.f79308a.getOnJoin();
        }

        @Nullable
        public final Job getParent() {
            return this.f79308a.getParent();
        }

        @NotNull
        public final DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> function1) {
            return this.f79308a.invokeOnCompletion(function1);
        }

        @NotNull
        public final DisposableHandle invokeOnCompletion(boolean z6, boolean z7, @NotNull Function1<? super Throwable, Unit> function1) {
            return this.f79308a.invokeOnCompletion(z6, z7, function1);
        }

        public final boolean isActive() {
            return this.f79308a.isActive();
        }

        public final boolean isCancelled() {
            return this.f79308a.isCancelled();
        }

        public final boolean isCompleted() {
            return this.f79308a.isCompleted();
        }

        @Nullable
        public final Object join(@NotNull Continuation<? super Unit> continuation) {
            return this.f79308a.join(continuation);
        }

        @NotNull
        public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return this.f79308a.minusKey(key);
        }

        @NotNull
        public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return this.f79308a.plus(coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public final Job plus(@NotNull Job job) {
            return this.f79308a.plus(job);
        }

        public final boolean start() {
            return this.f79308a.start();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$b.class */
    public static final class b implements CompletableDeferred<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CompletableDeferred<Boolean> f79310a = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f79311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f79312c;

        public b(long j7, boolean z6) {
            this.f79311b = j7;
            this.f79312c = z6;
        }

        @NotNull
        public final kotlinx.coroutines.l attachChild(@NotNull n nVar) {
            return this.f79310a.attachChild(nVar);
        }

        @Nullable
        public final Object await(@NotNull Continuation<? super Boolean> continuation) {
            return this.f79310a.await(continuation);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public final /* synthetic */ void cancel() {
            this.f79310a.cancel();
        }

        public final void cancel(@Nullable CancellationException cancellationException) {
            this.f79310a.cancel(cancellationException);
        }

        @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public final /* synthetic */ boolean cancel(Throwable th) {
            return this.f79310a.cancel(th);
        }

        public final boolean complete(Object obj) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return this.f79310a.complete(bool);
        }

        public final boolean completeExceptionally(@NotNull Throwable th) {
            return this.f79310a.completeExceptionally(th);
        }

        public final <R> R fold(R r7, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) this.f79310a.fold(r7, function2);
        }

        @Nullable
        public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
            return (E) this.f79310a.get(key);
        }

        @NotNull
        public final CancellationException getCancellationException() {
            return this.f79310a.getCancellationException();
        }

        @NotNull
        public final Sequence<Job> getChildren() {
            return this.f79310a.getChildren();
        }

        public final Object getCompleted() {
            return (Boolean) this.f79310a.getCompleted();
        }

        @Nullable
        public final Throwable getCompletionExceptionOrNull() {
            return this.f79310a.getCompletionExceptionOrNull();
        }

        @NotNull
        public final CoroutineContext.Key<?> getKey() {
            return this.f79310a.getKey();
        }

        @NotNull
        public final SelectClause1<Boolean> getOnAwait() {
            return this.f79310a.getOnAwait();
        }

        @NotNull
        public final kotlinx.coroutines.selects.c getOnJoin() {
            return this.f79310a.getOnJoin();
        }

        @Nullable
        public final Job getParent() {
            return this.f79310a.getParent();
        }

        @NotNull
        public final DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> function1) {
            return this.f79310a.invokeOnCompletion(function1);
        }

        @NotNull
        public final DisposableHandle invokeOnCompletion(boolean z6, boolean z7, @NotNull Function1<? super Throwable, Unit> function1) {
            return this.f79310a.invokeOnCompletion(z6, z7, function1);
        }

        public final boolean isActive() {
            return this.f79310a.isActive();
        }

        public final boolean isCancelled() {
            return this.f79310a.isCancelled();
        }

        public final boolean isCompleted() {
            return this.f79310a.isCompleted();
        }

        @Nullable
        public final Object join(@NotNull Continuation<? super Unit> continuation) {
            return this.f79310a.join(continuation);
        }

        @NotNull
        public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
            return this.f79310a.minusKey(key);
        }

        @NotNull
        public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return this.f79310a.plus(coroutineContext);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @NotNull
        public final Job plus(@NotNull Job job) {
            return this.f79310a.plus(job);
        }

        public final boolean start() {
            return this.f79310a.start();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$c.class */
    public interface c<InnerPlayer extends e> {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$c$a.class */
        public static final class a implements c {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$c$b.class */
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f79313a = new Object();
        }

        /* JADX INFO: renamed from: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$c$c.class */
        public static final class C0510c<InnerPlayer extends e> implements c<InnerPlayer> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InnerPlayer f79314a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final Object f79315b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public Job f79316c;

            public C0510c(@NotNull InnerPlayer innerplayer, @Nullable Object obj) {
                this.f79314a = innerplayer;
                this.f79315b = obj;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/ResolveAndPlayPlayable$c$d.class */
        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final Job f79317a;

            public d(@NotNull Job job) {
                this.f79317a = job;
            }
        }
    }

    public ResolveAndPlayPlayable(@NotNull d dVar) {
        this.f79302a = dVar;
    }

    public static final <InnerPlayer extends e> void m(CoroutineScope coroutineScope, ResolveAndPlayPlayable<InnerPlayer> resolveAndPlayPlayable, ResolveAndPlayPlayable<InnerPlayer>.a aVar) {
        Job jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new ResolveAndPlayPlayable$resolveInner$enterResolvingStage$resolvingJob$1(aVar, resolveAndPlayPlayable, null), 1, (Object) null);
        if (jobLaunch$default.isCompleted()) {
            return;
        }
        resolveAndPlayPlayable.s(new c.d(jobLaunch$default));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$1
            if (r0 == 0) goto L25
            r0 = r6
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$1 r0 = (com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$1) r0
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
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$1 r0 = new com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$1
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
            goto L96
        L5e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto L87
        L66:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$2 r0 = new com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$run$2
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
            if (r0 != r1) goto L87
            r0 = r8
            return r0
        L87:
            r0 = r6
            r1 = 2
            r0.label = r1
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)
            r1 = r8
            if (r0 != r1) goto L96
            r0 = r8
            return r0
        L96:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.D(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    public final long F() {
        c<InnerPlayer> cVarH0 = h0();
        return cVarH0 instanceof c.C0510c ? ((c.C0510c) cVarH0).f79314a.F() : ((Duration) this.f79304c.getValue()).unbox-impl();
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @NotNull
    public final Flow<Duration> J() {
        return FlowKt.transformLatest(this.f79303b, new ResolveAndPlayPlayable$special$$inlined$flatMapLatest$2(null, this));
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
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.c(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final Flow<PlayerAvailability> d() {
        return FlowKt.transformLatest(this.f79303b, new ResolveAndPlayPlayable$special$$inlined$flatMapLatest$1(null));
    }

    @Nullable
    public final Object e(@NotNull Function1<? super Continuation<? super InnerPlayer>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.f79307f.send(new a(function1), continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }

    @NotNull
    public final c<InnerPlayer> h0() {
        return (c) this.f79303b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1 r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            r0 = r7
            boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$resolveAndAwait$1
            if (r0 == 0) goto L29
            r0 = r7
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$resolveAndAwait$1 r0 = (com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$resolveAndAwait$1) r0
            r9 = r0
            r0 = r9
            int r0 = r0.label
            r8 = r0
            r0 = r8
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L29
            r0 = r9
            r1 = r8
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r9
            r7 = r0
            goto L33
        L29:
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$resolveAndAwait$1 r0 = new com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$resolveAndAwait$1
            r1 = r0
            r2 = r5
            r3 = r7
            r1.<init>(r2, r3)
            r7 = r0
        L33:
            r0 = r7
            java.lang.Object r0 = r0.result
            r9 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r7
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L76
            r0 = r8
            r1 = 1
            if (r0 == r1) goto L66
            r0 = r8
            r1 = 2
            if (r0 != r1) goto L5c
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            r6 = r0
            goto Lc1
        L5c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L66:
            r0 = r7
            java.lang.Object r0 = r0.L$0
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$a r0 = (com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.a) r0
            r6 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            goto La1
        L76:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$a r0 = new com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$a
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r6 = r0
            r0 = r7
            r1 = r6
            r0.L$0 = r1
            r0 = r7
            r1 = 1
            r0.label = r1
            r0 = r5
            kotlinx.coroutines.channels.Channel<com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<InnerPlayer>$a> r0 = r0.f79307f
            r1 = r6
            r2 = r7
            java.lang.Object r0 = r0.send(r1, r2)
            r1 = r10
            if (r0 != r1) goto La1
            r0 = r10
            return r0
        La1:
            r0 = r7
            r1 = 0
            r0.L$0 = r1
            r0 = r7
            r1 = 2
            r0.label = r1
            r0 = r6
            kotlinx.coroutines.CompletableDeferred<java.lang.Boolean> r0 = r0.f79308a
            r1 = r7
            java.lang.Object r0 = r0.await(r1)
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r10
            if (r0 != r1) goto Lc1
            r0 = r10
            return r0
        Lc1:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.i(kotlin.jvm.functions.Function1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.bilibili.player.tangram.basic.j
    @NotNull
    public final PlayerAvailability k() throws NoWhenBranchMatchedException {
        PlayerAvailability playerAvailabilityK;
        c<InnerPlayer> cVarH0 = h0();
        if (cVarH0 instanceof c.b) {
            playerAvailabilityK = PlayerAvailability.IDLE;
        } else if (cVarH0 instanceof c.d) {
            playerAvailabilityK = PlayerAvailability.LOADING;
        } else if (cVarH0 instanceof c.C0510c) {
            playerAvailabilityK = ((c.C0510c) cVarH0).f79314a.k();
        } else {
            if (!(cVarH0 instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            playerAvailabilityK = PlayerAvailability.ERROR;
        }
        return playerAvailabilityK;
    }

    @Override // com.bilibili.player.tangram.basic.WithVideoProgress
    @Nullable
    public final Duration q() {
        c<InnerPlayer> cVarH0 = h0();
        return cVarH0 instanceof c.C0510c ? ((c.C0510c) cVarH0).f79314a.q() : null;
    }

    public final void s(c<? extends InnerPlayer> cVar) {
        defpackage.a.b("[tangram-basic-ResolveAndPlayPlayable-setPlayerStage] ", "Stage " + cVar, "ResolveAndPlayPlayable-setPlayerStage");
        this.f79303b.setValue(cVar);
    }
}
