package com.bilibili.playset.editor.widget;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
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

/* JADX INFO: renamed from: com.bilibili.playset.editor.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/widget/b.class */
public final /* synthetic */ class C5952b implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1808672480, iIntValue, -1, "com.bilibili.playset.editor.widget.ComposableSingletons$PlaySetEditorFullScreenKt.lambda$1808672480.<anonymous> (PlaySetEditorFullScreen.kt:155)");
            }
            IconKt.m1714Iconww6aTOc(DrawablePainterKt.rememberDrawablePainter(KtxKt.getAppCompatDrawable((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), 2131238660), composer, 0), (String) null, SizeKt.m1372size3ABfNKs(PaddingKt.m1346paddingqDBjuR0$default(Modifier.Companion, Dp.m3880constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3880constructorimpl(24)), BiliTheme.INSTANCE.getThemeColors(composer, BiliTheme.$stable).getActionIcon-0d7_KjU(), composer, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
