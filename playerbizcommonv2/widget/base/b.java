package com.bilibili.playerbizcommonv2.widget.base;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.IActivityStateService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/b.class */
@DaggerGenerated
@QualifierMetadata
public final class b implements rW0.b<PlayerInsetControllerWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IActivityStateService> f82386a;

    public b(Provider<IActivityStateService> provider) {
        this.f82386a = provider;
    }

    public final void injectMembers(Object obj) {
        ((PlayerInsetControllerWidget) obj).f82347i = (IActivityStateService) this.f82386a.get();
    }
}
