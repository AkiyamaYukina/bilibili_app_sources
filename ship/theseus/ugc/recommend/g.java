package com.bilibili.ship.theseus.ugc.recommend;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import dagger.internal.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/g.class */
@StabilityInferred(parameters = 0)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f98430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f98431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Provider f98432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<o> f98433e = new ArrayList();

    @Inject
    public g(@NotNull CoroutineScope coroutineScope, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull DetailRelateRepository detailRelateRepository, @NotNull Provider provider) {
        this.f98429a = coroutineScope;
        this.f98430b = absFunctionWidgetService;
        this.f98431c = detailRelateRepository;
        this.f98432d = provider;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new FullScreenPlayingBottomRecommendService$1(this, null), 3, (Object) null);
    }
}
