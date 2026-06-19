package com.bilibili.ogv.operation.modular.modules.homecard;

import android.view.View;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.operation.modular.modules.homecard.HomeCardViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/homecard/b.class */
public final class b implements IExposureReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeCardViewModel f70719a;

    public b(HomeCardViewModel homeCardViewModel) {
        this.f70719a = homeCardViewModel;
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final void Xa(int i7, IExposureReporter.ReporterCheckerType reporterCheckerType, View view) {
        SourceContent sourceContent;
        if (reporterCheckerType == IExposureReporter.ReporterCheckerType.ExtraChecker) {
            HomeCardViewModel homeCardViewModel = this.f70719a;
            if (homeCardViewModel.f70674b != HomeCardViewModel.HomeCardType.STATIC || (sourceContent = homeCardViewModel.f70671Z0) == null) {
                return;
            }
            GAdCoreKt.getGAdReport().scrollIdle(view, sourceContent);
        }
    }

    @Override // com.bilibili.ogv.infra.legacy.exposure.IExposureReporter
    public final boolean ve(int i7, IExposureReporter.ReporterCheckerType reporterCheckerType) {
        boolean z6 = false;
        if (reporterCheckerType == IExposureReporter.ReporterCheckerType.ExtraChecker) {
            z6 = false;
            if (this.f70719a.f70674b == HomeCardViewModel.HomeCardType.STATIC) {
                z6 = true;
            }
        }
        return z6;
    }
}
