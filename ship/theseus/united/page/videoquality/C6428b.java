package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/b.class */
public final /* synthetic */ class C6428b implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | (composer.changed(modifier) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-659000740, i7, -1, "com.bilibili.ship.theseus.united.page.videoquality.ComposableSingletons$QualityListPanelKt.lambda$-659000740.<anonymous> (QualityListPanel.kt:385)");
            }
            com.bilibili.playerbizcommonv2.widget.quality.h0.d(StringResources_androidKt.stringResource(2131836472, composer, 0), modifier, null, null, composer, (i7 << 3) & 112, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
