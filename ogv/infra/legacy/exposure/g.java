package com.bilibili.ogv.infra.legacy.exposure;

import androidx.viewpager.widget.ViewPager;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/g.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
public interface g extends Oj0.d {
    static /* synthetic */ void c(g gVar, ViewPager viewPager, int i7) {
        IExposureReporter.ReporterCheckerType reporterCheckerType = IExposureReporter.ReporterCheckerType.DefaultChecker;
        gVar.a(viewPager, i7);
    }

    static /* synthetic */ void h(g gVar, ViewPager viewPager) {
        IExposureReporter.ReporterCheckerType reporterCheckerType = IExposureReporter.ReporterCheckerType.DefaultChecker;
        gVar.g(viewPager);
    }

    void a(@NotNull ViewPager viewPager, int i7);

    void g(@NotNull ViewPager viewPager);
}
