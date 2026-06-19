package com.bilibili.ship.theseus.playlist.di.biz.cheese;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.playlist.C6251p;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import eu0.C6985d;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/cheese/PlaylistCheeseBizSchedulingService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistCheeseBizSchedulingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f95364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final h f95365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f95366f;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.cheese.PlaylistCheeseBizSchedulingService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/cheese/PlaylistCheeseBizSchedulingService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistCheeseBizSchedulingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.cheese.PlaylistCheeseBizSchedulingService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/cheese/PlaylistCheeseBizSchedulingService$1$1.class */
        public static final class C07721 extends SuspendLambda implements Function2<PlaylistRepository.e, Continuation<? super Unit>, Object> {
            int label;
            final PlaylistCheeseBizSchedulingService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07721(PlaylistCheeseBizSchedulingService playlistCheeseBizSchedulingService, Continuation<? super C07721> continuation) {
                super(2, continuation);
                this.this$0 = playlistCheeseBizSchedulingService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C07721(this.this$0, continuation);
            }

            public final Object invoke(PlaylistRepository.e eVar, Continuation<? super Unit> continuation) {
                return create(eVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
                C6985d c6985dA;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!this.this$0.f95366f.d()) {
                        PlaylistCheeseBizSchedulingService playlistCheeseBizSchedulingService = this.this$0;
                        if (!playlistCheeseBizSchedulingService.f95363c && (c6985dA = playlistCheeseBizSchedulingService.f95364d.a()) != null && c6985dA.f117509d == 3) {
                            BLog.i("PlaylistCheeseBizSchedulingService$1$1-invokeSuspend", "[theseus-playlist-PlaylistCheeseBizSchedulingService$1$1-invokeSuspend] playlist cheese unpaid && ispPreview return");
                            this.this$0.f95365e.pause();
                            this.label = 1;
                            if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistCheeseBizSchedulingService playlistCheeseBizSchedulingService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistCheeseBizSchedulingService;
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
                PlaylistCheeseBizSchedulingService playlistCheeseBizSchedulingService = this.this$0;
                PlaylistSchedulingService playlistSchedulingService = playlistCheeseBizSchedulingService.f95362b;
                C6251p c6251p = new C6251p(2, new C07721(playlistCheeseBizSchedulingService, null));
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
    public PlaylistCheeseBizSchedulingService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistSchedulingService playlistSchedulingService, boolean z6, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull h hVar, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository) {
        this.f95361a = coroutineScope;
        this.f95362b = playlistSchedulingService;
        this.f95363c = z6;
        this.f95364d = cheesePlayRepository;
        this.f95365e = hVar;
        this.f95366f = pageBackgroundPlayRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
