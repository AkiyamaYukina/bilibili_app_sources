package com.bilibili.ship.theseus.cheese.pay.purchase.guide;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/pay/purchase/guide/f.class */
public final /* synthetic */ class f implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-43525962, iIntValue, -1, "com.bilibili.ship.theseus.cheese.pay.purchase.guide.ComposableSingletons$CheesePurchaseGuideComponentKt.lambda$-43525962.<anonymous> (CheesePurchaseGuideComponent.kt:108)");
            }
            String strStringResource = StringResources_androidKt.stringResource(2131841458, composer, 0);
            BiliTheme biliTheme = BiliTheme.INSTANCE;
            int i7 = BiliTheme.$stable;
            TextKt.m1772Text4IGK_g(strStringResource, (Modifier) null, biliTheme.getColors(composer, i7).getText2-0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, biliTheme.getTextStyle(composer, i7).getT16(), composer, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
