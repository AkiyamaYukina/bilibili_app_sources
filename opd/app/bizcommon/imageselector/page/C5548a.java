package com.bilibili.opd.app.bizcommon.imageselector.page;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.imageselector.page.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/page/a.class */
public final /* synthetic */ class C5548a implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-837873144, iIntValue, -1, "com.bilibili.opd.app.bizcommon.imageselector.page.ComposableSingletons$MallText2ImgKt.lambda$-837873144.<anonymous> (MallText2Img.kt:301)");
            }
            MallText2ImgKt.e(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
