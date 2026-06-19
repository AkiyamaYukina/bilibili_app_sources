package com.bilibili.ship.theseus.playlist;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistErrorStateService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f95036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<a> f95037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f95038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f95039g;

    @NotNull
    public final C8043a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f95040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final FloatLayerManager f95041j = new FloatLayerManager();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Unit> f95042k = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, (Object) null);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistErrorStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$1$1.class */
        public static final class C07671 extends SuspendLambda implements Function2<a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistErrorStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07671(PlaylistErrorStateService playlistErrorStateService, Continuation<? super C07671> continuation) {
                super(2, continuation);
                this.this$0 = playlistErrorStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07671 c07671 = new C07671(this.this$0, continuation);
                c07671.L$0 = obj;
                return c07671;
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
                    if (aVar != null) {
                        FloatLayerManager floatLayerManager = this.this$0.f95041j;
                        ViewGroup viewGroup = aVar.f95043a;
                        this.label = 1;
                        if (floatLayerManager.a(viewGroup, this) == coroutine_suspended) {
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
        public AnonymousClass1(PlaylistErrorStateService playlistErrorStateService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistErrorStateService;
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
                PlaylistErrorStateService playlistErrorStateService = this.this$0;
                Flow<a> flow = playlistErrorStateService.f95037e;
                C07671 c07671 = new C07671(playlistErrorStateService, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c07671, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistErrorStateService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistErrorStateService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlaylistRepository.d, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final PlaylistErrorStateService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistErrorStateService playlistErrorStateService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistErrorStateService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlaylistRepository.d dVar, Continuation<? super Unit> continuation) {
                return create(dVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                com.bilibili.ship.theseus.united.page.playingarea.g gVar;
                String str;
                String str2;
                com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.L$1;
                    gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        gVar2.j(str2);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        str = str2;
                        gVar = gVar2;
                        th = th;
                        gVar.j(str);
                        throw th;
                    }
                }
                ResultKt.throwOnFailure(obj);
                PlaylistRepository.d dVar = (PlaylistRepository.d) this.L$0;
                if (dVar instanceof PlaylistRepository.d.i) {
                    return Unit.INSTANCE;
                }
                PlaylistErrorStateService playlistErrorStateService = this.this$0;
                com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = playlistErrorStateService.f95039g;
                gVar3.f("PlaylistNotSupportService");
                try {
                    this.L$0 = gVar3;
                    this.L$1 = "PlaylistNotSupportService";
                    this.label = 1;
                    playlistErrorStateService.getClass();
                    if (CoroutineScopeKt.coroutineScope(new PlaylistErrorStateService$handleNotSupport$2(dVar, playlistErrorStateService, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = "PlaylistNotSupportService";
                    gVar2 = gVar3;
                    gVar2.j(str2);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    gVar = gVar3;
                    str = "PlaylistNotSupportService";
                    gVar.j(str);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistErrorStateService playlistErrorStateService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistErrorStateService;
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
                PlaylistErrorStateService playlistErrorStateService = this.this$0;
                StateFlow<PlaylistRepository.d> stateFlow = playlistErrorStateService.f95034b.f95082E;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistErrorStateService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistErrorStateService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewGroup f95043a;

        public a(@NotNull ViewGroup viewGroup) {
            this.f95043a = viewGroup;
        }
    }

    @Inject
    public PlaylistErrorStateService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull Context context, @NotNull Flow<a> flow, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f95033a = coroutineScope;
        this.f95034b = playlistRepository;
        this.f95035c = playlistSchedulingService;
        this.f95036d = context;
        this.f95037e = flow;
        this.f95038f = theseusFloatLayerService;
        this.f95039g = gVar;
        this.h = c8043a;
        this.f95040i = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
