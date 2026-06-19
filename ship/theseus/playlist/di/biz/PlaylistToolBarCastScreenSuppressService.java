package com.bilibili.ship.theseus.playlist.di.biz;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.toolbar.actionview.projection.ToolbarCastScreenRepository;
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
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistToolBarCastScreenSuppressService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistToolBarCastScreenSuppressService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ToolbarCastScreenRepository f95357b;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.PlaylistToolBarCastScreenSuppressService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/PlaylistToolBarCastScreenSuppressService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistToolBarCastScreenSuppressService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistToolBarCastScreenSuppressService playlistToolBarCastScreenSuppressService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistToolBarCastScreenSuppressService;
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
                    this.this$0.f95357b.a("PlaylistToolBarCastScreenSuppressor");
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
                this.this$0.f95357b.b("PlaylistToolBarCastScreenSuppressor");
                throw th;
            }
        }
    }

    @Inject
    public PlaylistToolBarCastScreenSuppressService(@NotNull CoroutineScope coroutineScope, @NotNull ToolbarCastScreenRepository toolbarCastScreenRepository, @NotNull IPlayerCoreService iPlayerCoreService) {
        this.f95356a = coroutineScope;
        this.f95357b = toolbarCastScreenRepository;
        if (iPlayerCoreService.isProjectionScreenAvailable()) {
            return;
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
