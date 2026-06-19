package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import ol0.C8228b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/G.class */
public final /* synthetic */ class G implements Function4 {
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(952906992, iIntValue, -1, "com.bilibili.ogv.kmm.operation.banner.ComposableSingletons$BannerUiKt.lambda$952906992.<anonymous> (BannerUi.kt:117)");
        }
        C8228b.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
