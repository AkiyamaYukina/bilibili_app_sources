package com.bilibili.ship.theseus.ogv.intro.download.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.download.ui.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/a.class */
public final /* synthetic */ class C6162a implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204984380, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.download.ui.ComposableSingletons$DownloadFloatLayerUIKt.lambda$-204984380.<anonymous> (DownloadFloatLayerUI.kt:169)");
            }
            if (com.bilibili.biligame.booktri.benefit.C.a(8, 6, composer, Modifier.Companion)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
