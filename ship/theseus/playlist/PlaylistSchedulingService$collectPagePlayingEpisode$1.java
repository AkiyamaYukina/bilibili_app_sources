package com.bilibili.ship.theseus.playlist;

import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPagePlayingEpisode$1.class */
final class PlaylistSchedulingService$collectPagePlayingEpisode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PlaylistSchedulingService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectPagePlayingEpisode$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPagePlayingEpisode$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
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

        public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
            return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
            MultiTypeMedia multiTypeMedia = this.this$0.f95148g.c().f95137a;
            Ou0.c cVar = this.this$0.f95148g.c().f95138b;
            if (c1318a != null) {
                C7893a.C1318a.C1319a c1319a = c1318a.f123395a;
                if (c1319a.f123397a == multiTypeMedia.d()) {
                    long j7 = c1319a.f123398b;
                    if (cVar == null || j7 != cVar.f18089b) {
                        Iterator<Ou0.c> it = multiTypeMedia.f95225M.iterator();
                        int i7 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i7 = -1;
                                break;
                            }
                            if (it.next().f18089b == j7) {
                                break;
                            }
                            i7++;
                        }
                        if (i7 == -1) {
                            return Unit.INSTANCE;
                        }
                        PlaylistSchedulingService.g(this.this$0, multiTypeMedia, multiTypeMedia.f95225M.get(i7), null, null, 12);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSchedulingService$collectPagePlayingEpisode$1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super PlaylistSchedulingService$collectPagePlayingEpisode$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistSchedulingService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlaylistSchedulingService$collectPagePlayingEpisode$1(this.this$0, continuation);
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
            StateFlow<C7893a.C1318a> stateFlow = playlistSchedulingService.f95151k.f123393f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistSchedulingService, null);
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
