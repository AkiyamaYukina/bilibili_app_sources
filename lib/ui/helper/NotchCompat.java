package com.bilibili.lib.ui.helper;

import Rf0.C2841c;
import android.graphics.Rect;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import kntr.base.utils.foundation.RomUtils;
import tv.danmaku.android.util.AppBuildConfig;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/ui/helper/NotchCompat.class */
public class NotchCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C2841c f64844a;

    /* JADX WARN: Type inference failed for: r0v11, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [Rf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [Rf0.c, Rf0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [Rf0.c, java.lang.Object] */
    public static void a() {
        if (f64844a != null) {
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            f64844a = new Object();
            return;
        }
        if (i7 >= 28) {
            ?? obj = new Object();
            obj.f20812c = new ArrayList();
            f64844a = obj;
            return;
        }
        if (RomUtils.isMiuiRom()) {
            f64844a = new Object();
            return;
        }
        if (RomUtils.isHuaweiRom()) {
            f64844a = new Object();
            return;
        }
        if (RomUtils.isOppoRom()) {
            f64844a = new Object();
            return;
        }
        if (RomUtils.isVivoRom()) {
            f64844a = new Object();
            return;
        }
        if (RomUtils.isMeizuRom()) {
            f64844a = new Object();
            return;
        }
        if (RomUtils.isSamsungRom()) {
            f64844a = new Object();
        } else if (RomUtils.isOnePlusRom()) {
            f64844a = new Object();
        } else {
            f64844a = new Object();
        }
    }

    public static void blockDisplayCutout(Window window) {
        a();
        f64844a.f(window);
    }

    @NonNull
    public static List<Rect> getDisplayCutoutSize(@NonNull Window window) {
        a();
        return f64844a.a(window);
    }

    @NonNull
    public static List<Rect> getDisplayCutoutSizeHardware(@NonNull Window window) {
        a();
        return f64844a.b(window);
    }

    public static boolean hasDisplayCutout(@NonNull Window window) {
        a();
        return f64844a.c(window);
    }

    public static boolean hasDisplayCutoutHardware(@NonNull Window window) {
        if (AppBuildConfig.isHDApp() && RomUtils.isSamsungRom()) {
            return false;
        }
        a();
        return f64844a.d(window);
    }

    public static void immersiveDisplayCutout(@NonNull Window window) {
        a();
        f64844a.e(window);
    }

    public static void onWindowConfigChanged(Window window) {
        a();
        f64844a.getClass();
    }

    public static void resetDisplayCutout(Window window) {
        a();
        f64844a.g(window);
    }
}
