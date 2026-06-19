package com.bilibili.pegasus.components.graduation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.graduation.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/b.class */
public final /* synthetic */ class C5601b implements Function4 {
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1764542438, iIntValue, -1, "com.bilibili.pegasus.components.graduation.ComposableSingletons$GraduationSeasonFlipEnterOverlayControllerKt.lambda$1764542438.<anonymous> (GraduationSeasonFlipEnterOverlayController.kt:158)");
        }
        D.a(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
