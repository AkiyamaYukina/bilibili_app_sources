package com.bilibili.ship.theseus.playlist.di.cache.screenrecord;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.coroutineextension.j;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
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
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/screenrecord/PlaylistDummyScreenRecordSuppressionService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistDummyScreenRecordSuppressionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f95407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95408c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.cache.screenrecord.PlaylistDummyScreenRecordSuppressionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/screenrecord/PlaylistDummyScreenRecordSuppressionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistDummyScreenRecordSuppressionService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistDummyScreenRecordSuppressionService playlistDummyScreenRecordSuppressionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistDummyScreenRecordSuppressionService;
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
                PlaylistDummyScreenRecordSuppressionService playlistDummyScreenRecordSuppressionService = this.this$0;
                this.label = 1;
                Object objCollectLatest = FlowKt.collectLatest(playlistDummyScreenRecordSuppressionService.f95408c.f95111s, new PlaylistDummyScreenRecordSuppressionService$collectScreenRecordState$2(playlistDummyScreenRecordSuppressionService, null), this);
                if (objCollectLatest != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollectLatest = Unit.INSTANCE;
                }
                if (objCollectLatest == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.cache.screenrecord.PlaylistDummyScreenRecordSuppressionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/screenrecord/PlaylistDummyScreenRecordSuppressionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final PlaylistDummyScreenRecordSuppressionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.cache.screenrecord.PlaylistDummyScreenRecordSuppressionService$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/cache/screenrecord/PlaylistDummyScreenRecordSuppressionService$2$a.class */
        public static final class a implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistDummyScreenRecordSuppressionService f95409a;

            public a(PlaylistDummyScreenRecordSuppressionService playlistDummyScreenRecordSuppressionService) {
                this.f95409a = playlistDummyScreenRecordSuppressionService;
            }

            public final void invoke() {
                this.f95409a.f95407b.getWindow().clearFlags(8192);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlaylistDummyScreenRecordSuppressionService playlistDummyScreenRecordSuppressionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playlistDummyScreenRecordSuppressionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            j aVar;
            j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = new a(this.this$0);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    aVar.invoke();
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j jVar2 = (j) this.L$0;
                jVar = jVar2;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = jVar2;
                } catch (Throwable th2) {
                    aVar = jVar;
                    th = th2;
                    aVar.invoke();
                    throw th;
                }
            }
            j jVar3 = aVar;
            jVar = aVar;
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public PlaylistDummyScreenRecordSuppressionService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull PlaylistRepository playlistRepository) {
        this.f95406a = coroutineScope;
        this.f95407b = activity;
        this.f95408c = playlistRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
