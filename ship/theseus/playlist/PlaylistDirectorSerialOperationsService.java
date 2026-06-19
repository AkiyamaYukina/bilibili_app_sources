package com.bilibili.ship.theseus.playlist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPlayRepository;
import com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.player.oldway.OldWayPlayerContainerService;
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
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistDirectorSerialOperationsService.class */
@StabilityInferred(parameters = 0)
public final class PlaylistDirectorSerialOperationsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f95020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.biliplayerv2.service.k f95021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PlaylistRepository f95022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PlaylistSchedulingService f95023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final t f95024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OldWayPlayerContainerService f95025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPreloadService f95026g;

    @NotNull
    public final PageBackgroundPlayRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C8043a f95027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final wv0.a f95028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageReportService f95029k;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.PlaylistDirectorSerialOperationsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/PlaylistDirectorSerialOperationsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlaylistDirectorSerialOperationsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlaylistDirectorSerialOperationsService playlistDirectorSerialOperationsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playlistDirectorSerialOperationsService;
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
                PlaylistDirectorSerialOperationsService playlistDirectorSerialOperationsService = this.this$0;
                this.label = 1;
                if (PlaylistDirectorSerialOperationsService.a(playlistDirectorSerialOperationsService, this) == coroutine_suspended) {
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
    public PlaylistDirectorSerialOperationsService(@NotNull CoroutineScope coroutineScope, @NotNull tv.danmaku.biliplayerv2.service.k kVar, @NotNull PlaylistRepository playlistRepository, @NotNull PlaylistSchedulingService playlistSchedulingService, @NotNull t tVar, @NotNull OldWayPlayerContainerService oldWayPlayerContainerService, @NotNull PageBackgroundPreloadService pageBackgroundPreloadService, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull C8043a c8043a, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f95020a = coroutineScope;
        this.f95021b = kVar;
        this.f95022c = playlistRepository;
        this.f95023d = playlistSchedulingService;
        this.f95024e = tVar;
        this.f95025f = oldWayPlayerContainerService;
        this.f95026g = pageBackgroundPreloadService;
        this.h = pageBackgroundPlayRepository;
        this.f95027i = c8043a;
        this.f95028j = aVar;
        this.f95029k = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.playlist.PlaylistDirectorSerialOperationsService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.playlist.PlaylistDirectorSerialOperationsService.a(com.bilibili.ship.theseus.playlist.PlaylistDirectorSerialOperationsService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
