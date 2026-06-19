package com.bilibili.mediautils;

import android.util.Log;
import com.bilibili.app.producers.ability.l0;
import com.bilibili.studio.material.util.UtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/LogUtils.class */
public class LogUtils {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    private static final String FILE_NAME = "multi_media.log";
    public static final int INFO = 4;
    public static final int NONE = Integer.MAX_VALUE;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static boolean initialized = false;
    private static int mLogGrade = 3;
    private static String mLogPath;

    public static void d(String str, String str2) {
        synchronized (LogUtils.class) {
            try {
                if (initialized) {
                    if (mLogGrade <= 3) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        writeLog2File(jCurrentTimeMillis, TimeUtils.milliSecond2DateFormat(jCurrentTimeMillis), str, mLogPath, str2);
                    }
                }
            } finally {
            }
        }
    }

    public static void e(String str, String str2) {
        synchronized (LogUtils.class) {
            try {
                if (initialized) {
                    if (mLogGrade <= 6) {
                        Log.e(str, str2);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        writeLog2File(jCurrentTimeMillis, TimeUtils.milliSecond2DateFormat(jCurrentTimeMillis), str, mLogPath, str2);
                    }
                }
            } finally {
            }
        }
    }

    public static void i(String str, String str2) {
        synchronized (LogUtils.class) {
            try {
                if (initialized) {
                    if (mLogGrade <= 4) {
                        Log.i(str, str2);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        writeLog2File(jCurrentTimeMillis, TimeUtils.milliSecond2DateFormat(jCurrentTimeMillis), str, mLogPath, str2);
                    }
                }
            } finally {
            }
        }
    }

    public static void initialize(String str, int i7) {
        synchronized (LogUtils.class) {
            try {
                if (initialized) {
                    return;
                }
                mLogGrade = i7;
                mLogPath = str + "/multi_media.log";
                initialized = true;
            } finally {
            }
        }
    }

    public static void setGrade(int i7) {
        synchronized (LogUtils.class) {
            try {
                mLogGrade = i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void v(String str, String str2) {
        synchronized (LogUtils.class) {
            try {
                if (initialized) {
                    if (mLogGrade == 2) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        writeLog2File(jCurrentTimeMillis, TimeUtils.milliSecond2DateFormat(jCurrentTimeMillis), str, mLogPath, str2);
                    }
                }
            } finally {
            }
        }
    }

    public static void w(String str, String str2) {
        synchronized (LogUtils.class) {
            try {
                if (initialized) {
                    if (mLogGrade <= 5) {
                        Log.w(str, str2);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        writeLog2File(jCurrentTimeMillis, TimeUtils.milliSecond2DateFormat(jCurrentTimeMillis), str, mLogPath, str2);
                    }
                }
            } finally {
            }
        }
    }

    private static void writeLog2File(long j7, String str, String str2, String str3, String str4) throws Throwable {
        StringBuilder sbA = l0.a("\n", str, UtilsKt.DOT);
        sbA.append(String.valueOf(j7).substring(10));
        sbA.append("--");
        sbA.append(str2);
        sbA.append(": [");
        sbA.append(Thread.currentThread().getName());
        sbA.append("] ");
        sbA.append(str4);
        FileUtils.appendText(str3, sbA.toString());
    }
}
