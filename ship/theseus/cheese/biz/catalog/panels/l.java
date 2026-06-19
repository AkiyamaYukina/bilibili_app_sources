package com.bilibili.ship.theseus.cheese.biz.catalog.panels;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.image.BiliImageState;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/panels/l.class */
public final /* synthetic */ class l implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BiliImageState biliImageState = (BiliImageState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | ((iIntValue & 8) == 0 ? composer.changed(biliImageState) : composer.changedInstance(biliImageState) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-943837687, i7, -1, "com.bilibili.ship.theseus.cheese.biz.catalog.panels.ComposableSingletons$CheeseCoursewarePreviewPanelKt.lambda$-943837687.<anonymous> (CheeseCoursewarePreviewPanel.kt:181)");
            }
            if (biliImageState.getSucceed()) {
                composer.startReplaceGroup(1282787001);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1282441041);
                BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getWh0-0d7_KjU(), null, 2, null), composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
