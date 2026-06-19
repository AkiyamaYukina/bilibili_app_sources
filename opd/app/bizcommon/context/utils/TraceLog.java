package com.bilibili.opd.app.bizcommon.context.utils;

import android.app.Application;
import com.bilibili.api.base.Config;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r2.C8509b;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/utils/TraceLog.class */
public final class TraceLog {

    @NotNull
    public static final TraceLog INSTANCE = new TraceLog();

    @NotNull
    public static final String TAG = "TraceLog";

    @JvmStatic
    public static final void d(@Nullable String str) {
        if (Config.isDebuggable()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            BLog.d("TraceLog#" + C8509b.a(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":") + "#" + stackTraceElement.getMethodName(), str);
        }
    }

    @JvmStatic
    public static final void d(@Nullable String str, @Nullable String str2) {
        if (Config.isDebuggable()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            BLog.d("TraceLog#" + C8509b.a(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":") + "#" + stackTraceElement.getMethodName(), str);
            Application application = BiliContext.application();
            ToastHelper.showToast(application != null ? application.getApplicationContext() : null, str2, 0, 17);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String str) {
        if (Config.isDebuggable()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            BLog.e("TraceLog#" + C8509b.a(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":") + "#" + stackTraceElement.getMethodName(), str);
        }
    }

    @JvmStatic
    public static final void e(@Nullable String str, @Nullable String str2) {
        if (Config.isDebuggable()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            BLog.e("TraceLog#" + C8509b.a(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":") + "#" + stackTraceElement.getMethodName(), str);
            Application application = BiliContext.application();
            ToastHelper.showToast(application != null ? application.getApplicationContext() : null, str2, 0, 17);
        }
    }

    @JvmStatic
    public static final void i(@Nullable String str) {
        if (Config.isDebuggable()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            BLog.i("TraceLog#" + C8509b.a(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":") + "#" + stackTraceElement.getMethodName(), str);
        }
    }

    @JvmStatic
    public static final void i(@Nullable String str, @Nullable String str2) {
        if (Config.isDebuggable()) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            BLog.i("TraceLog#" + C8509b.a(stackTraceElement.getLineNumber(), stackTraceElement.getFileName(), ":") + "#" + stackTraceElement.getMethodName(), str);
            Application application = BiliContext.application();
            ToastHelper.showToast(application != null ? application.getApplicationContext() : null, str2, 0, 17);
        }
    }
}
