package com.bilibili.ship.theseus.ugc.intro.upcenter;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.moduleservice.ugc.IUploaderCenterService;
import com.bilibili.moduleservice.ugc.IUploaderCenterServiceProvider;
import com.bilibili.ship.theseus.ugc.intro.upcenter.UgcUpCenterUIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sh1.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/upcenter/UgcUpCenterService.class */
@StabilityInferred(parameters = 0)
public final class UgcUpCenterService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f97508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f97509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f97510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f97511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f97512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97513g;

    @Nullable
    public final IUploaderCenterServiceProvider h = (IUploaderCenterServiceProvider) BLRouter.get$default(BLRouter.INSTANCE, IUploaderCenterServiceProvider.class, (String) null, 2, (Object) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f97514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f97515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f97516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f97517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<UgcUpCenterUIComponent.b> f97518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<UgcUpCenterUIComponent.b> f97519n;

    @Inject
    public UgcUpCenterService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull WebFloatLayerService webFloatLayerService, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f97507a = coroutineScope;
        this.f97508b = context;
        this.f97509c = pageReportService;
        this.f97510d = gVar;
        this.f97511e = webFloatLayerService;
        this.f97512f = theseusFloatLayerService;
        this.f97513g = introContentSizeRepository;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f97514i = MutableStateFlow;
        this.f97515j = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f97516k = MutableStateFlow2;
        this.f97517l = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<UgcUpCenterUIComponent.b> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new UgcUpCenterUIComponent.b(0));
        this.f97518m = MutableStateFlow3;
        this.f97519n = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public static final IUploaderCenterService b(List<UgcUpCenterUIComponent.c> list, UgcUpCenterService ugcUpCenterService) {
        UgcUpCenterUIComponent.c cVar = (UgcUpCenterUIComponent.c) CollectionsKt.getOrNull(list, ((Number) ugcUpCenterService.f97517l.getValue()).intValue());
        IUploaderCenterService service = null;
        if (cVar != null) {
            ExtType extType = cVar.f97545c;
            service = null;
            if (extType != null) {
                IUploaderCenterServiceProvider iUploaderCenterServiceProvider = ugcUpCenterService.h;
                service = null;
                if (iUploaderCenterServiceProvider != null) {
                    service = iUploaderCenterServiceProvider.getService(b.a(extType));
                }
            }
        }
        return service;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull a aVar) {
        final IUploaderCenterService service;
        ArrayList arrayList = new ArrayList();
        this.f97514i.setValue(Boolean.valueOf(i.a.getBoolean("pref_key_uploader_expand", true)));
        this.f97516k.setValue(Integer.valueOf(aVar.f97548c));
        boolean z6 = aVar.f97547b.length() > 0 && ConfigManager.Companion.ab2().getWithDefault("up_center.help_circle_show_enable", true);
        List<e> list = aVar.f97546a;
        ArrayList<e> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((e) obj).f97557a.length() > 0) {
                arrayList2.add(obj);
            }
        }
        for (e eVar : arrayList2) {
            IUploaderCenterServiceProvider iUploaderCenterServiceProvider = this.h;
            if (iUploaderCenterServiceProvider != null && (service = iUploaderCenterServiceProvider.getService(b.a(eVar.f97558b))) != null) {
                service.onBind(eVar.f97557a);
                View viewTabContent = service.tabContent(this.f97508b);
                if (viewTabContent != null) {
                    arrayList.add(new UgcUpCenterUIComponent.c(service.getTabTitle(), viewTabContent, eVar.f97558b));
                }
                service.invokeWebPanelShow(new Function1(this, service) { // from class: com.bilibili.ship.theseus.ugc.intro.upcenter.d

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final UgcUpCenterService f97555a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final IUploaderCenterService f97556b;

                    {
                        this.f97555a = this;
                        this.f97556b = service;
                    }

                    public final Object invoke(Object obj2) {
                        String tabTitle = this.f97556b.getTabTitle();
                        UgcUpCenterService ugcUpCenterService = this.f97555a;
                        ugcUpCenterService.getClass();
                        BuildersKt.launch$default(ugcUpCenterService.f97507a, (CoroutineContext) null, (CoroutineStart) null, new UgcUpCenterService$showWebPanel$1(ugcUpCenterService, (String) obj2, tabTitle, null), 3, (Object) null);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        this.f97518m.tryEmit(UgcUpCenterUIComponent.b.a(c(), d(), ((Number) this.f97517l.getValue()).intValue(), z6, arrayList, null, aVar.f97549d, 16));
        IUploaderCenterService iUploaderCenterServiceB = b(arrayList, this);
        if (iUploaderCenterServiceB != null) {
            iUploaderCenterServiceB.onTabStatusChange(d(), true);
        }
        UgcUpCenterUIComponent ugcUpCenterUIComponent = new UgcUpCenterUIComponent(this.f97519n, this.f97513g.f100020a);
        return new RunningUIComponent(ugcUpCenterUIComponent, 0, new UgcUpCenterService$create$3(this, ugcUpCenterUIComponent, aVar, arrayList, null), 2);
    }

    public final UgcUpCenterUIComponent.b c() {
        return (UgcUpCenterUIComponent.b) this.f97518m.getValue();
    }

    public final boolean d() {
        return ((Boolean) this.f97515j.getValue()).booleanValue();
    }
}
