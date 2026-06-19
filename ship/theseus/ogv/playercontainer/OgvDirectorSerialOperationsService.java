package com.bilibili.ship.theseus.ogv.playercontainer;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.ad.PageAdRepository;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvDirectorSerialOperationsService.class */
@StabilityInferred(parameters = 0)
public final class OgvDirectorSerialOperationsService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f94292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f94293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final tv.danmaku.biliplayerv2.service.k f94295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Gu0.a f94296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPlayRepository f94297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OldWayPlayerContainerService f94298g;

    @NotNull
    public final OgvSeason h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Gu0.a f94299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final PageBackgroundPreloadService f94300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.d f94301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final C8043a f94302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final PageAdRepository f94303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final wv0.a f94304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PageReportService f94305o;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.playercontainer.OgvDirectorSerialOperationsService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvDirectorSerialOperationsService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvDirectorSerialOperationsService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvDirectorSerialOperationsService;
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
                OgvDirectorSerialOperationsService ogvDirectorSerialOperationsService = this.this$0;
                this.label = 1;
                if (OgvDirectorSerialOperationsService.a(ogvDirectorSerialOperationsService, this) == coroutine_suspended) {
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
    public OgvDirectorSerialOperationsService(@NotNull Context context, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull CoroutineScope coroutineScope, @NotNull tv.danmaku.biliplayerv2.service.k kVar, @NotNull Gu0.a aVar, @NotNull PageBackgroundPlayRepository pageBackgroundPlayRepository, @NotNull OldWayPlayerContainerService oldWayPlayerContainerService, @NotNull OgvSeason ogvSeason, @NotNull Gu0.a aVar2, @NotNull PageBackgroundPreloadService pageBackgroundPreloadService, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull C8043a c8043a, @NotNull PageAdRepository pageAdRepository, @NotNull wv0.a aVar3, @NotNull PageReportService pageReportService) {
        this.f94292a = context;
        this.f94293b = ogvCurrentEpisodeRepository;
        this.f94294c = coroutineScope;
        this.f94295d = kVar;
        this.f94296e = aVar;
        this.f94297f = pageBackgroundPlayRepository;
        this.f94298g = oldWayPlayerContainerService;
        this.h = ogvSeason;
        this.f94299i = aVar2;
        this.f94300j = pageBackgroundPreloadService;
        this.f94301k = dVar;
        this.f94302l = c8043a;
        this.f94303m = pageAdRepository;
        this.f94304n = aVar3;
        this.f94305o = pageReportService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.playercontainer.OgvDirectorSerialOperationsService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.playercontainer.OgvDirectorSerialOperationsService.a(com.bilibili.ship.theseus.ogv.playercontainer.OgvDirectorSerialOperationsService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
