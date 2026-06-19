package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/g.class */
public final /* synthetic */ class C6433g implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350849798, iIntValue, -1, "com.bilibili.ship.theseus.united.page.videoquality.ComposableSingletons$TheseusPlayerQualitySwitchWidgetKt.lambda$-350849798.<anonymous> (TheseusPlayerQualitySwitchWidget.kt:101)");
            }
            k0.a(StringResources_androidKt.stringResource(2131845792, composer, 0), null, null, null, null, composer, 0, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
