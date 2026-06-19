package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.AutoContinuousInterceptService;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistAutoContinuousInterceptService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistAutoContinuousInterceptService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f94996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AutoContinuousInterceptService f94997c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistAutoContinuousInterceptService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistAutoContinuousInterceptService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistAutoContinuousInterceptService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistAutoContinuousInterceptService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistAutoContinuousInterceptService$1$1.class */
        public static final class C07641 extends SuspendLambda implements Function2<PlaylistRepository.e, Continuation<? super Unit>, Object> {
            int label;
            final PlaylistAutoContinuousInterceptService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07641(PlaylistAutoContinuousInterceptService playlistAutoContinuousInterceptService, Continuation<? super C07641> continuation) {
                super(2, continuation);
                this.this$0 = playlistAutoContinuousInterceptService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07641(this.this$0, continuation);
            }

            public final Object invoke(PlaylistRepository.e eVar, Continuation<? super Unit> continuation) {
                return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AutoContinuousInterceptService autoContinuousInterceptService = this.this$0.f94997c;
                    this.label = 1;
                    if (autoContinuousInterceptService.d(this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistAutoContinuousInterceptService playlistAutoContinuousInterceptService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistAutoContinuousInterceptService;
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
                BLog.i("PlaylistAutoContinuousInterceptService$1-invokeSuspend", "[theseus-playlist-PlaylistAutoContinuousInterceptService$1-invokeSuspend] Hit DD, register interceptor to playlist scheduling service.");
                PlaylistAutoContinuousInterceptService playlistAutoContinuousInterceptService = this.this$0;
                PlaylistSchedulingService playlistSchedulingService = playlistAutoContinuousInterceptService.f94996b;
                C6251p c6251p = new C6251p(1, new C07641(playlistAutoContinuousInterceptService, null));
                this.label = 1;
                if (playlistSchedulingService.d(c6251p, this) == coroutine_suspended) {
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
    public PlaylistAutoContinuousInterceptService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull AutoContinuousInterceptService autoContinuousInterceptService) {
        this.f94995a = coroutineScope;
        this.f94996b = playlistSchedulingService;
        this.f94997c = autoContinuousInterceptService;
        if (((Boolean) com.bilibili.ship.theseus.ugc.play.schedule.b.f98177d.getValue()).booleanValue()) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }
}
