package com.bilibili.lib.upload;

import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/upload/UploadLog.class */
public class UploadLog {
    private static final String TAG = "BILI-UPLOAD";

    public static void debug(String str) {
        BLog.d(TAG, str);
    }

    public static void error(String str) {
        BLog.e(TAG, str);
    }

    public static void info(String str) {
        BLog.i(TAG, str);
    }

    public static void warning(String str) {
        BLog.w(TAG, str);
    }
}
