package com.bilibili.ogv.operation3.module.filmlistbanner;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ml0.C8013d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/filmlistbanner/e.class */
public final class e implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f71280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71281b;

    public e(List<f> list, int i7) {
        this.f71280a = list;
        this.f71281b = i7;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-55504360, iIntValue2, -1, "com.bilibili.ogv.operation3.module.filmlistbanner.FilmListHubBannerModuleSupportModule.provide.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilmListHubBannerModuleSupportModule.kt:72)");
        }
        f fVar = (f) ((ArrayList) this.f71280a).get(iIntValue % this.f71281b);
        m.b(fVar.f71282a, C8013d.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), fVar.f71283b), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
