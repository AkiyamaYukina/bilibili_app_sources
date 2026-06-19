package com.bilibili.ship.theseus.playlist;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayerForbidden$1.class */
final class PlaylistSchedulingService$collectPlayerForbidden$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistSchedulingService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectPlayerForbidden$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayerForbidden$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlaylistSchedulingService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistSchedulingService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((PlayerAvailability) this.L$0) == PlayerAvailability.FORBIDDEN && this.this$0.f95154n.d()) {
                    defpackage.a.b("[theseus-playlist-PlaylistSchedulingService$collectPlayerForbidden$1$1-invokeSuspend] ", com.bilibili.app.comm.bh.x5.b.a("Handling playerAvailability FORBIDDEN, BackgroundPlaying, try to playNext.", this.this$0.f95160t.f99044d), "PlaylistSchedulingService$collectPlayerForbidden$1$1-invokeSuspend");
                    PlaylistSchedulingService playlistSchedulingService = this.this$0;
                    if (playlistSchedulingService.f95160t.f99044d) {
                        this.label = 1;
                        if (PlaylistSchedulingService.i(playlistSchedulingService, false, false, this, 7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.label = 2;
                        if (PlaylistSchedulingService.k(playlistSchedulingService, false, this, 7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i7 != 1 && i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSchedulingService$collectPlayerForbidden$1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super PlaylistSchedulingService$collectPlayerForbidden$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistSchedulingService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistSchedulingService$collectPlayerForbidden$1(this.this$0, continuation);
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
            MutableStateFlow<PlayerAvailability> mutableStateFlow = playlistSchedulingService.f95149i.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistSchedulingService, null);
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
