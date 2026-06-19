package com.bilibili.studio.videoeditor.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/V.class */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f110220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f110221b;

    public static int a(int i7, Context context) {
        if (context != null) {
            return context.getResources().getDimensionPixelSize(i7);
        }
        BLog.e("Utils", "failed getDimensionPixelSize context null " + Log.getStackTraceString(new Throwable()));
        return 0;
    }

    public static void b(Context context) {
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.addFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public static boolean c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = jCurrentTimeMillis - f110220a;
        if (j7 > 0 && j7 <= 800) {
            return true;
        }
        f110220a = jCurrentTimeMillis;
        return false;
    }

    public static boolean d(List list) {
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static boolean e(@Nullable List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j7 = jCurrentTimeMillis - f110221b;
        if (j7 > 0 && j7 <= 300) {
            return true;
        }
        f110221b = jCurrentTimeMillis;
        return false;
    }
}
