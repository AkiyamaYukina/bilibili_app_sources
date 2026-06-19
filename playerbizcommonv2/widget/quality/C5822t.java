package com.bilibili.playerbizcommonv2.widget.quality;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.bilibili.playerbizcommonv2.widget.setting.PlayerSettingComposeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.quality.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/quality/t.class */
public final /* synthetic */ class C5822t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5823u f82881a;

    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1076670947, iIntValue, -1, "com.bilibili.playerbizcommonv2.widget.quality.PlayerQualitySettingFunctionWidget.contentView.<anonymous>.<anonymous> (PlayerQualitySettingFunctionWidget.kt:60)");
            }
            PlayerSettingComposeKt.d(this.f82881a.f82886l, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
