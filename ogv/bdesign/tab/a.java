package com.bilibili.ogv.bdesign.tab;

import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bdesign/tab/a.class */
public final /* synthetic */ class a implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1777897809, iIntValue, -1, "com.bilibili.ogv.bdesign.tab.ComposableSingletons$XXScrollableTabRowKt.lambda$-1777897809.<anonymous> (XXScrollableTabRow.kt:42)");
            }
            DividerKt.m2008HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
