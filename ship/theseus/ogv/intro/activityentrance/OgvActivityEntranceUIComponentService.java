package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.lib.theme.R$color;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/OgvActivityEntranceUIComponentService.class */
@StabilityInferred(parameters = 0)
public final class OgvActivityEntranceUIComponentService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f92300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Router f92301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f92302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f92303d;

    @Inject
    public OgvActivityEntranceUIComponentService(@NotNull Context context, @NotNull Router router, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f92300a = context;
        this.f92301b = router;
        this.f92302c = pageReportService;
        this.f92303d = introContentSizeRepository;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull List<ActivityEntrance> list) {
        b bVar = new b();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z6 = false;
            if (!it.hasNext()) {
                return new RunningUIComponent(new c(bVar), 0, new OgvActivityEntranceUIComponentService$create$2(bVar, this, null), 2);
            }
            final ActivityEntrance activityEntrance = (ActivityEntrance) it.next();
            a aVar = new a(activityEntrance, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(this, activityEntrance) { // from class: com.bilibili.ship.theseus.ogv.intro.activityentrance.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final OgvActivityEntranceUIComponentService f92315a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ActivityEntrance f92316b;

                {
                    this.f92315a = this;
                    this.f92316b = activityEntrance;
                }

                public final Object invoke() {
                    PageReportService.i(this.f92315a.f92302c, "united.player-video-detail.activeoperation.0.show", this.f92316b.f92298g, 4);
                    return Unit.INSTANCE;
                }
            }), activityEntrance.f92298g, new e(this, activityEntrance));
            if (((ArrayList) list).size() == 1) {
                z6 = true;
            }
            if (z6 != aVar.h) {
                aVar.h = z6;
                aVar.notifyPropertyChanged(581);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(AppCompatResources.getColorStateList(this.f92300a, R$color.Operate_orange_thin));
            gradientDrawable.setCornerRadius(Uj0.c.a(2, this.f92300a));
            if (!Intrinsics.areEqual(gradientDrawable, aVar.f92310g)) {
                aVar.f92310g = gradientDrawable;
                aVar.notifyPropertyChanged(626);
            }
            bVar.f92311a.add(aVar);
        }
    }
}
