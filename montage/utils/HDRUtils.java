package com.bilibili.montage.utils;

import android.opengl.EGL14;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/utils/HDRUtils.class */
public class HDRUtils {
    private static final String EXTENSION_COLOR_SPACE_BT2020_HLG = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final String EXTENSION_COLOR_SPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    public static final int HDR_DISPLAY_MODE_DEPEND_DEVICE = 1;
    public static final int HDR_DISPLAY_MODE_SDR = 0;
    public static final int HDR_DISPLAY_MODE_TONE_MAP_SDR = 2;

    public static boolean isSupportBT2020HLG() {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (strEglQueryString.isEmpty()) {
            return false;
        }
        return strEglQueryString.contains(EXTENSION_COLOR_SPACE_BT2020_HLG);
    }

    public static boolean isSupportBT2020PQ() {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        if (strEglQueryString.isEmpty()) {
            return false;
        }
        return strEglQueryString.contains(EXTENSION_COLOR_SPACE_BT2020_PQ);
    }
}
