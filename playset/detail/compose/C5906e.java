package com.bilibili.playset.detail.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.bilibili.compose.theme.BiliTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.playset.detail.compose.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/compose/e.class */
public final /* synthetic */ class C5906e implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1167118350, iIntValue, -1, "com.bilibili.playset.detail.compose.ComposableSingletons$FavoritesArticleCardKt.lambda$-1167118350.<anonymous> (FavoritesArticleCard.kt:88)");
            }
            BoxKt.Box(BackgroundKt.m1169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getGa1-0d7_KjU(), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
