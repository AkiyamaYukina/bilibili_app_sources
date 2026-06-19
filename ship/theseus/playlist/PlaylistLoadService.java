package com.bilibili.ship.theseus.playlist;

import android.util.ArrayMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4667i;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.ListResponse;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.PlaylistInfo;
import com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistLoadService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ReloadOnAccountInfoChangeService f95046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<c> f95047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SharedFlow<c> f95048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<PlaylistRepository.b> f95049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final StateFlow<PlaylistRepository.b> f95050g;

    @NotNull
    public final ArrayMap<Integer, List<MultiTypeMedia>> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.playlist.util.c f95051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final b f95052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final b f95053k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistLoadService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistLoadService f95054a;

            public a(PlaylistLoadService playlistLoadService) {
                this.f95054a = playlistLoadService;
            }

            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                Object objB = PlaylistLoadService.b(this.f95054a, (c) obj, continuation);
                if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objB = Unit.INSTANCE;
                }
                return objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistLoadService playlistLoadService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistLoadService;
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
                PlaylistLoadService playlistLoadService = this.this$0;
                SharedFlow<c> sharedFlow = playlistLoadService.f95048e;
                a aVar = new a(playlistLoadService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistLoadService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistLoadService playlistLoadService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistLoadService;
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
                PlaylistLoadService playlistLoadService = this.this$0;
                this.label = 1;
                if (PlaylistLoadService.a(playlistLoadService, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistLoadService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlaylistLoadService playlistLoadService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playlistLoadService;
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
                PlaylistLoadService playlistLoadService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(playlistLoadService.f95045b.f95111s, new PlaylistLoadService$collectPlayingMediaIndex$2(playlistLoadService, null), this);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistLoadService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$4$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistLoadService f95055a;

            public a(PlaylistLoadService playlistLoadService) {
                this.f95055a = playlistLoadService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                BLog.i("PlaylistLoadService$4$1-emit", "[theseus-playlist-PlaylistLoadService$4$1-emit] Login status changed, try to refresh playlist info.");
                Object objC = PlaylistLoadService.c(this.f95055a, continuation);
                if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = Unit.INSTANCE;
                }
                return objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PlaylistLoadService playlistLoadService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = playlistLoadService;
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
                PlaylistLoadService playlistLoadService = this.this$0;
                Flow<Unit> flow = playlistLoadService.f95046c.f98798b;
                a aVar = new a(playlistLoadService);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f95056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f95057b;

        public a() {
            this(true, true);
        }

        public a(boolean z6, boolean z7) {
            this.f95056a = z6;
            this.f95057b = z7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f95058a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f95059b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f95060c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f95061d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f95062e = 0;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$c.class */
    public interface c {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$c$a.class */
        @StabilityInferred(parameters = 0)
        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final b f95063a;

            public a(@NotNull b bVar) {
                this.f95063a = bVar;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean a() {
                return false;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            @NotNull
            public final b b() {
                return this.f95063a;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean c() {
                return false;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$c$b.class */
        @StabilityInferred(parameters = 0)
        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final CompletableDeferred<Unit> f95064a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final b f95065b = new b();

            public b(@NotNull CompletableDeferred<Unit> completableDeferred) {
                this.f95064a = completableDeferred;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean a() {
                return false;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            @NotNull
            public final b b() {
                return this.f95065b;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean c() {
                return true;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistLoadService$c$c, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$c$c.class */
        @StabilityInferred(parameters = 0)
        public static final class C0768c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final b f95066a;

            public C0768c(@NotNull b bVar) {
                this.f95066a = bVar;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean a() {
                return true;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            @NotNull
            public final b b() {
                return this.f95066a;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean c() {
                return false;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistLoadService$c$d.class */
        @StabilityInferred(parameters = 0)
        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @Nullable
            public final CompletableDeferred<Unit> f95067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final b f95068b = new b();

            public d(@Nullable CompletableDeferred<Unit> completableDeferred) {
                this.f95067a = completableDeferred;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean a() {
                return false;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            @NotNull
            public final b b() {
                return this.f95068b;
            }

            @Override // com.bilibili.ship.theseus.playlist.PlaylistLoadService.c
            public final boolean c() {
                return true;
            }
        }

        boolean a();

        @NotNull
        b b();

        boolean c();
    }

    @Inject
    public PlaylistLoadService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull a aVar, boolean z6, @NotNull ReloadOnAccountInfoChangeService reloadOnAccountInfoChangeService) {
        this.f95044a = coroutineScope;
        this.f95045b = playlistRepository;
        this.f95046c = reloadOnAccountInfoChangeService;
        MutableSharedFlow<c> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95047d = mutableSharedFlowMutableSharedFlow$default;
        this.f95048e = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<PlaylistRepository.b> MutableStateFlow = StateFlowKt.MutableStateFlow(new PlaylistRepository.b(false, aVar.f95056a, aVar.f95057b && z6));
        this.f95049f = MutableStateFlow;
        this.f95050g = FlowKt.asStateFlow(MutableStateFlow);
        this.h = new ArrayMap<>();
        this.f95051i = (com.bilibili.ship.theseus.playlist.util.c) ServiceGenerator.createService(com.bilibili.ship.theseus.playlist.util.c.class);
        this.f95052j = new b();
        this.f95053k = new b();
        if (playlistRepository.f95092O) {
            return;
        }
        MultiTypeMedia multiTypeMedia = playlistRepository.d().get(0);
        d(playlistRepository.d().get(playlistRepository.d().size() - 1));
        e(multiTypeMedia);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.playlist.PlaylistLoadService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.playlist.PlaylistLoadService$collectMediaStateChanged$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.ship.theseus.playlist.PlaylistLoadService$collectMediaStateChanged$1 r0 = (com.bilibili.ship.theseus.playlist.PlaylistLoadService$collectMediaStateChanged$1) r0
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
            com.bilibili.ship.theseus.playlist.PlaylistLoadService$collectMediaStateChanged$1 r0 = new com.bilibili.ship.theseus.playlist.PlaylistLoadService$collectMediaStateChanged$1
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
            goto L89
        L5e:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r5
            com.bilibili.ship.theseus.playlist.PlaylistRepository r0 = r0.f95045b
            kotlinx.coroutines.flow.SharedFlow<com.bilibili.ship.theseus.playlist.PlaylistRepository$c> r0 = r0.f95115w
            r9 = r0
            com.bilibili.ship.theseus.playlist.v r0 = new com.bilibili.ship.theseus.playlist.v
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r5 = r0
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.collect(r1, r2)
            r1 = r8
            if (r0 != r1) goto L89
            r0 = r8
            return r0
        L89:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistLoadService.a(com.bilibili.ship.theseus.playlist.PlaylistLoadService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.playlist.PlaylistLoadService r20, com.bilibili.ship.theseus.playlist.PlaylistLoadService.c r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistLoadService.b(com.bilibili.ship.theseus.playlist.PlaylistLoadService, com.bilibili.ship.theseus.playlist.PlaylistLoadService$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.playlist.PlaylistLoadService r10, kotlin.coroutines.Continuation r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistLoadService.c(com.bilibili.ship.theseus.playlist.PlaylistLoadService, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(MultiTypeMedia multiTypeMedia) {
        MutableStateFlow<PlaylistRepository.b> mutableStateFlow;
        Object value;
        long j7 = multiTypeMedia.f95235i;
        b bVar = this.f95052j;
        bVar.f95058a = j7;
        bVar.f95059b = multiTypeMedia.f95240n;
        bVar.f95060c = Integer.valueOf(multiTypeMedia.f95248v);
        if (multiTypeMedia.f95236j == this.f95045b.e().f95279l - 1) {
            do {
                mutableStateFlow = this.f95049f;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, PlaylistRepository.b.a((PlaylistRepository.b) value, false, false, false, 3)));
        }
    }

    public final void e(MultiTypeMedia multiTypeMedia) {
        MutableStateFlow<PlaylistRepository.b> mutableStateFlow;
        Object value;
        long j7 = multiTypeMedia.f95235i;
        b bVar = this.f95053k;
        bVar.f95058a = j7;
        bVar.f95059b = multiTypeMedia.f95240n;
        bVar.f95060c = Integer.valueOf(multiTypeMedia.f95248v);
        if (multiTypeMedia.f95236j == 0) {
            do {
                mutableStateFlow = this.f95049f;
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, PlaylistRepository.b.a((PlaylistRepository.b) value, false, false, false, 5)));
        }
    }

    public final void f() {
        if (!((PlaylistRepository.b) this.f95050g.getValue()).f95131c) {
            BLog.i("PlaylistLoadService-loadNextPage", "[theseus-playlist-PlaylistLoadService-loadNextPage] There is no next page left, returned.");
        } else {
            this.f95047d.tryEmit(new c.a(this.f95052j));
        }
    }

    public final void g() {
        if (!((PlaylistRepository.b) this.f95050g.getValue()).f95130b) {
            BLog.i("PlaylistLoadService-loadPrePage", "[theseus-playlist-PlaylistLoadService-loadPrePage] There is no previous page left, returned.");
        } else {
            this.f95047d.tryEmit(new c.C0768c(this.f95053k));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void h(c cVar, ListResponse listResponse) throws NoWhenBranchMatchedException {
        Object value;
        Object value2;
        Object value3;
        MutableStateFlow<PlaylistInfo> mutableStateFlow;
        Object value4;
        Object value5;
        if (listResponse == null) {
            return;
        }
        boolean z6 = cVar instanceof c.d;
        MutableStateFlow<PlaylistRepository.b> mutableStateFlow2 = this.f95049f;
        PlaylistRepository playlistRepository = this.f95045b;
        if (z6) {
            do {
                value5 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value5, PlaylistRepository.b.a((PlaylistRepository.b) value5, false, true, true, 1)));
            if (listResponse.f95206a.isEmpty()) {
                BLog.e("PlaylistLoadService-updateParams", "[theseus-playlist-PlaylistLoadService-updateParams] media list from response is empty.", (Throwable) null);
                return;
            }
            MultiTypeMedia multiTypeMedia = listResponse.f95206a.get(0);
            d((MultiTypeMedia) C4667i.a(1, listResponse.f95206a));
            e(multiTypeMedia);
            playlistRepository.i(listResponse.f95206a);
            CompletableDeferred<Unit> completableDeferred = ((c.d) cVar).f95067a;
            if (completableDeferred != null) {
                completableDeferred.complete(Unit.INSTANCE);
            }
        } else {
            boolean z7 = cVar instanceof c.a;
            boolean z8 = listResponse.f95207b;
            if (z7) {
                do {
                    value3 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value3, PlaylistRepository.b.a((PlaylistRepository.b) value3, false, false, z8, 3)));
                if (listResponse.f95206a.isEmpty()) {
                    return;
                }
                d((MultiTypeMedia) C4667i.a(1, listResponse.f95206a));
                List<MultiTypeMedia> listD = playlistRepository.d();
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                listCreateListBuilder.addAll(listD);
                listCreateListBuilder.addAll(listResponse.f95206a);
                playlistRepository.i(CollectionsKt.build(listCreateListBuilder));
            } else if (cVar instanceof c.C0768c) {
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, PlaylistRepository.b.a((PlaylistRepository.b) value2, false, z8, false, 5)));
                if (listResponse.f95206a.isEmpty()) {
                    return;
                }
                e(listResponse.f95206a.get(0));
                List<MultiTypeMedia> listD2 = playlistRepository.d();
                List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                listCreateListBuilder2.addAll(listResponse.f95206a);
                listCreateListBuilder2.addAll(listD2);
                playlistRepository.i(CollectionsKt.build(listCreateListBuilder2));
            } else {
                if (!(cVar instanceof c.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, PlaylistRepository.b.a((PlaylistRepository.b) value, false, true, true, 1)));
                if (listResponse.f95206a.isEmpty()) {
                    BLog.e("PlaylistLoadService-updateParams", "[theseus-playlist-PlaylistLoadService-updateParams] media list from response is empty.", (Throwable) null);
                    return;
                }
                c.b bVar = (c.b) cVar;
                this.h.put(Integer.valueOf(bVar.f95065b.f95062e), listResponse.f95206a);
                MultiTypeMedia multiTypeMedia2 = listResponse.f95206a.get(0);
                d((MultiTypeMedia) C4667i.a(1, listResponse.f95206a));
                e(multiTypeMedia2);
                playlistRepository.i(listResponse.f95206a);
                bVar.f95064a.complete(Unit.INSTANCE);
            }
        }
        int i7 = listResponse.f95208c;
        if (i7 == 0 || i7 == playlistRepository.e().f95279l) {
            return;
        }
        do {
            mutableStateFlow = playlistRepository.f95101i;
            value4 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value4, PlaylistInfo.a((PlaylistInfo) value4, null, 0, 0, listResponse.f95208c, 0, 129023)));
    }
}
