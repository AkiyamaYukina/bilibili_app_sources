package com.bilibili.ogv.kmm.operation.inlinefeed;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ol0.C8228b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/o.class */
public final /* synthetic */ class o implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(427047628, iIntValue, -1, "com.bilibili.ogv.kmm.operation.inlinefeed.ComposableSingletons$InlineFeedUiKt.lambda$427047628.<anonymous> (InlineFeedUi.kt:58)");
            }
            C8228b.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
