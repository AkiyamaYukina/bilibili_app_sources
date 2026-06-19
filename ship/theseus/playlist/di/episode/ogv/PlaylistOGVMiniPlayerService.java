package com.bilibili.ship.theseus.playlist.di.episode.ogv;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.miniplayer.PlaylistRestoreSharedPlayService;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import ev0.j;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.Video;
import uu0.InterfaceC8767a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/PlaylistOGVMiniPlayerService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistOGVMiniPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f95533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f95534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f95535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.b f95536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f95537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PlaylistRestoreSharedPlayService f95538g;

    @NotNull
    public final PlaylistRepository h;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ogv.PlaylistOGVMiniPlayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/PlaylistOGVMiniPlayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistOGVMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ogv.PlaylistOGVMiniPlayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/PlaylistOGVMiniPlayerService$1$1.class */
        public static final class C07841 extends SuspendLambda implements Function2<b.InterfaceC1071b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistOGVMiniPlayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07841(PlaylistOGVMiniPlayerService playlistOGVMiniPlayerService, Continuation<? super C07841> continuation) {
                super(2, continuation);
                this.this$0 = playlistOGVMiniPlayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07841 c07841 = new C07841(this.this$0, continuation);
                c07841.L$0 = obj;
                return c07841;
            }

            public final Object invoke(b.InterfaceC1071b interfaceC1071b, Continuation<? super Unit> continuation) {
                return create(interfaceC1071b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                b.InterfaceC1071b interfaceC1071b = (b.InterfaceC1071b) this.L$0;
                PlaylistOGVMiniPlayerService playlistOGVMiniPlayerService = this.this$0;
                playlistOGVMiniPlayerService.getClass();
                defpackage.a.b("[theseus-playlist-PlaylistOGVMiniPlayerService-tryStartMiniPlayerPlay] ", "tryStartMiniPlayerPlay, " + interfaceC1071b, "PlaylistOGVMiniPlayerService-tryStartMiniPlayerPlay");
                com.bilibili.ship.theseus.keel.player.j jVarJ = playlistOGVMiniPlayerService.f95534c.j();
                if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                    PlaylistRepository playlistRepository = playlistOGVMiniPlayerService.h;
                    List<? extends Video.PlayableParams> listB = playlistRepository.b();
                    if (listB.isEmpty()) {
                        BLog.i("PlaylistOGVMiniPlayerService-tryStartMiniPlayerPlay", "[theseus-playlist-PlaylistOGVMiniPlayerService-tryStartMiniPlayerPlay] empty play list, turn on mini player failed!!");
                    } else {
                        int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(playlistOGVMiniPlayerService.f95533b);
                        Iterator<? extends Video.PlayableParams> it = listB.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (Intrinsics.areEqual(it.next().id(), geminiCommonPlayableParamsF.id())) {
                                break;
                            }
                            i7++;
                        }
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(i7, 0);
                        int i8 = interfaceC1071b.isPlaying() ? 4 : 5;
                        boolean zA = interfaceC1071b.a();
                        InterfaceC8767a interfaceC8767a = (InterfaceC8767a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC8767a.class, (String) null, 2, (Object) null);
                        if (interfaceC8767a != null) {
                            Bundle bundleA = com.bilibili.ship.theseus.playlist.miniplayer.a.a(playlistRepository);
                            boolean z6 = playlistRepository.f95093P;
                            interfaceC8767a.a(false, false, zA, i8, iPrepareForShare, iCoerceAtLeast, listB, bundleA, z6 ? String.valueOf(playlistRepository.f95087J) : null, z6 ? String.valueOf(playlistRepository.f95085H) : null);
                        }
                        boolean z7 = interfaceC1071b instanceof b.InterfaceC1071b.C1072b;
                        ComponentActivity componentActivity = playlistOGVMiniPlayerService.f95535d;
                        if (z7) {
                            BLRouter.routeTo(new RouteRequest.Builder("bilibili://home").build(), componentActivity);
                        }
                        playlistOGVMiniPlayerService.f95537f.f();
                        if (interfaceC1071b.b()) {
                            componentActivity.finish();
                        } else if (!componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
                            PlaylistRepository.e eVarC = playlistRepository.c();
                            PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService = playlistOGVMiniPlayerService.f95538g;
                            playlistRestoreSharedPlayService.a(eVarC);
                            playlistRestoreSharedPlayService.h = true;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistOGVMiniPlayerService playlistOGVMiniPlayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistOGVMiniPlayerService;
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
                PlaylistOGVMiniPlayerService playlistOGVMiniPlayerService = this.this$0;
                SharedFlow<b.InterfaceC1071b> sharedFlow = playlistOGVMiniPlayerService.f95536e.f102064u;
                C07841 c07841 = new C07841(playlistOGVMiniPlayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c07841, this) == coroutine_suspended) {
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
    public PlaylistOGVMiniPlayerService(@NotNull CoroutineScope coroutineScope, @NotNull PlayerContainer playerContainer, @NotNull h hVar, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.b bVar, @NotNull j jVar, @NotNull PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService, @NotNull PlaylistRepository playlistRepository) {
        this.f95532a = coroutineScope;
        this.f95533b = playerContainer;
        this.f95534c = hVar;
        this.f95535d = componentActivity;
        this.f95536e = bVar;
        this.f95537f = jVar;
        this.f95538g = playlistRestoreSharedPlayService;
        this.h = playlistRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
