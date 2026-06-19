package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.ugc.toolbar.actionview.listen.ToolbarListenRepository;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistToolBarListenSuppressService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistToolBarListenSuppressService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ToolbarListenRepository f95385b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistToolBarListenSuppressService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistToolBarListenSuppressService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistToolBarListenSuppressService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistToolBarListenSuppressService playlistToolBarListenSuppressService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistToolBarListenSuppressService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f95385b.a("playlistListenSuppressor");
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                this.this$0.f95385b.b("playlistListenSuppressor");
                throw th;
            }
        }
    }

    @Inject
    public PlaylistToolBarListenSuppressService(@NotNull CoroutineScope coroutineScope, @NotNull PlaylistRepository playlistRepository, @NotNull ToolbarListenRepository toolbarListenRepository) {
        this.f95384a = coroutineScope;
        this.f95385b = toolbarListenRepository;
        if (playlistRepository.f95092O) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        }
    }
}
