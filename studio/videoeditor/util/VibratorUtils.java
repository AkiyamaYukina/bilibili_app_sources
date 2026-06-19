package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.os.Vibrator;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/VibratorUtils.class */
public final class VibratorUtils {

    @NotNull
    public static final VibratorUtils INSTANCE = new VibratorUtils();

    @JvmStatic
    public static final void vibrateOnAdsorb(@Nullable Context context) {
        INSTANCE.getClass();
        if (context != null) {
            ((Vibrator) context.getSystemService("vibrator")).vibrate(50L);
        }
    }
}
