package com.bilibili.ship.theseus.ugc.intro.profield;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.intro.module.guidestrip.e;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/profield/UgcProfessionalFieldService.class */
@StabilityInferred(parameters = 0)
public final class UgcProfessionalFieldService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RelationRepository f97129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f97130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f97131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final e f97133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97134g;
    public boolean h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f97135i;

    @Inject
    public UgcProfessionalFieldService(@NotNull CoroutineScope coroutineScope, @NotNull RelationRepository relationRepository, @NotNull rW0.a<IntroRecycleViewService> aVar, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull e eVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97128a = coroutineScope;
        this.f97129b = relationRepository;
        this.f97130c = aVar;
        this.f97131d = pageReportService;
        this.f97132e = aVar2;
        this.f97133f = eVar;
        this.f97134g = introContentSizeRepository;
    }

    public static final void a(UgcProfessionalFieldService ugcProfessionalFieldService, RunningUIComponent runningUIComponent, UIComponent uIComponent) {
        if (uIComponent == null) {
            ugcProfessionalFieldService.getClass();
            return;
        }
        IntroRecycleViewService introRecycleViewService = (IntroRecycleViewService) ugcProfessionalFieldService.f97130c.get();
        if (introRecycleViewService != null) {
            introRecycleViewService.e(runningUIComponent, uIComponent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.app.gemini.ui.UIComponent, com.bilibili.ship.theseus.ugc.intro.b, java.lang.Object] */
    @NotNull
    public final RunningUIComponent b(@NotNull UgcProfessionalFieldInfo ugcProfessionalFieldInfo) {
        ?? obj = new Object();
        return new RunningUIComponent((UIComponent) obj, 0, new UgcProfessionalFieldService$create$1(this, ugcProfessionalFieldInfo, obj, null), 2);
    }
}
