package com.bilibili.studio.videoeditor.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import com.bilibili.lib.ui.helper.NotchCompat;
import com.bilibili.lib.ui.util.StatusBarCompat;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/ScreenUtil.class */
public class ScreenUtil {
    public static final float ANIMATION_NO_ROTATION = 0.0f;
    public static final float ANIMATION_ROTATION_CLOCKWISE_180 = 180.0f;
    public static final float ANIMATION_ROTATION_CLOCKWISE_90 = 90.0f;
    public static final float ANIMATION_ROTATION_COUNTERCLOCKWISE_90 = -90.0f;
    public static final int SCREEN_FLING_DOWN = 4;
    public static final int SCREEN_FLING_LEFT = 1;
    public static final int SCREEN_FLING_RIGHT = 2;
    public static final int SCREEN_FLING_UP = 3;
    public static final int SCREEN_ROTATE_0 = 0;
    public static final int SCREEN_ROTATE_180 = 2;
    public static final int SCREEN_ROTATE_270 = 3;
    public static final int SCREEN_ROTATE_90 = 1;

    public static float getNavigationBarHeight(Activity activity) {
        if (isNavigationBarVisible(activity)) {
            return StatusBarCompat.getNavigationBarHeight(activity);
        }
        return 0.0f;
    }

    public static float getNotchHeight(Window window) {
        List<Rect> displayCutoutSize;
        if (!NotchCompat.hasDisplayCutout(window) || (displayCutoutSize = NotchCompat.getDisplayCutoutSize(window)) == null || displayCutoutSize.isEmpty()) {
            return 0.0f;
        }
        int iMax = 0;
        for (Rect rect : displayCutoutSize) {
            if (rect.top == 0) {
                iMax = Math.max(iMax, rect.bottom);
            }
        }
        return iMax;
    }

    public static float getScreenHeight(Context context) {
        return com.bilibili.droid.ScreenUtil.getScreenHeight(context);
    }

    public static Point getScreenRealSize(Context context) {
        return StatusBarCompat.getDisplayRealSize(context);
    }

    public static float getScreenWidthForRatio(Context context, float f7) {
        if (context == null) {
            return 0.0f;
        }
        return context.getResources().getDisplayMetrics().widthPixels / f7;
    }

    public static boolean isNavigationBarVisible(Activity activity) {
        boolean z6 = false;
        if (Settings.Global.getInt(activity.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
            return false;
        }
        View viewFindViewById = activity.findViewById(R.id.navigationBarBackground);
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            return true;
        }
        if ((getScreenRealSize(activity).y - getScreenHeight(activity)) - getNotchHeight(activity.getWindow()) > 0.0f) {
            z6 = true;
        }
        return z6;
    }
}
