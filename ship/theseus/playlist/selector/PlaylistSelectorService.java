package com.bilibili.ship.theseus.playlist.selector;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.authorspace.ui.pages.p;
import com.bilibili.ship.theseus.playlist.PlaylistLoadService;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistSelectorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistLoadService f95838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f95840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f95841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f95842g;

    @NotNull
    public final BackActionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f95843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final SharedFlow<a> f95844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Job f95845k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistSelectorService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistSelectorService f95846a;

            public a(PlaylistSelectorService playlistSelectorService) {
                this.f95846a = playlistSelectorService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                boolean zAreEqual = Intrinsics.areEqual((a) obj, a.b.f95848a);
                PlaylistSelectorService playlistSelectorService = this.f95846a;
                if (!zAreEqual) {
                    Job job = playlistSelectorService.f95845k;
                    if (job != null && job.isActive()) {
                        Job job2 = playlistSelectorService.f95845k;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                        playlistSelectorService.f95845k = null;
                    }
                } else if (!playlistSelectorService.f95841f.h().f102987a && playlistSelectorService.f95841f.h().f102988b) {
                    playlistSelectorService.f95845k = BuildersKt.launch$default(playlistSelectorService.f95836a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistSelectorService$1$1$1(playlistSelectorService, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistSelectorService playlistSelectorService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistSelectorService;
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
                PlaylistSelectorService playlistSelectorService = this.this$0;
                SharedFlow<a> sharedFlow = playlistSelectorService.f95844j;
                a aVar = new a(playlistSelectorService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistSelectorService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<c.a, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistSelectorService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlaylistSelectorService playlistSelectorService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playlistSelectorService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(c.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((c.a) this.L$0).f102987a) {
                    this.this$0.f95843i.tryEmit(a.C0795a.f95847a);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistSelectorService playlistSelectorService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistSelectorService;
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
                StateFlow stateFlowC = this.this$0.f95841f.c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowC, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.selector.PlaylistSelectorService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0795a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0795a f95847a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof C0795a);
            }

            public final int hashCode() {
                return -338649704;
            }

            @NotNull
            public final String toString() {
                return "Hide";
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/selector/PlaylistSelectorService$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f95848a = new Object();

            public final boolean equals(@Nullable Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -338322605;
            }

            @NotNull
            public final String toString() {
                return "Show";
            }
        }
    }

    @Inject
    public PlaylistSelectorService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull PlaylistLoadService playlistLoadService, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull PageReportService pageReportService, @NotNull BackActionRepository backActionRepository) {
        this.f95836a = coroutineScope;
        this.f95837b = playlistRepository;
        this.f95838c = playlistLoadService;
        this.f95839d = playlistSchedulingService;
        this.f95840e = theseusFloatLayerService;
        this.f95841f = cVar;
        this.f95842g = pageReportService;
        this.h = backActionRepository;
        MutableSharedFlow<a> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);
        this.f95843i = mutableSharedFlowMutableSharedFlow$default;
        this.f95844j = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }

    public static final void a(PlaylistSelectorService playlistSelectorService, MultiTypeMedia multiTypeMedia) {
        PlaylistRepository playlistRepository = playlistSelectorService.f95837b;
        PageReportService.i(playlistSelectorService.f95842g, "player.player.option-episode.0.player", MapsKt.mapOf(new Pair[]{TuplesKt.to("playlist_sort_type", playlistRepository.f().reportValue()), p.a(multiTypeMedia.f95226N, 1, "playlist_video_sort"), TuplesKt.to("playlist_id", String.valueOf(playlistRepository.f95085H)), TuplesKt.to("playlist_type", String.valueOf(playlistRepository.f95087J))}), 4);
    }
}
