package com.bilibili.ogv.kmm.operation.inlinefeed;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ol0.C8228b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/m.class */
public final /* synthetic */ class m implements Function4 {
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1875019570, iIntValue, -1, "com.bilibili.ogv.kmm.operation.inlinefeed.ComposableSingletons$CinemaInlineFeedUiKt.lambda$-1875019570.<anonymous> (CinemaInlineFeedUi.kt:93)");
        }
        C8228b.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
