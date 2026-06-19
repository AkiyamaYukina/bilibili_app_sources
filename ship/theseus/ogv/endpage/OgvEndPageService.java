package com.bilibili.ship.theseus.ogv.endpage;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.a;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvEndPageService.class */
@StabilityInferred(parameters = 0)
public final class OgvEndPageService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a.n0.a f91925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a.n0.a f91926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a.n0.a f91927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f91928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91929e;

    @Inject
    public OgvEndPageService(@NotNull a.n0.a aVar, @NotNull a.n0.a aVar2, @NotNull a.n0.a aVar3, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar) {
        this.f91925a = aVar;
        this.f91926b = aVar2;
        this.f91927c = aVar3;
        this.f91928d = absFunctionWidgetService;
        this.f91929e = cVar;
    }

    @Nullable
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        Object objFirst;
        if (!Hj0.b.b() && (objFirst = FlowKt.first(FlowKt.mapLatest(this.f91929e.c(), new OgvEndPageService$handleVideoCompletion$2(this, null)), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objFirst;
        }
        return Unit.INSTANCE;
    }
}
