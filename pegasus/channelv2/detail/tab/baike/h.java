package com.bilibili.pegasus.channelv2.detail.tab.baike;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/h.class */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75142a;

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f75142a) {
            case 0:
                KProperty<Object>[] kPropertyArr = ChannelBaikeSelectFragment.f75056t;
                return Integer.valueOf(((RecyclerView) obj).getHeight() - 1);
            default:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, 1 & iIntValue)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(704520432, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.quality.ComposableSingletons$QualityList2PanelUIKt.lambda$704520432.<anonymous> (QualityList2PanelUI.kt:260)");
                    }
                    BoxKt.Box(AspectRatioKt.aspectRatio$default(Modifier.Companion, 2.4444444f, false, 2, null), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
