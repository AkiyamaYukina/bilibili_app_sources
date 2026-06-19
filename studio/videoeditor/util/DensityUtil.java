package com.bilibili.studio.videoeditor.util;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import com.bilibili.app.authorspace.ui.I1;
import com.bilibili.base.BiliContext;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/DensityUtil.class */
public class DensityUtil {
    public static int dp2px(float f7) {
        Application application = BiliContext.application();
        return application == null ? (int) ((f7 * Resources.getSystem().getDisplayMetrics().density) + 0.5f) : dp2px(application, f7);
    }

    public static int dp2px(Context context, float f7) {
        if (context != null) {
            return (int) ((f7 * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        BLog.e("DensityUtil", "method dp2px context is null");
        return 0;
    }

    public static int getDensityDpi(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    public static int getDevicesHeightPixels(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getDevicesWidthPixels(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static float getScreenScale(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int px2dp(float f7) {
        return px2dp(BiliContext.application(), f7);
    }

    public static int px2dp(Context context, float f7) {
        if (context != null) {
            return (int) ((f7 / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        BLog.e("DensityUtil", "method dp2px context is null");
        return 0;
    }

    public static float spToPx(Context context, float f7) {
        return I1.a(context, 2, f7);
    }
}
