package com.bilibili.mediacore.avutil;

import androidx.annotation.Keep;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/avutil/LogSinker.class */
@Keep
public class LogSinker {
    private static final int LOG_LEVEL_D = 0;
    private static final int LOG_LEVEL_E = 3;
    private static final int LOG_LEVEL_I = 1;
    private static final int LOG_LEVEL_W = 2;
    private static final int mCachedLogCount = 1;
    private static List<LogData> mLogPool = new LinkedList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediacore/avutil/LogSinker$LogData.class */
    @Keep
    public static class LogData {
        public int level;
        public String msg;

        public LogData(String str, int i7) {
            this.msg = str;
            this.level = i7;
        }
    }

    public static void d(String str, String str2) {
        synchronized (LogSinker.class) {
            try {
                mLogPool.add(new LogData(str + ": " + str2, 0));
                dump();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void dump() {
        synchronized (LogSinker.class) {
            try {
                if (mLogPool.size() >= 1) {
                    for (LogData logData : mLogPool) {
                        nativeLog(logData.msg, logData.level);
                    }
                    mLogPool.clear();
                }
            } finally {
            }
        }
    }

    public static void e(String str, String str2) {
        synchronized (LogSinker.class) {
            try {
                mLogPool.add(new LogData(str + ": " + str2, 3));
                dump();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2) {
        synchronized (LogSinker.class) {
            try {
                mLogPool.add(new LogData(str + ": " + str2, 1));
                dump();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static native void nativeLog(String str, int i7);

    public static void w(String str, String str2) {
        synchronized (LogSinker.class) {
            try {
                mLogPool.add(new LogData(str + ": " + str2, 2));
                dump();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
