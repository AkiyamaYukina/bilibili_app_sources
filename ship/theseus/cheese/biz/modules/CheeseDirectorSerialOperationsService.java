package com.bilibili.ship.theseus.cheese.biz.modules;

import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.cheese.player.playselect.CheeseEpisodeListRepository;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseDirectorSerialOperationsService.class */
@StabilityInferred(parameters = 0)
public final class CheeseDirectorSerialOperationsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.biliplayerv2.service.k f90348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OldWayPlayerContainerService f90350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.player.playselect.b f90351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final CheeseEpisodeListRepository f90352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPreloadService f90353g;

    @NotNull
    public final PageBackgroundPlayRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C4911a f90354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f90355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final wv0.a f90356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final PageReportService f90357l;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.CheeseDirectorSerialOperationsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseDirectorSerialOperationsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final CheeseDirectorSerialOperationsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = cheeseDirectorSerialOperationsService;
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
                CheeseDirectorSerialOperationsService cheeseDirectorSerialOperationsService = this.this$0;
                this.label = 1;
                if (CheeseDirectorSerialOperationsService.a(cheeseDirectorSerialOperationsService, this) == coroutine_suspended) {
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
    public CheeseDirectorSerialOperationsService(@NotNull CoroutineScope coroutineScope, @NotNull tv.danmaku.biliplayerv2.service.k kVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull OldWayPlayerContainerService oldWayPlayerContainerService, @NotNull com.bilibili.ship.theseus.cheese.player.playselect.b bVar, @NotNull CheeseEpisodeListRepository cheeseEpisodeListRepository, @NotNull PageBackgroundPreloadService pageBackgroundPreloadService, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull C4911a c4911a, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull wv0.a aVar, @NotNull PageReportService pageReportService) {
        this.f90347a = coroutineScope;
        this.f90348b = kVar;
        this.f90349c = cheesePlayRepository;
        this.f90350d = oldWayPlayerContainerService;
        this.f90351e = bVar;
        this.f90352f = cheeseEpisodeListRepository;
        this.f90353g = pageBackgroundPreloadService;
        this.h = pageBackgroundPlayRepository;
        this.f90354i = c4911a;
        this.f90355j = dVar;
        this.f90356k = aVar;
        this.f90357l = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.biz.modules.CheeseDirectorSerialOperationsService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.CheeseDirectorSerialOperationsService.a(com.bilibili.ship.theseus.cheese.biz.modules.CheeseDirectorSerialOperationsService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
