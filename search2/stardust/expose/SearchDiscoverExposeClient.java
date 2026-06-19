package com.bilibili.search2.stardust.expose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/SearchDiscoverExposeClient.class */
@StabilityInferred(parameters = 0)
public final class SearchDiscoverExposeClient implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final g f88730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<Ws0.a> f88731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<f> f88732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LifecycleCoroutineScope f88733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f88735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f88736g;
    public int h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f88737i = new h();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final d f88738j = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f88739k;

    /* JADX INFO: renamed from: com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/SearchDiscoverExposeClient$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SearchDiscoverExposeClient this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/SearchDiscoverExposeClient$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Ws0.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final SearchDiscoverExposeClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchDiscoverExposeClient searchDiscoverExposeClient, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchDiscoverExposeClient;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Ws0.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.a(((Ws0.a) this.L$0).f27346a ? "keyboard close" : "keyboard open");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SearchDiscoverExposeClient searchDiscoverExposeClient, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = searchDiscoverExposeClient;
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
                SearchDiscoverExposeClient searchDiscoverExposeClient = this.this$0;
                StateFlow<Ws0.a> stateFlow = searchDiscoverExposeClient.f88731b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchDiscoverExposeClient, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/SearchDiscoverExposeClient$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final SearchDiscoverExposeClient this$0;

        /* JADX INFO: renamed from: com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/stardust/expose/SearchDiscoverExposeClient$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<f, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final SearchDiscoverExposeClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchDiscoverExposeClient searchDiscoverExposeClient, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchDiscoverExposeClient;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(f fVar, Continuation<? super Unit> continuation) {
                return create(fVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Job job;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((f) this.L$0).f88750a) {
                    this.this$0.a("page visible");
                } else {
                    Job job2 = this.this$0.f88739k;
                    if (job2 != null && job2.isActive() && (job = this.this$0.f88739k) != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SearchDiscoverExposeClient searchDiscoverExposeClient, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = searchDiscoverExposeClient;
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
                SearchDiscoverExposeClient searchDiscoverExposeClient = this.this$0;
                StateFlow<f> stateFlow = searchDiscoverExposeClient.f88732c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchDiscoverExposeClient, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public SearchDiscoverExposeClient(@NotNull g gVar, @NotNull StateFlow stateFlow, @NotNull StateFlow stateFlow2, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.f88730a = gVar;
        this.f88731b = stateFlow;
        this.f88732c = stateFlow2;
        this.f88733d = lifecycleCoroutineScope;
        gVar.f88755d = this;
        gVar.f88752a.addOnAttachStateChangeListener(new i(this));
        BuildersKt.launch$default(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(lifecycleCoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }

    @Override // com.bilibili.search2.stardust.expose.l
    public final void a(@NotNull String str) {
        Job job;
        defpackage.a.b("pendingExpose, start from = ", str, "[read][Search]SearchDiscoverExposeClient");
        Job job2 = this.f88739k;
        if (job2 != null && job2.isActive() && (job = this.f88739k) != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job jobLaunch$default = BuildersKt.launch$default(this.f88733d, (CoroutineContext) null, (CoroutineStart) null, new SearchDiscoverExposeClient$pendingExpose$1(this, str, null), 3, (Object) null);
        this.f88739k = jobLaunch$default;
        if (jobLaunch$default != null) {
            jobLaunch$default.invokeOnCompletion(new Bl0.a(2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(float r6, int r7, android.view.View r8, float r9, com.bilibili.search2.stardust.expose.b r10, com.bilibili.search2.stardust.expose.g r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.stardust.expose.SearchDiscoverExposeClient.b(float, int, android.view.View, float, com.bilibili.search2.stardust.expose.b, com.bilibili.search2.stardust.expose.g, boolean):void");
    }
}
