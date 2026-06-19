package com.bilibili.lib.ui.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.IDrawerHost;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.regex.Pattern;
import kntr.base.utils.foundation.RomUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/util/StatusBarCompat.class */
public class StatusBarCompat {
    public static final int STATUS_BAR_DARK = 1;
    public static final int STATUS_BAR_LIGHT = 2;
    public static final int STATUS_BAR_NORMAL = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f64948a = new float[3];

    public static int a(int i7) {
        float[] fArr = f64948a;
        Color.colorToHSV(i7, fArr);
        float f7 = fArr[2];
        fArr[2] = f7 - (0.2f * f7);
        return Color.HSVToColor(fArr);
    }

    public static boolean changeStatusBarDarModeEnable() {
        return StatusBarModeUtil.isStatusBarModeAvailable();
    }

    public static void forceFitsSystemWindows(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof ViewGroup) {
                forceFitsSystemWindows((ViewGroup) childAt, z6);
            } else if (ViewCompat.getFitsSystemWindows(childAt)) {
                childAt.setFitsSystemWindows(z6);
            }
        }
    }

    public static void forceFitsSystemWindows(Window window, boolean z6) {
        forceFitsSystemWindows((ViewGroup) window.getDecorView().findViewById(R.id.content), z6);
    }

    public static Point getDisplayRealSize(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static int getNavigationBarHeight(Context context) {
        int identifier;
        if (!getNavigationBarVisibility(context) || (identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Constant.SDK_OS)) <= 0) {
            return 0;
        }
        return Resources.getSystem().getDimensionPixelSize(identifier);
    }

    public static boolean getNavigationBarVisibility(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Point displayRealSize = getDisplayRealSize(context);
        return Math.max(displayRealSize.y, displayRealSize.x) > Math.max(point.y, point.x);
    }

    public static int getPixelInsetTop(Activity activity) {
        return isStatusBarAvalible(activity) ? getStatusBarHeight(activity) : 0;
    }

    public static int getStatusBarHeight(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", Constant.SDK_OS);
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }

    public static void immersiveStatusBar(Activity activity) {
        immersiveStatusBar(activity.getWindow());
    }

    public static void immersiveStatusBar(Window window) {
        window.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        View childAt = ((ViewGroup) window.getDecorView().findViewById(R.id.content)).getChildAt(0);
        int statusBarHeight = getStatusBarHeight(window.getContext());
        if (childAt != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            ViewCompat.setFitsSystemWindows(childAt, true);
            layoutParams.topMargin = -statusBarHeight;
            childAt.setLayoutParams(layoutParams);
        }
    }

    public static boolean isFlyme4Later() {
        if (RomUtils.isMeizuRom()) {
            return true;
        }
        boolean z6 = true;
        if (!Build.FINGERPRINT.contains("Flyme_OS_4")) {
            z6 = true;
            if (!Build.VERSION.INCREMENTAL.contains("Flyme_OS_4")) {
                z6 = Pattern.compile("Flyme OS [4|5]", 2).matcher(Build.DISPLAY).find();
            }
        }
        return z6;
    }

    public static boolean isMIUI6Later() {
        boolean z6 = false;
        try {
            if (Integer.parseInt(((String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "ro.miui.ui.version.name")).replaceAll("[vV]", "")) >= 6) {
                z6 = true;
            }
        } catch (Exception e7) {
        }
        return z6;
    }

    public static boolean isStatusBarAvalible(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{R.attr.windowTranslucentStatus, R.attr.windowTranslucentNavigation});
        try {
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            if ((activity.getWindow().getAttributes().flags & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0) {
                z6 = true;
            }
            return z6;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void setHeightAndPadding(Context context, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = getStatusBarHeight(context) + layoutParams.height;
        view.setPadding(view.getPaddingLeft(), getStatusBarHeight(context) + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static int setNavigationBarMode(Activity activity, int i7, boolean z6) {
        return setNavigationBarMode(activity.getWindow(), i7, z6);
    }

    public static int setNavigationBarMode(Window window, int i7, boolean z6) {
        int i8 = i7;
        if (Build.VERSION.SDK_INT >= 26) {
            int i9 = z6 ? i7 & (-17) : i7 | 16;
            window.setNavigationBarColor(ContextCompat.getColor(window.getContext(), R$color.f64616Wh0));
            i8 = i9;
        }
        return i8;
    }

    public static void setPadding(Context context, View view) {
        view.setPadding(view.getPaddingLeft(), getStatusBarHeight(context) + view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void setStatusBarDarkMode(Activity activity) {
        StatusBarModeUtil.set(activity, true);
    }

    public static void setStatusBarDarkMode(Window window) {
        StatusBarModeUtil.set(window, true);
    }

    public static void setStatusBarLightMode(Activity activity) {
        StatusBarModeUtil.set(activity, false);
    }

    public static void setStatusBarLightMode(Window window) {
        StatusBarModeUtil.set(window, false);
    }

    public static void setStatusBarMode(Activity activity, boolean z6) {
        StatusBarModeUtil.set(activity, z6);
    }

    public static void tintStatusBar(Activity activity, @ColorInt int i7) {
        int iA;
        boolean z6;
        if (activity instanceof IDrawerHost) {
            return;
        }
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(R.id.content);
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(activity);
        boolean zIsWhiteTheme = MultipleThemeUtils.isWhiteTheme(activity);
        if (changeStatusBarDarModeEnable()) {
            iA = i7;
            z6 = true;
        } else {
            iA = i7;
            if (zIsWhiteTheme) {
                iA = i7;
                if (i7 != 0) {
                    iA = a(i7);
                }
            }
            z6 = false;
        }
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(activity, window.getDecorView().getSystemUiVisibility() | 1280, zIsNightTheme));
        window.setStatusBarColor(iA);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(true);
        }
        if (z6) {
            if (zIsWhiteTheme) {
                setStatusBarDarkMode(activity);
            } else {
                setStatusBarLightMode(activity);
            }
        }
    }

    public static void tintStatusBar(Activity activity, @ColorInt int i7, int i8) {
        if (activity instanceof IDrawerHost) {
            return;
        }
        if (i8 == 0) {
            tintStatusBar(activity, i7);
            return;
        }
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(R.id.content);
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(activity);
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(activity, window.getDecorView().getSystemUiVisibility() | 1280, zIsNightTheme));
        window.setStatusBarColor(i7);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(true);
        }
        if (i8 == 1) {
            setStatusBarDarkMode(activity);
        } else {
            setStatusBarLightMode(activity);
        }
    }

    public static void tintStatusBar(Window window, @ColorInt int i7) {
        boolean z6;
        Context context = window.getContext();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(R.id.content);
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(context);
        boolean zIsWhiteTheme = MultipleThemeUtils.isWhiteTheme(context);
        if (changeStatusBarDarModeEnable()) {
            z6 = true;
        } else {
            int iA = i7;
            if (zIsWhiteTheme) {
                iA = i7;
                if (i7 != 0) {
                    iA = a(i7);
                }
            }
            z6 = false;
            i7 = iA;
        }
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(window, window.getDecorView().getSystemUiVisibility() | 1280, zIsNightTheme));
        window.setStatusBarColor(i7);
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null && !(childAt instanceof DrawerLayout)) {
            childAt.setFitsSystemWindows(true);
        }
        if (z6) {
            if (zIsWhiteTheme) {
                setStatusBarDarkMode(window);
            } else {
                setStatusBarLightMode(window);
            }
        }
    }

    public static void tintStatusBarForDrawer(Activity activity, @ColorInt int i7, int i8) {
        int iA;
        boolean z6;
        Window window = activity.getWindow();
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(activity);
        boolean zIsWhiteTheme = MultipleThemeUtils.isWhiteTheme(activity);
        if (changeStatusBarDarModeEnable()) {
            iA = i7;
            z6 = true;
        } else {
            iA = i7;
            if (zIsWhiteTheme) {
                iA = i7;
                if (i7 != 0) {
                    iA = i7;
                    if (i8 == 0) {
                        iA = a(i7);
                    }
                }
            }
            z6 = false;
        }
        if (z6 || !zIsWhiteTheme || iA == 0 || i8 != 0) {
            window.setStatusBarColor(0);
        } else {
            window.setStatusBarColor(iA);
        }
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(activity, window.getDecorView().getSystemUiVisibility(), zIsNightTheme));
        if (z6) {
            if (i8 == 1 || (i8 == 0 && zIsWhiteTheme)) {
                StatusBarModeUtil.set(activity, true);
                activity.getWindow().setStatusBarColor(0);
            } else {
                StatusBarModeUtil.set(activity, false);
                activity.getWindow().setStatusBarColor(0);
            }
        }
    }

    public static void tintStatusBarPure(Activity activity, @ColorInt int i7) {
        boolean z6;
        int iA;
        if (activity instanceof IDrawerHost) {
            return;
        }
        Window window = activity.getWindow();
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(activity);
        boolean zIsWhiteTheme = MultipleThemeUtils.isWhiteTheme(activity);
        if (changeStatusBarDarModeEnable()) {
            z6 = true;
            iA = i7;
        } else {
            z6 = false;
            iA = i7;
            if (zIsWhiteTheme) {
                z6 = false;
                iA = i7;
                if (i7 != 0) {
                    iA = a(i7);
                    z6 = false;
                }
            }
        }
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(activity, window.getDecorView().getSystemUiVisibility() | 1280, zIsNightTheme));
        window.setStatusBarColor(iA);
        if (z6) {
            if (zIsWhiteTheme) {
                setStatusBarDarkMode(activity);
            } else {
                setStatusBarLightMode(activity);
            }
        }
    }

    public static void tintStatusBarPure(Activity activity, @ColorInt int i7, int i8) {
        if (activity instanceof IDrawerHost) {
            return;
        }
        Window window = activity.getWindow();
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(activity);
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(activity, window.getDecorView().getSystemUiVisibility() | 1280, zIsNightTheme));
        window.setStatusBarColor(i7);
        if (i8 == 1) {
            setStatusBarDarkMode(activity);
        } else {
            setStatusBarLightMode(activity);
        }
    }

    public static void tintStatusBarPure(Window window, @ColorInt int i7) {
        boolean z6;
        int iA;
        Context context = window.getContext();
        boolean zIsNightTheme = MultipleThemeUtils.isNightTheme(context);
        boolean zIsWhiteTheme = MultipleThemeUtils.isWhiteTheme(context);
        if (changeStatusBarDarModeEnable()) {
            z6 = true;
            iA = i7;
        } else {
            z6 = false;
            iA = i7;
            if (zIsWhiteTheme) {
                z6 = false;
                iA = i7;
                if (i7 != 0) {
                    iA = a(i7);
                    z6 = false;
                }
            }
        }
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(setNavigationBarMode(window, window.getDecorView().getSystemUiVisibility() | 1280, zIsNightTheme));
        window.setStatusBarColor(iA);
        if (z6) {
            if (zIsWhiteTheme) {
                setStatusBarDarkMode(window);
            } else {
                setStatusBarLightMode(window);
            }
        }
    }
}
