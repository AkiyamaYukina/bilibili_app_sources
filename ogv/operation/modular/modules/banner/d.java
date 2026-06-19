package com.bilibili.ogv.operation.modular.modules.banner;

import com.bilibili.banner.LineIndicator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation/modular/modules/banner/d.class */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f70451a;

    public d(c cVar) {
        this.f70451a = cVar;
    }

    public final void a(int i7, int i8) {
        c cVar = this.f70451a;
        LineIndicator lineIndicator = cVar.f70445j;
        LineIndicator lineIndicator2 = lineIndicator;
        if (lineIndicator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerIndicator");
            lineIndicator2 = null;
        }
        lineIndicator2.setActiveColorResource(i7);
        LineIndicator lineIndicator3 = cVar.f70445j;
        if (lineIndicator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerIndicator");
            lineIndicator3 = null;
        }
        lineIndicator3.setColorResource(i8);
    }
}
