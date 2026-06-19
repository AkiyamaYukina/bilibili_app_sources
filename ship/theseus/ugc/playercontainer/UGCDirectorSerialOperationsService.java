package com.bilibili.ship.theseus.ugc.playercontainer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.backgroundplay.UGCBackgroundPlayService;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCDirectorSerialOperationsService.class */
@StabilityInferred(parameters = 0)
public final class UGCDirectorSerialOperationsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f98272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final UGCBackgroundPlayService f98273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.biliplayerv2.service.k f98274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OldWayPlayerContainerService f98276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.play.schedule.k f98277g;

    @NotNull
    public final UGCEpisodeListRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPreloadService f98278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final wv0.a f98279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageReportService f98280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C8043a f98281l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playercontainer/UGCDirectorSerialOperationsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UGCDirectorSerialOperationsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = uGCDirectorSerialOperationsService;
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
                UGCDirectorSerialOperationsService uGCDirectorSerialOperationsService = this.this$0;
                this.label = 1;
                if (UGCDirectorSerialOperationsService.a(uGCDirectorSerialOperationsService, this) == coroutine_suspended) {
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
    public UGCDirectorSerialOperationsService(@NotNull CoroutineScope coroutineScope, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull UGCBackgroundPlayService uGCBackgroundPlayService, @NotNull tv.danmaku.biliplayerv2.service.k kVar, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull OldWayPlayerContainerService oldWayPlayerContainerService, @NotNull com.bilibili.ship.theseus.ugc.play.schedule.k kVar2, @NotNull UGCEpisodeListRepository uGCEpisodeListRepository, @NotNull PageBackgroundPreloadService pageBackgroundPreloadService, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService, @NotNull C8043a c8043a) {
        this.f98271a = coroutineScope;
        this.f98272b = pageBackgroundPlayRepository;
        this.f98273c = uGCBackgroundPlayService;
        this.f98274d = kVar;
        this.f98275e = uGCPlaybackRepository;
        this.f98276f = oldWayPlayerContainerService;
        this.f98277g = kVar2;
        this.h = uGCEpisodeListRepository;
        this.f98278i = pageBackgroundPreloadService;
        this.f98279j = aVar;
        this.f98280k = pageReportService;
        this.f98281l = c8043a;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            r0 = r6
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService$run$1
            if (r0 == 0) goto L2a
            r0 = r6
            com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService$run$1 r0 = (com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService$run$1) r0
            r8 = r0
            r0 = r8
            int r0 = r0.label
            r7 = r0
            r0 = r7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r7
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r8
            r6 = r0
            goto L34
        L2a:
            com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService$run$1 r0 = new com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService$run$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r6 = r0
        L34:
            r0 = r6
            java.lang.Object r0 = r0.result
            r10 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r6
            int r0 = r0.label
            r7 = r0
            r0 = r5
            com.bilibili.ship.theseus.united.page.background.PageBackgroundPreloadService r0 = r0.f98278i
            r9 = r0
            r0 = r5
            tv.danmaku.biliplayerv2.service.k r0 = r0.f98274d
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L6e
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L62
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L6a
            goto L9f
        L6a:
            r5 = move-exception
            goto La9
        L6e:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r8
            com.bilibili.ship.theseus.ugc.playercontainer.w r1 = new com.bilibili.ship.theseus.ugc.playercontainer.w
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.b(r1)
            r0 = r9
            com.bilibili.ship.theseus.ugc.playercontainer.x r1 = new com.bilibili.ship.theseus.ugc.playercontainer.x
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.f99024j = r1
            r0 = r6
            r1 = 1
            r0.label = r1     // Catch: java.lang.Throwable -> L6a
            r0 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.awaitCancellation(r0)     // Catch: java.lang.Throwable -> L6a
            r1 = r11
            if (r0 != r1) goto L9f
            r0 = r11
            return r0
        L9f:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L6a
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L6a
        La9:
            r0 = r8
            r1 = 0
            r0.b(r1)
            r0 = r9
            r1 = 0
            r0.f99024j = r1
            r0 = r5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService.a(com.bilibili.ship.theseus.ugc.playercontainer.UGCDirectorSerialOperationsService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
