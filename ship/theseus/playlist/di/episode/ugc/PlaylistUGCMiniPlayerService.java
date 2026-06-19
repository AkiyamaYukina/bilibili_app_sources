package com.bilibili.ship.theseus.playlist.di.episode.ugc;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.app.playerunite.ugcanymodel.UGCAnyModel;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.base.resolver.ArchiveInfo;
import com.bilibili.app.gemini.base.resolver.PlayerResolveExtraInfosUtilKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.lib.media.resource.MediaResource;
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
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.Video;
import uu0.InterfaceC8767a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCMiniPlayerService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistUGCMiniPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f95543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f95544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f95545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.b f95546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f95547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PlaylistRestoreSharedPlayService f95548g;

    @NotNull
    public final PlaylistRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f95549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.episode.c f95550j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCMiniPlayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCMiniPlayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistUGCMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.ugc.PlaylistUGCMiniPlayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/PlaylistUGCMiniPlayerService$1$1.class */
        public static final class C07851 extends SuspendLambda implements Function2<b.InterfaceC1071b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlaylistUGCMiniPlayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07851(PlaylistUGCMiniPlayerService playlistUGCMiniPlayerService, Continuation<? super C07851> continuation) {
                super(2, continuation);
                this.this$0 = playlistUGCMiniPlayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07851 c07851 = new C07851(this.this$0, continuation);
                c07851.L$0 = obj;
                return c07851;
            }

            public final Object invoke(b.InterfaceC1071b interfaceC1071b, Continuation<? super Unit> continuation) {
                return create(interfaceC1071b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                ArchiveInfo archiveInfo;
                ExtraInfo extraInfo;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                b.InterfaceC1071b interfaceC1071b = (b.InterfaceC1071b) this.L$0;
                String strValueOf = null;
                b.InterfaceC1071b.a aVar = interfaceC1071b instanceof b.InterfaceC1071b.a ? (b.InterfaceC1071b.a) interfaceC1071b : null;
                if (aVar == null || aVar.f102072b || aVar.f102074d) {
                    PlaylistUGCMiniPlayerService playlistUGCMiniPlayerService = this.this$0;
                    playlistUGCMiniPlayerService.getClass();
                    defpackage.a.b("[theseus-playlist-PlaylistUGCMiniPlayerService-tryStartMiniPlayerPlay] ", "tryStartMiniPlayerPlay, " + interfaceC1071b, "PlaylistUGCMiniPlayerService-tryStartMiniPlayerPlay");
                    com.bilibili.ship.theseus.keel.player.j jVarJ = playlistUGCMiniPlayerService.f95544c.j();
                    if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                        PlaylistRepository playlistRepository = playlistUGCMiniPlayerService.h;
                        List<? extends Video.PlayableParams> listB = playlistRepository.b();
                        if (listB.isEmpty()) {
                            BLog.i("PlaylistUGCMiniPlayerService-tryStartMiniPlayerPlay", "[theseus-playlist-PlaylistUGCMiniPlayerService-tryStartMiniPlayerPlay] empty play list, turn on mini player failed!!");
                        } else {
                            UGCAnyModel uGCAnyModel = (UGCAnyModel) playlistUGCMiniPlayerService.f95550j.f96908b.getValue();
                            if ((uGCAnyModel != null ? com.bilibili.ship.theseus.ugc.play.b.a(uGCAnyModel) : null) == null) {
                                MediaResource mediaResource = playlistUGCMiniPlayerService.f95549i.getMediaResource();
                                if (mediaResource == null) {
                                    BLog.w("UGCMiniPlayerHelper$Companion-ensureFakeDurationForPreview", "[theseus-ugc-UGCMiniPlayerHelper$Companion-ensureFakeDurationForPreview] current media resource is null.", (Throwable) null);
                                } else {
                                    ExtraInfo extraInfo2 = mediaResource.getExtraInfo();
                                    if (extraInfo2 != null && (archiveInfo = PlayerResolveExtraInfosUtilKt.getArchiveInfo(extraInfo2)) != null && (extraInfo = mediaResource.getExtraInfo()) != null) {
                                        extraInfo.setTag-pIAwiHE(tb0.a.a.a, new tb0.d(archiveInfo.b, archiveInfo.c));
                                    }
                                }
                            }
                            int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(playlistUGCMiniPlayerService.f95543b);
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
                                String strValueOf2 = z6 ? String.valueOf(playlistRepository.f95087J) : null;
                                if (z6) {
                                    strValueOf = String.valueOf(playlistRepository.f95085H);
                                }
                                interfaceC8767a.a(false, false, zA, i8, iPrepareForShare, iCoerceAtLeast, listB, bundleA, strValueOf2, strValueOf);
                            }
                            boolean z7 = interfaceC1071b instanceof b.InterfaceC1071b.C1072b;
                            ComponentActivity componentActivity = playlistUGCMiniPlayerService.f95545d;
                            if (z7) {
                                BLRouter.routeTo(new RouteRequest.Builder("bilibili://home").build(), componentActivity);
                            }
                            playlistUGCMiniPlayerService.f95547f.f();
                            if (interfaceC1071b.b()) {
                                componentActivity.finish();
                            } else if (!componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
                                PlaylistRepository.e eVarC = playlistRepository.c();
                                PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService = playlistUGCMiniPlayerService.f95548g;
                                playlistRestoreSharedPlayService.a(eVarC);
                                playlistRestoreSharedPlayService.h = true;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistUGCMiniPlayerService playlistUGCMiniPlayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistUGCMiniPlayerService;
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
                PlaylistUGCMiniPlayerService playlistUGCMiniPlayerService = this.this$0;
                SharedFlow<b.InterfaceC1071b> sharedFlow = playlistUGCMiniPlayerService.f95546e.f102064u;
                C07851 c07851 = new C07851(playlistUGCMiniPlayerService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c07851, this) == coroutine_suspended) {
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
    public PlaylistUGCMiniPlayerService(@NotNull CoroutineScope coroutineScope, @NotNull PlayerContainer playerContainer, @NotNull h hVar, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.b bVar, @NotNull j jVar, @NotNull PlaylistRestoreSharedPlayService playlistRestoreSharedPlayService, @NotNull PlaylistRepository playlistRepository, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull com.bilibili.ship.theseus.ugc.episode.c cVar) {
        this.f95542a = coroutineScope;
        this.f95543b = playerContainer;
        this.f95544c = hVar;
        this.f95545d = componentActivity;
        this.f95546e = bVar;
        this.f95547f = jVar;
        this.f95548g = playlistRestoreSharedPlayService;
        this.h = playlistRepository;
        this.f95549i = iPlayerCoreService;
        this.f95550j = cVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
