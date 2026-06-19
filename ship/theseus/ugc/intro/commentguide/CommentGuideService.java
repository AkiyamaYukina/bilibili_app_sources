package com.bilibili.ship.theseus.ugc.intro.commentguide;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroRecycleViewService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/commentguide/CommentGuideService.class */
@StabilityInferred(parameters = 0)
public final class CommentGuideService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f96981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final RelationRepository f96982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f96983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C8043a f96984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final rW0.a<IntroRecycleViewService> f96985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PageReportService f96986g;

    @NotNull
    public final IntroContentSizeRepository h;

    @Inject
    public CommentGuideService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull RelationRepository relationRepository, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C8043a c8043a, @NotNull rW0.a<IntroRecycleViewService> aVar2, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f96980a = coroutineScope;
        this.f96981b = context;
        this.f96982c = relationRepository;
        this.f96983d = aVar;
        this.f96984e = c8043a;
        this.f96985f = aVar2;
        this.f96986g = pageReportService;
        this.h = introContentSizeRepository;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.app.gemini.ui.UIComponent, com.bilibili.ship.theseus.ugc.intro.b, java.lang.Object] */
    @NotNull
    public final RunningUIComponent a(@NotNull i iVar) {
        ?? obj = new Object();
        return new RunningUIComponent((UIComponent) obj, 0, new CommentGuideService$create$1(this, iVar, obj, null), 2);
    }
}
