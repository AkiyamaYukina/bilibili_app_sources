package com.bilibili.ship.theseus.playlist.di.driver;

import Pb.F;
import Pb.G;
import android.app.Activity;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.lib.accounts.BiliAccountInfoKt;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.playlist.InterfaceC6217d;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.di.driver.a;
import com.bilibili.ship.theseus.sail.f;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.error.TheseusPageErrorStateService;
import dagger.internal.Provider;
import ev0.InterfaceC7008a;
import ev0.g;
import ev0.h;
import ev0.l;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl.class */
@StabilityInferred(parameters = 0)
public final class PlayListBusinessScopeDriverImpl implements InterfaceC6217d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Activity f95410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.di.driver.a f95412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f95413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayListMediaScopeDriverImpl f95414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a.P0 f95415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a.Z0 f95416g;

    @NotNull
    public final a.G0.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a.H0 f95417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.performance.a f95418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f95419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f95420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final C8043a f95421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f95422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final TheseusPageErrorStateService f95423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final BiliAccountInfo f95424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final Ku0.a f95425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final wv0.a f95426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final ReloadOnAccountInfoChangeService f95428t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f95429u = StateFlowKt.MutableStateFlow(a.c.f95437a);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Job f95430v;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListBusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayListBusinessScopeDriverImpl f95431a;

            public a(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl) {
                this.f95431a = playListBusinessScopeDriverImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                a.InterfaceC0778a interfaceC0778a = (a.InterfaceC0778a) obj;
                if (interfaceC0778a instanceof a.InterfaceC0778a.d) {
                    BLog.i("PlayListBusinessScopeDriverImpl$1$1-emit", "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl$1$1-emit] from play list shell driver call, reload view");
                    this.f95431a.d();
                }
                if (interfaceC0778a instanceof a.InterfaceC0778a.c) {
                    BLog.i("PlayListBusinessScopeDriverImpl$1$1-emit", "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl$1$1-emit] from play list shell driver call, switch to new video");
                    a.InterfaceC0778a.c cVar = (a.InterfaceC0778a.c) interfaceC0778a;
                    this.f95431a.e(cVar.f95472a, cVar.f95473b, cVar.f95474c, cVar.f95475d, cVar.f95476e);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playListBusinessScopeDriverImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl = this.this$0;
                SharedFlow<a.InterfaceC0778a> sharedFlow = playListBusinessScopeDriverImpl.f95412c.f95469c;
                a aVar = new a(playListBusinessScopeDriverImpl);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListBusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayListBusinessScopeDriverImpl f95432a;

            public a(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl) {
                this.f95432a = playListBusinessScopeDriverImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl = this.f95432a;
                Job job = playListBusinessScopeDriverImpl.f95430v;
                if (job == null || !job.isActive()) {
                    playListBusinessScopeDriverImpl.d();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playListBusinessScopeDriverImpl;
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
                PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl = this.this$0;
                Flow<Unit> flow = playListBusinessScopeDriverImpl.f95428t.f98798b;
                a aVar = new a(playListBusinessScopeDriverImpl);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListBusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayListBusinessScopeDriverImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playListBusinessScopeDriverImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl = this.this$0;
                    this.label = 1;
                    if (PlayListBusinessScopeDriverImpl.c(playListBusinessScopeDriverImpl, aVar, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playListBusinessScopeDriverImpl;
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
                PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl = this.this$0;
                MutableStateFlow<a> mutableStateFlow = playListBusinessScopeDriverImpl.f95429u;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playListBusinessScopeDriverImpl, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$4.class */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListBusinessScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<AccountInfo, AccountInfo, Continuation<? super AccountInfo>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final PlayListBusinessScopeDriverImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
                this.this$0 = playListBusinessScopeDriverImpl;
            }

            public final Object invoke(AccountInfo accountInfo, AccountInfo accountInfo2, Continuation<? super AccountInfo> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = accountInfo;
                anonymousClass1.L$1 = accountInfo2;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AccountInfo accountInfo = (AccountInfo) this.L$0;
                AccountInfo accountInfo2 = (AccountInfo) this.L$1;
                if (accountInfo != null && !accountInfo.isFormalAccount() && accountInfo2 != null && accountInfo2.isFormalAccount()) {
                    a aVar = (a) this.this$0.f95429u.getValue();
                    if (aVar instanceof a.b) {
                        PlayListBusinessScopeDriverImpl.f(this.this$0, ((a.b) aVar).f95434a, 30);
                    }
                }
                return accountInfo2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playListBusinessScopeDriverImpl;
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
                Flow flowA = BiliAccountInfoKt.a(this.this$0.f95422n);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.reduce(flowA, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0775a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0775a f95433a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0775a);
            }

            public final int hashCode() {
                return 1790910740;
            }

            @NotNull
            public final String toString() {
                return "Dummy";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f95434a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Throwable f95435b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.united.page.error.a f95436c;

            public b(@NotNull InterfaceC7008a.C1258a c1258a, @NotNull Throwable th, @NotNull com.bilibili.ship.theseus.united.page.error.a aVar) {
                this.f95434a = c1258a;
                this.f95435b = th;
                this.f95436c = aVar;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f95437a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1327569432;
            }

            @NotNull
            public final String toString() {
                return "Idle";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.sail.e f95438a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final String f95439b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f95440c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final CompletableDeferred<Unit> f95441d = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @Nullable
            public Provider f95442e;

            public d(@NotNull com.bilibili.ship.theseus.sail.e eVar, @NotNull String str, @NotNull InterfaceC7008a.C1258a c1258a) {
                this.f95438a = eVar;
                this.f95439b = str;
                this.f95440c = c1258a;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$e.class */
        @StabilityInferred(parameters = 0)
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InterfaceC7008a.C1258a f95443a;

            public e(@NotNull InterfaceC7008a.C1258a c1258a) {
                this.f95443a = c1258a;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$f.class */
        @StabilityInferred(parameters = 1)
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final String f95444a;

            public f(@Nullable String str) {
                this.f95444a = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$g.class */
        @StabilityInferred(parameters = 1)
        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final String f95445a;

            public g(@Nullable String str) {
                this.f95445a = str;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$a$h.class */
        @StabilityInferred(parameters = 1)
        public static final class h implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f95446a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1509386561;
            }

            @NotNull
            public final String toString() {
                return "Teenager";
            }
        }
    }

    @Inject
    public PlayListBusinessScopeDriverImpl(@NotNull Activity activity, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.playlist.di.driver.a aVar, @NotNull f fVar, @NotNull PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, @NotNull a.P0 p02, @NotNull a.Z0 z02, @NotNull a.G0.a aVar2, @NotNull a.H0 h02, @NotNull com.bilibili.ship.theseus.united.page.performance.a aVar3, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageAdRepository pageAdRepository, @NotNull C8043a c8043a, @NotNull BiliAccounts biliAccounts, @NotNull TheseusPageErrorStateService theseusPageErrorStateService, @NotNull BiliAccountInfo biliAccountInfo, @NotNull Ku0.a aVar4, @NotNull wv0.a aVar5, @NotNull PlaylistRepository playlistRepository, @NotNull ReloadOnAccountInfoChangeService reloadOnAccountInfoChangeService) {
        this.f95410a = activity;
        this.f95411b = coroutineScope;
        this.f95412c = aVar;
        this.f95413d = fVar;
        this.f95414e = playListMediaScopeDriverImpl;
        this.f95415f = p02;
        this.f95416g = z02;
        this.h = aVar2;
        this.f95417i = h02;
        this.f95418j = aVar3;
        this.f95419k = activityColorRepository;
        this.f95420l = pageAdRepository;
        this.f95421m = c8043a;
        this.f95422n = biliAccounts;
        this.f95423o = theseusPageErrorStateService;
        this.f95424p = biliAccountInfo;
        this.f95425q = aVar4;
        this.f95426r = aVar5;
        this.f95427s = playlistRepository;
        this.f95428t = reloadOnAccountInfoChangeService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    public static void b(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl r6, com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.c(com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl, com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static /* synthetic */ void f(PlayListBusinessScopeDriverImpl playListBusinessScopeDriverImpl, InterfaceC7008a.C1258a c1258a, int i7) {
        playListBusinessScopeDriverImpl.e(c1258a, null, null, null, (i7 & 16) != 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1] */
    @Override // com.bilibili.ship.theseus.playlist.InterfaceC6217d
    @NotNull
    public final PlayListBusinessScopeDriverImpl$special$$inlined$map$1 a() {
        final MutableStateFlow<a> mutableStateFlow = this.f95429u;
        return new Flow<Boolean>(mutableStateFlow) { // from class: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f95447a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f95448a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2$1.class */
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
                    this.f95448a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
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
                        com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1$2$1
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
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L86
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a r0 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a) r0
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.d
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        r6 = r0
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f95448a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L86
                        r0 = r9
                        return r0
                    L86:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f95447a = mutableStateFlow;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f95447a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r5 = this;
            r0 = r5
            kotlinx.coroutines.flow.MutableStateFlow<com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a> r0 = r0.f95429u
            r7 = r0
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a r0 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a) r0
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.e
            if (r0 == 0) goto L26
            r0 = r5
            r1 = r6
            com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a$e r1 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.e) r1
            ev0.a$a r1 = r1.f95443a
            r2 = 30
            f(r0, r1, r2)
            goto La2
        L26:
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.b
            if (r0 == 0) goto L3d
            r0 = r5
            r1 = r6
            com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a$b r1 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.b) r1
            ev0.a$a r1 = r1.f95434a
            r2 = 14
            f(r0, r1, r2)
            goto La2
        L3d:
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.d
            if (r0 == 0) goto L71
            r0 = r6
            com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a$d r0 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a.d) r0
            r8 = r0
            r0 = r8
            dagger.internal.Provider r0 = r0.f95442e
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L62
            r0 = r6
            java.lang.Object r0 = r0.get()
            ev0.a$a r0 = (ev0.InterfaceC7008a.C1258a) r0
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L67
        L62:
            r0 = r8
            ev0.a$a r0 = r0.f95440c
            r6 = r0
        L67:
            r0 = r5
            r1 = r6
            r2 = 30
            f(r0, r1, r2)
            goto La2
        L71:
            r0 = r7
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl$a r0 = (com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.a) r0
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "Cannot reload in  "
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl-reloadView] "
            r1 = r6
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "PlayListBusinessScopeDriverImpl-reloadView"
            r3 = 0
            com.bilibili.bangumi.logic.page.detail.service.f.a(r0, r1, r2, r3)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlayListBusinessScopeDriverImpl.d():void");
    }

    public final void e(InterfaceC7008a.C1258a c1258a, h hVar, l lVar, g gVar, boolean z6) {
        MutableStateFlow<a> mutableStateFlow = this.f95429u;
        a aVar = (a) mutableStateFlow.getValue();
        if ((aVar instanceof a.c) || (aVar instanceof a.e) || (aVar instanceof a.b)) {
            mutableStateFlow.setValue(new a.e(c1258a));
        } else if (aVar instanceof a.d) {
            a.d dVar = (a.d) aVar;
            if (dVar.f95438a.getBusinessType() == BusinessType.OGV) {
                mutableStateFlow.setValue(new a.e(c1258a));
            } else {
                dVar.f95441d.complete(Unit.INSTANCE);
            }
        }
        if (z6) {
            this.f95414e.a(c1258a, lVar, hVar, gVar);
        }
        BLog.i("PlayListBusinessScopeDriverImpl-switchToNewVideo", "[theseus-playlist-detail-PlayListBusinessScopeDriverImpl-switchToNewVideo] View call start.");
        Job job = this.f95430v;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f95430v = BuildersKt.launch$default(this.f95411b, (CoroutineContext) null, (CoroutineStart) null, new PlayListBusinessScopeDriverImpl$switchToNewVideo$1(this, c1258a, null), 3, (Object) null);
    }
}
