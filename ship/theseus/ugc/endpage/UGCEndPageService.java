package com.bilibili.ship.theseus.ugc.endpage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.ship.theseus.ugc.endpage.qoe.x;
import com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import com.bilibili.ship.theseus.united.page.toolbar.C6420d;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.a;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/endpage/UGCEndPageService.class */
@StabilityInferred(parameters = 0)
public final class UGCEndPageService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f96478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f96479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f96480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f96481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a.D1.a f96482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a.D1.a f96483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final a.D1.a f96484g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f96485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i f96486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IToastService f96487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final x f96488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final UgcAiFeedbackService f96489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.questionaire.e f96490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final C6420d f96491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96492p;

    @Inject
    public UGCEndPageService(@NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull ZoomContainerService zoomContainerService, @NotNull IControlContainerService iControlContainerService, @NotNull a.D1.a aVar, @NotNull a.D1.a aVar2, @NotNull a.D1.a aVar3, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull DetailRelateRepository detailRelateRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar, @NotNull IToastService iToastService, @NotNull x xVar, @NotNull UgcAiFeedbackService ugcAiFeedbackService, @NotNull com.bilibili.ship.theseus.ugc.intro.questionaire.e eVar, @NotNull C6420d c6420d, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar4) {
        this.f96478a = hVar;
        this.f96479b = absFunctionWidgetService;
        this.f96480c = zoomContainerService;
        this.f96481d = iControlContainerService;
        this.f96482e = aVar;
        this.f96483f = aVar2;
        this.f96484g = aVar3;
        this.h = cVar;
        this.f96485i = detailRelateRepository;
        this.f96486j = iVar;
        this.f96487k = iToastService;
        this.f96488l = xVar;
        this.f96489m = ugcAiFeedbackService;
        this.f96490n = eVar;
        this.f96491o = c6420d;
        this.f96492p = aVar4;
    }

    @Nullable
    public final Object a(@NotNull Continuation<? super Unit> continuation) {
        Object objCollectLatest;
        if (!this.f96485i.a().isEmpty() && (objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(FlowKt.combine(this.h.c(), this.f96480c.d, this.f96492p.f102939c, UGCEndPageService$handleEndPage$4.INSTANCE)), new UGCEndPageService$handleEndPage$5(this, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objCollectLatest;
        }
        return Unit.INSTANCE;
    }
}
