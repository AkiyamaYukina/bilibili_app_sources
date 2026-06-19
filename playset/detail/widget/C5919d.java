package com.bilibili.playset.detail.widget;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import com.bilibili.compose.theme.BiliTheme;
import com.bilibili.iconfont.KtxKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.playset.detail.widget.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/d.class */
public final /* synthetic */ class C5919d implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1125674601, iIntValue, -1, "com.bilibili.playset.detail.widget.ComposableSingletons$MultiTypeListDetailHeadContentKt.lambda$1125674601.<anonymous> (MultiTypeListDetailHeadContent.kt:179)");
            }
            IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238891), composer, 0), (String) null, SizeKt.m1372size3ABfNKs(Modifier.Companion, Dp.m3880constructorimpl(24)), BiliTheme.INSTANCE.getColors(composer, BiliTheme.$stable).getText2-0d7_KjU(), composer, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
