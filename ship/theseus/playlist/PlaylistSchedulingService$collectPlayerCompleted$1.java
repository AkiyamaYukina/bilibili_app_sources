package com.bilibili.ship.theseus.playlist;

import com.bilibili.player.tangram.basic.PlayerAvailability;
import java.util.Comparator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayerCompleted$1.class */
final class PlaylistSchedulingService$collectPlayerCompleted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final PlaylistSchedulingService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectPlayerCompleted$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayerCompleted$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
        final CoroutineScope $$this$launch;
        Object L$0;
        Object L$1;
        int label;
        final PlaylistSchedulingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectPlayerCompleted$1$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistSchedulingService$collectPlayerCompleted$1$1$a.class */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return ComparisonsKt.compareValues(Integer.valueOf(((C6251p) t8).f95829b), Integer.valueOf(((C6251p) t7).f95829b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistSchedulingService playlistSchedulingService, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistSchedulingService;
            this.$$this$launch = coroutineScope;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
            return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistSchedulingService$collectPlayerCompleted$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistSchedulingService$collectPlayerCompleted$1(PlaylistSchedulingService playlistSchedulingService, Continuation<? super PlaylistSchedulingService$collectPlayerCompleted$1> continuation) {
        super(2, continuation);
        this.this$0 = playlistSchedulingService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlaylistSchedulingService$collectPlayerCompleted$1 playlistSchedulingService$collectPlayerCompleted$1 = new PlaylistSchedulingService$collectPlayerCompleted$1(this.this$0, continuation);
        playlistSchedulingService$collectPlayerCompleted$1.L$0 = obj;
        return playlistSchedulingService$collectPlayerCompleted$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            PlaylistSchedulingService playlistSchedulingService = this.this$0;
            MutableStateFlow<PlayerAvailability> mutableStateFlow = playlistSchedulingService.f95149i.f91107a.f79286c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(playlistSchedulingService, coroutineScope, null);
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
