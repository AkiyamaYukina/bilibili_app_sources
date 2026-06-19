package com.bilibili.ship.theseus.playlist.di.driver;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.BizType;
import com.bilibili.ship.theseus.playlist.InterfaceC6240e;
import com.bilibili.ship.theseus.playlist.di.driver.a;
import com.bilibili.ship.theseus.sail.immatureplay.e;
import com.bilibili.ship.theseus.united.di.BusinessType;
import com.bilibili.ship.theseus.united.page.preload.PreloadRepository;
import com.bilibili.ship.theseus.united.player.mediaplay.d;
import ev0.InterfaceC7008a;
import ev0.g;
import ev0.h;
import ev0.j;
import ev0.l;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.a;
import tv.danmaku.videoplayer.coreV2.VideoBizType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl.class */
@StabilityInferred(parameters = 0)
public final class PlayListMediaScopeDriverImpl implements InterfaceC6240e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.di.driver.a f95449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f95451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a.X0 f95452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a.N0 f95453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a.D0 f95454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PreloadRepository f95455g;

    @NotNull
    public final C8043a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<a> f95456i = StateFlowKt.MutableStateFlow(a.C0777a.f95460a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f95457j = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f95458k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$1.class */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListMediaScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$1$1.class */
        public static final class C07761 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayListMediaScopeDriverImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07761(PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, Continuation<? super C07761> continuation) {
                super(2, continuation);
                this.this$0 = playListMediaScopeDriverImpl;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07761 c07761 = new C07761(this.this$0, continuation);
                c07761.L$0 = obj;
                return c07761;
            }

            public final Object invoke(a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a aVar = (a) this.L$0;
                    if (Intrinsics.areEqual(aVar, a.C0777a.f95460a)) {
                        BLog.i("PlayListMediaScopeDriverImpl$1$1-invokeSuspend", "[theseus-playlist-detail-PlayListMediaScopeDriverImpl$1$1-invokeSuspend] media scope change state to idle");
                    } else if (aVar instanceof a.c) {
                        BLog.i("PlayListMediaScopeDriverImpl$1$1-invokeSuspend", "[theseus-playlist-detail-PlayListMediaScopeDriverImpl$1$1-invokeSuspend] media scope change state to loading");
                    } else {
                        if (!(aVar instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl = this.this$0;
                        this.label = 1;
                        playListMediaScopeDriverImpl.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new PlayListMediaScopeDriverImpl$driveMediaScope$2((a.b) aVar, playListMediaScopeDriverImpl, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        public AnonymousClass1(PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playListMediaScopeDriverImpl;
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
                PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl = this.this$0;
                MutableStateFlow<a> mutableStateFlow = playListMediaScopeDriverImpl.f95456i;
                C07761 c07761 = new C07761(playListMediaScopeDriverImpl, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c07761, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$2.class */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayListMediaScopeDriverImpl this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayListMediaScopeDriverImpl f95459a;

            public a(PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl) {
                this.f95459a = playListMediaScopeDriverImpl;
            }

            public final Object emit(Object obj, Continuation continuation) {
                a.InterfaceC0778a interfaceC0778a = (a.InterfaceC0778a) obj;
                boolean z6 = interfaceC0778a instanceof a.InterfaceC0778a.b;
                PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl = this.f95459a;
                if (z6) {
                    BLog.i("PlayListMediaScopeDriverImpl$2$1-emit", "[theseus-playlist-detail-PlayListMediaScopeDriverImpl$2$1-emit] from play list shell driver call, switch media scope");
                    playListMediaScopeDriverImpl.d(((a.InterfaceC0778a.b) interfaceC0778a).f95471a);
                }
                if (interfaceC0778a instanceof a.InterfaceC0778a.C0779a) {
                    BLog.i("PlayListMediaScopeDriverImpl$2$1-emit", "[theseus-playlist-detail-PlayListMediaScopeDriverImpl$2$1-emit] from play list shell driver call, leave media scope");
                    playListMediaScopeDriverImpl.c();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playListMediaScopeDriverImpl;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
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
                PlayListMediaScopeDriverImpl playListMediaScopeDriverImpl = this.this$0;
                SharedFlow<a.InterfaceC0778a> sharedFlow = playListMediaScopeDriverImpl.f95449a.f95469c;
                a aVar = new a(playListMediaScopeDriverImpl);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0777a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0777a f95460a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$a$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BusinessType f95461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final d f95462b;

            public b(@NotNull BusinessType businessType, @NotNull d dVar) {
                this.f95461a = businessType;
                this.f95462b = dVar;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f95463a = new Object();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/driver/PlayListMediaScopeDriverImpl$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f95465b;

        static {
            int[] iArr = new int[BizType.values().length];
            try {
                iArr[BizType.BIZ_TYPE_UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PGC.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[BizType.BIZ_TYPE_PUGV.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f95464a = iArr;
            int[] iArr2 = new int[VideoBizType.values().length];
            try {
                iArr2[VideoBizType.PGC.ordinal()] = 1;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr2[VideoBizType.PUGV.ordinal()] = 2;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr2[VideoBizType.UGC.ordinal()] = 3;
            } catch (NoSuchFieldError e12) {
            }
            f95465b = iArr2;
        }
    }

    @Inject
    public PlayListMediaScopeDriverImpl(@NotNull com.bilibili.ship.theseus.playlist.di.driver.a aVar, @NotNull CoroutineScope coroutineScope, @NotNull e eVar, @NotNull a.X0 x02, @NotNull a.N0 n02, @NotNull a.D0 d02, @NotNull PreloadRepository preloadRepository, @NotNull C8043a c8043a) {
        this.f95449a = aVar;
        this.f95450b = coroutineScope;
        this.f95451c = eVar;
        this.f95452d = x02;
        this.f95453e = n02;
        this.f95454f = d02;
        this.f95455g = preloadRepository;
        this.h = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl r5, ev0.InterfaceC7008a.C1258a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl.b(com.bilibili.ship.theseus.playlist.di.driver.PlayListMediaScopeDriverImpl, ev0.a$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.ship.theseus.playlist.InterfaceC6240e
    public final void a(@NotNull InterfaceC7008a.C1258a c1258a, @Nullable l lVar, @Nullable h hVar, @Nullable g gVar) {
        this.f95456i.setValue(a.c.f95463a);
        Job job = this.f95458k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f95458k = BuildersKt.launch$default(this.f95450b, (CoroutineContext) null, (CoroutineStart) null, new PlayListMediaScopeDriverImpl$switchMediaScope$1(lVar, gVar, this, c1258a, hVar, null), 3, (Object) null);
    }

    public final void c() {
        Job job = this.f95458k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f95458k = null;
        this.f95456i.setValue(a.C0777a.f95460a);
    }

    public final void d(j.a aVar) {
        this.f95456i.setValue(new a.b(aVar.f117661e, new d(aVar)));
    }
}
