package com.bilibili.mediautils;

import android.content.Context;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/PermissionUtils.class */
public class PermissionUtils {
    public static boolean checkPermission(Context context, String str) {
        return isPermissionGranted(context, str);
    }

    private static boolean isPermissionGranted(Context context, String str) {
        boolean z6 = false;
        try {
            if (context.checkSelfPermission(str) == 0) {
                z6 = true;
            }
        } catch (Exception e7) {
        }
        return z6;
    }
}
