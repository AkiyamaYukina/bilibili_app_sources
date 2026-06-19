package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ol0.C8228b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/h0.class */
public final /* synthetic */ class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f103877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f103878b;

    public /* synthetic */ h0(Object obj, int i7) {
        this.f103877a = i7;
        this.f103878b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f103877a;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i7) {
            case 0:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(487191815, iIntValue, -1, "com.bilibili.ship.theseus.united.page.videoquality.QualitySwitchUI.<anonymous>.<anonymous> (TheseusPlayerQualitySwitchWidget.kt:253)");
                    }
                    k0.b((String) this.f103878b, SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1077156986, iIntValue, -1, "com.bilibili.ogv.operation3.module.related.RelatedRecommendationItem.<anonymous>.<anonymous> (RelatedRecommendationsSupportModule.kt:153)");
                    }
                    C8228b.a((Modifier) this.f103878b, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
