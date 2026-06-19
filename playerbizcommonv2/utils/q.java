package com.bilibili.playerbizcommonv2.utils;

import androidx.window.core.layout.WindowSizeClass;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/q.class */
public final class q {
    public static final boolean a(@Nullable r rVar) {
        StateFlow<WindowSizeClass> windowSizeFlow = rVar.getWindowSizeFlow();
        boolean z6 = false;
        if (windowSizeFlow != null) {
            WindowSizeClass windowSizeClass = (WindowSizeClass) windowSizeFlow.getValue();
            z6 = false;
            if (windowSizeClass != null) {
                z6 = false;
                if (KScreenAdjustUtilsKt.isLargeLandscape(windowSizeClass)) {
                    z6 = true;
                }
            }
        }
        return z6;
    }
}
