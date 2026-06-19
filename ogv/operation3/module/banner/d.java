package com.bilibili.ogv.operation3.module.banner;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/d.class */
public final class d implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f71135a;

    public d(List<a> list) {
        this.f71135a = list;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(888012458, iIntValue2, -1, "com.bilibili.ogv.operation3.module.banner.BannerV3SupportModule.provide.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BannerV3SupportModule.kt:128)");
        }
        List<a> list = this.f71135a;
        a aVar = list.get(iIntValue % list.size());
        k.b(aVar.f71117a, C8013d.a(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 1.8f, false, 2, null), aVar.f71118b), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
