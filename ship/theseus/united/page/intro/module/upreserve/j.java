package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f101996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f101997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f101998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f101999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f102000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f102001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f102002g;

    @NotNull
    public final MutableStateFlow<d> h = StateFlowKt.MutableStateFlow(new d(0));

    @Inject
    public j(@NotNull CoroutineScope coroutineScope, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull C7893a c7893a, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull TheseusFloatLayerService theseusFloatLayerService) {
        this.f101996a = coroutineScope;
        this.f101997b = backActionRepository;
        this.f101998c = gVar;
        this.f101999d = c7893a;
        this.f102000e = introContentSizeRepository;
        this.f102001f = aVar;
        this.f102002g = theseusFloatLayerService;
    }
}
