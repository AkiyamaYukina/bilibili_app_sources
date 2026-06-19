package com.bilibili.ogv.misc.timeline.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.bilibili.compose.image.BiliImageState;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.bilibili.ogv.misc.timeline.ui.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/timeline/ui/c.class */
public final /* synthetic */ class C5468c implements Function3 {
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BiliImageState biliImageState = (BiliImageState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i7 = iIntValue;
        if ((iIntValue & 6) == 0) {
            i7 = iIntValue | ((iIntValue & 8) == 0 ? composer.changed(biliImageState) : composer.changedInstance(biliImageState) ? 4 : 2);
        }
        if (composer.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757496036, i7, -1, "com.bilibili.ogv.misc.timeline.ui.ComposableSingletons$TimelineListItemsKt.lambda$-757496036.<anonymous> (TimelineListItems.kt:148)");
            }
            C5467b.a(biliImageState, composer, (i7 & 14) | BiliImageState.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
