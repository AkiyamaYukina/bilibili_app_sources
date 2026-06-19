package com.bilibili.ship.theseus.playlist.di.episode.cheese;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.united.page.miniplayer.b;
import eu0.C6985d;
import ev0.j;
import java.util.Iterator;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.Video;
import uu0.InterfaceC8767a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/PlaylistCheeseMiniPlayerService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistCheeseMiniPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f95510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final h f95511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f95512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.miniplayer.b f95513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final j f95514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f95515g;

    @NotNull
    public final PlaylistCheeseRestoreSharedPlayService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95516i;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.cheese.PlaylistCheeseMiniPlayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/PlaylistCheeseMiniPlayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistCheeseMiniPlayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.episode.cheese.PlaylistCheeseMiniPlayerService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/PlaylistCheeseMiniPlayerService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistCheeseMiniPlayerService f95517a;

            public a(PlaylistCheeseMiniPlayerService playlistCheeseMiniPlayerService) {
                this.f95517a = playlistCheeseMiniPlayerService;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
                Unit unit;
                GeminiCommonPlayableParams geminiCommonPlayableParamsF;
                b.InterfaceC1071b interfaceC1071b = (b.InterfaceC1071b) obj;
                PlaylistCheeseMiniPlayerService playlistCheeseMiniPlayerService = this.f95517a;
                C6985d c6985dA = playlistCheeseMiniPlayerService.f95515g.a();
                if (c6985dA != null && playlistCheeseMiniPlayerService.f95515g.d(c6985dA)) {
                    BLog.d("tryStartMiniPlayerPlay trigger: " + interfaceC1071b);
                    com.bilibili.ship.theseus.keel.player.j jVarJ = playlistCheeseMiniPlayerService.f95511c.j();
                    if (jVarJ != null && (geminiCommonPlayableParamsF = jVarJ.f()) != null) {
                        PlaylistRepository playlistRepository = playlistCheeseMiniPlayerService.f95516i;
                        List<? extends Video.PlayableParams> listB = playlistRepository.b();
                        if (listB.isEmpty()) {
                            BLog.i("PlaylistCheeseMiniPlayerService-tryStartMiniPlayerPlay", "[theseus-playlist-PlaylistCheeseMiniPlayerService-tryStartMiniPlayerPlay] enter mini player failed, play list is empty");
                        } else {
                            int iPrepareForShare = IPlayerContainer.Companion.prepareForShare(playlistCheeseMiniPlayerService.f95510b);
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
                            GeminiCommonPlayableParams geminiCommonPlayableParams = (GeminiCommonPlayableParams) CollectionsKt.getOrNull(listB, iCoerceAtLeast);
                            if (geminiCommonPlayableParams != null) {
                                geminiCommonPlayableParams.setFromSpmid(geminiCommonPlayableParamsF.getFromSpmid());
                            }
                            int i8 = interfaceC1071b.isPlaying() ? 4 : 5;
                            boolean zA = interfaceC1071b.a();
                            InterfaceC8767a interfaceC8767a = (InterfaceC8767a) BLRouter.get$default(BLRouter.INSTANCE, InterfaceC8767a.class, (String) null, 2, (Object) null);
                            if (interfaceC8767a != null) {
                                Bundle bundleA = com.bilibili.ship.theseus.playlist.miniplayer.a.a(playlistRepository);
                                boolean z6 = playlistRepository.f95093P;
                                interfaceC8767a.a(false, false, zA, i8, iPrepareForShare, iCoerceAtLeast, listB, bundleA, z6 ? String.valueOf(playlistRepository.f95087J) : null, z6 ? String.valueOf(playlistRepository.f95085H) : null);
                            }
                            boolean z7 = interfaceC1071b instanceof b.InterfaceC1071b.C1072b;
                            ComponentActivity componentActivity = playlistCheeseMiniPlayerService.f95512d;
                            if (z7) {
                                BLRouter.routeTo(new RouteRequest.Builder("bilibili://home").build(), componentActivity);
                            }
                            playlistCheeseMiniPlayerService.f95514f.f();
                            if (interfaceC1071b.b()) {
                                componentActivity.finish();
                            } else if (!componentActivity.isFinishing() && !componentActivity.isDestroyed()) {
                                PlaylistRepository.e eVarC = playlistRepository.c();
                                playlistCheeseMiniPlayerService.h.h.setValue(eVarC);
                                long jD = eVarC.f95137a.d();
                                Ou0.c cVar = eVarC.f95138b;
                                defpackage.a.b("[theseus-playlist-PlaylistCheeseRestoreSharedPlayService-leavePageAndSaveLast] ", "leave page and save last, avid:" + jD + ", cid:" + (cVar != null ? Long.valueOf(cVar.f18089b) : null), "PlaylistCheeseRestoreSharedPlayService-leavePageAndSaveLast");
                            }
                        }
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistCheeseMiniPlayerService playlistCheeseMiniPlayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistCheeseMiniPlayerService;
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
                PlaylistCheeseMiniPlayerService playlistCheeseMiniPlayerService = this.this$0;
                SharedFlow<b.InterfaceC1071b> sharedFlow = playlistCheeseMiniPlayerService.f95513e.f102064u;
                a aVar = new a(playlistCheeseMiniPlayerService);
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

    @Inject
    public PlaylistCheeseMiniPlayerService(@NotNull CoroutineScope coroutineScope, @NotNull PlayerContainer playerContainer, @NotNull h hVar, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.miniplayer.b bVar, @NotNull j jVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull PlaylistCheeseRestoreSharedPlayService playlistCheeseRestoreSharedPlayService, @NotNull PlaylistRepository playlistRepository) {
        this.f95509a = coroutineScope;
        this.f95510b = playerContainer;
        this.f95511c = hVar;
        this.f95512d = componentActivity;
        this.f95513e = bVar;
        this.f95514f = jVar;
        this.f95515g = cheesePlayRepository;
        this.h = playlistCheeseRestoreSharedPlayService;
        this.f95516i = playlistRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
