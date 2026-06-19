package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/C.class */
public final /* synthetic */ class C implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(404388460, iIntValue, -1, "com.bilibili.ogv.kmm.operation.banner.ComposableSingletons$BannerModuleSupportModuleKt.lambda$404388460.<anonymous> (BannerModuleSupportModule.kt:149)");
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
