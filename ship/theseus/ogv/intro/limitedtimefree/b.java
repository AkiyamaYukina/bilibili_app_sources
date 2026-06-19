package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/b.class */
public final /* synthetic */ class b implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(833160215, iIntValue, -1, "com.bilibili.ship.theseus.ogv.intro.limitedtimefree.ComposableSingletons$OgvLimitedTimeFreeTicketsComponentAKt.lambda$833160215.<anonymous> (OgvLimitedTimeFreeTicketsComponentA.kt:69)");
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
