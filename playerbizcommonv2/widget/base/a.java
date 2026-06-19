package com.bilibili.playerbizcommonv2.widget.base;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/a.class */
@DaggerGenerated
@QualifierMetadata
public final class a implements rW0.b<PlayerBackWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IReporterService> f82385a;

    public a(Provider<IReporterService> provider) {
        this.f82385a = provider;
    }

    public final void injectMembers(Object obj) {
        ((PlayerBackWidget) obj).f82338e = (IReporterService) this.f82385a.get();
    }
}
