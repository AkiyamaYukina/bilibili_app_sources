package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/P.class */
public final /* synthetic */ class P implements Function4 {
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Composer composer = (Composer) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(880248858, iIntValue, -1, "com.bilibili.ship.theseus.cheese.biz.intro.primary.ComposableSingletons$CheeseRelatedCoursesFloatLayerComponentKt.lambda$880248858.<anonymous> (CheeseRelatedCoursesFloatLayerComponent.kt:194)");
        }
        BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getGa2-0d7_KjU(), null, 2, null), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
