package com.bilibili.pegasus.recommendlabel;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.pegasus.recommendlabel.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/recommendlabel/a.class */
public final /* synthetic */ class C5732a implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-407031213, iIntValue, -1, "com.bilibili.pegasus.recommendlabel.ComposableSingletons$RecommendLabelFirstPageKt.lambda$-407031213.<anonymous> (RecommendLabelFirstPage.kt:867)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(2131241969, composer, 0), "", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, Painter.$stable | BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
