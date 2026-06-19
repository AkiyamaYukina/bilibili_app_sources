package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/e.class */
public final /* synthetic */ class e implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1520124200, iIntValue, -1, "com.bilibili.ship.theseus.cheese.pay.purchase.guide.ComposableSingletons$CheesePurchaseGuideComponentKt.lambda$1520124200.<anonymous> (CheesePurchaseGuideComponent.kt:62)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(2131234658, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2671tintxETnrds$default(ColorFilter.Companion, ColorResources_androidKt.colorResource(2131101458, composer, 0), 0, 2, null), composer, Painter.$stable | 48, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
