package com.bilibili.ship.theseus.united.page.translate;

import I3.C2203b1;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import com.bilibili.ship.theseus.united.page.view.Translation;
import com.bilibili.ship.theseus.united.page.view.t;
import com.bilibili.ship.theseus.united.player.oldway.FullScreenThreePointEventRepository;
import dagger.internal.Provider;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tb0.h;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/translate/b.class */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FullScreenThreePointEventRepository f103463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f103464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Provider f103465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MenuService f103466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final t f103467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f103468g;

    @NotNull
    public final IReporterService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f103469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f103470j = LazyKt.lazy(new C2203b1(9));

    @Inject
    public b(@NotNull CoroutineScope coroutineScope, @NotNull FullScreenThreePointEventRepository fullScreenThreePointEventRepository, @NotNull rW0.a aVar, @NotNull Provider provider, @NotNull MenuService menuService, @NotNull t tVar, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull IReporterService iReporterService, @NotNull IInteractLayerService iInteractLayerService) {
        this.f103462a = coroutineScope;
        this.f103463b = fullScreenThreePointEventRepository;
        this.f103464c = aVar;
        this.f103465d = provider;
        this.f103466e = menuService;
        this.f103467f = tVar;
        this.f103468g = iPlayerSettingService;
        this.h = iReporterService;
        this.f103469i = iInteractLayerService;
        if (tVar.f104127c != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailPageTranslationService$1(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DetailPageTranslationService$2(this, null), 3, (Object) null);
        }
    }

    public final void a() {
        InterfaceC7008a.C1258a c1258a = (InterfaceC7008a.C1258a) this.f103465d.get();
        Translation translation = this.f103467f.f104127c;
        String str = (translation == null || translation.f104032a != 1) ? "translate" : "see_original";
        if (c1258a != null && (translation == null || translation.f104032a != 0)) {
            d dVar = new d(str);
            h hVar = c.f103471a;
            c1258a.m10991setTagpIAwiHE(hVar.a, dVar);
            InterfaceC7008a.c((InterfaceC7008a) this.f103464c.get(), c1258a, null, null, null, false, 0, 46);
            c1258a.m10991setTagpIAwiHE(hVar.a, null);
        }
        if (((Boolean) this.f103470j.getValue()).booleanValue()) {
            IInteractLayerService.reloadViewProgress$default(this.f103469i, false, MapsKt.mapOf(TuplesKt.to("translate_switch", str)), 1, (Object) null);
        }
    }
}
