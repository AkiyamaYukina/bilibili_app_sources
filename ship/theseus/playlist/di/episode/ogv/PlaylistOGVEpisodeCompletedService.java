package com.bilibili.ship.theseus.playlist.di.episode.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.restrictionlayer.OgvRestrictionLayerDriver;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.playingarea.i;
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
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/PlaylistOGVEpisodeCompletedService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistOGVEpisodeCompletedService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h f95528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvRestrictionLayerDriver f95529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i f95530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f95531e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ogv.PlaylistOGVEpisodeCompletedService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/PlaylistOGVEpisodeCompletedService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistOGVEpisodeCompletedService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ogv.PlaylistOGVEpisodeCompletedService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/PlaylistOGVEpisodeCompletedService$1$1.class */
        public static final class C07831 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final PlaylistOGVEpisodeCompletedService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07831(PlaylistOGVEpisodeCompletedService playlistOGVEpisodeCompletedService, Continuation<? super C07831> continuation) {
                super(2, continuation);
                this.this$0 = playlistOGVEpisodeCompletedService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07831 c07831 = new C07831(this.this$0, continuation);
                c07831.L$0 = obj;
                return c07831;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                i iVar;
                PlaylistOGVEpisodeCompletedService playlistOGVEpisodeCompletedService;
                i iVar2;
                Throwable th;
                PlaylistOGVEpisodeCompletedService playlistOGVEpisodeCompletedService2;
                i iVar3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (((PlayerAvailability) this.L$0) == PlayerAvailability.FORBIDDEN) {
                        if (this.this$0.f95531e.d()) {
                            return Unit.INSTANCE;
                        }
                        BLog.i("PlaylistOGVEpisodeCompletedService$1$1-invokeSuspend", "[theseus-playlist-PlaylistOGVEpisodeCompletedService$1$1-invokeSuspend] Handling video forbidden ...");
                        this.this$0.f95528b.pause();
                        PlaylistOGVEpisodeCompletedService playlistOGVEpisodeCompletedService3 = this.this$0;
                        iVar = playlistOGVEpisodeCompletedService3.f95530d;
                        iVar.a(playlistOGVEpisodeCompletedService3);
                        try {
                            OgvRestrictionLayerDriver ogvRestrictionLayerDriver = playlistOGVEpisodeCompletedService3.f95529c;
                            this.L$0 = iVar;
                            this.L$1 = playlistOGVEpisodeCompletedService3;
                            this.label = 1;
                            if (ogvRestrictionLayerDriver.b(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            playlistOGVEpisodeCompletedService2 = playlistOGVEpisodeCompletedService3;
                        } catch (Throwable th2) {
                            playlistOGVEpisodeCompletedService = playlistOGVEpisodeCompletedService3;
                            iVar2 = iVar;
                            th = th2;
                            iVar2.c(playlistOGVEpisodeCompletedService);
                            throw th;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                playlistOGVEpisodeCompletedService2 = (PlaylistOGVEpisodeCompletedService) this.L$1;
                i iVar4 = (i) this.L$0;
                playlistOGVEpisodeCompletedService = playlistOGVEpisodeCompletedService2;
                iVar3 = iVar4;
                try {
                    ResultKt.throwOnFailure(obj);
                    iVar = iVar4;
                } catch (Throwable th3) {
                    th = th3;
                    iVar2 = iVar3;
                    iVar2.c(playlistOGVEpisodeCompletedService);
                    throw th;
                }
                playlistOGVEpisodeCompletedService = playlistOGVEpisodeCompletedService2;
                iVar3 = iVar;
                Unit unit = Unit.INSTANCE;
                iVar.c(playlistOGVEpisodeCompletedService2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistOGVEpisodeCompletedService playlistOGVEpisodeCompletedService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistOGVEpisodeCompletedService;
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
                PlaylistOGVEpisodeCompletedService playlistOGVEpisodeCompletedService = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = playlistOGVEpisodeCompletedService.f95528b.f91107a.f79286c;
                C07831 c07831 = new C07831(playlistOGVEpisodeCompletedService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c07831, this) == coroutine_suspended) {
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

    @Inject
    public PlaylistOGVEpisodeCompletedService(@NotNull CoroutineScope coroutineScope, @NotNull h hVar, @NotNull OgvRestrictionLayerDriver ogvRestrictionLayerDriver, @NotNull i iVar, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository) {
        this.f95527a = coroutineScope;
        this.f95528b = hVar;
        this.f95529c = ogvRestrictionLayerDriver;
        this.f95530d = iVar;
        this.f95531e = pageBackgroundPlayRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
