package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.playlist.PlaylistSchedulingService;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUgcReportCoverPlayNextService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistUgcReportCoverPlayNextService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.reportlayer.b f95389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95390c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistUgcReportCoverPlayNextService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUgcReportCoverPlayNextService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistUgcReportCoverPlayNextService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.biz.ugc.PlaylistUgcReportCoverPlayNextService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/PlaylistUgcReportCoverPlayNextService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlaylistUgcReportCoverPlayNextService f95391a;

            public a(PlaylistUgcReportCoverPlayNextService playlistUgcReportCoverPlayNextService) {
                this.f95391a = playlistUgcReportCoverPlayNextService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                Object objI = PlaylistSchedulingService.i(this.f95391a.f95390c, true, true, continuation, 4);
                if (objI != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objI = Unit.INSTANCE;
                }
                return objI;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistUgcReportCoverPlayNextService playlistUgcReportCoverPlayNextService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistUgcReportCoverPlayNextService;
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
                PlaylistUgcReportCoverPlayNextService playlistUgcReportCoverPlayNextService = this.this$0;
                SharedFlow<Unit> sharedFlow = playlistUgcReportCoverPlayNextService.f95389b.f98492b;
                a aVar = new a(playlistUgcReportCoverPlayNextService);
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
    public PlaylistUgcReportCoverPlayNextService(@NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.ugc.reportlayer.b bVar, @NotNull PlaylistSchedulingService playlistSchedulingService) {
        this.f95388a = coroutineScope;
        this.f95389b = bVar;
        this.f95390c = playlistSchedulingService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
