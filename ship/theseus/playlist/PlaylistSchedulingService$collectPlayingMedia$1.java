package com.bilibili.ship.theseus.playlist;

import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import com.bilibili.ship.theseus.playlist.api.Rights;
import com.bilibili.ship.theseus.playlist.util.f;
import ev0.InterfaceC7008a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayingMedia$1.class */
final class PlaylistSchedulingService$collectPlayingMedia$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistSchedulingService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectPlayingMedia$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayingMedia$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<PlaylistRepository.e, PlaylistRepository.e, Continuation<? super PlaylistRepository.e>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final PlaylistSchedulingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = playlistSchedulingService;
        }

        public final Object invoke(PlaylistRepository.e eVar, PlaylistRepository.e eVar2, Continuation<? super PlaylistRepository.e> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = eVar;
            anonymousClass1.L$1 = eVar2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            PlaylistRepository.e eVar;
            Object objI;
            PlaylistRepository.e eVar2;
            Rights rights;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                PlaylistRepository.e eVar3 = (PlaylistRepository.e) this.L$0;
                eVar = (PlaylistRepository.e) this.L$1;
                if (Intrinsics.areEqual(PlaylistRepository.f95077Q, eVar)) {
                    return eVar;
                }
                boolean zT = eVar.f95137a.t();
                Ou0.c cVar = eVar.f95138b;
                MultiTypeMedia multiTypeMedia = eVar.f95137a;
                if (!zT && multiTypeMedia.d() == eVar3.f95137a.d()) {
                    com.bilibili.ship.theseus.keel.player.j jVarJ = this.this$0.f95149i.j();
                    GeminiCommonPlayableParams geminiCommonPlayableParamsF = jVarJ != null ? jVarJ.f() : null;
                    if (!Intrinsics.areEqual(geminiCommonPlayableParamsF != null ? Boxing.boxLong(geminiCommonPlayableParamsF.getCid()) : null, cVar != null ? Boxing.boxLong(cVar.f18089b) : null)) {
                        this.this$0.n(eVar);
                        return eVar;
                    }
                    Long lBoxLong = null;
                    if (cVar != null) {
                        lBoxLong = Boxing.boxLong(cVar.f18089b);
                    }
                    defpackage.a.b("[theseus-playlist-PlaylistSchedulingService$collectPlayingMedia$1$1-invokeSuspend] ", "cid:" + lBoxLong + " equals to player playable cid, no need to schedule", "PlaylistSchedulingService$collectPlayingMedia$1$1-invokeSuspend");
                    return eVar;
                }
                PlaylistSchedulingService playlistSchedulingService = this.this$0;
                this.L$0 = eVar;
                this.label = 1;
                playlistSchedulingService.getClass();
                if (multiTypeMedia.s() || (playlistSchedulingService.f95147f.isBackgroundRunning() && (rights = multiTypeMedia.f95244r) != null && rights.f() == 1)) {
                    objI = PlaylistSchedulingService.i(playlistSchedulingService, true, false, this, 6);
                    if (objI != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objI = Unit.INSTANCE;
                    }
                } else {
                    BiliAccounts biliAccounts = com.bilibili.ship.theseus.playlist.util.f.f96126a;
                    PlaylistRepository.d dVarA = f.a.a(multiTypeMedia, cVar);
                    PlaylistRepository playlistRepository = playlistSchedulingService.f95148g;
                    playlistRepository.k(dVarA);
                    if (dVarA instanceof PlaylistRepository.d.i) {
                        playlistSchedulingService.f95151k.e(new C7893a.C1318a(cVar != null ? cVar.f18088a : multiTypeMedia.d(), cVar != null ? cVar.f18089b : 0L));
                        long jD = cVar != null ? cVar.f18088a : multiTypeMedia.d();
                        long j7 = 0;
                        if (cVar != null) {
                            j7 = cVar.f18089b;
                        }
                        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(jD, "try to switch to new video, aid = ", " cid = ");
                        sbA.append(j7);
                        defpackage.a.b("[theseus-playlist-PlaylistSchedulingService-tryToPlayNewVideo] ", sbA.toString(), "PlaylistSchedulingService-tryToPlayNewVideo");
                        PlaylistSchedulingService.a aVar = playlistSchedulingService.f95143b;
                        String str = aVar.f95168e;
                        aVar.f95168e = null;
                        InterfaceC7008a.c(playlistSchedulingService.f95144c, PlaylistSchedulingService.m(playlistSchedulingService, eVar.f95137a, eVar.f95138b, eVar.f95140d, str, 4), null, eVar.f95139c, playlistSchedulingService.e(multiTypeMedia, cVar), false, ((com.bilibili.ship.theseus.united.report.b) playlistRepository.f95084G.getValue()).f104838a, 18);
                        PlaylistReportService playlistReportService = playlistSchedulingService.f95153m;
                        if (playlistReportService.f95073c.isLogin() && playlistReportService.f95074d.f95091N) {
                            BuildersKt.launch$default(playlistReportService.f95071a, (CoroutineContext) null, (CoroutineStart) null, new PlaylistReportService$reportPlaylistProgress$1(playlistReportService, multiTypeMedia, null), 3, (Object) null);
                        }
                        objI = Unit.INSTANCE;
                    } else {
                        objI = Unit.INSTANCE;
                    }
                }
                if (objI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eVar2 = eVar;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                PlaylistRepository.e eVar4 = (PlaylistRepository.e) this.L$0;
                ResultKt.throwOnFailure(obj);
                eVar2 = eVar4;
            }
            eVar = eVar2;
            return eVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSchedulingService$collectPlayingMedia$1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super PlaylistSchedulingService$collectPlayingMedia$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistSchedulingService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistSchedulingService$collectPlayingMedia$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            PlaylistSchedulingService playlistSchedulingService = this.this$0;
            StateFlow<PlaylistRepository.e> stateFlow = playlistSchedulingService.f95148g.f95111s;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistSchedulingService, null);
            this.label = 1;
            if (FlowKt.reduce(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
