package com.bilibili.mediautils;

import android.util.Log;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/NumberUtils.class */
public class NumberUtils {
    public static final String TAG = "NumberUtils";

    public static int parseInt(String str, int i7) {
        try {
            i7 = Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            Log.w(TAG, "parseInt Exception", e7);
        }
        return i7;
    }

    public static long parseLong(String str, long j7) {
        try {
            j7 = Long.parseLong(str);
        } catch (NumberFormatException e7) {
            Log.w(TAG, "parseLong Exception", e7);
        }
        return j7;
    }
}
