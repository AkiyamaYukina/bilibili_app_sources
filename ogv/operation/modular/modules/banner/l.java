package com.bilibili.ogv.operation.modular.modules.banner;

import androidx.databinding.f;
import com.bilibili.ogv.opbase.RecommendModule;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/l.class */
public final class l extends f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f70480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ok0.a f70481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecommendModule f70482c;

    public l(m mVar, Ok0.a aVar, RecommendModule recommendModule) {
        this.f70480a = mVar;
        this.f70481b = aVar;
        this.f70482c = recommendModule;
    }

    @Override // androidx.databinding.f.a
    public final void onPropertyChanged(androidx.databinding.f fVar, int i7) {
        m.o(this.f70480a, this.f70481b.f17876e, this.f70482c);
    }
}
