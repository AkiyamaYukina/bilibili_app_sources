package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ol0.C8228b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/i0.class */
public final /* synthetic */ class i0 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103881b;

    public /* synthetic */ i0(Object obj, int i7) {
        this.f103880a = i7;
        this.f103881b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7 = this.f103880a;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        switch (i7) {
            case 0:
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(157584637, iIntValue, -1, "com.bilibili.ship.theseus.united.page.videoquality.QualitySwitchUI.<anonymous>.<anonymous> (TheseusPlayerQualitySwitchWidget.kt:256)");
                }
                k0.b((String) this.f103881b, SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            default:
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-344499716, iIntValue, -1, "com.bilibili.ogv.operation3.module.related.RelatedRecommendationItem.<anonymous>.<anonymous> (RelatedRecommendationsSupportModule.kt:156)");
                }
                C8228b.a((Modifier) this.f103881b, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
