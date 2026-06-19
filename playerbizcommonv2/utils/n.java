package com.bilibili.playerbizcommonv2.utils;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/utils/n.class */
public final class n {
    @NotNull
    public static final String a(long j7) {
        return j7 >= ((long) BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) ? String.format("%.1fGB", Arrays.copyOf(new Object[]{Float.valueOf(j7 / BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE)}, 1)) : j7 >= ((long) AccessibilityNodeInfoCompat.ACTION_DISMISS) ? String.format("%.1fMB", Arrays.copyOf(new Object[]{Float.valueOf(j7 / AccessibilityNodeInfoCompat.ACTION_DISMISS)}, 1)) : j7 >= ((long) 1024) ? String.format("%.1fKB", Arrays.copyOf(new Object[]{Float.valueOf(j7 / 1024)}, 1)) : com.bilibili.app.authorspace.local.service.j.a(j7, "B");
    }
}
